
package paquete1;


public class DocenteNombramiento extends Docente {
    
    
    private double valorSueldo;
    private double valorHora;
    private double numeroH;
    private double Salario;
    

    
    public void establecerValorSueldo(double valorS) {
        valorSueldo = valorS;
    }

    public void establecerValorHora(double valorH) {
        valorHora = valorH;
    }

    public void establecerNumeroH(double numeroH) {
        numeroH = numeroH;
    }

    public void calcularSalario() {
        
        Salario =(valorSueldo*(numeroH*valorHora));
    }
    
    

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHora() {
        return valorHora;
    }

    public double obtenerNumeroH() {
        return numeroH;
    }

    public double obtenerSalario() {
        return Salario;
    }
    
   @Override
    public String toString(){
        String reporte = String.format("Nombres: %s\nCédula: %s\nValor del "
                + "Sueldo: $%.2f\nValor de las Horas Extra: $%.2f\nNúmero de "
                + "Horas Extra: %d\nSueldo: $%.2f",
                obtenerNombre(),
                obtenerCedula(),
                obtenerValorSueldo(),
                obtenerValorHora(),
                obtenerNumeroH(),
                obtenerSalario());
        
        return reporte;
    }
    
}