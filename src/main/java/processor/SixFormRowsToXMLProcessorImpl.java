package processor;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import model.DBFRow;
import model.XMLTag;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SixFormRowsToXMLProcessorImpl extends AbstractRowsToXMLLProcessor {

    List<XMLTag> T1RXXXXG5_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG6_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG7S_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG8_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG9_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG101_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG102_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG111S_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG112S_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG113S_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG12_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG13_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG14_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG15_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG16_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG17_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG18_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG19_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG20_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG21_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG22_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG23_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG24_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG25_list = new ArrayList<>();

    @Override
    public String convertRowsToXmlString(List<DBFRow> rows) {
        fillTagsLists(rows);

        return writeTags();
    }

    @Override
    String writeTags() {
        StringWriter stringWriter = new StringWriter();

        writeTag("T1RXXXXG5", T1RXXXXG5_list, stringWriter);
        writeTag("T1RXXXXG6", T1RXXXXG6_list, stringWriter);
        writeTag("T1RXXXXG7S", T1RXXXXG7S_list, stringWriter);
        writeTag("T1RXXXXG8", T1RXXXXG8_list, stringWriter);
        writeTag("T1RXXXXG9", T1RXXXXG9_list, stringWriter);
        writeTag("T1RXXXXG101", T1RXXXXG101_list, stringWriter);
        writeTag("T1RXXXXG102", T1RXXXXG102_list, stringWriter);
        writeTag("T1RXXXXG111S", T1RXXXXG111S_list, stringWriter);
        writeTag("T1RXXXXG112S", T1RXXXXG112S_list, stringWriter);
        writeTag("T1RXXXXG113S", T1RXXXXG113S_list, stringWriter);
        writeTag("T1RXXXXG12", T1RXXXXG12_list, stringWriter);
        writeTag("T1RXXXXG13", T1RXXXXG13_list, stringWriter);
        writeTag("T1RXXXXG14", T1RXXXXG14_list, stringWriter);
        writeTag("T1RXXXXG15", T1RXXXXG15_list, stringWriter);
        writeTag("T1RXXXXG16", T1RXXXXG16_list, stringWriter);
        writeTag("T1RXXXXG17", T1RXXXXG17_list, stringWriter);
        writeTag("T1RXXXXG18", T1RXXXXG18_list, stringWriter);
        writeTag("T1RXXXXG19", T1RXXXXG19_list, stringWriter);
        writeTag("T1RXXXXG20", T1RXXXXG20_list, stringWriter);
        writeTag("T1RXXXXG21", T1RXXXXG21_list, stringWriter);
        writeTag("T1RXXXXG22", T1RXXXXG22_list, stringWriter);
        writeTag("T1RXXXXG23", T1RXXXXG23_list, stringWriter);
        writeTag("T1RXXXXG24", T1RXXXXG24_list, stringWriter);
        writeTag("T1RXXXXG25", T1RXXXXG25_list, stringWriter);

        return stringWriter.toString();
    }

    @Override
    void fillTagsLists(List<DBFRow> rows) {
        AtomicInteger curRowNum = new AtomicInteger(1);
        rows.forEach(row -> {
            fillTagList(T1RXXXXG5_list, curRowNum, String.valueOf(row.getUKR_GROMAD()));
            fillTagList(T1RXXXXG6_list, curRowNum, String.valueOf(row.getST()));
            fillTagList(T1RXXXXG7S_list, curRowNum, String.valueOf(row.getNUMIDENT()));
            fillTagList(T1RXXXXG8_list, curRowNum, String.valueOf(row.getZO()));
            fillTagList(T1RXXXXG9_list, curRowNum, String.valueOf(row.getPAY_TP()));
            fillTagList(T1RXXXXG101_list, curRowNum, String.valueOf(row.getPAY_MNTH()));
            fillTagList(T1RXXXXG102_list, curRowNum, String.valueOf(row.getPAY_YEAR()));
            fillTagList(T1RXXXXG111S_list, curRowNum, String.valueOf(row.getLN()));
            fillTagList(T1RXXXXG112S_list, curRowNum, String.valueOf(row.getNM()));
            fillTagList(T1RXXXXG113S_list, curRowNum, String.valueOf(row.getFTN()));
            fillTagList(T1RXXXXG12_list, curRowNum, String.valueOf(row.getKD_NP()));
            fillTagList(T1RXXXXG13_list, curRowNum, String.valueOf(row.getKD_NZP()));
            fillTagList(T1RXXXXG14_list, curRowNum, String.valueOf(row.getKD_PTV()));
            fillTagList(T1RXXXXG15_list, curRowNum, null);
            fillTagList(T1RXXXXG16_list, curRowNum, String.valueOf(row.getSUM_TOTAL()));
            fillTagList(T1RXXXXG17_list, curRowNum, String.valueOf(row.getSUM_MAX()));
            fillTagList(T1RXXXXG18_list, curRowNum, String.valueOf(row.getSUM_DIFF()));
            fillTagList(T1RXXXXG19_list, curRowNum, String.valueOf(row.getSUM_INS()));
            fillTagList(T1RXXXXG20_list, curRowNum, String.valueOf(row.getSUM_NARAH()));
            fillTagList(T1RXXXXG21_list, curRowNum, String.valueOf(row.getOTK()));
            fillTagList(T1RXXXXG22_list, curRowNum, String.valueOf(row.getNRC()));
            fillTagList(T1RXXXXG23_list, curRowNum, String.valueOf(row.getEXP()));
            fillTagList(T1RXXXXG24_list, curRowNum, String.valueOf(row.getNRM()));
            fillTagList(T1RXXXXG25_list, curRowNum, String.valueOf(row.getOZN()));

            curRowNum.getAndIncrement();
        });
    }
}
