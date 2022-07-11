

package paradiseinfo;

public class TestInfo 
{
    public static void main(String []args )
    {
        System.out.println("Calling method from another class:");
        ParadiseInfo.displayInfo();//this method is calling the display method in the another class within the same package
    }
    
}
