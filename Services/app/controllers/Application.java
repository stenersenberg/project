package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import play.libs.F;
import play.libs.WS;
import play.libs.WS.HttpResponse;

public class Application extends Controller {

    
          

      
       public static void index()
  {
    F.Promise<WS.HttpResponse> remoteCall1 = WS.url("http://localhost:9000/getController").getAsync();
 
 

        HttpResponse httpResponse = await(remoteCall1); // request gets suspended here
    
    String content = httpResponse.getString();
    
    render(content);
  }
    
           
           
           
        
      public static  String getInterface(){
      
            HttpResponse res = WS.url("http://localhost:9000/getController").get();
            String content = res.getString();
            return content;
}

}   