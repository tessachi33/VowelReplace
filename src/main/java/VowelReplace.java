import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.*;

public class VowellReplace {
  public static void main(String[] args){
    String layout = ("templates/layout.vtl");

    // input page is where the user enters their information

      get("/", (request, response) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/input.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

     //Users String needs to be converted to char array here
    //  String userInout = "userInput";
    //  char[] vowelCharArray = userInput.toCharArray();

    // output page is where the information is displayed to the user

      get("/output", (request, response) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();
        return new ModelAndView(model, "templates/results.vtl");
      }, new VelocityTemplateEngine());
    }


      public static Char[] userInputArray (String userInput) {
              char[] userInputArray = userInput.toCharArray();

              HashMap<Character, String> vowelMap = new HashMap<Character, String>();
              vowelMap.put('a', "-");
              vowelMap.put('e', "-");
              vowelMap.put('i', "-");
              vowelMap.put('o', "-");
              vowelMap.put('u', "-");

    if(userInput = 'a' || 'e' || ){
      System.out.printLn(userInput);}
    }
 }
