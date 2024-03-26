
// idhuku keela pana poradhu main class kula pana poradhu so static use pani dhan cl pana mudiyum
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// public class method_array 
// {
//     public static int[] sortArray()
//     {
//         Scanner in = new Scanner(System.in);
//         System.out.println("enter the limit : ");
//         int n= in.nextInt();
//         int []a=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             System.out.println("Enter the value " +i+ ": " );
//             a[i]=in.nextInt();
//         }
//         Arrays.sort(a);
//         return a;
//     }

//     public static void main(String[] args) 
//     {
//         int ar[]=sortArray();
//         for(int ab:ar)
//         {
//             System.out.println(ab);
//         }   
//     }


// }









// static use pandra nala direct ah main prgm la cl panikalam 
class Math
{
    public static int pow(int base , int power)
    {
        int result=1;
        for(int i=1;i<=power;i++)
        {
            result*=base;
        }
        return result;
    }
}

public class method_array {

    public static void main(String[] args) {
        
        // math o =new math();   indha mari oru object create pana theva ila adhukaga dhan static use pandrom
        
        System.out.println("power : "+Math.pow(2, 3));
    }
}