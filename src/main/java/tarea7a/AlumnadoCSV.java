/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * B) Una clase AlumnadoCSV con un atributo: un String que identifique el
 * fichero a leer. Esta clase tendrá un constructor con un parámetro String,
 * para inicializar el atributo. También tendrá un método llamado getAll() que
 * permita abrir el archivo para su lectura y devolver todos los datos del
 * fichero en una lista de tipo Alumnado.
 *
 * @author Salva
 */
public class AlumnadoCSV {

    private String idFichero;

    public AlumnadoCSV(String idFichero) {
        this.idFichero = idFichero;
    }

    //metodo que devuelve una lista de alumnos que leeremos en el fichero que le pasaremos al constructor
    public ArrayList<Alumnado> getAll() {

        ArrayList<Alumnado> listaAlumnos = new ArrayList<>();
        int cont = 0; //contador que sirve para descartar la primera linea
        int edad = 0; //guarda el casteo de la edad
        LocalDate fechanacimiento; //guarda el casteo de la fecha

        // Fichero a leer
        String idFichero = this.idFichero;

        // Variables para guardar los datos que se van leyendo
        String[] tokens = null;
        String linea = null;

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (
                Scanner datosFichero = new Scanner(new File(idFichero), "utf-8")) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                cont++;
                linea = datosFichero.nextLine(); //Se lee la línea

                //Empezamos a guardas a partir de la segunda linea, para omitir las cabeceras
                if (cont > 1) {

                    //guardamos los datos por separado, en un array
                    tokens = linea.split(";");

                    //en algunos campos de la edad, se cuela la unidad, y da error NumberFormatException
                    //si eso ocurre pondremos la edad a cero, para que se sepa del error
                    try {
                        //parseamos la edad y si da error, pondra la edad por defecto
                        edad = Integer.parseInt(tokens[7]);
                    } catch (NumberFormatException nfe) {
                        edad = 0;
                    }

                    //llamamos a la clase DateTimeFormatter, para formatear la fecha
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

                    //en algunos campos de fecha, esta la localidad, y da error de DateTimeException
                    //la fecha por defecto sera 1/1/1, para que se sepa que esta mal
                    try {
                        //parseamos la fecha y si da error, pondra la fecha por defecto
                        fechanacimiento = LocalDate.parse(tokens[4], formatter);
                    } catch (DateTimeException dfe) {
                        fechanacimiento = LocalDate.of(1, 1, 1);
                    }

                    //guardamos los alumno del fichero en la lista de alumnos, con los datos parseados
                    listaAlumnos.add(new Alumnado(tokens[0],
                            tokens[1],
                            tokens[2],
                            tokens[3],
                            fechanacimiento,
                            tokens[5],
                            tokens[6],
                            edad,
                            tokens[8],
                            tokens[9],
                            tokens[10],
                            tokens[11]));

                }

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaAlumnos;
    }

//    public static void main(String[] args) {
//        AlumnadoCSV alumCsv = new AlumnadoCSV("RegAlum.csv");
//        ArrayList<Alumnado> listaAlumnos=alumCsv.getAll();
//
//        
//        for (int i = 0; i < listaAlumnos.size(); i++) {
//            System.out.println(listaAlumnos.get(i));
//        }
//
//
//    }
}
