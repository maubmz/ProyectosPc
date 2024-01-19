package Seccion14.ProyectoSeccion;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Miguel", "Hernandez");
        Producto p1 = new Producto("Gamesa", "Marias", 20);
        Producto p2 = new Producto("Barcel", "Takis", 17);
        Producto p3 = new Producto("Oreo", "Galletas oreo", 19);
        Producto p4 = new Producto("Pepsi", "Pepsi 600ml", 15);
        Producto[] lista1 = {p1, p2, p3, p4};
        OrdenCompra orden1 = new OrdenCompra("Compra de galletas y refresco");
        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        for (int i = 0; i < lista1.length; i++) {
            orden1.addProducto(lista1[i]);
        }

        Cliente cliente2 = new Cliente("Danna", "Perez");
        Producto p5 = new Producto("Baileys","Chocolate con rompope", 90);
        Producto p6 = new Producto("Ferrero Rocher", "16 chocolates", 200);
        Producto p7 = new Producto("Apple", "Airpods pro", 6000);
        Producto p8 = new Producto("Bonafont", "Agua Bonafont 1.5lt", 20);
        Producto[] lista2 = {p5, p6, p7, p8};
        OrdenCompra orden2 = new OrdenCompra("Compra en la tienda bestbuy");
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        for (int i = 0; i < lista2.length; i++) {
            orden2.addProducto(lista2[i]);
        }

        Cliente cliente3 = new Cliente("Ernesto", "Suarez");
        Producto p9 = new Producto("Coca Cola", "Coca 3Lts", 45);
        Producto p10 = new Producto("Ciel", "Agua mineral 2Lts", 28);
        Producto p11 = new Producto("Barcel", "Chips grandes", 35);
        Producto p12 = new Producto("Gamesa", "Rollo galletas emperador", 30);
        Producto[] lista3 = {p9, p10, p11, p12};
        OrdenCompra orden3 = new OrdenCompra("Compra en Walmart");
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());
        for (int i = 0; i < lista3.length; i++) {
            orden3.addProducto(lista3[i]);
        }

        System.out.println("Primer Orden: ");
        System.out.println(orden1.getCliente().getNombre() + " " + orden1.getCliente().getApellido());
        System.out.println(orden1.getDescripcion());
        System.out.println(orden1.getFecha());
        System.out.println("Total: " + orden1.totalCompra());
        for (Producto p: orden1.getProductos()) {
            System.out.println(p.getFabricante() + " " + p.getNombre() + " " + p.getPrecio());
        }

        System.out.println("\nSegunda Orden: ");
        System.out.println(orden2.getCliente().getNombre() + " " + orden2.getCliente().getApellido());
        System.out.println(orden2.getDescripcion());
        System.out.println(orden2.getFecha());
        System.out.println("Total: " + orden2.totalCompra());
        for (Producto p: orden2.getProductos()) {
            System.out.println(p.getFabricante() + " " + p.getNombre() + " " + p.getPrecio());
        }

        System.out.println("\nTercer Orden: ");
        System.out.println(orden3.getCliente().getNombre() + " " + orden3.getCliente().getApellido());
        System.out.println(orden3.getDescripcion());
        System.out.println(orden3.getFecha());
        System.out.println("Total: " + orden3.totalCompra());
        for (Producto p: orden3.getProductos()) {
            System.out.println(p.getFabricante() + " " + p.getNombre() + " " + p.getPrecio());
        }

    }
}
