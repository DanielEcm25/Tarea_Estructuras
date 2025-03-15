            TORRE DE HANOI CON RECURSIVIDAD

----- DESCRIPCIÓN DEL PROYECTO -----

Este proyecto implementa el clásico problema de las Torres de Hanoi 
utilizando el concepto de recursividad. El objetivo principal es 
desarrollar una aplicación que permita resolver este problema de 
forma automática, mostrando paso a paso cómo se deben mover los 
discos desde una torre de origen hacia una torre de destino, 
utilizando una torre auxiliar como apoyo, y cumpliendo con las 
reglas establecidas del juego.

Asimismo, se utiliza la recursividad para resolver
problemas complejos de manera estructurada y eficiente, aplicando
conceptos fundamentales de la programación orientada a objetos, uso
de estructuras de datos (pilas/Stacks), entrada de datos por teclado,
y control del flujo del programa.

----- FUNCIONAMIENTO -----

El sistema permite al usuario ingresar la cantidad de discos con 
los que desea resolver el problema, los cuales se almacenan 
inicialmente en la torre de origen (Torre 1), utilizando una 
estructura dinámica de tipo pila (Stack). El algoritmo principal, 
implementado mediante el método recursivo hanoi(), se encarga de 
trasladar los discos desde la torre origen hasta la torre destino 
(Torre 3), haciendo uso de una torre auxiliar (Torre 2). 
Este método aplica las reglas clásicas del juego: solo se puede 
mover un disco a la vez y un disco mayor no puede colocarse sobre 
uno menor. En cada llamada recursiva, se realizan tres pasos 
fundamentales: mover los discos superiores a la torre auxiliar, 
mover el disco más grande a la torre destino y finalmente mover 
los discos desde la torre auxiliar a la torre destino. 
Cada movimiento es gestionado mediante el método moverDisco(),
que se encarga de retirar el disco de la torre origen y colocarlo 
en la torre destino, actualizando el estado del sistema. A su vez, 
el método mostrarTorres() imprime por consola el estado actual de las
tres torres después de cada movimiento, permitiendo al usuario 
visualizar el proceso de resolución paso a paso. La ejecución del 
programa se inicia desde la clase Main, que gestiona la entrada del
usuario.

-----INTEGRANTES DEL GRUPO-----
1. Johan Steven Briceño Layton
2. Daniel Esteban Contreras Motoa
3. Juan David Catrillón Varón
