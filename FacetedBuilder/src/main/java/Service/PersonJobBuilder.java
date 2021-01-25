package Service;

import Entities.Person;

public class PersonJobBuilder extends PersonBuilder{

    PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder at (String companyName){
        person.setCompanyName(companyName);
        return this;
    }
    public PersonJobBuilder as (String position){
        person.setPosition(position);
        return this;
    }
    public PersonJobBuilder earning (int annualIncome){
        person.setAnnualIncome(annualIncome);
        return this;
    }
}
