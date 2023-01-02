package com.tomspencerlondon.hibernateonetoone.entity;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Student {

  @Id
  private Long id;

  private String name;

  @OneToOne(fetch = FetchType.LAZY)
  Passport passport;

  @Override
  public String toString() {
    return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
  }
}
