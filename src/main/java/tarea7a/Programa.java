/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7a;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * C) Una clase Programa, que obtendrá una lista de Alumnado haciendo uso del
 * método getAll() de un objeto AlumnadoCSV. Una vez obtenida la lista, se
 * realizarán las siguientes acciones, mostrando por consola los resultados
 * obtenidos:
 *
 * //Crear dos listas, una de hombres y otra de mujeres.
 *
 * //Saber el número total de de alumnos y alumnas menores de edad.
 *
 * //Lista de los nombres del alumnado de 1ºDAW que no son hombres, ordenados
 * por fecha de nacimiento.
 *
 * //Listar todos los alumnos y alumnas extranjeros que residen en Estepona.
 *
 * //Listar todos los alumnos y alumnas de 3º ESO ordenados por unidad y
 * nombre. Esto es, por ejemplo, el alumnado de 3º ESO A tiene que aparecer
 * ordenado por nombre y apellidos, luego el de 3º ESO B, etc.
 *
 * //Saber si algún alumno se llama Lucas.
 *
 * //Nacionalidades distintas que no sean “española”.
 *
 *
 */
public class Programa {

    //Crear dos listas, una de hombres y otra de mujeres.
    public void DosListas(ArrayList<Alumnado> listaAlumnos) {

        ArrayList<Alumnado> listaHombres = new ArrayList<>();
        ArrayList<Alumnado> listaMujeres = new ArrayList<>();

        //falta falta falta falta falta falta falta falta falta falta 
    }

    public static void main(String[] args) {
        AlumnadoCSV alumCsv = new AlumnadoCSV("RegAlum.csv");
        ArrayList<Alumnado> listaAlumnos = alumCsv.getAll();
        ArrayList<Alumnado> listaHombres = new ArrayList<>();
        ArrayList<Alumnado> listaMujeres = new ArrayList<>();

//        for (int i = 0; i < listaAlumnos.size(); i++) {
//            System.out.println(listaAlumnos.get(i));
//        }
//Crear dos listas, una de hombres y otra de mujeres.
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getSexo().equalsIgnoreCase("H")) {
                listaHombres.add(listaAlumnos.get(i));
            } else {
                listaMujeres.add(listaAlumnos.get(i));
            }
        }

        //Saber el número total de de alumnos y alumnas menores de edad.
//         System.out.println("Alumnos mayores de edad");
//         listaHombres.stream()
//                 .filter(a-> a.getEdad()>17)
//                .forEach(System.out::println);
//         
//          System.out.println("\nAlumnas mayores de edad");
//         listaMujeres.stream()
//                 .filter(a-> a.getEdad()>17)
//                .forEach(System.out::println);
//Lista de los nombres del alumnado de 1ºDAW que no son hombres, ordenados por fecha de nacimiento.
//        System.out.println("\nNombres del alumnado de 1ºDAW que no son hombres, ordenados por fecha de nacimiento");
//        listaAlumnos.stream()
//                .filter(a -> a.getUnidad().equalsIgnoreCase("1DAW"))
//                .filter(a -> !a.getSexo().equalsIgnoreCase("H"))
//                .sorted((p1, p2) -> p1.getFechNacimiento().compareTo(p2.getFechNacimiento()))
//                .map(p -> p.getAlumno())
//                .forEach(System.out::println);
//Listar todos los alumnos y alumnas extranjeros que residen en Estepona.
//        System.out.println("\nAlumnos y alumnas extranjeros que residen en Estepona");
//        listaAlumnos.stream()
//                .filter(a -> a.getLocResidencia().equalsIgnoreCase("Estepona"))
//                .filter(a -> !a.getPaisNacimiento().equalsIgnoreCase("España"))
//                .forEach(System.out::println);
//Listar todos los alumnos y alumnas de 3º ESO ordenados por unidad y nombre. 
//Esto es, por ejemplo, el alumnado de 3º ESO A tiene que aparecer ordenado por nombre y apellidos, 
//luego el de 3º ESO B, etc.
        System.out.println("\nAlumnos y alumnas de 3º ESO ordenados por unidad y nombre");

        Comparator<Alumnado> compUnidad = (p1, p2) -> p1.getUnidad().compareTo(p2.getUnidad());
        Comparator<Alumnado> compNombre = (p1, p2) -> p1.getAlumno().compareTo(p2.getAlumno());

        listaAlumnos.stream()
                .filter(a -> a.getCurso().equalsIgnoreCase("3º de E.S.O."))
                .sorted(compUnidad.thenComparing(compNombre))
                .forEach(System.out::println);

        //Saber si algún alumno se llama Lucas.
        System.out.println("\nAlumnos y alumnas de 3º ESO ordenados por unidad y nombre");
        boolean estaLucas = listaAlumnos.stream()
                .anyMatch(a -> a.getAlumno().endsWith("Lucas"));

        System.out.println("Esta Lucas? " + estaLucas);

        //Nacionalidades distintas que no sean “española”.
        System.out.println("\nNacionalidades distintas a la española");
        listaAlumnos.stream()
                .filter(a -> !a.getNacionalidad().equalsIgnoreCase("Española"))
                .forEach(System.out::println);

    }

}
