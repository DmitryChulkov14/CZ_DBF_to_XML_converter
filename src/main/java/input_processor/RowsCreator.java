package input_processor;

import com.linuxense.javadbf.DBFReader;
import model.DBFRow;

import java.util.List;

public interface RowsCreator {
    List<DBFRow> getRowsFromDbfReader(DBFReader reader);
}
