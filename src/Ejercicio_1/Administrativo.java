package Ejercicio_1;

import java.time.LocalDate;

public class Administrativo extends Empleado {

    //atributos
    public enum Despacho {DESPACHO_1, DESPACHO_2, DESPACHO_3, DESPACHO_4, DESPACHO_5}
    int fax;
    Despacho despacho;


    //constructores
    public Administrativo(String nombre, String apellidos, String dni, String direccion,
                          LocalDate antiguedad, int telf, double salario, Empleado supervisor,
                          int fax, Despacho despacho) {
        super(nombre, apellidos, dni, direccion, antiguedad, telf, salario, supervisor);
        this.fax = fax;
        this.despacho = despacho;
    }

    public Administrativo(String nombre, String apellidos, String dni, String direccion,
                          LocalDate antiguedad, int telf, double salario, int fax, Despacho despacho) {
        super(nombre, apellidos, dni, direccion, antiguedad, telf, salario);
        this.fax = fax;
        this.despacho = despacho;
    }

    public Administrativo(String nombre, String apellidos, String dni, int fax, Despacho despacho) {
        super(nombre, apellidos, dni);
        this.fax = fax;
        this.despacho = despacho;
    }

    //metodos

    /**
     * Metodo por el cual el salario base introducido se incrementará
     * Precondición: el empleado debe cobrar un salario
     * Postcondición: el salario incrementado debe ser mayor que el salario base
     * Entrada: double salario
     * Salida: double
     */

    @Override
    public void incrementarSalario(){

        double porcentajeSubida = 5;
        double incremento = ((porcentajeSubida/100)*salario)+salario;

        this.salario+=incremento;
    }

    @Override
    public String toString() {
        return "El empleado trabaja en el " + despacho +
                ",su numero de fax es " + fax + "y su supervisor es " + supervisor;
    }
}
