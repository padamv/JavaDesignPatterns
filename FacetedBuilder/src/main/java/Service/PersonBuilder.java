package Service;

import Entities.Person;

public class PersonBuilder {

    protected Person person = new Person();

    public Person build(){
        return person;
    }
}
