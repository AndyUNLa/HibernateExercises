# Hibernate with Maven

## Para crear un proyecto Maven desde 0:
Al principio tendremos una carpeta con algunos archivos de texto o ninguno
```bash
PROJECT-FOLDER/
├── .gitignore
└── README.md
```

### Nos ubicamos dentro de la carpeta del proyecto y tipeamos lo siguiente:
```bash
mvn archetype:generate -DgroupId=com.company -DartifactId=testHibernateMvn -DarchetypeArtifactId=maven-archetype-quickstart -Dversion=1.0-SNAPSHOT
cd testHibernateMvn && mvn install
mvn package # To install dependencies suited in pom.xml file
mvn eclipse:eclipse # Para generar un archivo .classpath con el que nuestro editor de texto o IDE(Eclipse y VSCode) puede encontrar las dependencias descargadas
```

### ___Tras esto el árbol de directorios quedará de la sig. manera___
```bash
PROJECT-FOLDER/
├── .gitignore
├── README.md
└── testHibernateMvn
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
        └── testHibernateMvn-1.0-SNAPSHOT.jar
```