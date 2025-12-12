/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JIMENA
 */
public class Factura {
    private Cliente cliente;
    private Vuelo vuelo;
    private double impuestos;
    private double total;

    public Factura(Cliente cliente, Vuelo vuelo) {
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.impuestos = vuelo.getPrecioBase() * 0.13; // 13% IVA
        this.total = vuelo.getPrecioBase() + impuestos;
    }

    public void imprimirFactura() {
        System.out.println("\n=== FACTURA DE COMPRA ===");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Pasaporte: " + cliente.getPasaporte());
        System.out.println("Vuelo: " + vuelo.getCodigo() + " - " + vuelo.getDestino());
        System.out.println("Precio base: $" + vuelo.getPrecioBase());
        System.out.println("Impuestos (13%): $" + impuestos);
        System.out.println("TOTAL: $" + total);
        System.out.println("=========================\n");
    }
}