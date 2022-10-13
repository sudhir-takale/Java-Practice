package sudhir;

import java.util.Comparator;

public class SortBySpeed implements Comparator<Microprocessor> {


    public  int compare(Microprocessor m , Microprocessor n2){

        return m.version - n2.version;
    }
}
