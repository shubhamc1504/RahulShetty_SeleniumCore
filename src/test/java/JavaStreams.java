import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {
    //@Test
    public void regular()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Shubham");
        names.add("Mayur");
        names.add("Sahil");
        names.add("Amit");
        names.add("Siddharth");
        names.add("Sagar");
        names.add("Ajinkya");
        names.add("Sachin");
        int count = 0;

        for(int i=0; i < names.size();i++)
        {
            String actual = names.get(i);
            if(actual.startsWith("S"))
            {
                count ++;
            }
        }
        System.out.println(count);
    }


    //@Test
    public void streamFilter()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Shubham");
        names.add("Mayur");
        names.add("Sahil");
        names.add("Amit");
        names.add("Siddharth");
        names.add("Sagar");
        names.add("Ajinkya");
        names.add("Sachin");

        Long c = names.stream().filter(s->s.startsWith("S")).count();
        System.out.println(c);
    }

    @Test
    public void streamMap()
    {
        //prints name which has last char r to upper case
        Stream.of("Shubham", "Ajinkya", "Sachin", "Siddharth", "Sagar", "Sahil", "Mayur")
                .filter(s->s.endsWith("r"))
                .map(s->s.toUpperCase())
                .forEach(s->System.out.println(s));

        //sorting array into Stream
        List<String> names = Arrays.asList("Ronaldo", "Azpillicueta", "Adama", "Acosta", "Messi", "Ansu");
        names.stream()
                .filter(s->s.startsWith("A"))
                .sorted()
                .map(s->s.toUpperCase())
                .forEach(s->System.out.println(s));
    }
    @Test
    public void streamCollect()
    {
        List<Integer> values = Arrays.asList(3,2,5,6,6,8,9,9,7,1,1);
        //print unique numbers
        values.stream().distinct().forEach(s->System.out.println(s));
        List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li.get(2));
    }
}

