public class comments_args 
{

    public static void main(String[] args) 
    {
        for(int i=0; i<args.length; i++)
        {
            System.out.println(args[i]);
        }
        
        // for(int i=0; i<=40;i++)
        // {
        //     System.out.println(args[0]);
        // }

    }
}

/*
 * run in terminal and set (1.javac comments_args.java)
 *                         (2.java comments_args)
 * must follow the rules only you will get the answer 
 * 
 * PS D:\java workout> javac comments_args.java                                                                                                                               
 * PS D:\java workout> java comments_args kavin chndru 
 * 
 * 
 * 1.args.length la irukura elathayum run panum
 * 2.40 tym run panum 0th index la ena kudukuromo dhan       args la iruka 0th index la ena irukunu pakum adha 40 tym run panum       
 */
