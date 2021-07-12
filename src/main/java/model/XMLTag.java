package model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import java.io.Serializable;

@FieldDefaults(level = AccessLevel.PROTECTED)
@Getter
public class XMLTag implements Serializable {

    int rownum;
    String value;
    Boolean xsinil;

    @XmlAttribute(name = "ROWNUM")
    public void setRownum(int rownum) {
        this.rownum = rownum;
    }

    @XmlValue
    public void setValue(String value) {
        this.value = value;
    }

    @XmlAttribute(name = "xsi:nil")
    public void setXsinil(Boolean xsinil) {
        this.xsinil = xsinil;
    }
}
