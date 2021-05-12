package homework11.task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.*;
import javax.xml.transform.Result;
import java.io.*;

public class MyStAXParser {
    public static void main(String[] args) {

        try {
            File f = new File("C:\\Users\\User\\IdeaProjects\\java_professional\\src\\main\\java\\homework11\\task1\\City.xml");
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileOutputStream(f));

            writer.writeStartDocument("UTF-8", "1.0");
            writer.writeStartElement("location");
            writer.writeStartElement("city");
            writer.writeAttribute("size", "big");
            writer.writeCharacters("Kiev");
            writer.writeEndElement();
            writer.writeStartElement("street");
            writer.writeCharacters("Khreshchatyk");
            writer.writeEndElement();
            writer.writeStartElement("house_number");
            writer.writeCharacters("10");
            writer.writeEndElement();

            writer.writeEndDocument();

            writer.flush();
            writer.close();

        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
