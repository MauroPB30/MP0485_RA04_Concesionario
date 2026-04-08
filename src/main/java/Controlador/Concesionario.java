/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vehiculo;
import java.util.ArrayList;
import Persistencia.FicheroVehiculos;

/**
 *
 * @author usuario
 */
public class Concesionario {

    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public boolean insertarVehiculo(Vehiculo v) {
        if (findVh("") != null) {
            return false;
        }
        vehiculos.add(new Vehiculo("", "", "", 0, ""));
        return true;

    }

    public Vehiculo buscarVehiculo(String matricula) {
        return null;
    }

    public void eliminarVehiculo(String matricula) {

    }

    public void listarVehiculos(ArrayList<Vehiculo> vehiculos) {

    }

    public Vehiculo findVh(String matr) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equalsIgnoreCase(matr)) {
                return vehiculo;
            }
        }
        return null;
    }

}
