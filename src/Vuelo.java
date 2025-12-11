/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Keisy
 */
public class Vuelo {
    private final String codigo;
    private final String destino;
    private final double precioBase;

    public Vuelo(String codigo, String destino, double precioBase) {
        this.codigo = codigo;
        this.destino = destino;
        this.precioBase = precioBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    @Override
    public String toString() {
        return codigo + " - " + destino + " | Precio:  ₡ " + precioBase;
    }
}


