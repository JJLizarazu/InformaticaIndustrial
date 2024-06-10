import java.util.*;
class Proyecto_1{
    static Scanner sc = new Scanner(System.in);  // Scanner : números
    static Scanner scc = new Scanner(System.in); // Scanner : texto
    public static void main(String[] args) {
        int menuSelector;
        headerMain();
        do {
            selectorOptions();
            System.out.print("                                       -> ");menuSelector = sc.nextInt();
            cleanScreen();
            showSelectorOptions(menuSelector);
        } while (menuSelector != 3);
    }

    static void showSelectorOptions(int menuSelector){
        ArrayList Farmacos = new ArrayList();
        String Farmaco;
        int quantityFarmaco;
        switch(menuSelector){
            case 1:                                                        // REALIZAR LA VENTA
                cleanScreen();
                System.out.println("                                       ______________________________________");
                System.out.println("                                       |           REALIZAR VENTA           |");
                System.out.println("                                       ------------------------------------- ");
                break;
            case 2:                                                        // AÑADIR O QUITAR INVENTARIO
                int selectorInventory;
                do {
                    System.out.println("                                       ______________________________________");
                    System.out.println("                                       |        -> A/Q INVENTARIO <-        |");
                    System.out.println("                                       [------------------------------------]");
                    System.out.println("                                       |   SELECCIONE UNA OPCIÓN ( 1 - 4 )  |");
                    System.out.println("                                       |-----|------------------------------|");
                    System.out.println("                                       |  1  |     AÑADIR AL INVENTARIO     |");
                    System.out.println("                                       |-----|------------------------------|");
                    System.out.println("                                       |  2  |     QUITAR AL INVENTARIO     |");
                    System.out.println("                                       |-----|------------------------------|");
                    System.out.println("                                       |  3  |      MOSTRAR INVENTARIO      |");
                    System.out.println("                                       |-----|------------------------------|");
                    System.out.println("                                       |  4  |        VOLVER AL MENÚ        |");
                    System.out.println("                                       |-----|------------------------------|");
                    System.out.print("                                       -> ");selectorInventory = sc.nextInt();
                    cleanScreen();
                    switch (selectorInventory){
                        case 1: // AÑADIR AL INVENTARIO
                            System.out.println("                                       ______________________________________");
                            System.out.println("                                       |        AÑADIR AL INVENTARIO        |");
                            System.out.println("                                       [------------------------------------]");
                            System.out.println("                                       |  INGRESE UN FÁRMACO HA SER AÑADIDO |");
                            System.out.println("                                       [------------------------------------]");
                            System.out.print("                                       -> ");
                            Farmaco = scc.nextLine();  // Leer Fármaco
                            System.out.println("                                       [------------------------------------]");
                            System.out.println("                                       |   CANTIDAD DE UNIDADES A INGRESAR  |");
                            System.out.println("                                       [------------------------------------]");
                            System.out.print("                                       -> x");
                            quantityFarmaco = sc.nextInt();
                            Farmacos.add(Farmaco);  // Añadir Fármaco
                            Farmacos.add(quantityFarmaco);  // Añadir Cantidad del Fármaco
                            cleanScreen();
                            System.out.println("                                       ______________________________________");
                            System.out.println("                                                  " + Farmaco + " - x" + quantityFarmaco + "        ");
                            System.out.println("                                       |    ¡ FUE AGREGADO EXITOSAMENTE !   |");
                            System.out.println("                                       [------------------------------------]");
                            break;
                        case 2: // QUITAR DEL INVENTARIO
                            cleanScreen();
                            break;
                        case 3: // MOSTRAR EL INVENTARIO
                            cleanScreen();
                            for (int i = 0 ; i < Farmacos.size() ; i++){
                                System.out.print(Farmacos.get(i));
                                if((i + 1) % 2 == 0){
                                    System.out.println(" ");
                                }
                                if ((i + 1) % 2 != 0){
                                    System.out.print(", x");
                                }
                            }
                            break;
                        case 4: // SALIR
                            cleanScreen();
                            break;
                    }
                } while (selectorInventory != 4);
                break;
            case 3:
                finishSesion();
                break;
        }
    }

    static void finishSesion(){
        cleanScreen();
        System.out.println("                                       ______________________________________");
        System.out.println("                                       |           TERMINAR SESIÓN           |");
        System.out.println("                                       ------------------------------------- ");
    }
    static void selectorOptions(){
        System.out.println("                                       |-----|------------------------------|");
        System.out.println("                                       |  1  |        REALIZAR VENTA        |");
        System.out.println("                                       |-----|------------------------------|");
        System.out.println("                                       |  2  |        A/Q INVENTARIO        |");
        System.out.println("                                       |-----|------------------------------|");
        System.out.println("                                       |  3  |       TERMINAR  SESIÓN       |");
        System.out.println("                                       |-----|------------------------------|");
    }

    static void headerMain(){
        System.out.println(" ");
        System.out.println("                                       |====================================|");
        System.out.println("                                       |      |   ----------------   |      |");
        System.out.println("                                       |      |       FARMACIA       |      |");
        System.out.println("                                       |      |   ----------------   |      |");
        System.out.println("                                       |  SISTEMA PARA GESTIÓN DE FARMACIA  |");
        System.out.println("                                       [------------------------------------]");
        System.out.println("                                       |   SELECCIONE UNA OPCIÓN ( 1 - 3 )  |");
    }

    static void cleanScreen(){
        for (int i = 0 ; i < 20 ; i++){
            System.out.println(" ");
        }
    }

}