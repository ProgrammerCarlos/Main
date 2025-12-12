/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author JIMENA
 */
public class SistemaFacturacion {

    private ArrayList<Vuelo> vuelos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public SistemaFacturacion() {
        vuelos.add(new Vuelo("A101", "México", 320));
        vuelos.add(new Vuelo("B202", "Panamá", 280));
        vuelos.add(new Vuelo("C303", "España", 750));
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Mostrar vuelos");
            System.out.println("2. Comprar vuelo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

           switch (opcion) {
    case 1:
        mostrarVuelos();
        break;
    case 2:
        comprarVuelo();
        break;
    case 3:
        System.out.println("Gracias por usar el sistema.");
        break;
    default:
        System.out.println("Opción inválida");
        break;
}
        } while (opcion != 3);
    }

    private void mostrarVuelos() {
        System.out.println("\n=== LISTA DE VUELOS ===");
        for (int i = 0; i < vuelos.size(); i++) {
            System.out.println((i + 1) + ". " + vuelos.get(i));
        }
    }
    

    private void comprarVuelo() {
        mostrarVuelos();
        System.out.print("Seleccione un vuelo: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion < 1 || opcion > vuelos.size()) {
            System.out.println("Opción inválida");
            return;
        }

        Vuelo vueloSeleccionado = vuelos.get(opcion - 1);

        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Número de pasaporte: ");
        String pasaporte = sc.nextLine();

        Cliente cliente = new Cliente(nombre, pasaporte);
        Factura factura = new Factura(cliente, vueloSeleccionado);

        factura.imprimirFactura();
    }
}