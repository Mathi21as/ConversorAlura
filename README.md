# ConversorAlura

## Descripción

  Este es un challenge del programa Oracle Next Education (ONE) y Alura LATAM.
  El challenge en si se trataba de hacer un conversor de divisas y de 
  temperatura con la libertad de agregar otras conversiones a elección del 
  desarrollador, por lo cual, agregue las conversiones de longitud, peso, 
  volumen y bytes.

## Funcionalidades

  El programa tiene las siguientes opciones en cada tipo de conversion, de
  las cuales se puede convertir una a cualquier otra de la lista del mismo tipo:
  
  + Divisa:
      Las divisas entre las cuales se puede convertir son: dolar, euro, 
      peso argentino, libra esterlina, won coreano y yen japones.

  + Temperatura:
      Se puede convertir entre las tres unidades de temperatura: celsius,
      farenheit y kelvin.

  + Longitud:
      Se puede convertir entre las unidades metro, pulgada, pie, yarda y milla.

  + Peso (en el programa figura como Masa):
      Se puede convertir entre las unidades kilogramo, libra, onza y tonelada.

  + Volumen:
      Se puede convertir entre las unidades litro, galon, pie cubico y cuarto.

  + Bytes:
      Se puede convertir entre las unidades byte, kilobyte, megabyte, gigabyte 
      y terabyte.

## Sobre el uso

  En cuanto al uso, es sencillo.<br> 
  1. Debe asegurarse de tener instalado java en su equipo, puede hacerlo de la
  siguiente manera:<br>
   + Desde 'Inicio > Ejecutar'

   + Escriba 'cmd'. Una vez en la ventana de MS-DOS que se abre, escriba 'java -versión' (deje un espacio en blanco entre la           palabra java y el guión).<br>

   + Luego de esto en la consola debe aparecer la version de java instalada, algo como esto:

   ![version java](https://sede.mitma.gob.es/NR/rdonlyres/D1A6FF50-7E0B-4E15-8F4A-50291AF861BB/74930/comprobar_java_09.gif)

   + En caso de que en consola diga "java no se reconoce como un comando interno o externo, programa o archivo por lotes ejecutable", debe instalar java. Aqui dejo un link sobre como instalarlo:

   https://www.java.com/es/download/help/windows_manual_download.html

  2. Descargar este repositorio haciendo click en el boton verde "<> Code" y luego en "Download ZIP"<br>
  
   ![Como descargar el repo](https://ax-blog.axarnet.dev/blog/images/blog/2022/github/github-descargar-zip.jpg)
  
  3. Descomprimir el archivo ZIP, entrar a la carpeta que se descomprimio y entrar a la carpeta compilado.

  4. Luego ejecutar el archivo ConversorAlura.jar
  
  5. Al abrirse el programa aparecera una pantalla de bienvenida, sobre la misma se 
   encuentran los tipos de conversion que se pueden hacer.

  6. Al seleccionar uno se abrira la pantalla correspondiente en la que apareceran
   Dos listas de unidades, la primera es la unidad actual del valor que se ingresara
   y la segunda es la unidad a la cual se quiere convertir. Debajo de la primera lista
   de unidades se ingresa el valor y, luego de seleccionar en las listas las unidades
   correspondientes a su conversion, se oprime el boton "Convertir". Luego, debajo de
   la segunda lista de unidades aparecera el valor de la conversion.


## Posible problema con Java
Si al ejecutar el archivo ConversorAlura.jar y tiene instalado y configurado java pero 
aun asi el programa no se ejecuta, como en mi caso, esto se soluciona de la siguiente manera:

  1.  Cree un acceso directo del archivo ConversorAlura.jar
  
  2.  Haga click derecho en el acceso directo creado y en "Destino" al comienzo del contenido
      del cuadro, fuera de las comillas, va a agregar el comando "javaw -jar " (sin las comillas)
      como se muestra debajo:

      

  4.  Luego ejecute el acceso directo y vera que el programa se ejecuta correctamente

## Autor

Este challenge/proyecto fue desarrollado por Mathias Ledesma. Cualquier problema que se 
tenga con la ejecucion del programa o sugerencias sobre le mismo pueden contactarse por el
correo romanmathias21@gmail.com
