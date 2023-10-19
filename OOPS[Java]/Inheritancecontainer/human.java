package Inheritancecontainer;
public class human {
   String name;
   int age;

   human()
   {

   }

   human(String name,int age)
   {
     this.name = name;
    this.age = age;
   }

   human(human h)
   {
       this.name = h.name;
       this.age = h.age;
   }

   void sayHello()
   {
       System.out.println("Hello from human");
   }
}
