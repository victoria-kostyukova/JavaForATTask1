package exercise4;

import java.util.ArrayList;

/**
 * Created by Виктория on 28.09.16.
 */
public class Massive {

    private ArrayList <Integer> N = new ArrayList<Integer>();

    public Massive(ArrayList<Integer> n) {
        N = n;
    }

    public void isSimple(){
        for (int i = 0; i < N.size(); i++){
            boolean isComposite = false;
            for (int j = 2; j < N.get(i); j++){
                if (N.get(i) % j == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite == false) {
                System.out.println(i);
            }
        }

    }
}
