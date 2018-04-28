/**
 * 
 */
package com.amex.demo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author balraj
 *
 */
public interface PersonRepository extends CrudRepository<People, Integer>
{
   
   public People findById(@Param("Id") int id);

}
