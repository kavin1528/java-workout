
class rectangle
{
    int length,width;

    void getdetails(int x,int y)
    {
        length=x;
        width=y;
    }
    int area()
    {
        int a=length*width;
        return a;
    }
}

public class class_object
{
    public static void main(String[] args) {
        rectangle o1=new rectangle();
        o1.length=10;
        o1.width=2;
        System.out.println("Area of rectangle : " +o1.area());

        // oru class ku multipe object create panalam 
        rectangle o2=new rectangle();
        o2.getdetails(10, 20);
        System.out.println("Area of the rectangle : "+o2.area());

        
    }
}
