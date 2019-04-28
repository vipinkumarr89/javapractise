package EdurekaHW.module6;
import javax.xml.parsers.*;

import org.w3c.dom.*;

import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
public class DomParserDemo {
    public static void main(String args[]) throws Exception {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        DocumentBuilder b = f.newDocumentBuilder();
        Document doc = b.newDocument();
        Element root = doc.createElement("students");
        Element student = doc.createElement("student");
        Element name = doc.createElement("name");
        Element standard = doc.createElement("standard");
        Element gender = doc.createElement("gender");
        Element marks = doc.createElement("marks");
        Element address = doc.createElement("address");
        Text t1 = doc.createTextNode("Varun");
        Text t2 = doc.createTextNode("XI");
        Text t3 = doc.createTextNode("1234");
        Text t4 = doc.createTextNode("UP");
        Text t5 = doc.createTextNode("M");
        name.appendChild(t1);
        standard.appendChild(t2);
        marks.appendChild(t3);
        address.appendChild(t4);
        gender.appendChild(t5);
        student.appendChild(name);
        student.appendChild(standard);
        student.appendChild(marks);
        student.appendChild(address);
        student.appendChild(gender);
        root.appendChild(student);
        doc.appendChild(root);
        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("/workplace/vipkmar/javapractise/src/EdurekaHW/module6/Students.xml")));
        System.out.println("XML file generated..");
    }
}
