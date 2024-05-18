public class Visitas {

    // Método promedio recibe un arreglo de enteros y calcula el promedio
    public static double promedio(int[] arregloVisitas) {
        // Se verifica si el arreglo está vacío
        if (arregloVisitas.length == 0) {
            return 0;
        }

        // Se inicializa una variable para sumar las visitas
        int sumaVisitas = 0;

        // Se suman las visitas
        for (int i = 0; i < arregloVisitas.length; i++) {
            sumaVisitas += arregloVisitas[i];
        }

        // Se calcula el promedio
        return sumaVisitas / (double) arregloVisitas.length;
    }

    public static void main(String[] args) {
        // Los argumentos (texto) se convierten a entero
        int[] arregloVisitas = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arregloVisitas[i] = Integer.parseInt(args[i]);
        }

        // Se calcula el promedio
        double resultadoPromedio = promedio(arregloVisitas);

        System.out.println("El promedio de visitas es: " + resultadoPromedio);
    }
}
