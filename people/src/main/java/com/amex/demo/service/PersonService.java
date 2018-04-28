/**
 * 
 */
package com.amex.demo.service;

import com.amex.demo.model.People;

/**
 * @author balraj
 *
 */
public interface PersonService
{
   
   public Iterable<People> getPerson();
   
   public People addPerson(final People people);
   
   public People getPerson(final int id);
   
   public People updatePerson(final People people, final int id);
   
   public void deletePerson(final int id);

}
