
package paquete1;


public class DocenteNombramiento extends Docente {
    
    
    private double valorSueldo;
    private double valorHora;
    private int numeroH;
    private double Salario;
    

    
    public void establecerValorSueldo(double valorS) {
        valorSueldo = valorS;
    }

    public void establecerValorHora(double valorH) {
        valorHora = valorH;
    }

    public void establecerNumeroH(int  numeroH) {
        numeroH = numeroH;
    }

    public void calcularSalario() {
        
        Salario =(valorSueldo+(numeroH*valorHora));
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
      
    public String toString() {
        String reporte = String.format("Nombre: %s\n"
                + "Cédula: %s\n"
                + "Valor del Sueldo: %.2f\n"
                + "Valor Hora Extra: %.2f\n"
                + "Número de Horas Extra: %d\n"
                + "Sueldo Total: %.2f",
                nombres,
                cedula,
                valorSueldo,
                valorHora,
                numeroH,
                Salario);

        return reporte;
    }
    
}