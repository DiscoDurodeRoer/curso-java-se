# Ejercicios

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

[Resolucion](https://youtu.be/Ub-p5RUJ0ws)

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

[Resolucion](https://youtu.be/TdGcQiTMjsQ)

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

[Resolucion](https://youtu.be/ZboRq87cCSA)

34. Realiza el ejercicio 31 usando Record

[Resolucion](https://youtu.be/tvbuof7Y7hM)

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

[Resolucion](https://youtu.be/RVTOmpTGHfs)

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

[Resolucion](https://youtu.be/pQMsKMMNQt0)

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

[Resolucion](https://youtu.be/DPgBhsBpZEQ)

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

[Resolucion](https://youtu.be/zXp7jL6cX0c)

39. Recuperamos la clase Producto y sus clases hijas. Crea un array de productos de diferentes tipos y muestralos ordenados por precio del mas barato al mas caro.

    Al final debes mostrar:

    - numero de cada producto

    - total de importe comprando 5 unidades de cada producto

    - el producto refrigerado tiene el cajon mas alejado

    - el producto fresco mas proximo a caducar

[Resolucion](https://youtu.be/5aWLi14-ccw)

40. Crea una clase llamada Lista.

Se define por los atributos:

elementos

numElementos

El atributo elementos puede ser cualquier tipo que le indiquemos. Tendremos un constructor donde le pasaremos el tamaño que queremos del array, debe ser positivo.

Crea una interfaz llamada Listable con las siguientes operaciones:

posicion: le pasamos un elemento T y devolvera un numero

aniadir: le pasamos un elemento T y devolvera un booleano

tamanio: sin parametros y devolvera un numero

eliminar: le pasamos un elemento T y devolvera un booleano

listar: sin parametros y no devuelve nada

vaciar: sin parametros y no devuelve nada

Implementala en nuestra clase Lista

Las operaciones de Lista son:

posicion: dado un elemento, indica en que indice esta, sino existe, devolvemos un -1

aniadir: añade un elemento al array, siempre y cuando haya espacio. No se admiten repetidos. True si lo añade y false sino lo hace

tamanio: devuelve el numero de elementos que hay

eliminar: elimina el elemento que le pasemos. True si lo elimina y false sino lo hace.

listar: muestra los elementos que tenemos

vaciar: reinicia el array al tamaño original

[Resolucion](https://youtu.be/rtHOpAXF1Kc)
