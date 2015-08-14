
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

    


}
