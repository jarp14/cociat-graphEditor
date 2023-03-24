# CO-CIAT
The Co-CIAT graphical editor is the Eclipse platform technological support for collaborative modeling of CIAN diagrams.
Currently, CIAT includes the modeling of diagrams as follows: Sociograms, Process Diagrams, Domain diagrams and CTT diagrams.

To run it, make sure you have installed the Eclipse Epsilon Framework: https://www.eclipse.org/epsilon/download/


# SpacEclipse

Requirements:

1. Eclipse Communications Framework 3.13.2:

    - https://www.eclipse.org/ecf/downloads.php
    - [URI] https://download.eclipse.org/rt/ecf/3.13.2/site.p2/

2. DataBase & ECF Generic Server configuration:

    - MySQL Workbench 6.X
    - MySQL Server 5.7.X

The database script is located @ spaceclipse/resources/database.sql.
It is necessary to change the DBName, DBUser & DBPassword in the properties file, located @ package spaceclipse/sincronizacion/issc_en.properties.
To launch an ECF Generic Server you must launch the server.bat located @ spaceclipse/resources/server.bat or run a new Eclipse configuration launching it as parameters.
