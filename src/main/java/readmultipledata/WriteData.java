package readmultipledata;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteData {
    public static void main(String args[]) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        Book b1=new Book();
        b1.setTitle("b1");
        b1.setIsbn("34567");
        b1.setAuthor(new String[]{"tisha","riyaa"});
        b1.setYear(2023);

        String[] json= new String[]{mapper.writeValueAsString(b1)};
        System.out.println(json);
        for (String v:json)
        {
            System.out.println(v);
        }
    }
}
