# Ejercicio 1 - Al revés (1.5 puntos).

Crea un fichero "E1.java"

* En el main crea un programa que pida dos cadenas de texto al usuario. El programa debe concatenar las dos cadenas y mostrar la cadena de texto resultante al revés.

* Por ejemplo, para las cadenas de texto "hola" y "adios" el programa debería imprimir "soidaaloh".

* Haz commit.

# Ejercicio 2 - Módulo (2.5 puntos)

Crea un fichero "E2.java"

* En el main crea un programa que llame a una función "obtenerRestos".

* La función "obtenerRestos" recibe como parámetros dos arrays de números enteros. Si los arrays son de la misma longitud debe calcular el resto de la división entre los elementos que ocupan la misma posición en cada uno de los arrays.

* La función debe devolver un array con los restos calculados.

* En el main se debe imprimir cada uno de los arrays utilizados. Tanto los dos arrays de entrada como el de salida.

* Crea una función imprimirArray que realice esa tarea.

* Haz commit.

# Ejercicio 3 - Persona (3.5 puntos)

Crea una clase "Persona" con los siguientes atributos:

* Nombre
* Apellidos
* Edad
* DNI
* Domicilio

Los atributos no deben ser visibles desde fuera de la clase.

Crea dos constructores. Uno sin parámetros en los que se crea una persona con el nombre "Maria" y 25 años de edad. El otro constructor debe permitir dar valores concretos a cada uno de los atributos.

Crea los getters y setters para todos los atributos. La única restricción es que una vez creado un objeto no se debe poder cambiar la edad de una persona.

Crea un atributo de clase "personas" que debe ser un ArrayList. Cada vez que se crea una persona nueva se debe añadir a ese ArrayList.

Crea un método de clase "eliminarPersona" que recibe como parámetro una cadena de texto y elimina la primera persona cuyo nombre coincide en el ArrayList "personas".

Crea el método adecuado para que Java pueda manejar un objeto de la clase Persona como una cadena de texto.

* Haz commit.

# Ejercicio 4 - Music Organizer (2.5 puntos)

* Añade un campo "seconds" para indicar la duración de una pista en segundos.

* Añade un nuevo constructor para poder crear una pista indicando su duración.

* Añade el getter y el setter para el campo seconds;

* Añade dos métodos para poder incrementar y decrementar la duración de una pista.

* Añade un método en MusicOrganizer llamado "findLongTracks" que debe devolver un ArrayList con las pistas que duren más de cuatro minutos;

* Añade un método en MusicOrganizer llamado "findShort" que devuelva la pista más corta de la colección.
