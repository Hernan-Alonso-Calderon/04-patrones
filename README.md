
# Patron Visitor

El Visitor es un patrón de diseño de comportamiento que permite agregar nuevas operaciones a estructuras de datos complejas sin modificar sus clases existentes.



## Funcionamiento

Imagina que tienes una estructura de objetos que representan diferentes elementos de un documento, como párrafos, tablas e imágenes. Cada uno de estos elementos tiene su propia lógica, pero necesitas realizar operaciones adicionales como convertir el documento a un formato diferente o calcular su tamaño total.

Con el patrón Visitor, puedes definir un conjunto de "visitantes" que encapsulan estas operaciones adicionales. Cada visitante implementa las operaciones necesarias para interactuar con los diferentes tipos de elementos de la estructura. La estructura no necesita cambiar, simplemente permite que los visitantes interactúen con sus componentes.

Este enfoque separa el comportamiento de los elementos de la estructura de las operaciones realizadas sobre ellos, lo que facilita la adición de nuevas operaciones sin alterar el código de los elementos.a.


## Cuando usarlo...

-Cuando necesites realizar muchas operaciones diferentes sobre una estructura de objetos compleja. Cada operación puede implementarse como un nuevo visitante sin modificar las clases de los objetos.

-Cuando necesitas mantener el principio de responsabilidad única. El patrón Visitor permite que las clases de la estructura se enfoquen en su lógica principal mientras delegan las operaciones adicionales a los visitantes.

-Cuando anticipas que las operaciones aplicadas a los elementos de una estructura cambiarán más a menudo que la estructura en sí. Es más fácil agregar un nuevo visitante que modificar todas las clases de la estructura para soportar nuevas operaciones.



