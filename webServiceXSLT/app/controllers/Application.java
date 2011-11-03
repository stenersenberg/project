package controllers;

import java.io.InputStream;
import play.*;
import play.mvc.*;
import play.libs.*;

import org.w3c.dom.Document;


import java.util.*;

import models.*;
import play.libs.WS.HttpResponse;

public class Application extends Controller {

    public static void index() {
        render();
    }

      public static void sum(String text) {

        Document doc = WS.url("http://localhost:9000/webservices/sum/"+text).get().getXml();

        String rate = doc.getElementsByTagName("sum").item(1).getTextContent();

        render(rate);
    }

       public static void sum2(String text) {

      

        HttpResponse res = WS.url("http://localhost:9002/webservices/sum/"+text).get();    
        String content = res.getString();
        
        render(content);
    }

         public static void test(String text) {

        Document doc = WS.url("http://localhost:9000/webservices/sum/"+text).get().getXml();

        String rate = doc.getElementsByTagName("sum").item(0).getTextContent();

        render(rate);
    }

}