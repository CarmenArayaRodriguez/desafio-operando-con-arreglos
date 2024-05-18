import java.util.ArrayList;

public class SmartWatch {

    // Método clearSteps filtra los pasos válidos y los devuelve en un arreglo
    public static ArrayList<Integer> clearSteps(int[] pasos) {
        ArrayList<Integer> pasosValidos = new ArrayList<>();

        // Se filtran los pasos
        for (int i = 0; i < pasos.length; i++) {
            if (pasos[i] >= 200 && pasos[i] <= 100000) {
                pasosValidos.add(pasos[i]);
            }
        }

        return pasosValidos;
    }

    // Método promedio recibe un ArrayList y calcula el promedio de los pasos
    public static double promedio(ArrayList<Integer> pasos) {
        if (pasos.isEmpty()) {
            return 0;
        }

        int sumaPasos = 0;
        // Se calculando la suma de pasos
        for (int i = 0; i < pasos.size(); i++) {
            sumaPasos += pasos.get(i);
        }

        return sumaPasos / (double) pasos.size();
    }

    public static void main(String[] args) {
        // Se convierten los argumentos de texto a entero
        int[] arregloPasos = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arregloPasos[i] = Integer.parseInt(args[i]);
        }

        // Se filtran los pasos y se calcula el promedio
        ArrayList<Integer> pasosValidos = clearSteps(arregloPasos);
        double resultadoPromedio = promedio(pasosValidos);

        System.out.println("El promedio de pasos válidos es: " + resultadoPromedio);
    }
}
