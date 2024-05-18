public class MultiplosDeTres {

    // Método suma recibe un arreglo y suma los múltiplos de 3
    public static int suma(int[] numeros) {
        int sumaTotal = 0;

        // Se suman solo los múltiplos de 3
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                sumaTotal += numeros[i];
            }
        }

        return sumaTotal;
    }

    // Método promedio calcula el promedio de los múltiplos de 3
    public static double promedio(int[] numeros) {
        int sumaMultiplos = 0;
        int contadorMultiplos = 0;

        // Se itera sobre el arreglo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                sumaMultiplos += numeros[i];
                contadorMultiplos++;
            }
        }

        // Se evita la división por cero
        if (contadorMultiplos == 0) {
            // Si no se encuentran múltiplos de tres se devuelve 0
            return 0;
        }
        // Si hay múltiplos de tres se calcula el promedio
        return sumaMultiplos / (double) contadorMultiplos;
    }

    public static void main(String[] args) {
        // Los argumentos se convierten de texto a entero
        int[] arregloNumeros = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arregloNumeros[i] = Integer.parseInt(args[i]);
        }

        // Se calcula la suma y el promedio de los múltiplos de 3
        int sumaMultiplos = suma(arregloNumeros);
        double promedioMultiplos = promedio(arregloNumeros);

        System.out.println("Suma de múltiplos de 3: " + sumaMultiplos);
        System.out.println("Promedio de múltiplos de 3: " + promedioMultiplos);
    }
}
