
import exercise2.variables.Point;
import exercise3.Tangens;
import exercise4.Massive;
import exercise6.SquareMatrix;
import exersice1.variables.VariableExercise1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Viktoryia_Kastsiukov on 9/20/2016.
 */
public class Main {

    public static void main(String[] args) {

        double x, y, a, b, h;
        int q, w;

        while (true){
            System.out.println("Choose operation");
            System.out.println("1 - exercise 1; 2 - exercise 2; 3 - exercise 3; 4 - exercise 4; 5 - exercise 5; \n" +
                    "6 - exercise 6; 7 - exercise 7; 8 - exercise 8; 9 - exercise 9; 10 - exercise 10; \n" +
                    "11 - exercise 11; 12 - exercise 12; 13 - exercise 13; 13 - exercise 13; 14 - exercise 14; ");
            Scanner in = new Scanner(System.in);
            System.out.print("Enter operation number: ");
            int operationNumber = in.nextInt();
            switch (operationNumber){
                case 1:
                    System.out.println("Enter x and y to get the result");
                    System.out.print("Enter x: ");
                    x = in.nextDouble();
                    System.out.print("Enter y: ");
                    y = in.nextDouble();
                    VariableExercise1 variableExercise1 = new VariableExercise1(x, y);
                    System.out.println("(1 + pow(sin(variable.getX() + variable.getY()), 2)) " +
                            "/ (2 + abs((2 * variable.getX()) / (1 + pow(variable.getX(), 2) * pow(variable.getY(), 2)))) " +
                            "+ variable.getX() = " + variableExercise1.formula(variableExercise1));
                    break;
                case 2:
                    System.out.println("Enter x and y to get the result");
                    System.out.print("Enter x: ");
                    x = in.nextDouble();
                    System.out.print("Enter y: ");
                    y = in.nextDouble();
                    Point point = new Point(x, y);
                    System.out.println("Is your point in region " + point.isInRegion());
                    break;
                case 3:
                    System.out.println("Enter a and b to get segment and h to get step");
                    System.out.print("Enter a: ");
                    a = in.nextDouble();
                    System.out.print("Enter b: ");
                    b = in.nextDouble();
                    System.out.print("Enter h: ");
                    h = in.nextDouble();
                    Tangens tangens = new Tangens(a, b, h);
                    System.out.println("Tangens table");
                    tangens.countTangens();
                    break;
                case 4:
                    ArrayList<Integer> n = new ArrayList<Integer>();
                    System.out.println("Enter count massive elements");
                    System.out.print("Enter a: ");
                    q = in.nextInt();
                    for (int i = 0; i < q; i++){
                        System.out.print("Enter massive element: ");
                        w = in.nextInt();
                        n.add(w);
                    }
                    Massive massive = new Massive(n);
                    System.out.println("Index simple elements");
                    massive.isSimple();
                    break;
                case 5:
                    break;
                case 6:
                    ArrayList<Double> m = new ArrayList<Double>();
                    System.out.println("Enter count massive elements");
                    System.out.print("Enter a: ");
                    q = in.nextInt();
                    for (int i = 0; i < q; i++){
                        System.out.print("Enter massive element: ");
                        h = in.nextDouble();
                        m.add(h
                        );
                    }
                    SquareMatrix squareMatrix = new SquareMatrix(m);
                    System.out.println("Make Square Matrix");
                    squareMatrix.makeSquareMatrix();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Enter correct operation numebr");
                    break;
            }
        }
    }
}
