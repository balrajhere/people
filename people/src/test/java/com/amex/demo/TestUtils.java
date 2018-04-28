/**
 * 
 */
package com.amex.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

/**
 * @author balraj
 *
 */
public class TestUtils
{
   public static String readFileAsString(String path)
   {
      try
      {
         return new String(Files.readAllBytes(Paths.get(path)));
      }
      catch(IOException e)
      {
         throw new RuntimeException("Failed to read File", e);
      }
   }
   
   public static <V> V toType(String json, Class<V> clazz)
   {
      Gson gson = new Gson();
      return gson.fromJson(json, clazz);
   }
}
