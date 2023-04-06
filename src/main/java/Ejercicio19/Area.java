package Ejercicio19;

public class Area {
    
    public double are;
    
    public void CalcAre(double n) {
        Altura n2 = new Altura();
        n2.CalcAlt(n);
        are = n*n2.alt/2;
    }
}
