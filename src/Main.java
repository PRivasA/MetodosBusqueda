import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 3, 4, 5, 7, 9, 12, 13, 17, 23, 28, 31};

        System.out.println("Elija el tipo de búsqueda:");
        System.out.println("1. Búsqueda Binaria");
        System.out.println("2. Búsqueda Secuencial");

        int choice = scanner.nextInt();

        System.out.println("Ingrese el número a buscar:");
        int target = scanner.nextInt();

        if (choice == 1) {
            int result = busquedaBinaria(array, target);
            if (result == -1) {
                System.out.println("El número " + target + " no se encontró en el arreglo.");
            } else {
                System.out.println("El número " + target + " se encontró en el índice " + result + ".");
            }
        } else if (choice == 2) {
            int result = busquedaSecuencial(array, target);
            if (result == -1) {
                System.out.println("El número " + target + " no se encontró en el arreglo.");
            } else {
                System.out.println("El número " + target + " se encontró en el índice " + result + ".");
            }
        } else {
            System.out.println("Opción inválida. Por favor, elija 1 o 2.");
        }
    }

    // método de búsqueda binaria
    public static int busquedaBinaria(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    //método de búsqueda secuencial
    public static int busquedaSecuencial(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}