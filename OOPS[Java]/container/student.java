package container;

public class student {
    private int value;
    int rnoll;

    student()
    {

    }

    student(int value,int rnoll)
    {
        this.value = value;
        this.rnoll = rnoll;
    }
    student(student st)
    {
        this.value = st.value;
        this.rnoll = st.rnoll;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
    public int  getValue()
    {
        return this.value;
    }
    public static void main(String[] args)
{
    student st = new student(10,20);
    st.value = 30;
}

}

