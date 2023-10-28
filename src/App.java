import java.util.Random;         // Importamos la clase Random para generar números aleatorios.
import javax.swing.JOptionPane;  // Importamos la clase JOptionPane para la entrada/salida de datos en una ventana de diálogo.

public class App {
    public static void main(String[] args) {
        Random random = new Random();                     // Creamos una instancia de la clase Random para generar números aleatorios.
        int numramdom = random.nextInt(10) + 1;          // Generamos un número aleatorio entre 1 y 10 y lo almacenamos en la variable numramdom.
        int numuser;                                     // Declaramos una variable para almacenar el número ingresado por el usuario.
        boolean adivinado = false;                       // Declaramos una variable para rastrear si el usuario ha adivinado el número.

        do {  // Iniciamos un bucle do-while que se ejecutará al menos una vez. Esto permite que el usuario haga múltiples intentos para adivinar el número.

            numuser = Integer.parseInt(JOptionPane.showInputDialog("Digite el número"));  // Mostramos una ventana de diálogo para que el usuario ingrese un número.

            if (numuser > numramdom) {                  // Comparamos el número ingresado por el usuario (numuser) con el número aleatorio generado (numramdom).
                JOptionPane.showMessageDialog(null, "Muy alto");  // Si numuser es mayor, mostramos "Muy alto".
            } else if (numuser < numramdom) {
                JOptionPane.showMessageDialog(null, "Muy bajo");  // Si numuser es menor, mostramos "Muy bajo".
            } else {
                JOptionPane.showMessageDialog(null, "¡Correcto! El número oculto era: " + numramdom);  // Si numuser es igual, mostramos "¡Correcto!" y establecemos adivinado en true para salir del bucle.
                adivinado = true;
            }
        } while (!adivinado);  // El bucle continúa hasta que la variable adivinado se establece en true, lo que significa que el usuario ha adivinado el número.

    }
}
