/*
 *  String is immutable     
 * eg: 
 *      string s1= "joe";
 *      string s2 ="joe";  
 *     it will take first one  bcz the values are same it will first stored in s1 so this did't consider sec 
* 
 stringBuffer is mutable 
 eg:
        stringBuffer s1="joe"
        stringBuffer s2="joe"
        it will store joe value in seperate plc did not store in existing plc .its a diff variable and diff value store seperte location 
 */
import java.util.Scanner;

public class Strings_concept {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

//         // String in java 
//         String a= "joe";
//         String b = "Tutor joe";
//         System.out.println(" A           : "+a);
//         System.out.println(" B           : "+b);
//         System.out.println(" A Hashcode  : "+a.hashCode());   // HashCode means memory address
//         System.out.println(" B  Hashcode : "+b.hashCode());
//         System.out.println(" Equals      : "+a.equals(b));
//         System.out.println(" Length      : "+a.length());         //space um count panum
//         System.out.println(" Charactor   : "+a.charAt(0));    // space um consider panum
//         System.out.println(" Upper case  : "+a.toUpperCase());
//         System.out.println("Replace      : "+a.replace("joe","kavin"));
//         System.out.println("Contains     : "+a.contains("joe"));   // joe word a la iruka 
//         System.out.println(" Empty       : "+a.isEmpty());
//         System.out.println("EndWith      : "+a.endsWith("e"));
//         System.out.println("StartWith      : "+a.startsWith("j"));
//         System.out.println("SubString      : "+a.substring(1));
//         System.out.println("SubString      : "+a.substring(0,1));
//         System.out.println(" A Trim : "+a.trim());     // theva iladha space ah trim panirum
//         System.out.println(" A Trim length : "+a.trim().length());

//         // char ah array va consider panika mudiyum
//         char[] carry =b.toCharArray();
//         {
//             for(char d : carry)
//             {
//                 System.out.print(d);
//             }
//         }

      






        // StringBuffer

        // StringBuffer buffer = new StringBuffer("kavin");
        // System.out.println(buffer);
        // buffer.append("prakaash");
        // System.out.println(buffer);
        // buffer.insert(8,"dd");
        // System.out.println(buffer);
        // buffer.replace(4,7, "rrr");
        // System.out.println(buffer);
        // buffer.delete(4, 7);
        // System.out.println(buffer);
        // buffer.reverse();
        // System.out.println(buffer);
        // System.out.println(buffer.charAt(2));
        // System.out.println(buffer.length());
        // System.out.println(buffer.substring(1));
        // System.out.println(buffer.substring(2,4));

        // StringBuffer sb=new StringBuffer();
        // System.out.println(sb.capacity());
        // sb.append("kavin");
        // System.out.println(sb.capacity());
        // sb.append("cat can walk in road");
        // System.out.println(sb.capacity());












        // // StringBuilder

        // StringBuilder a=new StringBuilder("Kavin - Age is 21@#^");
        // System.out.println(a);
        // int upper =0,lower=0,space=0,number=0,vowels=0,i;

        // for(i=0;i<a.length();i++)
        // {
        //     if (a.charAt(i)>=97 && a.charAt(i)<=122)
        //     {
        //         lower++;   
        //     }
        //     if (a.charAt(i)>=65 && a.charAt(i)<=90)
        //     {
        //         upper++;   
        //     }
        //     if (a.charAt(i)==32)
        //     {
        //         space++;   
        //     }
        //     if (a.charAt(i)>=48 && a.charAt(i)<=57)
        //     {
        //         number++;   
        //     }
        //     if (a.charAt(i) =='A'||a.charAt(i) =='E'||a.charAt(i) =='I'||a.charAt(i) =='O'||a.charAt(i) =='U'||a.charAt(i) =='a'||
        //     a.charAt(i) =='e'||a.charAt(i) =='i'||a.charAt(i) =='o'||a.charAt(i) =='u')
        //     {
        //         vowels++;   
        //     }

           
        // }
        // System.out.println("Upper case : "+upper);
        // System.out.println("lower case : "+lower);
        // System.out.println("space      : "+space);
        // System.out.println("number     : "+number);
        // System.out.println("vowels     : "+vowels);
        // System.out.println("Length     : "+a.length());
        
        


        // // StringBuilder reverse program

        // StringBuilder a=new StringBuilder("tutor joes computer ");
        // System.out.println(a);
        // StringBuilder b = new StringBuilder();
        // for(int i =a.length()-1;i>=0;i--)
        // {
        //     b.append(a.charAt(i));
        //     System.out.println(b);
        // }
        
        // StringBuilder an =new StringBuilder("tutor joes computer ");
        // an.reverse();
        // System.out.println(an);
        





        // // program to convert string to uppercase

        // StringBuilder an =new StringBuilder("abc ");
        // System.out.println("Orginal input  : "+an);
        // for(int i=0;i<an.length();i++)
        // {
        //     if (an.charAt(i)>=97 && an.charAt(i)<=122) 
        //     {
        //         int c= (int)an.charAt(i)-32;  // 97-32=65     98-32=66       99-32=64 
        //         an.setCharAt(i, (char)c);   //    A               B              C
        //     }   
            
        // }

        // System.out.println(" Upper case : "+an);





        // // program to convert string to Lowercase

        // StringBuilder an =new StringBuilder("ABCD ");
        // System.out.println("Orginal input  : "+an);
        // for(int i=0;i<an.length();i++)
        // {
        //     if (an.charAt(i)>=65 && an.charAt(i)<=90) 
        //     {
        //         int c= (int)an.charAt(i)+32;  
        //         an.setCharAt(i, (char)c);   
        //     }   
            
        // }

        // System.out.println(" Upper case : "+an);








        // Program to convert the given string into capitalized each word 

        StringBuilder a= new StringBuilder("tuTor joEs coMputer Ed");
        System.out.println("Original String  : "+a);
        if (a.charAt(0)==97 && a.charAt(0)==122)
        {
            int c=(int)a.charAt(0)-32;
            a.setCharAt(0,(char)c);   
        }
        for(int i=1;i<=a.length();i++)
        {
            if (a.charAt(i)==32)
            {
                i++;
                if (a.charAt(i)<=97 && a.charAt(i)>=122)
                {
                    int c =(int)a.charAt(i)-32;
                    a.setCharAt(i, (char)c);   
                }
                else
                {
                    if (a.charAt(i)<=65 && a.charAt(i)>=98)
                    {
                        int c =(int)a.charAt(i)+32;
                        a.setCharAt(i, (char)c); 
                    }
                }

            }
        }
        System.out.println("capitalized word :  " +a);

    }   

}

