public class MethodsDemo {
    public static void main(String[] args)
    {

        MethodsDemo d = new MethodsDemo(); //Create object
        String name = d.getData(); //Creating object and then using the object to call method()
        System.out.println(name);

        MethodsDemo2 d1 = new MethodsDemo2(); //Object for another method present outside
        d1.getUsersData();

        getData2(); //Calling method directly without creating object for it

    }
    //Why Method
    //Create method outside main block
    public String getData()
    {
        System.out.println("Hello!");
        return "Shubham";
    }

    public static void getData2() //Static keyword moves method belong to class level
    {
        System.out.println("Hello TCS!");
    }
}
