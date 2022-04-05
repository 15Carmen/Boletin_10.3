package Ejercicio_1;

import java.time.LocalDate;

public abstract class Empleado {

    /**
     *  Clase base para contener a un trabajador que contiene los datos básicos del
     * mismo: nombre, apellidos, DNI, dirección, antigüedad, teléfono de contacto y salario.
     * Incluye también información de quién es el empleado que lo supervisa.
     * Ha de tener las siguientes funciones:
     * • Constructores;
     * • Impresión
     * • Cambio de supervisor
     * • Incrementar salario
     */

    //atributos
    protected String nombre, apellidos, dni, direccion;
    protected LocalDate antiguedad;
    protected int telf;
    protected double salario;
    protected Empleado supervisor;


    //constructor

    public Empleado (String nombre, String apellidos, String dni, String direccion, LocalDate antiguedad,
                     int telf, double salario, Empleado supervisor){

        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.direccion=direccion;
        this.antiguedad=antiguedad;
        this.telf=telf;
        this.salario=salario;
        this.supervisor=supervisor;
    }

    public Empleado (String nombre, String apellidos, String dni, String direccion, LocalDate antiguedad,
                     int telf, double salario){
        this (nombre, apellidos, dni, direccion, antiguedad, telf, salario, null);
    }

    public Empleado(String nombre, String apellidos,String dni){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
    }


    //metodos

    /**
     * Precondición:
     * Postcondición:
     * Entrada:
     * Salida:
     */
    public void cambioSupervisor(Empleado empleado){

        if(this.supervisor.equals(empleado)){
            System.out.println("Ya es supervisado por este empleado");
        }else {
            this.supervisor=empleado;
        }

    }


    /**
     * Metodo por el cual el salario base introducido se incrementará
     * Precondición: el empleado debe cobrar un salario
     * Postcondición: el salario incrementado debe ser mayor que el salario base
     * Entrada: double salario
     * Salida: double
     */
    public abstract void incrementarSalario();


    //Impresión
    @Override
    public String toString() {
        return "El Empleado es " + nombre + apellidos + ", con dni " + dni + ' ' + ", telefono " + telf +
                " y salario. " + salario +'\''+
                "Vive en " + direccion +
                "y lleva en la empresa desde  " + antiguedad + ".";
    }
}
