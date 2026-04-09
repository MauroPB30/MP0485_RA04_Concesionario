/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vehiculo;
import java.util.ArrayList;
import Persistencia.FicheroVehiculos;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Concesionario {

    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public boolean insertarVehiculo(Vehiculo v) {
        if (buscarVehiculo(v.getMatricula()) != null) {
            return false; 
        }
        vehiculos.add(v);
        FicheroVehiculos.guardar(vehiculos);
        return true;
    }

    public Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                return v;
            }
        }
        return null;
    }

    public void eliminarVehiculo(String matricula) {
        Vehiculo v = buscarVehiculo(matricula);
        if (v != null) {
            vehiculos.remove(v);
            FicheroVehiculos.guardar(vehiculos);
        }

    }

    public List<Vehiculo> listarVehiculos() {
        return vehiculos;

    }


}
