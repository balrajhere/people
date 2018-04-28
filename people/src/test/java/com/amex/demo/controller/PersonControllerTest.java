/**
 * 
 */
package com.amex.demo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.amex.demo.TestUtils;
import com.amex.demo.model.People;

/**
 * @author balraj
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonControllerTest
{

   @Autowired
   PersonController personController;

   /**
    * @throws java.lang.Exception
    */
   @Before
   public void setUp() throws Exception
   {
   }

   /**
    * Test method for {@link com.amex.exercise.controller.PersonController#getPersons()}.
    */
   @Test
   public void testGetPersons()
   {
      ResponseEntity<?> response = personController.getPersons();
      assertEquals(HttpStatus.OK, response.getStatusCode());
   }

   /**
    * Test method for {@link com.amex.exercise.controller.PersonController#addPerson(com.amex.exercise.model.People)}.
    */
   @Test
   public void testAddPerson()
   {
      String json = TestUtils.readFileAsString("src/test/resources/createPeople.json");
      People people = TestUtils.toType(json, People.class);
      ResponseEntity<?> response = personController.addPerson(people);
      assertEquals(HttpStatus.CREATED, response.getStatusCode());
   }

   /**
    * Test method for {@link com.amex.exercise.controller.PersonController#getPerson(int)}.
    */
   @Test
   public void testGetPerson()
   {
      ResponseEntity<?> response = personController.getPerson(1);
      assertEquals(HttpStatus.OK, response.getStatusCode());
   }

   /**
    * Test method for
    * {@link com.amex.exercise.controller.PersonController#updatePerson(com.amex.exercise.model.People)}.
    */
   @Test
   public void testUpdatedPerson()
   {
      String json = TestUtils.readFileAsString("src/test/resources/updatePeople.json");
      People people = TestUtils.toType(json, People.class);
      ResponseEntity<?> response = personController.updatePerson(people);
      assertEquals(HttpStatus.OK, response.getStatusCode());
   }

   /**
    * Test method for {@link com.amex.exercise.controller.PersonController#deletePerson(int)}.
    */
   @Ignore
   @Test
   public void testDeletePerson()
   {
      ResponseEntity<?> response = personController.deletePerson(1);
      assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
   }

}
