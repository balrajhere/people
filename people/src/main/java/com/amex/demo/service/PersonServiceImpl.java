/**
 * 
 */
package com.amex.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amex.demo.model.People;
import com.amex.demo.model.PersonRepository;

/**
 * @author balraj
 *
 */
@Service("personService")
public class PersonServiceImpl implements PersonService
{
   @Autowired
   private PersonRepository personRepository;

   @Override
   public Iterable<People> getPerson()
   {
      return personRepository.findAll();
   }

   @Override
   public People getPerson(final int id)
   {
      return personRepository.findById(id);
   }

   @Override
   public People addPerson(People people)
   {
      return personRepository.save(people);
   }

   @Override
   public People updatePerson(People people, int id)
   {
      People personToBeUpdated = personRepository.findById(id);
      BeanUtils.copyProperties(people, personToBeUpdated);
      return personRepository.save(personToBeUpdated);
   }

   @Override
   public void deletePerson(int id)
   {
      personRepository.deleteById(id);
   }

}
