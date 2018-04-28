package com.amex.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
public class People implements Serializable
{
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

   private String age;

   @Temporal(TemporalType.DATE)
   @Column(name = "date_of_birth")
   private Date dateOfBirth;

   @Column(name = "email_address")
   private String emailAddress;

   private String name;

   public People()
   {
   }

   public int getId()
   {
      return this.id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public String getAge()
   {
      return this.age;
   }

   public void setAge(String age)
   {
      this.age = age;
   }

   public Date getDateOfBirth()
   {
      return this.dateOfBirth;
   }

   public void setDateOfBirth(Date dateOfBirth)
   {
      this.dateOfBirth = dateOfBirth;
   }

   public String getEmailAddress()
   {
      return this.emailAddress;
   }

   public void setEmailAddress(String emailAddress)
   {
      this.emailAddress = emailAddress;
   }

   public String getName()
   {
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

}