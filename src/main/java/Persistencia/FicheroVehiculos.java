/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Vehiculo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.in;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class FicheroVehiculos {
    
    public static void cargar(ArrayList<Vehiculo> vehiculos) throws FileNotFoundException{
        
        String matriculaVh=null;
        String marcaVh = null;
        String modeloVh = null;
        double priceVh = 0.0;
        String tipoVh = null;
        
        FileReader inputStream = null;
        BufferedReader in = null;
        
        try{
            inputStream = new FileReader("Vehiculos.txt");
            in = new BufferedReader(inputStream);
            
            while ((matriculaVh = in.readLine()) != null){
                
                String datos[] = matriculaVh.split(";");
                
//                for (int i = 0; i<datos.length; i++){
//                    String finalDatos[] = datos[i].split(":");
//                    if (finalDatos[0].equals())
//                }
            }
            Vehiculo v = new Vehiculo(matriculaVh,marcaVh,modeloVh,priceVh,tipoVh);
            FicheroVehiculos.vehiculos.add(v);
        
        
    }catch (java.io.IOException ex) {
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
    
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        private String rutaArchivo;

    /**
     * Get the value of rutaArchivo
     *
     * @return the value of rutaArchivo
     */
    public String getRutaArchivo() {
        return rutaArchivo;
    }

    /**
     * Set the value of rutaArchivo
     *
     * @param rutaArchivo new value of rutaArchivo
     */
    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }


    
}
