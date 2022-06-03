package com.juanvladimir13.validation;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class Persona {
  @PositiveOrZero
  private int id;
  
  @NotNull
  @Size(min = 3, max = 30, message = "Parametrizado")
  private String nombres;
  
  @NotNull
  @Size(min = 3, max = 50)
  private String apellidos;
  
  @Digits(integer=2, fraction=2) 
  private double peso;
  
  @AssertTrue
  private boolean estado;

  public Persona() {
    id = 0;
    nombres = "";
    apellidos = "";
    peso = 21.55;
    estado = false;
  }

  public void setData(String nombres, String apellidos, double peso, boolean estado) {
    this.id = 0;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.peso = peso;
    this.estado = estado;
  }

  public Map<String, String> getData(){
    Map<String, String> data = new HashMap<>();
    data.put("nombres", nombres);
    data.put("apellidos", apellidos);
    data.put("peso", Double.toString(peso));
    data.put("estado", Boolean.toString(estado));
    return data;
  }
}
