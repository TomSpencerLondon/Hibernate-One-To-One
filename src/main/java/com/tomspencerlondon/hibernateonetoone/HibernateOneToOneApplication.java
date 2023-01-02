package com.tomspencerlondon.hibernateonetoone;



import com.tomspencerlondon.hibernateonetoone.entity.Passport;
import com.tomspencerlondon.hibernateonetoone.entity.Student;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HibernateOneToOneApplication implements CommandLineRunner {

  @Autowired
  private EntityManager entityManager;

  public static void main(String[] args) {
    SpringApplication.run(HibernateOneToOneApplication.class, args);
  }

  @Override
  @Transactional
  public void run(String... args) throws Exception {
    Student student = entityManager.find(Student.class, 1L);
    log.info("Student -> {}", student);
    log.info("Get passport from Student -> {}", student.getPassport());

//    Passport owner
    Passport passport = entityManager.find(Passport.class, 1L);
    log.info("Passport -> {}", passport);
    log.info("Get student from Passport -> {}", passport.getStudent());
  }
}
