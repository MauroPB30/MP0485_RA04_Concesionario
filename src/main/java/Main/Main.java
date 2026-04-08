/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import java.util.Scanner;
import Controlador.Concesionario;
import Modelo.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Main {

          private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
  
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Concesionario concesionario = new Concesionario();
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
            System.out.println("1) Contar caja");
            System.out.println("2) Añadir producto");
            System.out.println("3) Añadir stock");
            System.out.println("4) Marcar producto proxima caducidad");
            System.out.println("5) Ver inventario");
            System.out.println("6) Venta");
            System.out.println("7) Ver ventas");
            System.out.println("8) Ver total de ventas");
            System.out.println("9) Eliminar producto del inventario");
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
                    concesionario.listarVehiculos(vehiculos);
                    break;
                case 10:
                    exit = true;
                    break;
            }
        } while (!exit);

    }

}
