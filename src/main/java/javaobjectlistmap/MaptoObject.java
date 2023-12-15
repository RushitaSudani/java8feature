package javaobjectlistmap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.w3c.dom.NameList;

import java.awt.print.Book;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class MaptoObject {
    public static void main(String args[]) throws IOException {

        ObjectMapper mapper=new ObjectMapper();
        File file=new File("c:/JavaProjects/Demo_json/src/json/new.json");
       // Staff[] staff = mapper.readValue(file, Staff[].class);

        List<Staff> studentList = mapper.readValue(file, new TypeReference<List<Staff>>(){});
        //System.out.println(studentList);
        //1 startwith t
        studentList.stream().filter(e -> e.getName().charAt(0) == 't').forEach(System.out::println);
        //2 age<=20
        List<Staff> list1=studentList.stream().filter(e->e.getAge()<=20).collect(Collectors.toList());
        //System.out.println(list1);

        List<Staff> li= list1.stream().filter(e->e.getPosition().equals("Director")).collect(Collectors.toList());
        System.out.println(li);

        /*
        List<Staff> s1=new ArrayList<>();
        s1=Arrays.asList(mapper.readValue(file,Staff.class));
        System.out.println(s1);
        */

      //  System.out.println(Arrays.asList(staff));
        //List<String> list1=new ArrayList(Arrays.asList(staff));
       // List newnames=list1.stream().filter(e->e.hashCode()).collect(Collectors.toList());
       // List<String> list2 = list1.stream().filter(h->h.startsWith("t")).toList();

       // System.out.println(list2.toString());

        /*
        for(Staff s:staff)
        {
            System.out.println("Name ::"+s.getName());
            System.out.println("Age ::"+s.getAge());
            System.out.println("Possition ::"+ Arrays.toString(s.getPosition()));
            System.out.println("Skill ::"+s.getSkills());
            System.out.println("Salary ::"+s.getSalary());

            System.out.println("------------------------------------------------");
        }



       // Staff staff=createStaff();
        /*
        try
        {
            //Staff staff=new Staff();
            //convert java object to json file
            mapper.writeValue(new File("c:/files/new.json"),staff);
            String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
            System.out.println(json);

            System.out.println("Deserialization on json to object");

            Staff s1=mapper.readValue(json,Staff.class);
            System.out.println(s1.getName());
            System.out.println(Arrays.toString(s1.getPosition()));
            System.out.println(s1.getSalary());
            System.out.println(s1.getSkills());


        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static Staff createStaff() {
        Staff staff=new Staff();
        staff.setName("tisha");
        staff.setAge(22);
        staff.setPosition(new String[]{"CEO","founder","director"});
        Map<String, BigDecimal> salary=new HashMap<>(){{
            put("1",new BigDecimal(120000));
            put("2",new BigDecimal(4567));
            put("3",new BigDecimal(34567865.345));
        }};
        staff.setSalary(salary);
        staff.setSkills(Arrays.asList("java","python","c++"));

        return staff;*/
    }
}
