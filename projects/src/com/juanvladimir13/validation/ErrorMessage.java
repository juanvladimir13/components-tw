package com.juanvladimir13.validation;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class ErrorMessage {
  private String property;
  private String message;

  public ErrorMessage(String property, String message) {
    this.property = property;
    this.message = message;
  }

  public String getProperty() {
    return property;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public String toString() {
    String html = "<p class='error'><strong>%s</strong> : %s</p>";
    return String.format(html, property, message);
  }
}
