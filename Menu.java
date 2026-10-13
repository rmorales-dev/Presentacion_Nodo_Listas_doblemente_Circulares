import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.println("==================================================================");
            System.out.println(" Bienvenido a la Playlist Lista Doblemente Circular del ITM ");
            System.out.println("==================================================================");
            System.out.println("Por favor ingrese la opcion que desea realizar: ");
            System.out.println("1) Cargar las 3 canciones de prueba (Julio Jaramillo, Willie Colón, Octavio Mesa)");
            System.out.println("2) Ingresar una nueva canción manualmente");
            System.out.println("3) Mostrar playlist hacia adelante (Cabeza -> Cola)");
            System.out.println("4) Mostrar playlist hacia atrás (Cola -> Cabeza)");
            System.out.println("5) Salir");
            System.out.print("Opción: ");

            int opt = sc.nextInt();
            System.out.println();

            switch (opt) {
                case 1:
                    // Canción 1: Julio Jaramillo
                    ObjCancion c1 = new ObjCancion();
                    c1.setTitulo("Reminiscencias");
                    c1.setCantante("Julio Jaramillo");
                    c1.setAño(1960);
                    m.AgregarCancion(c1);

                    // Canción 2: Willie Colón
                    ObjCancion c2 = new ObjCancion();
                    c2.setTitulo("Idilio");
                    c2.setCantante("Willie Colón");
                    c2.setAño(1993);
                    m.AgregarCancion(c2);

                    // Canción 3: Octavio Mesa
                    ObjCancion c3 = new ObjCancion();
                    c3.setTitulo("Con verraquera");
                    c3.setCantante("Octavio Mesa");
                    c3.setAño(1985);
                    m.AgregarCancion(c3);

                    System.out.println("-> ¡Las 3 canciones de prueba fueron cargadas con éxito!");
                    break;

                case 2:
                    m.PedirYAgregarCancion(sc);
                    System.out.println("-> ¡Canción ingresada correctamente!");
                    break;

                case 3:
                    System.out.println(m.MostrarListaAdelante());
                    break;

                case 4:
                    System.out.println(m.MostrarListaAtras());
                    break;

                case 5:
                    System.out.println("Gracias por usar la Playlist Lista Doblemente Circular. Espero tener un 5 de calificación :D");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida, ingrese una opción del 1 al 5");
                    System.out.println();
                    break;
            }
        }
    }
}