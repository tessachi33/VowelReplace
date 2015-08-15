
import java.util.Map;
import java.util.HashMap;
import java.io.Console;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class VowelReplace {
   public static void main(String[] args){
     String layout = "templates/layout.vtl";

     get("/", (request, response) -> {
       Map<String, Object> model = new HashMap<String, Object>();
       model.put("template", "templates/input.vtl");
       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

     get("/output", (request, response) -> {
       Map<String, Object> model = new HashMap<String, Object>();
       model.put("template", "templates/output.vtl");


       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());
   }

//grabbing the user's input String
  public static String vowel(String userInput){

      //making the input String's letters lowercase
      String input = userInput.toLowerCase();

      //making the String's letters into an array
      String [] inputArray = input.split("");

      //going into the letter array and
      for(String letter : inputArray) {

        if (letter == "a"){
          System.out.println("-");
        } else if (letter == "e"){
          System.out.println("-");
        } else if (letter == "i"){
          System.out.println("-");
        } else if (letter == "o"){
          System.out.println("-");
        } else if (letter == "u"){
          System.out.println("-");
        } else{
          System.out.println(letter);
        };

      }
    return userInput;

  }
}
