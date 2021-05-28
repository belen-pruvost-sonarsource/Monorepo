package org.sonarsource.monorepo.module2;

import org.sonarsource.monorepo.library.Person;

public class Module2App {
  Person person = new Person();

  private void someMethod() {
    
    //TODO: Code smell 1
      while(true) {
        
      }
    
    //TODO: Code smell 2
    }
}
