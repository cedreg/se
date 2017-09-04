package ch.hfict;

import java.util.Map;
import java.util.HashMap;

public class PhoneBook {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Map<Person, String> phonebook = new HashMap<Person, String>();
    
    phonebook.put(new Person("Hans", "Peter"), "0791234565");
    phonebook.put(new Person("cedric", "regenass"), "n/a");
    phonebook.put(new Person("patrick", "studer"), "0763210987");
    
    
    Person key = new Person("Hans", "Peter");
    System.out.println(key.getFirst() + phonebook.get(key));
  }

  
}
