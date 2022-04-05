package Ejercicio_1;

import Ejercicio_1.USOS.Coche;
import Ejercicio_1.USOS.Portatil;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //creamos un prtatil y un coche
        Portatil portatil = new Portatil(Portatil.Marca.HP, Portatil.Modelo.PRIMERA_GEN, 12345);
        Portatil portatil2 = new Portatil(Portatil.Marca.ACER, Portatil.Modelo.PRIMERA_GEN, 12345);
        Coche coche = new Coche("876546U", Coche.ModeloCoche.CABRIO, Coche.MarcaCoche.MERCEDES);

        // Nos creamos varios empleados

        Administrativo empleado1 = new Administrativo("Carla", "Márquez", "48127583F", "calle de la Lloreeria, 13",
                LocalDate.of(1986,7,27), 645781687, 3000);

        JefeProyectos empleado2 = new JefeProyectos("Carlos", "González", "87695421K", "Avenida Andalucía, 34",
                LocalDate.of(2000,5,3), 647104845, 3000, portatil, Programador.Tecnología.LIMPIA, empleado1, 616661048,
                coche, portatil, Programador.Tecnología.LIMPIA, empleado1);

        Programador empleado = new Programador("Carmen", "Martin", "49117682D", "calle de la Amargura, 17",
                LocalDate.of(1995,3,11), 653532779, 2500, empleado2, 959286475, portatil2, Programador.Tecnología.EQUIPO,
                Programador.Proyecto.HADES);
    }
}
