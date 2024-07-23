﻿# m06_act01_linkiafp
 
EJERCICIO 1: Manipulación de un archivo XML.
Se desea implementar una aplicación de gestión para un servicio de incidencias de una multinacional.

Para ello se dispone de un archivo de incidencias (incidencias.txt) con un formato como el siguiente:

% 2019-09-21 15:27:14 agonzalez jramirez
La impresora no tiene tóner.
Urgente
% 2019-09-22 10:28:37 jramirez afernandez
No se ha entregado la documentación del expediente EXP324.
Normal
% 2019-09-22 16:28:45 smartinez jramirez
No quedan folios.
Normal
% 2019-09-23 11:03:05 smartinez lsuarez
El ordenador de recepción no funciona.
Urgente
% 2019-09-28 13:11:29 jramirez lsuarez
Mi portátil no puede acceder a la wifi.
Normal
La primera línea (comenzada con un signo de “%”, será seguida de la fecha y hora de la creación de la incidencia, junto con el nombre de usuario del empleado que ha generado la incidencia y seguido del nombre de usuario del empleado que debe resolverla.

La segunda línea es el detalle de la incidencia. Se asume que el detalle de la incidencia ocupará una sola línea de texto.

La tercera línea es el tipo de prioridad de la incidencia. Una incidencia puede tener carácter Urgente o Normal.


Queremos traspasar la información contenida en el archivo anterior (incidencias.txt) a un único archivo XML. El formato que queremos tener para el nuevo archivo, tiene que ser como el que vemos a continuación:
<incidencias>
  <incidencia fechahora=”2019-09-21 15:27:14”>
    <origen>agonzalez</origen>
    <destino>jramirez</destino>
    <detalle>La impresora no tiene tóner.</detalle>
    <tipo>Urgente</tipo>
  </incidencia> 

  <incidencia fechahora=”2019-09-22 10:28:37”>
    <origen>jramirez</origen>
    <destino>afernandez</destino>
    <detalle>No se ha entregado la documentación del expediente EXP324.</detalle>
    <tipo>Normal</tipo>
  </incidencia> 

  …

</incidencias>


Con todo esto en mente, tenemos que realizar lo siguiente:
1.	Definir el esquema del XML asociado a la tarea mostrada para el formato indicado.
2.	Definir los atributos y construir los objetos básicos de Java (POJO) para guardar dicha información. A la correspondiente clase POJO, tenemos que llamarla ‘Incidencia’.
3.	Construir un programa llamado ‘Traspaso’ que sea capaz de leer los mensajes desde el archivo .txt a memoria mediante objetos de la clase ‘Incidencia’.
4.	Añadir el código correspondiente al programa ‘Traspaso’ para poder guardarlo en un archivo .xml llamado ‘incidencias.xml’, con el formato indicado por el esquema creado en el punto 1. Utilizar JAXB para esta tarea.
