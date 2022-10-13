package sudhir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SpeedMp {

    public static void main(String[] args) {
        ArrayList<Microprocessor> mp = new ArrayList<>();

        mp.add(new Microprocessor(45, 5, "Intel 5.5"));
        mp.add(new Microprocessor(5, 35, "Ryzen 5.5"));
        mp.add(new Microprocessor(453, 543, "Android 5.5"));

        Collections.sort(mp,new SortBySpeed() );

        for(Microprocessor k : mp){
            System.out.println(k);
        }
    }

}
