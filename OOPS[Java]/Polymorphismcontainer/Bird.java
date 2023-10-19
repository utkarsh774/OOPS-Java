package Polymorphismcontainer;

public class Bird {
 
    void sound()
    {
        System.out.println("tweet tweet tweet");
    }

    public static void main(String[] args)
    {
        Bird bird = new sparrow();
        bird.sound();
    }

}
