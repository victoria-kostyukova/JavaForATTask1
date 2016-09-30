package exercise6;

import java.util.ArrayList;

/**
 * Created by Виктория on 29.09.16.
 */
public class SquareMatrix {
    ArrayList <Double> N = new ArrayList<Double>();

    public SquareMatrix(ArrayList<Double> n) {
        N = n;
    }

    public void makeSquareMatrix(){
        int sizeN = N.size();
        double[][] squareMatrix = new double[sizeN][sizeN];
        for (int i = 0; i < sizeN; i++){
            for(int j = 0; j < sizeN; j++){
                if ((i + j) < sizeN){
                    squareMatrix[i][j] = N.get(i + j);
                } else{
                    squareMatrix[i][j] = N.get(i + j - sizeN);
                }
            }
        }
    }
}
