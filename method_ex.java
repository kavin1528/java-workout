// import java.util.Scanner;

// public class method_ex {
    
//     public static void main(String args[])
//     {
//         // java in-built methods 
//         // Scanner in = new Scanner(System.in);
//         // System.out.println("Absolute value   :  "+Math.abs(-32));
//         // System.out.println("round value      :  "+Math.round(2.34));
//         // System.out.println("Ceil value       :  "+Math.ceil(2.87));
//         // System.out.println("Floor value      :  "+Math.floor(2.87));

//         // double a=2;
//         // double b =3;
//         // System.out.println("Maximum number of a and b            : " +Math.max(a, b));
//         // System.out.println("Square root of b is                  : " +Math.sqrt(b));
//         // System.out.println("power of a and b is                  : " +Math.pow(a,b));
//         // System.out.println("Logarithm of a is                    : " +Math.log(a));
//         // System.out.println("log10 of a is                        : " +Math.log10(a));
//         // System.out.println("sine value of a is                   : " +Math.sin(a));
//         // System.out.println("Cosine value of a is                 : " +Math.cos(a));
//         // System.out.println("Tnagent value of a is                :  "+ Math.tan(a));

        
//     }
// }











import java.util.Scanner;

class method
{
    // // no return  without argument public    
    // public void add()
    // {
    //     Scanner in =new Scanner(System.in);
    //     System.out.println("Enter two number : ");
    //     int a = in.nextInt();
    //     int b = in.nextInt();
    //     System.out.println( " Add  : "+(a+b));
    // }


    // // No return with argument public
    // public void subt(int a, int b)
    //     {
    //         System.out.println( " sub  : "+ (a-b));
    //     }

    

    // // Return without arg
    // public int mul()
    // {
    //     int a,b;
    //     a=10;
    //     b=20;
    //     return a*b;
    // }

    
    
    // //  Return with arg
    // public float div(int x,int y)
    // {
    //     return x/y;
    // }


    // public float mod(int x,int y)
    //     {
    //         return x%y;
    //     }

    // Recursion function   --  oru function thana thaney call panikita adhuku peru recursion . Ex factorial
    public int factorial(int n)
    {
        if (n==1)
        {
            return 1;   
        }
        else
        {
            return(n*factorial(n-1));
        }
    }

}


    


public class method_ex {

    public static void main (String args[])
    {
        method o= new method();
        // System.out.println(" Multiple  : "+o.mul());
        // System.out.println(" divison  : "+o.div(92,5));
        // System.out.println("mod  : "+o.mod(10, 7));
        System.out.println("fact   : "+o.factorial(5));
    }
        
}
   

// idhelam main class ku veliya pandradhu so static theva padadhu


