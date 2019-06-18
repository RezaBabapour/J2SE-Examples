import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class xml {
    public void writeXML() throws Exception
    {
        Element company = new Element("company");
        Document doc = new Document(company);
        Element staff = new Element("staff");
        staff.setAttribute("id","1");
        staff.addContent(new Element("fname").setText("yan"));
        staff.addContent(new Element("lname").setText("bam"));
        staff.addContent(new Element("nickname").setText("mam"));
        staff.addContent(new Element("salary").setText("1000"));


        doc.getRootElement().addContent(staff);

        Element staff2 = new Element("staff");
        staff2.setAttribute("id","2");
        staff2.addContent(new Element("fname").setText("dan"));
        staff2.addContent(new Element("lname").setText("bez"));
        staff2.addContent(new Element("nickname").setText("kan"));
        staff2.addContent(new Element("salary").setText("9999"));
        doc.getRootElement().addContent(staff2);


        XMLOutputter xmlOutput = new XMLOutputter();

        xmlOutput.setFormat(Format.getPrettyFormat());
        xmlOutput.output(doc, new FileWriter("out.xml"));
    }

    public void readXML() throws JDOMException, IOException {
        Document document = new SAXBuilder().build(new File("out.xml"));
        Element rootNode = document.getRootElement();
        List<Element> list = rootNode.getChildren("staff");

        for (Element element : list)
        {
            System.out.println(element.getAttribute("age"));
            System.out.println("fname : " + element.getChildText("fname"));
            System.out.println("lname : " + element.getChildText("lname"));
            System.out.println("nickname : " + element.getChildText("nickname"));
            System.out.println("salary : " + element.getChildText("salary"));
        }

    }


        public static void main(String[] args) throws Exception {
        new xml().writeXML();
        new xml().readXML();
    }
}
