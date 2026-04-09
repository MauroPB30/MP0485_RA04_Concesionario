/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Vehiculo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class FicheroVehiculos {

    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private String rutaArchivo;

    public static void cargar(ArrayList<Vehiculo> vehiculos) throws FileNotFoundException {

        String matriculaVh = null;
        String marcaVh = null;
        String modeloVh = null;
        double priceVh = 0.0;
        String tipoVh = null;

        FileReader inputStream = null;
        BufferedReader in = null;

        try {
            inputStream = new FileReader("C:\\Users\\usuario\\Documents\\NetBeansProjects\\Test_Concesionario\\Data\\Vehiculos.txt");
            in = new BufferedReader(inputStream);
            String linea;

            while ((linea = in.readLine()) != null) {
                String[] datos = linea.split(";");
                String matricula = datos[0];
                String marca = datos[1];
                String modelo = datos[2];
                double precio = Double.parseDouble(datos[3]);
                String tipo = datos[4];
                vehiculos.add(new Vehiculo(matricula, marca, modelo, precio, tipo)); // ← DENTRO del while
            }
//            Vehiculo v = new Vehiculo(matriculaVh, marcaVh, modeloVh, priceVh, tipoVh);
//            FicheroVehiculos.vehiculos.add(v);

        } catch (java.io.IOException ex) {
            System.out.println(ex);
            System.out.println("No se puede acceder al archivo.");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println("No se puede acceder al archivo.");
                }
            }
        }
    }

    public static void guardar(List<Vehiculo> vehiculos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\usuario\\Documents\\NetBeansProjects\\Test_Concesionario\\Data\\Vehiculos.txt"))) {
            for (Vehiculo v : vehiculos) {
                bw.write(v.toString());
                bw.newLine();

            }
            bw.flush(); // Fuerza la escritura de los datos pendientes
            System.out.println("Archivo escrito y cerrado correctamente.");
        } catch (IOException e) {
            System.err.println("ERROR CRÍTICO: " + e.getMessage());
        }
    }
}
