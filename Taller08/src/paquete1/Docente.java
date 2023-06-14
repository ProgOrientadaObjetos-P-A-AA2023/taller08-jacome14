package paquete1;

public class Docente {

    String nombres;
    String cedula;

    public void establecerNombre(String n) {
      nombres = n;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombre() {
        return nombres;
    }

    public String obtenerCedula() {
        return cedula;
    }

   

    }


