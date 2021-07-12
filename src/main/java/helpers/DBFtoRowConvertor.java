package helpers;

import model.DBFRow;

import java.math.BigDecimal;

public class DBFtoRowConvertor {

    public static DBFRow createRow(Object[] rowObject){
        DBFRow row = new DBFRow();
        row.setPERIOD_M((BigDecimal) rowObject[0]);
        row.setPERIOD_Y((BigDecimal) rowObject[1]);
        row.setUKR_GROMAD((BigDecimal) rowObject[2]);
        row.setST((BigDecimal) rowObject[3]);
        row.setNUMIDENT((String) rowObject[4]);
        row.setLN((String) rowObject[5]);
        row.setNM((String) rowObject[6]);
        row.setFTN((String) rowObject[7]);
        row.setZO((BigDecimal) rowObject[8]);
        row.setPAY_TP((BigDecimal) rowObject[9]);
        row.setPAY_MNTH((BigDecimal) rowObject[10]);
        row.setPAY_YEAR((BigDecimal) rowObject[11]);
        row.setKD_NP((BigDecimal) rowObject[12]);
        row.setKD_NZP((BigDecimal) rowObject[13]);
        row.setKD_PTV((BigDecimal) rowObject[14]);
        row.setKD_VP((BigDecimal) rowObject[15]);
        row.setSUM_TOTAL((BigDecimal) rowObject[16]);
        row.setSUM_MAX((BigDecimal) rowObject[17]);
        row.setSUM_DIFF((BigDecimal) rowObject[18]);
        row.setSUM_INS((BigDecimal) rowObject[19]);
        row.setSUM_NARAH((BigDecimal) rowObject[20]);
        row.setOTK((BigDecimal) rowObject[21]);
        row.setEXP((BigDecimal) rowObject[22]);
        row.setNRC((BigDecimal) rowObject[23]);
        row.setNRM((BigDecimal) rowObject[24]);
        row.setOZN((String) rowObject[25]);
        return row;
    }
}
