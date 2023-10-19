
import java.util.*;
public class lec2 {
  
    
    public  static class Human
    {
        String name;
        int age;
        // When a variable is defined static it's value can be read without making an object
        // Class name can be used to ascess the variable
        static long population;

        Human(String name,int age)
        {
            this.name  = name;
            this.age = age;
            Human.population +=1;
        }
        Human()
        {

        }

    }

    
    public static void fun1()
    {
       
    }
    public  void fun2()
    {
        fun1();
    }
    public static void main(String[] args)
    {
    //     Human h1 = new Human("Utkarsh",22);   
    //   System.out.println(Human.population);
    //     Human h2 = new Human("Mannu",23);
    //     System.out.println(Human.population);

         System.out.println(Human.population);
    }

}
