package com.juanvladimir13.template;

import com.juanvladimir13.validation.Persona;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class App {
  public static void main(String[] args) {
    
    MaryTemplate.setFilePath("./templates");
    
    Persona persona = new Persona();
    persona.setData("juan", "vladimir", 45.0, true);
    
    String html = MaryTemplate.render("persona/find", persona.getData());
    System.out.println(html);
  }
}
