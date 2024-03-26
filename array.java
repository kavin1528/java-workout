import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        // int  a[]={10,20,30,40,50,60,70,80,90};
        // System.out.println(a[5]);


        // print one by one
        // for (int i = 1; i <= a.length; i++) 
        // {
        //     System.out.println(a[i]);   
        // }

        //  this also print one by one by using enhanced for loop
        // for(int element : a)
        // {
        //     System.out.println(element);
        // }

        // int b[];
        // b=new int[10];
        // // System.out.println(b);
       
        // for(int element : b)
        // {
        //     System.out.println(element);
        // }
        

        // int [] c=new int[10];
        // System.out.println(" enter the limit : ");
        // int y=in.nextInt();
        // for(int i=1;i<=y;i++)
        // {
        //     System.out.println("Enter the value : ");
        //     c[i]=in.nextInt();    // c[] la iruka 10 values 0 0.... 0  adhula c[i] i ah ula stuff pandrom  result i la 3 limit so andha 10   0 la oru 3 valuse matum inupt la ena kudukurangalo adhu venum   
        // }
           
           
        // for(int element : c)

        // {
        //     System.out.println(element);
        // }



        
        

        // int e=0,o=0;
        // System.out.println(" enter the limit : ");
        // int n=in.nextInt();
        // int [] a= new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println("Enter a["+i+"] value : ");
        //     a[i]=in.nextInt();
        // }
        // for(int element : a)
        // {
        //     System.out.println(element);
        //     if (element%2==0)
        //     {
        //         e++;
        //     }
        //     else
        //     {
        //         o++;
        //     }

        // }
        // System.out.println("Total even num : " +e);
        // System.out.println("Total odd num : " +o);











        // // Two dimension array
        // int [][] a={

        //     {10,20,30},
        //     {40,50,60},
        //     {70,80,90}

        // };
        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<3;j++)
        //     {
        //         System.out.print(" " +a[i][j]);
        //     }
        //     System.out.println(" ");
        // }


        // // To create two dimension array 5row 5colm
        // int [][] b= new int[5][5];
        // // To create three dimension array
        // int[][][] c=new int[5][5][5];









        // // Jagged array
        // /*
        //  * 5,6,7,8
        //  * 7,5.4
        //  * 8,5,3,9
        //  */

        // int[][] a={

        //     {5,6,7,8},
        //     {7,5,4},
        //     {8,5,3,9}

        // };
        // for(int i=0;i<a.length;i++)
        // {
        //     for(int j=0;j<a[i].length;j++)
        //     {
        //         System.out.print(" "+a[i][j]);
        //     }
        //     System.out.println(" ");
        // }

        // for(int k[]:a)
        // {
        //     for(int l:k)
        //     {
        //         System.out.print(" " +l);
        //     }
        //     System.out.println(" ");
        // }









        //  int a =3,b=9;


        // // Ascending order
        // int []a={25,12,3,60,9,8};
        // int temp;
        // System.out.println(" Before sort : " +Arrays.toString(a));

        // for(int i=0;i<a.length;i++)
        // {
        //     for(int j=0;j<a.length;j++)
        //     {
        //         if (a[i]<a[j])
        //         //   25 < 12
        //         {
        //             temp=a[i];
        //             a[i]=a[j];
        //             a[j]=temp;
        //         }

        //     }

        // }
        // System.out.println("After sort : "+ Arrays.toString(a));






        // Insert value
        // int[] a={10,20,30,40,50,60,70,80,90};
        // System.out.println("Before insert : "+Arrays.toString(a));

        // int index=3;
        // int value = 55;
        // for(int i=a.length-1;i>index;i--)
        // {
        //     a[i]=a[i-1];
        // }
        // a[index]=value;
        // System.out.println("After insert : "+Arrays.toString(a));

        










        // // Find Duplicate 
        // int i,j;
        // int[]a={2,3,5,2,7,5,3};
        
        // for(i=0;i<a.length;i++)
        // {
        //     for(j=i+1;j<a.length;j++)
        //     {
        //         if ((a[i]==a[j]) && (i!=j))
        //         {
        //             System.out.println("Duplicate Element : "+a[j]);   
        //         }
        //     }
        // }

















        // ASCII

        // for(int i=0;i<=255;i++)
        // {
        //     System.out.println(i + " "+(char)i);
        // }
        int i =1;
        int j=2;
        System.out.println( (char)i);
        System.out.println( (char)j);


    }
}
