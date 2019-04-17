<h4>UTN Mar del Plata > Tecnicatura Superior en Sistemas Informáticos > Laboratorio V > TP Nº1 </h4>
<h1>Maven</h1>

<h3>Que es Maven?</h3>
Maven es una herramienta de software que sirve para la construcción, compilacion y gestion de dependencias en proyectos Java. Creada en el año 2002 es actualmente un standard en la creacion de proyectos.

<h3>POM, Que significa y para que sirve</h3>
POM (Project Object Model) es un archivo XML que representa el proyecto completo. En el se almacena informacion general sobre el proyecto, la compilacion del mismo,empaquetado , dependencias y otros modulos o componentes externos.

<h3>Archetype / ArtifacId</h3>
<b>Archetype</b> ->  Un arquetipo es un
patrón o modelo original sobre el que pueden desarrollar todas aquellas cosas que son de un mismo tipo. Puede decirse que son plantillas, parametrizadas o configuradas para utilizar determinadas tecnologías, que los programadores utilizan como base para escribir y organizar el código de la aplicación.
<b>ArtifacId</b> -> es parte del archivo POM y representa el nombre de un plugin o dependencia (el nombre del jar).

<h3>Maven Goals: Clean, Package, Install, Compile</h3>
Maven esta basado en el concepto central de "Build lifecyle" o ciclo de vida de construccion, que representa los pasos que sigue para la construccion de un proyecto. Dentro de las fases que componen este ciclo de vida se encuentran...
<b>Clean</b> -> es unop de los lifecycles por defecto, se encarga de la limpieza del proyecto eliminando todos los archivos generados en una construccion anterior.
<b>Package</b> -> Toma el codigo compilado y lo empaqueta en el formato de distribucion como JAR.
<b>Install</b> -> Instala el paquete en el repositorio local para ser usado como dependencia en otro proyectos locales.
<b>Compile</b> -> Compila el codigo fuente del proyecto.

<h3>Scopes > Compile, Provide, Runtime, Test, System</h3>
Scopes limitan el alcance que tienen las dependencias.
<b>Compile</b> -> Es el alcance por defecto, las dependencias estaran disponibles en todas las rutas de clase (classpath) del proyecto
<b>Provided</b> -> Es usado para marcar dependencias que deberian ser provistas durante ejecucion por un JDL o un contenedor.
<b>Runtime</b> -> La dependencia no es requerida para compilar, solo en tiempo de ejecución.
<b>Test</b> -> La dependencia no es requerida para el uso normal en la aplicacion solo para el testing.
<b>System</b> -> Similar a Provided excepto que hay que proveer el JAR que contiene la dependencia.
 
