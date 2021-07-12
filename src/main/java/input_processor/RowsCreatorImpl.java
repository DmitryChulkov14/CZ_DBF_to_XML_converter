package input_processor;

import com.linuxense.javadbf.DBFReader;
import helpers.DBFtoRowConvertor;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import model.DBFRow;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class RowsCreatorImpl implements RowsCreator {

    @Override
    public List<DBFRow> getRowsFromDbfReader(DBFReader dbfReader) {
        List<DBFRow> rows = new ArrayList<>();

        Object[] row;
        while ((row = dbfReader.nextRecord()) != null) {
            rows.add(DBFtoRowConvertor.createRow(row));
        }

        return rows;
    }
}
