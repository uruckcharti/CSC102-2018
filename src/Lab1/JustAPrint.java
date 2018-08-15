package Lab1;

/**
 * Created by uruckcharti on 16/8/2018 AD.
 */
public class JustAPrint
{
    public static void main(String[] args)
    {
        //How to declare variables?
        //Primitive Datatype
        int numberOfSphere = 15;
        float radius = 13.516498f; //If you use FLOAT, 'f' must be follow at the end of your number
        final double PI = 3.14; //This is how we declare a Constant
        char sphereName = 'A';
        //Generic Datatype Ex.String
        String author = "Mr.Ukrit";
        
        
        //Just print a String
        System.out.println("Who write this programme : "+author);
        //Calculate volume of a sphere
        double volume = (4/3)*PI*Math.pow(radius,2);//Math.pow(A,B)returns the value of the argument A raised to the power of the argument B
        System.out.println("Volume of a sphere is "+volume);
        System.out.printf("Volume of a sphere with 4 decimal point is %.4f \n",volume); //use printf to format your output, \n use to terminate that line
        System.out.printf("Good bye %S",author);//printf with %S return a string to be CAPITAL LETTER!!!
        
        
    }
}
