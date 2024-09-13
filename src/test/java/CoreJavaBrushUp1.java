public class CoreJavaBrushUp1 {
    public static void main(String[] args)
    {
        int num =15; //Int is primitive datatype
        String name = "Shubham Choudhury"; //String is Non-primitive datatype
        char letter ='r'; //Char is with single ''
        double dec =6.999; // Double or float both works here
        boolean myCard = true;

        System.out.println(num+" is the value stored in num variable");
        System.out.println("--------------------------------------------");
        System.out.println(name);
        System.out.println("--------------------------------------------");

        //Arrays
        int[] arr =new int[5];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 2;

        int[] arr2 = {1,2,3,4,5,6,7,8,9};

        //for loop iteration
        for(int i=0; i<arr.length;i++)
        {
            //System.out.println(i);
            System.out.println(arr[i]);
            System.out.println("--------------------------------------------");

        }

        for(int i=0; i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
            System.out.println("--------------------------------------------");
        }

        String[] names ={"Shubham", "Sahil", "Deepak"};
        //for loop
        for(int i=0; i<names.length;i++)
        {
            System.out.println(names[i]);
            System.out.println("--------------------------------------------");
        }

        //for each loop or enhanced for loop
        for (String s:names)
        {
            System.out.println(s);
            System.out.println("--------------------------------------------");
        }
    }
}
