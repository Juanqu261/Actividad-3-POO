package Ejercicio10;

public class PagoMatricula {
    public double pago;
    
    public void Incremento(float pat, float est){
        if (pat>2000000 && est>3) {
            pago = 50000+pat*0.03;   
        }
        else {
            pago = 50000;
        }
    }
}
