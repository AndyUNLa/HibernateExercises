# Hibernate with Maven

## Para crear un proyecto Maven desde 0:
Al principio tendremos una carpeta con algunos archivos de texto
```bash
PROJECT-FOLDER/
├── .gitignore
├── .pom.xml.bak    # Archivo que contiene las dependencias restantes
└── README.md
```

### PASOS PARA CREAR UN PROYECTO MAVEN DESDE CERO
### Nos ubicamos dentro de la carpeta del proyecto y tipeamos lo siguiente:
```bash
declare NOMBRE_APP="nombre-app"
mvn archetype:generate -DgroupId=com.company -DartifactId=$NOMBRE_APP -DarchetypeArtifactId=maven-archetype-quickstart -Dversion=1.0-SNAPSHOT
cd $NOMBRE_APP && mvn install # Ingresamos a la carpeta de la nueva app creada y empezamos a instalar
```
### Agregamos las dependencias que se encuentran en el archivo pom.xml.bak(en el directorio raíz) al archivo pom.xml del actual directorio:
```bash
mvn package         # 1ro colocamos las dependencias que necesita nuestro proyecto y luego ejecutamos el comando.
mvn eclipse:eclipse # Para generar un archivo .classpath con el que nuestro editor de texto o IDE(Eclipse y VSCode) puede encontrar las dependencias descargadas
```

### ___Tras esto el árbol de directorios quedará de la sig. manera___
```bash
PROJECT-FOLDER/
├── .gitignore
├── .pom.xml.bak
├── README.md
└── $NOMBRE_APP
    ├── .classpath # Sirve para que nuestro editor encuentre las librerias y nuestro proyecto
    ├── .project
    ├── pom.xml
    ├── src
    │   ├── main
    │   │   └── java
    │   │       └── com
    │   │           └── company
    │   │               └── App.java
    │   └── test
    │       └── java
    │           └── com
    │               └── company
    │                   └── AppTest.java
    └── target
        ├── classes
        │   └── com
        │       └── company
        │           └── App.class
        ├── maven-archiver
        │   └── pom.properties
        ├── maven-status
        │   └── ...
        ├── surefire-reports
        │   ├── ...
        ├── test-classes
        │   └── com
        │       └── company
        │           └── AppTest.class
        └── $NOMBRE_APP-1.0-SNAPSHOT.jar
```