import java.util.Scanner;

public class MuyMalHecho {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int Contador = 0;

        System.out.println("Número de usuarios a ingresar:");
        byte NumeroUsuarios = input.nextByte();
        input.nextLine();

        byte Edad1 = 0, Edad2 = 0, Edad3 = 0;
        String Nombre1 = "", Nombre2 = "", Nombre3 = "";

        while (Contador < NumeroUsuarios) {
            System.out.println("Nombre del usuario:");
            String NombreUsuario = input.nextLine();

            System.out.println("Edad del usuario:");
            byte EdadUsuario = input.nextByte();
            input.nextLine();

            if (Contador == 0) {
                Nombre1 = NombreUsuario;
                Edad1 = EdadUsuario;
            } else if (Contador == 1) {
                Nombre2 = NombreUsuario;
                Edad2 = EdadUsuario;
            } else if (Contador == 2) {
                Nombre3 = NombreUsuario;
                Edad3 = EdadUsuario;
            }

            if (EdadUsuario >= 18) {
                System.out.println(NombreUsuario + " es mayor de edad.");
            } else {
                System.out.println(NombreUsuario+ " es menor de edad.");
            }

            if (EdadUsuario > 120 || EdadUsuario < 1) {
                System.out.println("Edad no válida.");
            }

            Contador = Contador + 1;
        }

        System.out.println("Resumen:");
        System.out.println("Usuario 1: " + Nombre1 + " - Edad: " + Edad1);
        System.out.println("Usuario 2: " + Nombre2 + " - Edad: " + Edad2);
        System.out.println("Usuario 3: " + Nombre3 + " - Edad: " + Edad3);
        input.close();
    }
}
