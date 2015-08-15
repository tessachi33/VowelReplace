
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

           String userInput = request.queryParams("userInput");

            String outPut = vowel(userInput);

            model.put("userInput", userInput);
            model.put("outPut", vowel(userInput));
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());
   }

//grabbing the user's input String
  public static String vowel(String userInput){

      //making the input String's letters lowercase
      String input = userInput.toLowerCase();

      //make an empty output sting to create string in for
      String userOutput = "";

      //making the String's letters into an array
      String [] inputArray = input.split("");

      //going into the letter array and
      for(String letter : inputArray) {

        if (letter == "a"){
          userOutput.concat("-");
        } else if (letter == "e"){
          userOutput.concat("-");
        } else if (letter == "i"){
          userOutput.concat("-");
        } else if (letter == "o"){
          userOutput.concat("-");
        } else if (letter == "u"){
          userOutput.concat("-");
        } else{
          userOutput.concat(letter);
        };

      }
    return userOutput;

  }
}
