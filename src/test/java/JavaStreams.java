import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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


    @Test
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
}
