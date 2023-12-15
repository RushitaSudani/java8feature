package matchdata;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javaobjectlistmap.Staff;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ManipulationJson {
    public static void main(String args[]) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        File file=new File("c:/JavaProjects/Demo_json/src/json/match.json");
        List<Match> studentList = mapper.readValue(file, new TypeReference<List<Match>>(){});
       // System.out.println(studentList.toString());
        List<Match> m1= studentList.stream().filter(e->e.getTeam1().startsWith("C")).collect(Collectors.toList());
        //System.out.println(m1);

        List<Match> tosswin=studentList.stream().filter(e->(e.getToss_decision().equals("bat"))).collect(Collectors.toList());
        List<Match> win=tosswin.stream().filter(e-> Boolean.parseBoolean(e.getToss_winner())).collect(Collectors.toList());
       // System.out.println(win);

        Long counter=studentList.stream().filter(e->e.getPlayer_of_match().equals("AC Gilchrist")).collect(Collectors.counting());
        //System.out.println("AC Gilchrist player of match is ::"+counter+" times");

       Map<Boolean,List<Match>> lst= studentList.stream().collect(Collectors.partitioningBy(player->player.getSeason()==2008));
        lst.forEach((k,v)->System.out.println("key:"+k+"Value:"+v));
    }
}
