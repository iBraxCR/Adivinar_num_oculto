Juego de Adivinanza de Números

Este código Java es un juego simple de adivinanza de números en el que el programa genera un número aleatorio entre 1 y 10, y el usuario intenta adivinar ese número. El juego se desarrolla en una ventana de diálogo utilizando la clase JOptionPane para entrada/salida de datos.

Cómo Funciona
Importaciones:

Importamos la clase Random para generar números aleatorios.
Importamos la clase JOptionPane para mostrar ventanas de diálogo.
Generación del Número Aleatorio:

Creamos una instancia de la clase Random para generar números aleatorios.
Generamos un número aleatorio entre 1 y 10 y lo almacenamos en la variable numramdom.
Declaración de Variables:

Declaramos la variable numuser para almacenar el número ingresado por el usuario.
Establecemos la variable adivinado en false para rastrear si el usuario ha adivinado el número.
Bucle de Adivinanza:

Iniciamos un bucle do-while que permite al usuario hacer múltiples intentos para adivinar el número aleatorio.
Se muestra una ventana de diálogo para que el usuario ingrese un número.
Comprobación de la Suposición del Usuario:

Comparamos el número ingresado por el usuario (numuser) con el número aleatorio generado (numramdom).
Si numuser es mayor que numramdom, se muestra un mensaje "Muy alto".
Si numuser es menor que numramdom, se muestra un mensaje "Muy bajo".
Si numuser es igual a numramdom, se muestra un mensaje de victoria y se establece adivinado en true para salir del bucle.
Fin del Juego:

El juego continúa hasta que el usuario adivina el número.
Una vez adivinado el número, se muestra un mensaje de victoria que incluye el número oculto.
Este juego proporciona una experiencia interactiva y entretenida para que los usuarios practiquen sus habilidades de adivinanza de números. Puedes personalizarlo según tus necesidades y preferencias. ¡Diviértete jugando!