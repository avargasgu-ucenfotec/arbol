# Implementación de estructuras de datos - Árbol B+

## Descripción
El trabajo consiste en la implementación de un árbol B+ en Java, que simule de manera simbólica y simplificada la operación ordinaria de una estructura como las utilizadas para la gestión de los datos en bases de datos y sistemas de ficheros en sistemas operativos.

Los árboles B+, debido a su definición, no permiten el desbalance, de modo que las operaciones que conforman su interfaz pública deben ser desarrolladas con dicha condición en mente (i.e., si la inserción o eliminación de un nodo introduce un desbalance en la estructura, ella misma debe rebalancearse automáticamente).

Todos los elementos de un árbol B+ se almacenan en las hojas, que son los únicos nodos que contienen datos; los nodos intermedios, incluyendo la raíz, contienen únicamente claves. Adicionalmente, todas las hojas están enlazadas entre sí, facilitando el recorrido de los datos una vez que se ha encontrado una cierta hoja de interés.

## Requerimientos
[ ] El sistema debe incluir una clase **ArbolBMas** cuyos atributos son la **raiz** y el **orden** del árbol (i.e., cada nodo puede tener entre **m/2** y **m** hijos, con la expcepcion de la **raiz**, que puede tener entre **2** y **m** hijos.\
[ ] La clase **ArbolBMas** debe tener el método **insertar()**, el cual recibe la clave y el valor del elemento por insertar.\
[ ] La clase **ArbolBMas** debe tener el método **buscar()**, el cual recibe la clave del elemento por insertar.\
[ ] La clase **ArbolBMas** debe tener el método **eliminar()**, el cual recibe la clave del elemento por eliminar.\
[ ] La clase **ArbolBMas** debe tener el método **recorrer()**, el cual recibe un valor **n** y realiza una búsqueda e imprime los siguientes **n** elementos.\
[ ] El sistema debe incluir una clase **Nodo**, cuyos atributos son **listaClaves**, **esHoja**, **listaHijos** y **siguiente**.\
[ ] La clase **Nodo** debe tener los métodos estándares ordinarios.\
[ ] La clase **Nodo** debe tener el método **insertarClave()**.\
[ ] La clase **Nodo** debe tener el método **dividir()**, el cual se invoca cada vez que el nodo ha alcanzado la cantidad de claves permitidas.\
[ ] El sistema debe incluir una interfaz de consola sencilla mediante la cual el usuario pueda interactuar con la estructura de datos.\
[ ] El sistema debe incluir un **menu()** de consola sencillo pero intuitivo y amigable con el usuario.
