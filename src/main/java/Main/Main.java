/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import java.util.Scanner;
import Controlador.Concesionario;
import Modelo.Vehiculo;
import Vista.VentanaAlta;
import Vista.VentanaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Main {

          private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
  
        
    public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));

        Scanner sc = new Scanner(System.in);
        
        Concesionario concesionario = new Concesionario();
        
        VentanaAlta vsAlta = new VentanaAlta(concesionario);
        
        vsAlta.setVisible(true);
        
        Vehiculo v = null;
        String matricula = null;
//        Shop shop = new Shop();
//        shop.initSession();
//        shop.loadInventory(inventory);
        int opcion = 0;
        boolean exit = false;

        do {
            System.out.println("\n===========================");
            System.out.println("Menu principal miTienda.com");
            System.out.println("===========================");
            System.out.println("1) Añadir Vehiculo");
            System.out.println("2) Eliminar Vehiculo");
            System.out.println("3) Buscar Vehiculo");
            System.out.println("4) Lista Vehiculo");
            System.out.println("10) Salir programa");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    concesionario.insertarVehiculo(v);
                    break;
                case 2:
                    concesionario.eliminarVehiculo(matricula);
                    break;
                case 3:
                    concesionario.buscarVehiculo(matricula);
                    break;
                case 4:
                    concesionario.listarVehiculos();
                    break;
                case 10:
                    exit = true;
                    break;
            }
        } while (!exit);

    }

}
