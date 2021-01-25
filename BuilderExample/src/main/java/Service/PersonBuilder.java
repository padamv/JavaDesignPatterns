package Service;

import Entities.Person;

public class PersonBuilder <SELF extends PersonBuilder<SELF>>{
    protected Person person= new Person();

    // critical to return SELF here (to work in case of inheritance)
    public SELF withName(String name){
        person.setName(name);
        return self();
    }

    private SELF self() {
        // unchecked cast, but actually safe
        return (SELF) this;
    }

    public Person build(){
        return person;
    }

}
