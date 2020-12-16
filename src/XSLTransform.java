import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class XSLTransform {



    public void transformujXMLDoNowegoFormatu(StreamSource plikXML, StreamSource XMLtoNewFormat, StreamResult outputFile) {

        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer;
        try {
            transformer = factory.newTransformer(XMLtoNewFormat);
            transformer.transform(plikXML, outputFile);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }

    public static void main( String [] args ) throws Exception {

        StreamSource xmlCode = new StreamSource(new File("..\\XMLProjekt_Luniewska_Ciach\\Files\\TERC.xml"));

        StreamSource XMLtoXML = new StreamSource(new File("..\\XMLProjekt_Luniewska_Ciach\\Files\\XMLtoXML.xsl"));
        StreamSource XMLtoJSON = new StreamSource(new File("..\\XMLProjekt_Luniewska_Ciach\\Files\\XMLtoJSON.xslt"));
        StreamSource XMLtoHTML = new StreamSource(new File("..\\XMLProjekt_Luniewska_Ciach\\Files\\XMLtoHTML.xsl"));

        StreamResult outputXML = new StreamResult(new File("..\\XMLProjekt_Luniewska_Ciach\\FilesOutput\\nowyPlikXML.xml"));
        StreamResult outputJSON = new StreamResult(new File("..\\XMLProjekt_Luniewska_Ciach\\FilesOutput\\nowPlikJSON.json"));
        StreamResult outputhHTML = new StreamResult(new File("..\\XMLProjekt_Luniewska_Ciach\\FilesOutput\\nowyPlikHTML.html"));



        XSLTransform xslTransform = new XSLTransform();


        xslTransform.transformujXMLDoNowegoFormatu(xmlCode, XMLtoXML, outputXML);
        xslTransform.transformujXMLDoNowegoFormatu(xmlCode, XMLtoJSON, outputJSON);
        xslTransform.transformujXMLDoNowegoFormatu(xmlCode, XMLtoHTML, outputhHTML);




    }


}


