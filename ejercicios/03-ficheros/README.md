# Ejercicios

41. Crea un directorio llamado pruebas.

Crea 10 ficheros dentro del directorio pruebas con el siguiente formato:

file-<numero>.txt donde <numero> se sustituira por el numero del fichero

Lista los fichero dentro de la carpeta pruebas.

Si el directorio pruebas existe, lo borraremos antes de empezar a crear.

Puedes hacerlo con File o Path.

[Resolucion](https://youtu.be/ApD0XlxWSMc)

42. Pide un número positivo por teclado. 

Escribe en el fichero numeros.txt los numeros del 1 al número introducido.

Despues, lee el fichero y muestra su contenido.

[Resolucion](https://youtu.be/X84yjrd6NGk)

43. Genera un fichero index.html que contenga una etiqueta h1 con un hola mundo.

Debe estar tabulado como un html.

[Resolucion](https://youtu.be/ea8x-Io4QwE)

44. Escribe un fichero de 20 lineas donde cada linea sera un password aleatorio.

El password sera de 8 caracteres combinando letras mayusculas, minusculas y numeros.

Despues, obten una fila aleatoria y obten un password.

Si el fichero existe y es valido (tiene al menos 20 lineas) no lo generaremos de nuevo.

[Resolucion](https://youtu.be/hAKm0v_GcOo)

45. Usa un Scanner para pedir lineas de texto al usuario y guardalas con un PrintWriter.

Si ya tiene contenido, se lo añadiremos al final.

Lee el fichero resultante con otro Scanner.

[Resolucion](https://youtu.be/EWtC_1xqE4w)

46. Pide una ruta de origen de un fichero.

Debe cumplir los siguientes requisitos:

    - Debe existir
    - Debe ser un fichero
    - Debe tener alguna de las siguientes extensiones:
        - jpg
        - png
        - mp3
        - mp4

Tambien debes pedir la ruta donde almacenarlo.

Debe cumplir los siguientes requisitos:

    - Debe existir
    - Debe ser un directorio

Copia el fichero de origen al destino.

Muestra un porcentaje del progreso de la copia.

[Resolucion](https://youtu.be/DOmAGECJvxU)

47. Vamos a gestionar una serie de personas.
    
Cada registro tiene el siguiente formato:

    - Nombre: String de 10 caracteres 
    - Edad: int
    - Altura: float
    - Peso: float

Pide una persona al iniciar el programa y guardalo al final del fichero.

Antes de acabar debes mostrar:

    - El numero de personas que hay en el fichero
    - Media de edad
    - Nombre de la persona mas alta
    - Suma de todos los pesos

[Resolucion](https://youtu.be/mBmZRqspAUk)

48. Vamos a gestionar una serie de productos.
    
Cada registro tiene el siguiente formato:

    - ID: int, este sera autoincrementado
    - Nombre: String de 20 caracteres
    - Precio: float
    - Descuento: boolean

[Resolucion](https://youtu.be/pPN6O-OBJRc)

Crea un menu con las siguientes opciones:

    - Crear producto: Creamos un producto al final del fichero
    - Buscar producto: Pedimos un id y mostramos los datos de ese producto
    - Mostrar productos: Mostramos todos los productos
    - Salir: Salimos de la aplicación

[Resolucion](https://youtu.be/pPN6O-OBJRc)

49. Vamos a gestionar una serie de productos serializados.

Crea la clase Producto con los siguientes atributos:

    - id (int)
    - nombre (String)
    - precio (float)

Dentro del fichero, vamos a tener un array de productos de 10 elementos.

Crea un menu con las siguientes opciones:

    - Guardar producto: guarda un producto en el fichero si hay espacio en el array
    - Mostrar productos: muestra todos los prodcutos del fichero
    - Borrar fichero: borra el fichero de los productos
    - Salir: sale de la aplicación

[Resolucion](https://youtu.be/oy_tBRUqc2Q)

50. Vamos a gestionar una serie de productos serializados.

Crea la clase Producto con los siguientes atributos:

    - id (int)
    - nombre (String)
    - precio (float)

Puedes insertar tantos productos como quieras. Los productos debe ser independientes dentro del fichero (sin arrays)

Crea un menu con las siguientes opciones:

    - Guardar producto: guarda un producto en el fichero
    - Mostrar productos: muestra todos los prodcutos del fichero
    - Borrar fichero: borra el fichero de los productos
    - Salir: sale de la aplicación

[Resolucion](https://youtu.be/PFbPUyQBsCo)
