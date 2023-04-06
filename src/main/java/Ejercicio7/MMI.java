package Ejercicio7;

public class MMI {
    public String result;
    
    public void Comparar(float n1, float n2) {
        if (n1>n2) {
            result = "El primer numero es el mayor";
        }
        else if (n2>n1) {
            result = "El segundo numero es el mayor";
        }
        else {
            result = "Los numeros son iguales";
        }
    }
}
