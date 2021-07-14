package row_convertors;

import model.DBFRow;

import java.util.HashMap;

public interface DBFtoRowConvertor {
     DBFRow createRow(Object[] rowObject, HashMap<String, Integer> columnNamesAndNums);
}
