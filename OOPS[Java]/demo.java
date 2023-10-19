public class demo {
    public static class Human
    {
        int age;
        String name;
        String college;
        Human()
        {
            this(23,"utkarsh");
        }
        Human(int age,String name)
        {
            this.age = age;
            this.name = name;
        }
        Human(int age,String name,String college)
        {
            this.age = age;
            this.name = name;
            this.college = college;
        }
    }
    public static void main(String[] args)
    {
        Human h = new Human(23,"Utkarsh","Pes");
        System.out.println(h.age);
        System.out.println(h.name);
        System.out.println(h.college);


    }
}
