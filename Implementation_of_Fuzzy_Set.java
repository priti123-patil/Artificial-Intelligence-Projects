import java.util.*;
import java.lang.Math;
public class Implementation_of_Fuzzy_Set {
    public static void main(String[] args) 
    {
        //Here we are calculating the membership values for the elements
        //Calculating values for 5
        float x[]={1,2,3,4,5,6,7,8,9,10};

        float memvalue=0.0f, factor;
        int gamma=1;

        for (int i=0;i<10;i++)
        {
            factor = gamma * Math.abs( (5 / Math.max(x[i],5) - (x[i]/Math.max(x[i],5)))  );

            if (factor==0)
                memvalue=1;
            if (factor>0 && factor<=1)
                memvalue = 1-factor;
            if (factor>1)
                memvalue=0;

            System.out.println("Membership value of " + x[i] + " is : " + memvalue);
        }
    }
}

