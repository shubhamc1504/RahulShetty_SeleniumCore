import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        //Logic to find nums in array which is multiple of 2

//        for(int i=0; i<arr2.length;i++)
//        {
//            if(arr2[i]%2==0)
//            {
//                System.out.println(arr2[i]);
//                System.out.println("--------------------------------------------");
//            }
//            else
//            {
//                System.out.println(arr2[i] + " is not a multiple of 2");
//                System.out.println("--------------------------------------------");
//            }

        //Dynamic array
        ArrayList<String> a = new ArrayList<String>();
        //create object of that class - object.method
        a.add("Shubham");
        a.add("Sahil");
        a.add("Sagar");
        a.add("Mayur");
        a.add("Amit");
//            System.out.println(a.get(4));
//            System.out.println("--------------------------------------------");

        for (int i = 0; i < a.size(); i++) //size is used in Arraylist
        {
            System.out.println(a.get(i));
        }
        System.out.println("************************************************");

        //For each loop
        for (String val:a)
        {
            System.out.println(val);
        }

        //Item is present in ArrayList or not
        System.out.println(a.contains("Mayur")); //True

        String[] name = {"Shubham", "Sahil", "Sagar", "Mayur", "Amit"};
        List<String> nameArrayList = Arrays.asList(name);
        System.out.println(nameArrayList.contains("Amit")); //True
    }
}
