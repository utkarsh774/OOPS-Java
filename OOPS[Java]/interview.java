import java.util.PriorityQueue;
import java.util.Scanner;

public class interview {
    
    public static int solution(int[] arr,int n)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }

       for(int i=1;i<=n-2;i++)
       {
        pq.remove();
       }
      int ans =  pq.peek();
     return ans;
    }

 // ->   9  6
 
 
// n  = 5
// 2 3 9 5 6
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }

       int ans =  solution(arr,n);
       System.out.print(ans);
    }
}
