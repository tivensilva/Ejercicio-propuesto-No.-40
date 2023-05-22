import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar un número?", "Ingreso de números", JOptionPane.YES_NO_OPTION);

        while (opcion == JOptionPane.YES_OPTION) {
            // Solicitar el número
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo"));

            // Calcular la raíz cuadrada, el cuadrado y el cubo
            double raiz = Operaciones.calcularRaizCuadrada(numero);
            int cuadrado = Operaciones.calcularCuadrado(numero);
            int cubo = Operaciones.calcularCubo(numero);

            // Mostrar los resultados
            JOptionPane.showMessageDialog(null, "Para el número " + numero +
                    "\nLa raíz cuadrada es: " + raiz +
                    "\nEl cuadrado es: " + cuadrado +
                    "\nEl cubo es: " + cubo);

            // Preguntar si desea ingresar otro número
            opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro número?", "Ingreso de números", JOptionPane.YES_NO_OPTION);
        }
    }
}
