package App;

import Entities.Person;
import Service.PersonBuilder;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder
                .lives()
                    .at("123 London Road")
                    .in("London")
                    .withPostcode("SW123B")
                .works()
                    .at("Fabrikam")
                    .as("Engineer")
                    .earning(123456)
                .build();
        System.out.println(person);
    }
}
