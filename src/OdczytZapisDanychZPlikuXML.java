import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class OdczytZapisDanychZPlikuXML {



    String expression1 ="/wojewodztwa/catalog/wojewodztwo[@name]";
    String expression2 = "/wojewodztwa/catalog/wojewodztwo[@name]/podzial_adm/row/NAZWA";
    String expression3 = "/wojewodztwa/catalog/wojewodztwo[@name]/podzial_adm/row/NAZWA_DOD";


    void odczytWszytskichJednostekAdministracyjnych(Document document, XPath xPath) {


        NodeList nodeList = null;
        try {
            nodeList = (NodeList) xPath.compile(expression2).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        NodeList nodeList1 = null;
        try {
            nodeList1 = (NodeList) xPath.compile(expression3).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        try {
            NodeList nodeList2 = (NodeList) xPath.compile(expression1).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < nodeList.getLength(); i++) {


            System.out.println((i+1)+". "+
                    nodeList.item(i).getParentNode().getParentNode().getParentNode().getAttributes().getNamedItem("name").getTextContent()+
                    "; "+ nodeList.item(i).getFirstChild().getNodeValue() +"; "
                    + nodeList1.item(i).getFirstChild().getNodeValue());
        }
    }
    void zapisWszytskichJednostekAdministracyjnych(Document document, XPath xPath) throws FileNotFoundException {


        PrintWriter printWriter =
                new PrintWriter(new File("..\\XMLProjekt_Luniewska_Ciach\\FilesOutput\\wszystkieJedostkiAdministracyjne.txt"));

        NodeList nodeList = null;
        try {
            nodeList = (NodeList) xPath.compile(expression2).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        NodeList nodeList1 = null;
        try {
            nodeList1 = (NodeList) xPath.compile(expression3).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        try {
            NodeList nodeList2 = (NodeList) xPath.compile(expression1).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < nodeList.getLength(); i++) {


            printWriter.write((i+1)+". "+
                    nodeList.item(i).getParentNode().getParentNode().getParentNode().getAttributes().getNamedItem("name").getTextContent()+
                    "; "+ nodeList.item(i).getFirstChild().getNodeValue() +"; "
                    + nodeList1.item(i).getFirstChild().getNodeValue()+"\n");
        }
        printWriter.flush();
        printWriter.close();

    }

    void odczytWszytskichJednostekAdministracyjnychDlaDanegoWojewodztwa(Document document, XPath xPath, String wojewodztwo){

        expression1 = "/wojewodztwa/catalog/wojewodztwo[@name='"+wojewodztwo+"']";
        expression2 = "/wojewodztwa/catalog/wojewodztwo[@name='"+wojewodztwo+"']/podzial_adm/row/NAZWA";
        expression3 = "/wojewodztwa/catalog/wojewodztwo[@name='"+wojewodztwo+"']/podzial_adm/row/NAZWA_DOD";

        NodeList nodeList = null;
        try {
            nodeList = (NodeList) xPath.compile(expression2).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        NodeList nodeList1 = null;
        try {
            nodeList1 = (NodeList) xPath.compile(expression3).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        try {
            NodeList nodeList2 = (NodeList) xPath.compile(expression1).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < nodeList.getLength(); i++) {


            System.out.println((i+1)+". "+
                    nodeList.item(i).getParentNode().getParentNode().getParentNode().getAttributes().getNamedItem("name").getTextContent()+
                    "; "+ nodeList.item(i).getFirstChild().getNodeValue() +"; "
                    + nodeList1.item(i).getFirstChild().getNodeValue());
        }
    }
    void zapisWszytskichJednostekAdministracyjnychDlaDanegoWojewodztwa(Document document, XPath xPath, String wojewodztwo) throws FileNotFoundException {

        PrintWriter printWriter =
                new PrintWriter(new File("..\\XMLProjekt_Luniewska_Ciach\\FilesOutput\\wszystkieJedostkiAdministracyjne"+wojewodztwo+".txt"));


        expression1 = "/wojewodztwa/catalog/wojewodztwo[@name='"+wojewodztwo+"']";
        expression2 = "/wojewodztwa/catalog/wojewodztwo[@name='"+wojewodztwo+"']/podzial_adm/row/NAZWA";
        expression3 = "/wojewodztwa/catalog/wojewodztwo[@name='"+wojewodztwo+"']/podzial_adm/row/NAZWA_DOD";

        NodeList nodeList = null;
        try {
            nodeList = (NodeList) xPath.compile(expression2).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        NodeList nodeList1 = null;
        try {
            nodeList1 = (NodeList) xPath.compile(expression3).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        try {
            NodeList nodeList2 = (NodeList) xPath.compile(expression1).evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < nodeList.getLength(); i++) {


            printWriter.write((i+1)+". "+
                    nodeList.item(i).getParentNode().getParentNode().getParentNode().getAttributes().getNamedItem("name").getTextContent()+
                    "; "+ nodeList.item(i).getFirstChild().getNodeValue() +"; "
                    + nodeList1.item(i).getFirstChild().getNodeValue()+"\n");
        }

        printWriter.flush();
        printWriter.close();

    }


    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {



        //validate xml against DTD
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setValidating(true);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();


        Document document = builder.parse(new File("..\\XMLProjekt_Luniewska_Ciach\\Files\\TERC.xml"));
        XPath xPath = XPathFactory.newInstance().newXPath();


        NodeList woj = document.getElementsByTagName("wojewodztwo");
        NodeList podzial_adm = document.getElementsByTagName("podzial_adm");


        OdczytZapisDanychZPlikuXML odczytZapisDanychZPlikuXML = new OdczytZapisDanychZPlikuXML();


        odczytZapisDanychZPlikuXML.odczytWszytskichJednostekAdministracyjnych(document, xPath);

        odczytZapisDanychZPlikuXML.odczytWszytskichJednostekAdministracyjnychDlaDanegoWojewodztwa
                (document, xPath, "ZACHODNIOPOMORSKIE");

        odczytZapisDanychZPlikuXML.odczytWszytskichJednostekAdministracyjnych(document, xPath);

        odczytZapisDanychZPlikuXML.zapisWszytskichJednostekAdministracyjnych(document,xPath);
        odczytZapisDanychZPlikuXML.zapisWszytskichJednostekAdministracyjnychDlaDanegoWojewodztwa(document,xPath,"MAZOWIECKIE");

    }




}







