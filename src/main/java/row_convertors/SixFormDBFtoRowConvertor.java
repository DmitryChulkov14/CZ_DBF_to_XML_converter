package row_convertors;

import model.DBFRow;

import java.math.BigDecimal;
import java.util.HashMap;

import static row_convertors.SixFormDBFtoRowConvertor.ColumnNames.*;

public class SixFormDBFtoRowConvertor implements DBFtoRowConvertor {

    enum ColumnNames {
        PERIOD_M,
        PERIOD_Y,
        UKR_GROMAD,
        ST,
        NUMIDENT,
        LN,
        NM,
        FTN,
        ZO,
        PAY_TP,
        PAY_MNTH,
        PAY_YEAR,
        KD_NP,
        KD_NZP,
        KD_PTV,
        KD_VP,
        SUM_TOTAL,
        SUM_MAX,
        SUM_DIFF,
        SUM_INS,
        SUM_NARAH,
        OTK,
        EXP,
        NRC,
        NRM,
        OZN,
    }

    public DBFRow createRow(Object[] rowObject, HashMap<String, Integer> columnNamesAndNums){
        DBFRow row = new DBFRow();
        row.setPERIOD_M((BigDecimal) rowObject[columnNamesAndNums.get(PERIOD_M.name())]);
        row.setPERIOD_Y((BigDecimal) rowObject[columnNamesAndNums.get(PERIOD_Y.name())]);
        row.setUKR_GROMAD((BigDecimal) rowObject[columnNamesAndNums.get(UKR_GROMAD.name())]);
        row.setST((BigDecimal) rowObject[columnNamesAndNums.get(ST.name())]);
        row.setNUMIDENT((String) rowObject[columnNamesAndNums.get(NUMIDENT.name())]);
        row.setLN((String) rowObject[columnNamesAndNums.get(LN.name())]);
        row.setNM((String) rowObject[columnNamesAndNums.get(NM.name())]);
        row.setFTN((String) rowObject[columnNamesAndNums.get(FTN.name())]);
        row.setZO((BigDecimal) rowObject[columnNamesAndNums.get(ZO.name())]);
        row.setPAY_TP((BigDecimal) rowObject[columnNamesAndNums.get(PAY_TP.name())]);
        row.setPAY_MNTH((BigDecimal) rowObject[columnNamesAndNums.get(PAY_MNTH.name())]);
        row.setPAY_YEAR((BigDecimal) rowObject[columnNamesAndNums.get(PAY_YEAR.name())]);
        row.setKD_NP((BigDecimal) rowObject[columnNamesAndNums.get(KD_NP.name())]);
        row.setKD_NZP((BigDecimal) rowObject[columnNamesAndNums.get(KD_NZP.name())]);
        row.setKD_PTV((BigDecimal) rowObject[columnNamesAndNums.get(KD_PTV.name())]);
        row.setKD_VP((BigDecimal) rowObject[columnNamesAndNums.get(KD_VP.name())]);
        row.setSUM_TOTAL((BigDecimal) rowObject[columnNamesAndNums.get(SUM_TOTAL.name())]);
        row.setSUM_MAX((BigDecimal) rowObject[columnNamesAndNums.get(SUM_MAX.name())]);
        row.setSUM_DIFF((BigDecimal) rowObject[columnNamesAndNums.get(SUM_DIFF.name())]);
        row.setSUM_INS((BigDecimal) rowObject[columnNamesAndNums.get(SUM_INS.name())]);
        row.setSUM_NARAH((BigDecimal) rowObject[columnNamesAndNums.get(SUM_NARAH.name())]);
        row.setOTK((BigDecimal) rowObject[columnNamesAndNums.get(OTK.name())]);
        row.setEXP((BigDecimal) rowObject[columnNamesAndNums.get(EXP.name())]);
        row.setNRC((BigDecimal) rowObject[columnNamesAndNums.get(NRC.name())]);
        row.setNRM((BigDecimal) rowObject[columnNamesAndNums.get(NRM.name())]);
        row.setOZN((String) rowObject[columnNamesAndNums.get(OZN.name())]);

        return row;
    }
}
