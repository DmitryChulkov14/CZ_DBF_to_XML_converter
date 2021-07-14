package processor;

import model.DBFRow;
import model.XMLTag;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class AbstractRowsToXMLLProcessor implements RowsToXMLProcessor {

    abstract void fillTagsLists(List<DBFRow> rows);
    abstract String writeTags();

    void fillTagList(List<XMLTag> tagList, AtomicInteger curRowNum, String value) {
        XMLTag tag = new XMLTag();
        tag.setRownum(curRowNum.get());
        if (value != null && !value.equals("")) {
            tag.setValue(value.toUpperCase());
        } else {
            tag.setXsinil(true);
        }
        tagList.add(tag);
    }

    void writeTag(String tagName, List<XMLTag> tags, StringWriter stringWriter) {
        try {
            final JAXBContext jaxbContext = JAXBContext.newInstance(XMLTag.class);
            final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty("com.sun.xml.bind.xmlDeclaration", false);

            for (XMLTag tag : tags) {
                QName qName = new QName("", tagName);
                JAXBElement<XMLTag> root = new JAXBElement<>(qName, XMLTag.class, tag);

                try {
                    jaxbMarshaller.marshal(root, stringWriter);
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
                stringWriter.append("\r\n");
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
