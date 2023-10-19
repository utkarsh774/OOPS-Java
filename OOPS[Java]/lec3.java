public class lec3
{
   public static class Box
   {
       int l;
       int b;
       int h;

       Box()
       {

       }
       Box(int l,int b,int h)
       {
        this.l = l;
        this.b = b;
        this.h = h;
       }
       // copy constructor
       Box(Box box)
       {
           this.l = box.l;
           this.b = box.b;
           this.h = box.h;
       }
   }
  public static class Box2 extends Box
  {
        int w;
        Box2(int l,int b,int h,int w)
        {
            super(l, b, h);
            this.w = w;

        }
  }
   public static void main(String[] args)
   {
        // Box box = new Box(1,2,3);
        // Box box2 = new Box(box);
        // System.out.println(box.l + " "+box.b+" "+box.h);
        // System.out.println(box2.l+" "+box2.b+" "+box2.h);
        Box2 box2 = new Box2(1,2,3,4);
        

   }
}