package Ejercicio_1;

import Ejercicio_1.USOS.Portatil;

import java.time.LocalDate;

public class Programador extends Empleado{

    //atributos
    private int movil;
    public enum Proyecto{HADES, PENA, PANICO, MEGARA, HERCULES}
    public enum Tecnología{EQUIPO, OPERACION, PRODUCTO, LIMPIA}
    private Portatil portatil;
    private Tecnología tecnologia;


    //constructores
    public Programador(String nombre, String apellidos, String dni, String direccion,
                       LocalDate antiguedad, int telf, double salario, Empleado supervisor,
                       int movil, Portatil portatil) {
        super(nombre, apellidos, dni, direccion, antiguedad, telf, salario, supervisor);
        this.movil = movil;
        this.portatil = portatil;
    }

    public Programador(String nombre, String apellidos, String dni, String direccion,
                       LocalDate antiguedad, int telf, double salario, int movil, Portatil portatil) {
        super(nombre, apellidos, dni, direccion, antiguedad, telf, salario);
        this.movil = movil;
        this.portatil = portatil;
    }

    public Programador(String nombre, String apellidos, String dni, int movil, Portatil portatil) {
        super(nombre, apellidos, dni);
        this.movil = movil;
        this.portatil = portatil;
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

        double porcentajeSubida = 10;
        double incremento = ((porcentajeSubida/100)*salario)+salario;

        this.salario+=incremento;
    }

    /**
     * Precondición:
     * Postcondición:
     * Entrada:
     * Salida:
     */
    public void cambiarPortatil(Portatil portatil){

        if(this.portatil.equals(portatil)){
            System.out.println("Ya tiene este portatil");
        }else {
            this.portatil=portatil;
        }
    }

    /**
     * Precondición:
     * Postcondición:
     * Entrada:
     * Salida:
     */
    public void cambiarTecnologia(Tecnología tecnologia){

        if(this.tecnologia.equals(tecnologia)){
            System.out.println("Ya tiene esta tecnología");
        }else {
            this.tecnologia=tecnologia;
        }

    }
}
