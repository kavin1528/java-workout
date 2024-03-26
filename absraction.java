
// abstract class shape
// {
    
//     //method ah pre ah define panikalam but munadi abstract podanum oru method abstract ah irundhalum class ey abstract ah mathanum 
//     // abstract na onum ila  method ah munadiye define panirum and definition irukadhu just define matum pani vaikum 
//     abstract void draw();   // ------

//     void message()
//     {
//         System.out.println(" its a message");
//     }
// }
// class mains extends shape{
    
//     @Override
//     void draw()    // ------
//     {
//         System.out.println(" draw the rectangle ");
//     }

// }
// public class absraction {

//     public static void main(String[] args) {
//         mains o=new mains();
//         o.draw();
//         o.message();
//     }
// }





abstract class mobile 
{
    void voicecall()
    {
        System.out.println( " You make voice call");
    }
    abstract void camera();
    abstract void touchDisplay();
}
class samsung extends mobile
{
    @Override
    void camera()
    {
        System.out.println( " Your camera is 32mp");
    } 

    @Override
    void touchDisplay()
    {
        System.out.println(" Your display is 5.5inch");
    }
}
class nokia extends mobile 
{
    @Override
    void camera()
    {
        System.out.println( " Your camera is 55 mp");
    } 

    @Override
    void touchDisplay()
    {
        System.out.println(" Your display is 8.5inch");
    } 
}
public class absraction {

  public static void main(String[] args) 
  {

    samsung m32=new samsung();
    m32.camera();
    m32.touchDisplay();
    m32.voicecall();

    System.err.println("___________________________");

    nokia n1=new nokia();
    n1.camera();
    n1.touchDisplay();
    n1.voicecall();
  }  
}

