package exercise8;

import java.util.ArrayList;

/**
 * Created by Виктория on 29.09.16.
 */
public class NonRegressiveSequence {
    ArrayList<Double> A = new ArrayList<Double>();
    ArrayList<Double> B = new ArrayList<Double>();

    public NonRegressiveSequence(ArrayList<Double> a, ArrayList<Double> b) {
        A = a;
        B = b;
    }

    public void union(){

        ArrayList<Integer> indexForSecondArray = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++){
            for (int j = 0; j < B.size(); j++){
                if(B.get(j) < A.get(i)){
                    indexForSecondArray.add(i);
                }
            }
            System.out.println(indexForSecondArray.get(i));
        }
    }
}