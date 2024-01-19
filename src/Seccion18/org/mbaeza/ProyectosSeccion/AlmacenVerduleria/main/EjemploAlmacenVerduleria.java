package Seccion18.org.mbaeza.ProyectosSeccion.AlmacenVerduleria.main;

import Seccion18.org.mbaeza.ProyectosSeccion.AlmacenVerduleria.*;

public class EjemploAlmacenVerduleria {
    public static void main(String[] args) {

        Producto[] productos = new Producto[8];
        productos[0] = new Fruta("manzana fuji", 1200.00,2500d, "roja");
        productos[1] = new Fruta("uvas", 1000.00, 3500d, "verdes");

        productos[2] = new Limpieza("lavaloza", 2290, "Quix", 1.2);
        productos[3] = new Limpieza("Desinfectante Lavanda", 1330, "Lysol", 0.9);

        productos[4] = new Lacteo("Leche Sabor Chocolate Semidescremada", 1000, 32, 1150);
        productos[5] = new Lacteo("Yoghurt Batido Sabor Frutilla Bolsa", 1000, 37, 1190);

        productos[6] = new NoPerecible("Atún Lomitos en Agua Angelmo", 95,170, 960);
        productos[7] = new NoPerecible("Porotos Hallado Bolsa", 1000, 3536, 1990);

        for (Producto producto: productos) {
            System.out.println("-------------------------------- " + producto.getClass().getSimpleName() + "---------------------------------");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            if (producto instanceof Fruta) {
                System.out.println("Peso: " + ((Fruta) producto).getPeso());
                System.out.println("Color: " + ((Fruta) producto).getColor());
            } else if (producto instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) producto).getComponentes());
                System.out.println("Litros: " + ((Limpieza) producto).getLitros());
            } else if (producto instanceof Lacteo) {
                System.out.println("Cantidad: " + ((Lacteo) producto).getCantidad());
                System.out.println("Proteinas: " + ((Lacteo) producto).getProteinas());
            } else if (producto instanceof NoPerecible) {
                System.out.println("Calorias: " + ((NoPerecible) producto).getCalorias());
                System.out.println("Contenido: " + ((NoPerecible) producto).getContenido());
            }
        }

    }
}