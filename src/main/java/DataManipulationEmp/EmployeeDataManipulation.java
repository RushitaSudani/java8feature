package DataManipulationEmp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import matchdata.Match;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EmployeeDataManipulation {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        File file=new File("c:/JavaProjects/Demo_json/src/json/employee.json");
        List<Employee> studentList = mapper.readValue(file, new TypeReference<List<Employee>>(){});
        System.out.println(studentList);
    }
}
