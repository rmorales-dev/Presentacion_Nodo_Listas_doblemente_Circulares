import java.util.Scanner;

public class Metodos {
    Nodo Cabeza;
    Nodo Cola;

    public Metodos() {
        Cabeza = null;
        Cola = null;
    }

    // OPCIÓN 1: Agregar canción a la lista doblemente circular
    public boolean AgregarCancion(ObjCancion cancion) {
        Nodo nuevo = new Nodo();
        nuevo.setCancion(cancion);

        if (Cabeza == null) {
            Cabeza = nuevo;
            Cola = nuevo;
            Cabeza.setSiguiente(Cabeza);
            Cabeza.setAnterior(Cabeza);
        } else {
            Cola.setSiguiente(nuevo);      // 1. La antigua cola apunta hacia adelante al nuevo
            nuevo.setAnterior(Cola);       // 2. El nuevo apunta hacia atrás a la antigua cola
            nuevo.setSiguiente(Cabeza);    // 3. El nuevo apunta hacia adelante a la cabeza (cierra ciclo)
            Cabeza.setAnterior(nuevo);     // 4. La cabeza apunta hacia atrás al nuevo (cierra ciclo)
            Cola = nuevo;                  // 5. El nuevo pasa a ser la nueva cola
        }

        return true;
    }

    public boolean PedirYAgregarCancion(Scanner sc) {
        sc.nextLine();
        ObjCancion nuevaCancion = new ObjCancion();

        System.out.println("Ingrese el título de la canción:");
        nuevaCancion.setTitulo(sc.nextLine());

        System.out.println("Ingrese el cantante:");
        nuevaCancion.setCantante(sc.nextLine());

        System.out.println("Ingrese el año de lanzamiento:");
        nuevaCancion.setAño(sc.nextInt());

        return AgregarCancion(nuevaCancion);
    }

    public String MostrarListaAdelante() {
        if (Cabeza == null) {
            return "No hay canciones en la playlist.";
        }

        System.out.println("---------------------------------------------");
        System.out.println("Playlist Nacho Lee (Cabeza -> Cola)");
        Nodo actual = Cabeza;

        while (actual != null) {
            System.out.println(" Título: " + actual.getCancion().getTitulo()) ;
            System.out.println("- Cantante: " + actual.getCancion().getCantante() );
            System.out.println("- Año: " + actual.getCancion().getAño());

            if (actual == Cola) {
                break;
            }
            actual = actual.getSiguiente();
        }

        System.out.println("---------------------------------------------");
        return "Playlist mostrada correctamente.";
    }
    public String MostrarListaAtras() {
        if (Cabeza == null) {
            return "No hay canciones en la playlist.";
        }

        System.out.println("---------------------------------------------");
        System.out.println("Playlist Nacho Lee (Cola -> Cabeza)");
        Nodo actual = Cola;

        while (actual != null) {
            System.out.println(" Título: " + actual.getCancion().getTitulo()) ;
            System.out.println("- Cantante: " + actual.getCancion().getCantante() );
            System.out.println("- Año: " + actual.getCancion().getAño());

            if (actual == Cabeza) {
                break;
            }
            actual = actual.getAnterior();
        }

        System.out.println("---------------------------------------------");
        return "Playlist en sentido inverso mostrada correctamente.";
    }
}