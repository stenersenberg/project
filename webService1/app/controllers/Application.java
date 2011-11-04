package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void sum(String str) {
        String result = "Hei " + str + ". Webservice svarer";
        float numb = 122;
        render(result, numb);
    }

    public static void index() {
        render();

        }
    
    public static void getController() {
       
        render();
    }
    
        public static void getUser(String user) {
        String res = user + "you got it";
        render(res);
    }


}