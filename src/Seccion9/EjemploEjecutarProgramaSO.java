package Seccion9;

import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        Process process;

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                process = runtime.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                process = runtime.exec("textedit");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                    (System.getProperty("os.name").toLowerCase().contains("nix"))) {
                process = runtime.exec("gedit");
            }else {
                process = runtime.exec("gedit");
            }
            process.waitFor();

        } catch (Exception e) {
            System.err.println("El comando es desconocido. " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor ");
        System.exit(0);
    }
}
