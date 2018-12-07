/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlcreate;
import java.io.*;
/**
 *
 * @author Hrithik
 */
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException; 

public class XMLCreate{

    public static void main (String argv []){
    try {

            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse (new File("Courses.xml"));

            // normalize text representation
            doc.getDocumentElement ().normalize ();


            NodeList courses = doc.getElementsByTagName("course");
            int totalcourses = courses.getLength();
            System.out.println("Total no of courses : " + totalcourses);

            for(int s=0; s<courses.getLength() ; s++){


                Node firstcourse = courses.item(s);
                if(firstcourse.getNodeType() == Node.ELEMENT_NODE){


                    Element firstcourseelement = (Element)firstcourse;

                    //-------
                    NodeList firstcourselist = firstcourseelement.getElementsByTagName("code");
                    Element codeElement = (Element)firstcourselist.item(0);

                    NodeList textcodeList = codeElement.getChildNodes();
                    System.out.println("Code : " + 
                           ((Node)textcodeList.item(0)).getNodeValue().trim());

                    //-------
                    NodeList descriptionList = firstcourseelement.getElementsByTagName("description");
                    Element descriptionElement = (Element)descriptionList.item(0);

                    NodeList textdescriptionList = descriptionElement.getChildNodes();
                    System.out.println("Description : " + 
                           ((Node)textdescriptionList.item(0)).getNodeValue().trim());

                    //----
                    NodeList teacherList = firstcourseelement.getElementsByTagName("teacher");
                    Element teacherElement = (Element)teacherList.item(0);

                    NodeList textteacherList = teacherElement.getChildNodes();
                    System.out.println("Teacher : " + 
                           ((Node)textteacherList.item(0)).getNodeValue().trim());
                    
                    NodeList sbList = firstcourseelement.getElementsByTagName("schoolBoard");
                    Element sbElement = (Element)sbList.item(0);

                    NodeList textsbList = sbElement.getChildNodes();
                    System.out.println("School Board : " + 
                           ((Node)textsbList.item(0)).getNodeValue().trim());

                    //------


                }//end of if clause


            }//end of for loop with s var


        }catch (SAXParseException err) {
        System.out.println ("** Parsing error" + ", line " 
             + err.getLineNumber () + ", uri " + err.getSystemId ());
        System.out.println(" " + err.getMessage ());

        }catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();

        }catch (Throwable t) {
        t.printStackTrace ();
        }
        //System.exit (0);

    }//end of main


}

