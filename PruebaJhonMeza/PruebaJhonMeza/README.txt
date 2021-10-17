
\** ENTERPRISE' WARP-DRIVE MANAGEMENT SOFTWARE **\
Este proyecto fue desarrollado como un proyecto maven para la instalación de dependencias,
el entorno de eclipse y Junit para realizar pruebas(test) del sistema.

\** Recursos Utilizados **\
	- JAVA 1.8
	- Eclipse 2021-03
	- Junit 4.11
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
			<scope>test</scope>
		</dependency>

\** Instalación **\
	- Importar el proyecto "startrek" desde su entorno de desarrolo
	- Construir(Build) el proyecto importado
	- Ejecutar la instalación de dependecias declaradas en el archivo POM 
		utilizando Maven Install
	- Dentro de la carpeta test se encuentra la clase main "ControlWarp"
		si ejecutamos esta clase se obtendran los primeros datos.
		> A manera de ejemplo los datos necesarios para la ejecución son cargados aleatoriamente.
		> Seguido del primer ejemplo, se pueden establecer datos específicos para casos específicos.

\** Ejecución de pruebas **\
	- Las pruebas se encuentran en la sección de test destro del proyecto
	- Existen tres archivos de pruebas:
		> CalcularFlujoInjectoresTest
		> CalcularFlujoMaximaTest
		> CalcularVelocidadMaximaTest
	- Las pruebas contienen los valores de cada caso expuesto en el problema planteado y son 
		validados utilizando las respuesta de la solución presentada.

