package Ejercicio22;

public class Analizar {
    public String esc;
    
    public void Escribir(String nombre, float pago, float horas){
        float SalarioMensual = pago*horas;
        if (SalarioMensual>450000) {
            esc = nombre+" "+String.valueOf(SalarioMensual);
        }
        else {
            esc = nombre;
        }
    }
}
