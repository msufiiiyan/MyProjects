/*             SkillsClubb 
A unique place for Motivation and Coding
                                        */
import java.util.*;
public class AreaofaCircle{
    public static void main(String[] args)
    {
        final double pi= 3.14;
        Scanner ab= new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double r = ab.nextDouble();
        double a = pi*(Math.pow(r,2));
        System.out.println("Area of the circle is : " + a + "\n Process Success!");
    }
}
