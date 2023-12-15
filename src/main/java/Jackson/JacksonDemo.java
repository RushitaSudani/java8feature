package Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.Demo_json.EmployeeEx;
import com.fasterxml.jackson.core.*;

public class JacksonDemo {
    public static void main(String args[]) throws JsonProcessingException {
        Employee e1=new Employee();
        e1.setFirstName("tisha");
        e1.setLastName("sudani");
        e1.setAddress("amreli");
        e1.getTechnologies().add("java");
        e1.getTechnologies().add("python");
        e1.getTechnologies().add("html");
        ObjectMapper mapper=new ObjectMapper();

       // mapper.writeValue(new File("c:/files/emp.json"),new File());

        //String json=mapper.writeValueAsString(e1);
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e1);
        System.out.println(json);
        System.out.println("done..........");
        System.out.println("Desealization of json to object");



        Employee emp2 = mapper.readValue(json, Employee.class);
        // Employee emp = mapper.readValue(json, Employee.class);
        System.out.println("name ::" +emp2.getFirstName());
        System.out.println("last name :: "+emp2.getLastName());
        System.out.println("Address is :: "+emp2.getAddress());
        System.out.println("techologies is ::"+emp2.getTechnologies());
    }

}
