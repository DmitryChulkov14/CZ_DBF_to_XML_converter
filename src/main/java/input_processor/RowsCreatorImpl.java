package input_processor;

import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import row_convertors.DBFtoRowConvertor;
import row_convertors.SixFormDBFtoRowConvertor;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import model.DBFRow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class RowsCreatorImpl implements RowsCreator {

    private DBFtoRowConvertor dbFtoRowConvertor;

    public RowsCreatorImpl(DBFtoRowConvertor dbFtoRowConvertor) {
        this.dbFtoRowConvertor = dbFtoRowConvertor;
    }

    @Override
    public List<DBFRow> getRowsFromDbfReader(DBFReader dbfReader) {
        List<DBFRow> rows = new ArrayList<>();

        Object[] row;
        HashMap<String, Integer> columnNamesAndNums = new HashMap<>();
        for (int i = 0; i < dbfReader.getFieldCount(); i++) {
            DBFField field = dbfReader.getField(i);
            String columnName = field.getName().toUpperCase(Locale.ROOT);
            columnNamesAndNums.put(columnName, i);
        }

        while ((row = dbfReader.nextRecord()) != null) {
            rows.add(dbFtoRowConvertor.createRow(row, columnNamesAndNums));
        }

        return rows;
    }
}
