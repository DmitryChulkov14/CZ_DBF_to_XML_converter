package processor;

import model.DBFRow;

import java.util.List;

public interface RowsToXMLProcessor {
    String convertRowsToXmlString(List<DBFRow> rows);
}
