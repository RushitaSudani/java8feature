package jsonGenerator;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
public class WriteArray {
    public static void main(String args[]) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        try(JsonGenerator jgenerator = mapper.getFactory().createGenerator(new File("c:/JavaProjects/Demo_json/src/json/user.json"), JsonEncoding.UTF8))
        {
            jgenerator.useDefaultPrettyPrinter();
            jgenerator.writeStartArray();
            jgenerator.writeStartObject();
            jgenerator.writeStringField("name","Tisha");
            jgenerator.writeNumberField("age", 23);
            jgenerator.writeStartArray();                                   // [

            jgenerator.writeString("msg 1");                            	// "msg 1"
            jgenerator.writeString("msg 2");                            	// "msg 2"
            jgenerator.writeString("msg 3");                            	// "msg 3"

            jgenerator.writeEndArray();
        }
    }
}
