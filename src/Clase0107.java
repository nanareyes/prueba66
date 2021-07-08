public class Clase0107 {
    public static void main(String[] args) throws Exception {
        Operacion objetoOperacion = new Operacion();
        int numero = objetoOperacion.sumar(8, 7);
        System.out.println(numero);

        // crear
        int valores[];
        valores = new int[3];

        // Asignar valores a un arreglo a través de []
        valores[0] = 10;
        valores[1] = 20;
        valores[2] = 30;

        // Recorrer el arreglo
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);

        }

    }
}
