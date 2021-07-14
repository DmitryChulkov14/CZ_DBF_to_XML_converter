package row_convertors;

import model.DBFRow;

import java.math.BigDecimal;
import java.util.HashMap;

import static row_convertors.FourDfDBFtoRowConvertor.ColumnNames.*;

public class FourDfDBFtoRowConvertor implements DBFtoRowConvertor {

    enum ColumnNames {
        NP,
        TIN,
        S_NAR,
        S_DOX,
        S_TAXN,
        S_TAXP,
        A051,
        A05,
        OZN_DOX
    }

    public DBFRow createRow(Object[] rowObject, HashMap<String, Integer> columnNamesAndNums){
        DBFRow row = new DBFRow();
        row.setNP((BigDecimal) rowObject[columnNamesAndNums.get(NP.name())]);
        row.setTIN((String) rowObject[columnNamesAndNums.get(TIN.name())]);
        row.setS_NAR((BigDecimal) rowObject[columnNamesAndNums.get(S_NAR.name())]);
        row.setS_DOX((BigDecimal) rowObject[columnNamesAndNums.get(S_DOX.name())]);
        row.setS_TAXN((BigDecimal) rowObject[columnNamesAndNums.get(S_TAXN.name())]);
        row.setS_TAXP((BigDecimal) rowObject[columnNamesAndNums.get(S_TAXP.name())]);
        row.setA051((BigDecimal) rowObject[columnNamesAndNums.get(A051.name())]);
        row.setA05((BigDecimal) rowObject[columnNamesAndNums.get(A05.name())]);
        row.setOZN_DOX((BigDecimal) rowObject[columnNamesAndNums.get(OZN_DOX.name())]);

        return row;
    }
}
