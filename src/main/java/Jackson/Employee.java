package Jackson;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private String address;
    private List technologies=new ArrayList<>();

    public Employee(String firstName, String lastName, String address, List technologies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.technologies = technologies;
    }

    public Employee() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List technologies) {
        this.technologies = technologies;
    }
}
