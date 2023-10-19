public class lec1
{
    public static class Student
    {
        String name;
        int rnoll;
        String hobbie;
        Student(String name,int rnoll)
        {
            this.name = name;
            this.rnoll = rnoll;
        }
        Student()
        {
            this("Utkarsh",1025);
        }
        Student(String name,int rnoll,String hobbie)
        {
            this.name = name;
            this.rnoll = rnoll;
            this.hobbie = hobbie;
        }
        void intro()
        {
            System.out.println("hello from " +this.name+ " "+rnoll);
        }
    }
    public static void main(String[] args)
    {
       Student st = new Student();
        st.intro();   
    }
}