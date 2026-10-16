# GESTOR DE INCIDENCIAS

## Finalidad del proyecto

Proyecto para la gestión de incidencias en tiempo real.

## Descripción del proyecto

El proyecto proporciona una aplicación para la creación y gestión de incidencias. Facilita las tareas de búsqueda de incidencias a través de un menú interactivo y permite buscar, listar y comprobar el estado y los detalles de las incidencias existentes. 

## Versión de JAVA

Este proyecto utiliza **JAVA 17** para su correcto funcionamiento.

## Listado de funcionalidades

- Listar todas incidencias
- Buscar incidencias por título
- Buscar incidencias por identificador
- Listar incidencias abiertas
- Mostrar los detalles de una incidencia

## Compilación y ejecución

1) Con maven *en el PATH* del equipo:
```bash
mvn clean compile exec:java
```

2) Con el *wrapper* de maven:
```bash
.\mvnw.cmd clean compile exec:java
```

## Generación y consulta de Javadoc

1) Con maven *en el PATH* del equipo:
```bash
mvn javadoc:javadoc
```

2) Con el *wrapper* de maven:
```bash
.\mvnw.cmd javadoc:javadoc
```

## Tabla de clases principales y responsabilidad general

|Clase|Responsabilidad general|
|:----|:----------------------|
|App|Punto de acceso a la aplicación. Permite crera un nuevo Gestor de incidencias, mostrar el menú interactivo y la ayuda. Permite buscar y mostrar incidencias y sus detalles|
|GestorIncidencias|Permite listar, buscar y obtener incidencias, y listar las incidencias abiertas|
|Incidencia|Permite crear incidencias, obtener el id, título, nivel de prioridad o estado de la incidencia, consultar la existencia de una incidencia|
|IncidenciaNoEncontrada|Ecepción que se lanza cuando una incidencia no es encontrada|

## Estructura de archivos:
```
Pokemon-Battle-Web/
├─ mvnw: script de Maven Wrapper. Junto con mvn.cmd permite compilar y ejecutar proyectos Java con Apache Maven sin necesidad de tener Maven instalado previamente en el sistema.
├─ mvnw.cmd: script de Maven Wrapper. Junto con mvn permite compilar y ejecutar proyectos Java con Apache Maven sin necesidad de tener Maven instalado previamente en el sistema.
├─ pom.xml: controla los módulos y las versiones de dependencias necesarias para el funcionamiento de la aplicación.
├─ README: contiene toda la información del proyecto y su actualizaciones.
├─ .gitignore: contiene las reglas que determinan que tipo de archivos no son subidos al repositorio.
├─ docs/apidocs/: contiene los archivos de javadoc con la documentación de las clases del proyecto.
└─ src/main/java/es/centro/incidencias/ 
    ├─ App: aplicación para la gestión de incidencias.
    ├─ GestorIncidencias: gestiona las incidencias existentes.
    ├─ Incidencia: define la estructura de las incidencias gestionadas por el gestor.
    └─ IncidenciaNoEncontrada: clase lanzada para la excepción de no encontrar una incidencia.
```

## Enlace a la documentación Javadoc publicada mediante GitHub Pages
[Página de GitHub Pages del proyecto](https://dseoanem.github.io/documentacion-proyecto-ud1-david-seoanemiraz/)
