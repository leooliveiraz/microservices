package br.com.leorocha.userservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private boolean validated;

  public User(Long id, String name, boolean validated) {
    this.id = id;
    this.name = name;
    this.validated = validated;
  }

  public User() {
  }

  public Long getId() {
    return id;
  }
  public boolean isValidated() {
    return validated;
  }
  public void setValidated(boolean validated) {
    this.validated = validated;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setId(Long id) {
    this.id = id;
  }
}
