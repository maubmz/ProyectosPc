package Seccion4;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "mau";
        passwords[0] = "password";

        usernames[1] = "admin";
        passwords[1] = "password";

        usernames[2] = "pepe";
        passwords[2] = "password";
         */
        String[] usernames = {"mau","admin","pepe"};
        String[] passwords = {"password","password2","password3"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String user = scanner.next();

        System.out.println("Ingrese el password: ");
        String pass = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0;i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals((user)) && passwords[i].equals(pass) )? true : esAutenticado;

            /*if( (usernames[i].equals(user) && passwords[i].equals(pass)) ) {
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(user)
                : "Username o contrasenia incorrecto\nLo siento, requiere autenticacion.";
        System.out.println(mensaje);
        /*if(esAutenticado ) {
            System.out.println("Bienvenido usuario ".concat(user));
        }else {
            System.out.println("Username o contrasenia incorrectos!");
            System.out.println("Lo siento, requiere autenticacion.");
        }*/

    }
}
