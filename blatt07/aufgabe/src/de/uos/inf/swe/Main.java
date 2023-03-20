package de.uos.inf.swe;
import de.uos.inf.swe.a.A;
import de.uos.inf.swe.b.B;
import org.apache.commons.lang3.math.Fraction;

/**
 * Test-Class.
 */
public class Main{
    public static void main(String[] args){
        try{
            A a = new A();
            B b = new B();
            Fraction f = Fraction.getFraction("2/3");
            System.out.println("Fraction is " + f.toProperString());
        }
        catch(NoClassDefFoundError e){
            System.err.println("Forgotten to compile class 'A' or 'B' or apache.commons not properly imported?");
            e.printStackTrace();
        }
        catch(Throwable t){
             System.err.println("There went something wrong!");
        }
    }
}
