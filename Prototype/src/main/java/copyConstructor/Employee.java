package copyConstructor;

public class Employee {
    private String name;
    private Address address;

    public Employee(String name, Address address)
    {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee other)
    {
        name = other.name;
        address = new Address(other.address);
    }
}
