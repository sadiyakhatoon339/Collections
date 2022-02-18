package abc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Cone {

    public static void main (String args[])throws IOException{
        List<Float> a= new ArrayList<>();

        a.add(1.9f);
        a.add(4.9f);
        a.add(1.5f);
        a.add(6.9f);
        a.add(1.9f);
        float sum=0.0f;

        Iterator<Float> it=a.iterator();

        while(it.hasNext())
        {
            sum=sum+it.next();

        }

        System.out.println(sum);
    }
}
