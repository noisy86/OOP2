import java.util.*;
import java.lang.*;

public class Main{

    // Init pi
    private static final float pi = (float) 3.141592653589793;

    // calculate volume
    public static void volume(float r)
    {
        float volume = (float)(2 * pi *(float) Math.pow(r, 3))
                / (float)(3);
        System.out.println("Volume = " + volume/2);
    }
    //  calculate surface
    public static void surface_area(float r)
    {
        float s_area = (float)2 * pi * (float)Math.pow(r, 2);
        System.out.println("Surface Area = " + s_area/2);
    }

    // Driver function
    public static void main(String argc[]){
        float r = 11;
        float r1 = 15;
         float r2 = 11;
        volume(r);
        surface_area(r);
        volume(r1);
        surface_area(r1);
        volume(r2);
        surface_area(r2);
    }

}