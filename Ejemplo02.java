public class Ejemplo02 {
    public static void main(String[] args) {
        System.out.println("Argumentos pasados al programa:");
        // Verificar si se han pasado argumentos
        if (args.length > 0) {
            // Recorrer los argumentos y mostrarlos
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No se han pasado argumentos.");
        }
    }
}