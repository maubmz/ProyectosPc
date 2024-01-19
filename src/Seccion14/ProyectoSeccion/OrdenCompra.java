package Seccion14.ProyectoSeccion;

import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    private static Integer identificador = 0;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProductos = 0;

    public OrdenCompra(String descripcion) {
        identificador += 1;
        this.descripcion = descripcion;
    }

    public void addProducto(Producto producto) {
        this.productos[indiceProductos++] = producto;
    }

    public int totalCompra() {
        int total = 0;
        for (Producto p: this.productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Producto[] getProductos() {
        return productos;
    }
}
