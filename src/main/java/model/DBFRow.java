package model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DBFRow {
    // Six form
    BigDecimal PERIOD_M;
    BigDecimal PERIOD_Y;
    BigDecimal UKR_GROMAD;
    BigDecimal ST;
    String NUMIDENT;
    String LN;
    String NM;
    String FTN;
    BigDecimal ZO;
    BigDecimal PAY_TP;
    BigDecimal PAY_MNTH;
    BigDecimal PAY_YEAR;
    BigDecimal KD_NP;
    BigDecimal KD_NZP;
    BigDecimal KD_PTV;
    BigDecimal KD_VP;
    BigDecimal SUM_TOTAL;
    BigDecimal SUM_MAX;
    BigDecimal SUM_DIFF;
    BigDecimal SUM_INS;
    BigDecimal SUM_NARAH;
    BigDecimal OTK;
    BigDecimal EXP;
    BigDecimal NRC;
    BigDecimal NRM;
    String OZN;

    // Four DF
    BigDecimal NP;
    String TIN;
    BigDecimal S_NAR;
    BigDecimal S_DOX;
    BigDecimal S_TAXN;
    BigDecimal S_TAXP;
    BigDecimal A051;
    BigDecimal A05;
    BigDecimal OZN_DOX;

}
