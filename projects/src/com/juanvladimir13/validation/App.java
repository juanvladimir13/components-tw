package com.juanvladimir13.validation;

import com.juanvladimir13.template.MaryTemplate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class App {

  public static void main(String[] args) {
    MaryTemplate.setFilePath("./templates");
    
    Persona persona = new Persona();
    ValidatorData validatorData = new ValidatorData();
    
    if (!validatorData.validate(persona)) {
      
      Map<String, String> data = new HashMap<>();
      data.put("errors", validatorData.toString());
    
      String html = MaryTemplate.render("persona/errors", data);
      System.out.println(html);
    };
  }
}
