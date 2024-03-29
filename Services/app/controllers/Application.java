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
    F.Promise<WS.HttpResponse> remoteCall1 = WS.url("http://localhost:9000/getServiceLinks").getAsync();
    
 

        HttpResponse httpResponse = await(remoteCall1); // request gets suspended here
    
    String content = httpResponse.getString();
    
    
    F.Promise<WS.HttpResponse> remoteCall2 = WS.url("http://localhost:9000/getPicture").getAsync();
 
 

        HttpResponse httpResponse2 = await(remoteCall2); // request gets suspended here
    
    String content2 = httpResponse2.getString();
    
    render(content, content2);
  }
    
        

}   