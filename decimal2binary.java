// import java.util.Scanner;
// // decimal_to_binary

// public class decimal2binary {

//     public static void decimal_to_binary(int n)
//     {
        
//         int [] binaryNum=new int[1000];

//         int i=0; // loop condition start from 0
//         while (n>0)  // 0 va vida adhigama irundha conditon kula pogum 
//         {
//             binaryNum[i]=n%2;    // 0  0 1 1
//             n=n/2;   // 6  3 1 0
//             i++;   // 1 2 3 4
//         }
//         for(int j=i-1;j>=0;j--)
//         {
//             System.out.print(binaryNum[j]);
//         }

//     }
    
//     public static void main(String args[])
//     {
//         Scanner in = new Scanner(System.in);
//         System.out.println("enter the decimal num :");   // 12
//         int n = in.nextInt();
//         System.out.println("decimal num : " +n);
//         System.out.print("binary num : ");
//         decimal_to_binary(n);


//     }
// }









// binary to decimal 

/*
 * 
 * 1   1   0   0 
 * 
 * 0*2^0  0
 * 0*2^1  0
 * 1*2^2  4
 * 1*2^3  8
 *      -----
 *       12
 */
public class decimal2binary

{
    public static int bin2dec(int binary)
    {
        int decimal=0, power =0;
        while (binary!=0)
        {
            int remainder=binary%10;   // 0 0 1 1
            decimal+=remainder * Math.pow(2, power);   // 0 +0 + 4 +8 =12
            binary=binary/10;
            power++;
        }
        return decimal;
    }
    public static void main(String[] args) 
    {
        System.out.println(" 1100 - decimal value is : "+bin2dec(1100));   
    }
}