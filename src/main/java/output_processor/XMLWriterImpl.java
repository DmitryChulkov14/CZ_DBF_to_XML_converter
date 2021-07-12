package output_processor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class XMLWriterImpl implements XMLWriter {

    @Override
    public void writeDataToXml(String data) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");
        try {
            Files.write(Paths.get(dateTime.format(formatter) + ".xml"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
