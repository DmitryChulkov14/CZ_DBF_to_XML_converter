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
public class FourDfRowsToXMLProcessorImpl extends AbstractRowsToXMLLProcessor {

    List<XMLTag> T1RXXXXG02_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG03A_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG03_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG04A_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG04_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG5A_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG5_list = new ArrayList<>();
    List<XMLTag> T1RXXXXG05_list = new ArrayList<>();

    @Override
    public String convertRowsToXmlString(List<DBFRow> rows) {
        fillTagsLists(rows);

        return writeTags();
    }

    @Override
    String writeTags() {
        StringWriter stringWriter = new StringWriter();

        writeTag("T1RXXXXG02", T1RXXXXG02_list, stringWriter);
        writeTag("T1RXXXXG03A", T1RXXXXG03A_list, stringWriter);
        writeTag("T1RXXXXG03", T1RXXXXG03_list, stringWriter);
        writeTag("T1RXXXXG04A", T1RXXXXG04A_list, stringWriter);
        writeTag("T1RXXXXG04", T1RXXXXG04_list, stringWriter);
        writeTag("T1RXXXXG5A", T1RXXXXG5A_list, stringWriter);
        writeTag("T1RXXXXG5", T1RXXXXG5_list, stringWriter);
        writeTag("T1RXXXXG05", T1RXXXXG05_list, stringWriter);

        return stringWriter.toString();
    }

    @Override
    void fillTagsLists(List<DBFRow> rows) {
        AtomicInteger curRowNum = new AtomicInteger();
        rows.forEach(row -> {
            curRowNum.set(row.getNP().intValue());
            fillTagList(T1RXXXXG02_list, curRowNum, String.valueOf(row.getTIN()));
            fillTagList(T1RXXXXG03A_list, curRowNum, String.valueOf(row.getS_NAR()));
            fillTagList(T1RXXXXG03_list, curRowNum, String.valueOf(row.getS_DOX()));
            fillTagList(T1RXXXXG04A_list, curRowNum, String.valueOf(row.getS_TAXN()));
            fillTagList(T1RXXXXG04_list, curRowNum, String.valueOf(row.getS_TAXP()));
            fillTagList(T1RXXXXG5A_list, curRowNum, String.valueOf(row.getA051()));
            fillTagList(T1RXXXXG5_list, curRowNum, String.valueOf(row.getA05()));
            fillTagList(T1RXXXXG05_list, curRowNum, String.valueOf(row.getOZN_DOX()));
        });
    }
}
