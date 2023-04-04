package Ejercicio18;

public class infSalario {
    
    public float salario_bruto, salario_neto;
    
    public void SalaryB(float hrs, float pay) {
        salario_bruto = hrs*pay;
        
    }
    public void SalaryN(float hrs, float pay, float ret) {
        salario_neto = (hrs*pay)-((hrs*pay)*ret/100);
    }
}
