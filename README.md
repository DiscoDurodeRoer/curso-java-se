# Curso Java

Curso de Java SE (Standard Edition) para aprender todo sobre este lenguaje, combinando teoria y ejercicios para practicar.

El curso esta hecho en Java 21, pero es compatible con versiones anteriores.

El curso esta divido por partes.

## Básico

Video en [youtube](https://youtu.be/edKdQcbFzHI)

## POO

Video en [youtube](https://youtu.be/uevW8V0-CB8)

#### Teoria

0. Instalación Java y Apache Netbeans (IDE)
1. Hola mundo
2. Variables
3. Tipos de variables
4. Constantes
5. Comentarios
6. Pedir datos por Scanner
7. Mostrar datos
8. Operadores aritmeticos
9. Operadores unarios
10. Operadores logicos
11. Operadores relaciones
12. Casting
13. Clase Math
14. Generar aleatorios con Random
15. if else
16. else if
17. switch
18. while
19. for
20. do while
21. Scopes
22. String
23. Funciones
24. Arrays
25. Clase Arrays
26. Matrices
27. Funciones y arrays
28. Excepciones
29. Enumerados
30. Introduccion POO
31. Atributos
32. Modificadores de acceso
33. Constructores
34. Getters y setters
35. Métodos
36. Sobrecarga de métodos y constructores
37. Método toString
38. Métodos equals y hashCode
39. Enumerados avanzados
40. Atributos estáticos
41. Métodos estáticos
42. Objetos como atributos
43. Record
44. Record métodos
45. Record constructores
46. Record atributos estáticos
47. Herencia
48. Polimorfismo
49. Abstracción
50. Interfaces
51. Arrays de objetos
52. Instanceof
53. CompareTo
54. Clases genericas
55. Javadoc

#### Ejercicios

1. Pide un nombre por teclado y haz que te salude. Por ejemplo, si introduces "Fernando", la respuesta debe ser ¡Hola Fernando!

2. Pide el precio de un producto sin IVA y calcula su precio con IVA. El IVA es del 21%. Formatea el resultado para que se muestre con dos decimales.

3. Pide dos números por teclado e indica si el segundo es divisible por el primero Por ejemplo, si numero1 = 10 y numero2 = 5 debería mostrar: "El numero 5 es divisible de 10"

4. Pide un año por teclado e indica si es bisiesto o no. Un año es bisiesto cuando es divisible entre 4 y no divisible por 100 o es divisible por 400.

5. Pide 3 números por teclado e indica cual es el mayor.

6. Pide 2 operandos, un operador (+ - * /) y realiza la operación correspondiente. Si el operador es invalido o el 2º operando es 0 en el caso de la división, debes indicar que no se puede realizar la operación.

7. Mostrar la suma de los números hasta que el usuario introduzca un -1.

8. Muestra los números del 1 al 100 que sean divisibles entre 2 y 3.

9. Pide un numero por teclado y muestra su tabla de multiplicar hasta 10.

10. Pide un numero por teclado y valida que sea positivo.

11. Pide una frase por teclado y cuenta cuentas vocales tiene.

12. Pide una frase por teclado y cuenta cuantas mayúsculas y minúsculas hay.

13. Pide una frase por teclado, elimina los espacios y guardarlos en otra variable.

14. Pide una frase e indica si es palíndromo. Un palíndromo es una palabra o frase que se lee igual al revés sin espacios. Por ejemplo, "Amad a la dama"

15. Dado un numero generado aleatorio entre 1 y 100 (incluidos) pide al usuario por teclado que lo adivine dándole pistas diciéndole si es mayor o menor. El usuario solo tiene 5 intentos. Si se acaban los intentos o se acierta el numero, el juego se acaba.

16. Pide un numero por teclado y saca su factorial. El factorial se obtiene de multiplicar los números de n a 1. Por ejemplo, 5*4*3*2*1 = 120

17. Crea una función que genere un numero aleatorio entre 2 números inclusive.

18. Crea una función que genere un password de una longitud con números, letras mayúsculas y letras minúsculas combinadas.

19. Crea una función dado un parámetro obtenga el numero de la serie fibonacci. La serie fibonacci, empieza en 1 1 y el siguiente se obtiene sumando los dos anteriores. Por ejemplo, 1 1 2 3 5 8 13 21 34 55 ... Valida que la posición es mayor o igual que 1.

20. Crea un array de números y obtén la suma y la media de sus elementos.

21. Crea un array de números y obtén el mayor y el menor del array.

22. Dado dos arrays, uno con nombres de personas y otro con sus edades, indique cual es la persona con mas edad.

23. Crea un array e indica si es capicúa. Es decir, que el array es igual tanto de izquierda a derecha como de derecha a izquierda.

24. Crea dos arrays y fusiónalos en uno.

25. Indicar si un elemento existe en un array usando una función.

26. Crea una función que guarde en un array números aleatorios entre un mínimo y un máximo.

27. Pide una fila por teclado y realiza la suma de los valores de esa fila.

28. Pide una columna por teclado y realiza la suma de los valores de esa columna.

29. Crea una matriz de caracteres, donde este todo vacío excepto una donde este el carácter X. El objetivo es mover ese X por el tablero sin que se salga del tablero. Las direcciones son arriba, abajo, izquierda y derecha.

30. Crea un enumerado con todos los meses del año. Dado un mes, indica el numero de días que tiene. En el caso de febrero, pediremos el año, ya que si el año es bisiesto tendrá 29 días sino tendrá 28 días. Debes validar si se inserta un mes valido o si se inserta los datos correctos. Los meses que tienen 31 días son: Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre. Los meses que tienen 30 días son: Abril, Junio, Septiembre y Noviembre.

31. Realiza una clase que represente a un libro. Un libro se define por:

    - ISBN

    - titulo

    - numero de paginas

    - autor

    - prestado

    Debe tener un constructor vacio y otro por defecto. Encapsula todos sus atributos. Un libro puede realizar lo siguiente:

    - prestar: comprueba si esta o no prestado y pone el atributo prestado a true.

    - devolver: comprueba si esta o no prestado y pone el atributo prestado a false.

    - imprimir: dado un coste, calcularemos el coste de imprimir todas las paginas del libro.

    Muestra la información de la siguiente manera:

    Cuando este prestado:

    El libro (<ISBN>) con titulo <titulo> y autor <autor> tiene <numero paginas> paginas y esta prestado

    Cuando no este prestado:

    El libro (<ISBN>) con titulo <titulo> y autor <autor> tiene <numero paginas> paginas y no esta prestado

    Un libro es igual a otro cuando sus ISBN son iguales

32. Crea una clase que represente a un ordenador. Un ordenador se define por:

    - Marca

    - Modelo

    - GB de RAM (Por defecto, 4GB)

    - Capacidad disco Duro en GB (Por defecto, 50GB)

    - Espacio utilizado en el disco duro

    - Estar o no encendido (por defecto esta apagado)

    La RAM debe ser potencia de 2, de lo contrario lanzaremos una excepcion. Encapsula todos los atributos. Tendra los siguientes constructores:

    - Vacio

    - Solo pidiendo la RAM

    - Solo pidiendo la RAM y la capacidad del disco duro

    - Pidiendo todos los atributos excepto el espacio utilizado y encendido

    Las operaciones que podra realizar son:

    - encender: Enciende el ordenador, haciendo que el atributo encendido este a true

    - apagar: Enciende el ordenador, haciendo que el atributo encendido este a false

    - transferir archivos: dado un numero de GB, se aumenta el espacio utilizado. Si no cabe, se debera indicar. Solo se podra hacer si el ordenador esta encendido.

    - eliminar archivos: dado un numero de GB, se elimina el espacio indicado, si supera al espacio utilizado se quedara en 0. Solo se podra hacer si el ordenador esta encendido.

    Un ordenador es igual a otro cuando tienen la misma marca y modelo.

    Muestra la informacion con toString

33. Crea una clase que represente a un empleado. Un empleado se define por:

    - DNI

    - Nombre

    - Edad

    - Departamento (Contabilidad, informatica y direccion)

    - Teletrabajo

    - Empresa

    - Salario base

    El DNI se debe validar que tenga el formato correcto (que sea correcto no hace falta) y la empresa es obligatoria. 
    
    Todos los empleados tienen un salario base que es el mismo para todos. El departamento debe ser un enumerado. 
    
    La empresa es un objeto que se define por CIF y nombre. El CIF no es necesario de validar. 
    
    Encapsula todos los atributos. Crea un constructor por defecto. Un empleado podrá realizar las siguientes acciones:

    - calcular sueldo: el sueldo de un empleado se define por los siguientes parámetros:

        - Si tiene mas de 30 años, se le incrementa el salario 200€

        - Si pertenece al departamento de contabilidad, se le incrementa el salario 50€

        - Si pertenece al departamento de informática, se le incrementa el salario 80€

        - Si pertenece al departamento de dirección, se le incrementa el salario 100€

        - Si tiene teletrabajo, se le incrementa el salario 30€

    Un empleado es igual a otro cuando tienen el mismo DNI.

    Muestra la información del empleado.

34. Realiza el ejercicio 31 usando Record

35. Crea una clase que represente un Producto. Un producto se define por:

    - Id

    - Nombre

    - Precio

    El id sera autoincrementado. El precio debe ser positivo. 
    
    Encapsula los atributos. Dos constructores: vacio y otro pidiendo el nombre y el precio

    Las operaciones que podrá realizar son:

    - comprar: dada una cantidad, indicar el precio total

    Crea una clase que represente un producto fresco.

    Tiene los mismos atributos que producto, ademas se define por tener días de caducidad.

    Encapsula los atributos. Dos constructores: vacio y por defecto.

    Las operaciones que podrá realizar son:

    - comprar: dada una cantidad, indicar el precio total. Según los dias de caducidad el precio que le queden, el precio se reducirá:

        - Si le quedan entre 3 y 5 dias, se reduce un 40%

        - Si le quedan menos de 3 dias, se reduce un 70%

    Crea una clase que represente un producto refrigerado.

    Tiene los mismos atributos que producto, ademas se define por tener el cajon donde se encuentra. Encapsula los atributos. Dos constructores: vacio y por defecto.

    Las operaciones que podrá realizar son:

    - comprar: dada una cantidad, indicar el precio total

36. Crea una clase que represente a un vehiculo Un vehiculo se define por:

    - Marca

    - Modelo

    Crea un constructor por defecto. Encapsula sus atributos. Crea un método toString para mostrar su informacion.

    Crea una clase que represente a un coche.

    Ademas de los atributos que tiene un vehiculo, se define por:

    - Numero de puertas

    Crea un método toString para mostrar su informacion.

    Crea una clase que represente a una moto.

    Ademas de los atributos que tiene un vehiculo, se define por:

    - Si tiene o no un sidecar

    Crea un método toString para mostrar su informacion.

    Crea una clase que represente a un coche deportivo

    Ademas de los atributos que tiene un coche, se define por:

    - Si es o no descapotable

    Crea un método toString para mostrar su informacion.

37. Crea una clase que represente un aeropuerto. Un aeropuerto se define por:

    - Id

    - Nombre

    - Anio inauguracion

    - Capacidad

    El id sera autoincrementado. Encapsula todos sus atributos Crea dos constructores, uno vacio y otro con todos los atributos excepto el id.

    No se pueden crear instancias de aeropuertos.

    Las operaciones que se deben implementar todas sus clases hijas son:

    - gananciasTotales: se le pasa una cantidad y no devuelve nada.

    Crea una clase que represente a un aeropuerto publico.

    Además de los atributos de un aeropuerto, se define por:

    - financiacion

    - numero de trabajadores discapacitados

    Encapsula todos sus atributos. Crea dos constructores, uno vacio y por defecto. Las operaciones que se deben implementar:

    - gananciasTotales: Dada una cantidad, se le sumara la financiacion y 1000€ por cada trabajador discapacitado

    Crea una clase que represente a un aeropuerto privado.

    Además de los atributos de un aeropuerto, se define por:

    - numero de socios

    Encapsula todos sus atributos. Crea dos constructores, uno vacio y otro por defecto. Las operaciones que se deben implementar:

    - gananciasTotales: dada una cantidad, se dividira entre el numero de socios.

38. Crea una interfaz que se llame Prestable:

    Tendrá los siguientes métodos:

    - prestar

    - devolver

    Crea la clase VideoJuego que implemente esta interfaz.

    Se define por:

    - nombre

    - precio

    - prestado

    - vecesPrestado

    Encapsula los atributos nombre y precio. Crea un constructor que pida nombre y precio. Las operaciones que debe realizar son:

    - prestar: pone prestado a true, solo se puede prestar si esta disponible. El atributo vecesPrestado aumentará en uno.

    - devolver: pone prestado a false, solo se puede devolver si esta prestado.

    Crea la clase Prestamo que implemente la interfaz Prestable.

    Se define por los siguientes atributos:

    - cantidad

    - adeudo

    - titular

    Encapsula los atributos cantidad y titular. Crea un constructor que pida la cantidad y el titular. Las operaciones que debe realizar son:

    - prestar: presta el valor del atributo cantidad al titular, mostrará un mensaje indicándolo. Incrementa el adeudo con un 5% de interés.

    - devolver: devuelve el valor del atributo cantidad al titular, mostrará un mensaje indicándolo. El adeudo se reducirá, el adeudo no puede ser negativo, por lo que se quedara en cero en ese caso.

39. Recuperamos la clase Producto y sus clases hijas. Crea un array de productos de diferentes tipos y muestralos ordenados por precio del mas barato al mas caro.

    Al final debes mostrar:

    - numero de cada producto

    - total de importe comprando 5 unidades de cada producto

    - el producto refrigerado tiene el cajon mas alejado

    - el producto fresco mas proximo a caducar

40. Crea una clase llamada Lista.

    Se define por los atributos:

    - elementos

    - numElementos

    El atributo elementos puede ser cualquier tipo que le indiquemos. Tendremos un constructor donde le pasaremos el tamaño que queremos del array, debe ser positivo.

    Crea una interfaz llamada Listable con las siguientes operaciones:

    - posicion: le pasamos un elemento T y devolvera un numero

    - aniadir: le pasamos un elemento T y devolvera un booleano

    - tamanio: sin parametros y devolvera un numero

    - eliminar: le pasamos un elemento T y devolvera un booleano

    - listar: sin parametros y no devuelve nada

    - vaciar: sin parametros y no devuelve nada

    Implementala en nuestra clase Lista

    Las operaciones de Lista son:

    - posicion: dado un elemento, indica en que indice esta, sino existe, devolvemos un -1

    - aniadir: añade un elemento al array, siempre y cuando haya espacio. No se admiten repetidos. True si lo añade y false sino lo hace

    - tamanio: devuelve el numero de elementos que hay

    - eliminar: elimina el elemento que le pasemos. True si lo elimina y false sino lo hace.

    - listar: muestra los elementos que tenemos

    - vaciar: reinicia el array al tamaño original