import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {

    //Atributo
    private static final BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    //Métodos
    public static void menuPrincipal() throws Exception {
        byte opcion = -1;
        ArbolBMas arbol = new ArbolBMas(4);

        do {
            System.out.println("\n --- Menú principal --- \n");
            System.out.println("[ 1] Insertar");
            System.out.println("[ 2] Buscar");
            System.out.println("[ 3] Eliminar");
            System.out.println("[ 4] Recorrer");
            System.out.println("[ 5] Imprimir");
            System.out.println("[ 0] Salir");
            System.out.print("\nSeleccione una opción: ");
            try {
                opcion = Byte.parseByte(entrada.readLine());
            } catch (Exception e) {
                System.out.println("Lo sentimos, sucedió algo inesperado");
            }
            procesarSeleccionPrincipal(opcion, arbol);
        } while (opcion != 0);
    }

    public static void procesarSeleccionPrincipal(byte opcion, ArbolBMas arbol) {
        Scanner scanner = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.print("\nSeleccione la llave a insertar: ");
                int llaveInsertar = Integer.parseInt(scanner.nextLine());
                arbol.insertar(llaveInsertar);
                break;
            case 2:
                System.out.print("\nSeleccione la llave a buscar: ");
                int llaveBuscar = Integer.parseInt(scanner.nextLine());
                System.out.println("La llave " + llaveBuscar + " se encuentra en la estructura: "
                        + arbol.buscar(llaveBuscar));
                break;
            case 3:
                System.out.println("Eliminando...");
                break;
            case 4:
                System.out.println("Recorriendo...");
                break;
            case 5:
                arbol.imprimirArbol();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
