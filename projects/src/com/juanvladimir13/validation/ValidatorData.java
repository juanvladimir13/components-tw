package com.juanvladimir13.validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class ValidatorData {

  private final List<ErrorMessage> errors;

  public ValidatorData() {
    this.errors = new LinkedList<>();
  }

  public boolean validate(Object obj) {
    errors.clear();
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();

    Iterator iterator = validator.validate(obj).iterator();
    while (iterator.hasNext()) {
      Object next = iterator.next();
      String message = ((ConstraintViolation) next).getMessage();
      String property = ((ConstraintViolation) next).getPropertyPath().toString();
      
      errors.add(new ErrorMessage(property, message));
    }
    
    return errors.isEmpty();
  }

  public List<ErrorMessage> getErrors() {
    return errors;
  }

  @Override
  public String toString() {
    String group = "<h1>Grupo 03 SA</h1>"; 
    String containerHtml = "<div class='errors'>%s</div>";
    String contentHtml = "";

    for (int i = 0; i < errors.size(); i++) {
      contentHtml += errors.get(i);
    }
    containerHtml += group;
    
    return String.format(containerHtml, contentHtml);
  }
}
