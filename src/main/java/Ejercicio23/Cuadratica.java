package Ejercicio23;
import java.lang.Math;

public class Cuadratica {
    public double X1;
    public double X2;
     
   public void EC(double A, double B, double C){
        double deter = Math.pow(B, 2) - (4*A*C);
        X1 = (-B + Math.sqrt(deter))/2*A;
        X2 = (-B - Math.sqrt(deter))/2*A;
    }
}
