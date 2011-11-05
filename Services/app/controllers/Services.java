package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Services extends Controller {

    public static void getController() {
       
        render();
    }
    
       public static void getUser(String user) {
        String res = user + "you got it";
        render(res);
    }
       
    public static void getPicture(){
    render();
    }

}