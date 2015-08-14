import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.*;

//main methos and layout
public class VowelReplace {
  public static void main(String[] args){
    String layout = "templates/latout.vtl";

    // The page where the user inputs sentence/ inputs page layout
    get("/", (request, response) -> {
      Map<String, String> model = new HashMap<String, String>();
      model.put("template", "templates/input.vtl");
    }, new VelocityTemplateEngine());

    //This is where the useres sentence gets displayed/output page layout
    get("/output", (request, response) ->{
      Map<String, String> model = new HashMap<String, String>();

      String userWord = request.queryParams("userInput");


          model.put("userInput", userWord)

       return new model.put("template", "templates/output.vtl");
     }, new VelocityTemplateEngine());
  }

  //tells us that the userInput will be a string and is made into a char array
  public static String = userInputArray.toCharArray();

  //the Char array that allows the String to break down the characters to be replaced with HashMap info
  char[] userInputArray = userInput.toCharArray();

  //This is the HashMap that dictates that the vowels will be "-"
  HashMap<Character, String> vowelMap = new HashMap<Character, String>();

  vowelMap.put('a', "-");
  vowelMap.put('e', "-");
  vowelMap.put('i', "-");
  vowelMap.put('o', "-");
  vowelMap.put('u', "-");
  //As y is only sometimes a vowel, does it need it's own while loop?
  vowelMap.put('y', "-");








}
