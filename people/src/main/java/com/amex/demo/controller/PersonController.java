/**
 * 
 */
package com.amex.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.amex.demo.model.People;
import com.amex.demo.service.PersonService;

/**
 * @author balraj
 *
 */

@RestController
public class PersonController
{
   @Autowired
   private PersonService personService;
   
   @RequestMapping(value = "/people", method = RequestMethod.GET)
   public ResponseEntity<?> getPersons()
   {
      Iterable<People> people = personService.getPerson();
      return new ResponseEntity<>(people, HttpStatus.OK);
   }
   
   @RequestMapping(value = "/people", method = RequestMethod.POST)
   @ResponseStatus
   public ResponseEntity<?> addPerson(@RequestBody People people)
   {
      People newPerson = personService.addPerson(people);    
      return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
   }
   
   @RequestMapping(value = "/people/{id}", method = RequestMethod.GET)
   public ResponseEntity<?> getPerson(@PathVariable int id)
   {
      return new ResponseEntity<> (personService.getPerson(id), HttpStatus.OK);
   }   
   
   @RequestMapping(value = "/people/{id}", method = RequestMethod.PUT)
   @ResponseStatus
   public ResponseEntity<?> updatePerson(@RequestBody People people)
   {
      People updatedPerson = personService.addPerson(people);    
      return new ResponseEntity<>(updatedPerson, HttpStatus.OK);
   }   
   
   @RequestMapping(value = "/people/{id}", method = RequestMethod.DELETE)
   public ResponseEntity<?> deletePerson(@PathVariable int id)
   {
      personService.deletePerson(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
   }
}
