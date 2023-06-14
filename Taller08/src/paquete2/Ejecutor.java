
package paquete2;
import java.util.Locale;
import java.util.Scanner;
import paquete1.*;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean condicion = true;
        while(condicion) {
            System.out.println("Ingrese los nombres del docente:");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese la cédula del docente:");
            String cedula = entrada.nextLine();
        
            System.out.printf("\n%s\n%s\n%s\n%s\n\n%s",
                    "--Menú de Opciones--",
                    "1) Ingresar un Docente Nombremiento",
                    "2) Ingresar un Docente Factura",
                    "3) Salir",
                    "Elija una opción: ");
            
            int opcion;
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch(opcion) {
                case 1:
                    System.out.println("\nIngrese el valor del sueldo:");
                    double sueldo = entrada.nextDouble();
                    System.out.println("Ingrese el valor de las horas extra:");
                    double valorHoras = entrada.nextDouble();
                    System.out.println("Ingrese el numero de horas:");
                    int horas = entrada.nextInt();
                    entrada.nextLine();
                    
                    DocenteNombramiento docenteN = new DocenteNombramiento();

                    docenteN.establecerNombre(nombres);
                    docenteN.establecerCedula(cedula);
                    docenteN.establecerValorSueldo(sueldo);
                    docenteN.establecerValorHora(valorHoras);
                    docenteN.establecerNumeroH(horas);
                    docenteN.calcularSalario();

                    System.out.printf("\n%s\n", docenteN);
                    break;
                case 2:
                    System.out.println("\nIngrese el valor de la factura:");
                    double factura = entrada.nextDouble();
                    System.out.println("Ingrese el valor del descuento del "
                            + "iva:");
                    double ivaDescuento = entrada.nextDouble();
                    entrada.nextLine();
                    
                    DocenteFactura docenteF = new DocenteFactura();

                    docenteF.establecerNombre(nombres);
                    docenteF.establecerCedula(cedula);
                    docenteF.establecerValorFactura(factura);
                    docenteF.establecerValorIvaDescuento(ivaDescuento);
                    docenteF.calcularValorCancelar();

                    System.out.printf("\n%s\n", docenteF);
                    break;
                case 3:
                    System.err.println("\nSaliendo del programa...");
                    condicion = false;
                    break;
                default:
                    System.out.println("\nOpción incorrecta...");
            }
        }
    }
    
}