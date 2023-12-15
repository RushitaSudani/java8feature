package readmultipledata;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.print.Book;
import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
public class ExecuteJson {
    public static void main(String args[]) throws JsonProcessingException {
        try
        {
            ObjectMapper mapper=new ObjectMapper();
            File bookfile=new File("c:/JavaProjects/Demo_json/src/json/book.json");
          //  Book[] book= new Book[]{mapper.readValue(bookfile, Book.class)};
            Book[] book = mapper.readValue(bookfile, Book[].class);
            System.out.println(Arrays.asList(book));

            //List<Book> book1= Arrays.asList(mapper.readValue("c:/files/book.json", Book.class));
            // book.wait(System.out::println);
            //Book book = mapper.readValue(Paths.get("c:/files/book.json").toFile(), Book.class);
            //System.out.println(book.toString());

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
