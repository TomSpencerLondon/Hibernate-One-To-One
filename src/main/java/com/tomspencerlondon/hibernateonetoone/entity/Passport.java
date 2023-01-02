package com.tomspencerlondon.hibernateonetoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Passport {

  @Id
  private Long id;

  private String number;


  @OneToOne(mappedBy = "passport")
  Student student;
}
