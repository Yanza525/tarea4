package tarea4_git;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Clase principal para la gestión de la entrada de datos de alumnos y su 
 * almacenamiento en un fichero binario.
 * 
 * @author Vanessa Yanza
 */
public class Main {

    /**
     * Método principal que ejecuta la aplicación.
     * 
     * Este método solicita al usuario la ruta del fichero donde se guardarán 
     * los datos de los alumnos. Luego, recoge la información de cinco alumnos, 
     * incluyendo su NIA, nombre, apellido, género, fecha de nacimiento, ciclo, 
     * curso y grupo. Los datos son almacenados en un fichero binario 
     * utilizando un ObjectOutputStream.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ficheroBinario = "";
        System.out.println("Dime la ruta del fichero en el que quieres guardar la información: ");
        ficheroBinario = sc.nextLine();
        ObjectOutputStream oos;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(ficheroBinario));
            // Formato para la fecha de nacimiento
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Ciclo para crear 5 alumnos
            for (int i = 0; i < 5; i++) {
                int nia;
                String nombre;
                String apellido;
                char genero;
                LocalDate fechaNacimiento;
                String ciclo;
                String curso;
                String grupo;

                System.out.println("Dime el nia del alumno ");
                nia = sc.nextInt();
                System.out.println("Dime el nombre del alumno ");
                sc.nextLine();
                nombre = sc.nextLine();

                System.out.println("Dime el apellido del alumno");
                apellido = sc.nextLine();
                System.out.println("Dime el genero del alumno (M/F)");
                genero = sc.next().charAt(0);
                System.out.println("Dime la fecha de nacimiento del alumno (dd/MM/yyyy)");
                sc.nextLine();
                
                // Captura la fecha de nacimiento como un String
                String fecha = sc.nextLine();
                try {
                    // Convierte el String a LocalDate
                    fechaNacimiento = LocalDate.parse(fecha, formatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Formato incorrecto");
                    // Si hay un error, utiliza la fecha actual
                    fechaNacimiento = LocalDate.now();
                }

                System.out.println("Dime el ciclo del alumno ");
                ciclo = sc.nextLine();
                System.out.println("Dime el curso del alumno ");
                curso = sc.nextLine();
                System.out.println("Dime el grupo del alumno ");
                grupo = sc.nextLine();

                // Crea un objeto Alumno y lo guarda en el fichero
                Alumno alumnito = new Alumno(nia, nombre, apellido, genero, fechaNacimiento, ciclo, curso, grupo);
                oos.writeObject(alumnito);
                System.out.println("El alumno " + (i + 1) + " ha sido guardado");
            }
            oos.close();
            sc.close();
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
        }
    }
}
