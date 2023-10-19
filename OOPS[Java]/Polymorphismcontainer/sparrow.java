package Polymorphismcontainer;

public class sparrow extends Bird{
    @Override
     void sound()
    {
        System.out.println("TwrrTwrrTwrr");
    }


    public static void main(String[] args)
    {
        sparrow sp = new sparrow();
        sp.sound();
    }
}
