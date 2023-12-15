package com.json.Demo_json;

public class EmployeeEx {
    private String FirstName;
    private String LastName;
    private String address;

    public EmployeeEx(String firstName, String lastName, String address) {
        FirstName = firstName;
        LastName = lastName;
        this.address = address;
    }

    public EmployeeEx() {

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCompany() {
    }


}
