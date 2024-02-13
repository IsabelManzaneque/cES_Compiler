# cES_Compiler

## Tabla de contenidos
* [Información general](#información-general)
* [Aspectos léxicos](#aspectos-léxicos)
* [Aspectos sintácticos](#aspectos-sintácticos)
* [Aspectos semánticos](#aspectos-semánticos)
* [Tecnologías](#tecnologías)


## Información general

Analizador léxico, sintáctico y semántico de un compilador del lenguaje cES, basado en el lenguaje C. 
A continuación, se presenta una descripción del lenguaje y su características: la estructura general de los programas escritos 
en dicho lenguaje describiendo sus componentes léxicos y cómo éstos se organizan sintácticamente para formar construcciones
válidas del lenguaje.


## Aspectos léxicos

Es posible distinguir diferentes TOKENS: operadores aritméticos, relacionales y lógicos, los delimitadores como los paréntesis o los corchetes, los identificadores utilizados para nombrar variables, constantes o nombres de funciones, o las palabras reservadas del lenguaje son algunos ejemplos significativos. 

### Comentarios

secuencia de caracteres que se encuentra encerrada entre los delimitadores de principio de comentario y final de comentario: /* y */:

/* Este es un comentario correcto */

### Constantes literales

Se distinguen los siguientes tipos de constantes literales:

• Enteras: Las constantes enteras permiten representan valores enteros no negativos. Por ejemplo: 0, 32, 127, etc. En este sentido, no es posible escribir expresiones como -2, ya que el operador unario “–“, no existe en este lenguaje  

• Cadenas de caracteres: Secuencia ordenada de caracteres delimitadas por las comillas dobles, por ejemplo: “ejemplo de cadena”. 

En el lenguaje cES no existen constantes lógicas. Cualquier expresión numérica sirve como condición en un contexto lógico: si el resultado de la expresión es 0 ésta se interpretará como false, y si es distinto de cero, será true.

### Identificadores

Secuencia ordenada de caracteres y dígitos que comienzan obligatoriamente por una letra. Se usan para nombrar entidades del programa como las variables o las funciones. El lenguaje es case sensitive. La longitud de los identificadores no está restringida.

### Palabras reservadas

Tokens del lenguaje que, a nivel léxico, tienen un significado especial de manera que no pueden ser utilizadas para nombrar otras entidades como
variables, constantes, tipos definidos por el usuario o subprogramas.
<pre>
caso          Usado en sentencias "alternativas"
constante     Define una constante simbólica numérica
corte         Delimita un caso en sentencias "alternativas"
entero        Tipo entero
escribe       Muestra por pantalla un texto
escribeEnt    Muestra por pantalla un entero
alternativas  Cabecera de una sentencia condicional "alternativas"
mientras      Cabecera de una sentencia de flujo “mientras”
pordefecto    Caso por defecto en una sentencia “alternativas”
principal     Nombre de la función principal
devuelve      Instrucción de retorno en funciones
si            Cabecera de una sentencia condicional “si”
sino          Parte optativa de una sentencia condicional “si”
tipo          Marca la declaración de un tipo
vacio         Tipo vacio
</pre>

### Delimitadores
<pre>
“      Delimitador de constante literal de cadena
( )    Delimitadores de expresiones y de parámetros
[ ]    Delimitador de rango en una declaración de un vector
,      Delimitador en listas de identificadores
;      Delimitador en secuencias de sentencias
:      Delimitador en una sentencia “alternativas”
</pre>

### Operadores
Para construir expresiones por combinación de otras más sencillas:
<pre>
+      Suma 
*      Producto
<      Menor
==     Igual
&&     Conjunción lógica
!      Negación lógica
++     Autoincremento
=      Asignación
+=     Asignación con suma
[]     Acceso a elemento de un vector
</pre>

## Aspectos sintácticos

Especificaciones sintácticas que permiten escribir programas correctos

### Estructura de un programa y ámbitos de visibilidad

Un programa en cES comienza por una sección opcional donde se declaran constantes simbólicas, seguido de secciones para la declaración de variables y tipos globales y la declaración de funciones no anidadas entre las que se encuentra la función principal, sin parámetros, junto de arranque del programa.

Dentro de las funciones, en primer lugar hay una sección opcional para la declaración de variables locales y después comienzan las sentencias. Estas sentencias pueden organizarse en bloques mediante el uso de los delimitadores { y }. La estructura sintáctica de los bloques es anidante. La declaración de funciones también se realiza
acotando el código de la función entre los delimitadores { y }.

El uso de bloques en cES se utiliza para definir ámbitos de visibilidad. En cada ámbito sólo están accesibles un subconjunto de los identificadores definidos en el programa. Distinguimos 3 posibilidades:

• Referencias globales. Los identificadores globales son los que se declaran dentro del programa principal. Están accesibles desde cualquier otro ámbito

• Referencias locales. Los identificadores locales a un ámbito son solamente accesibles desde dentro de dicho ámbito. 

• Referencias no locales. Referencias a variables que no son globales ni locales, estando declaradas en algún punto dentro de la jerarquía de anidamiento de bloques.

En cuanto al uso de subprogramas, existen las siguientes restricciones:

• Todo subprograma que sea invocado por otro subprograma debe ser declarado previamente dentro del código fuente del programa. 

• Debe darse soporte a la ejecución de subprogramas recursivos. Sin embargo, no se da soporte a la recursividad indirecta.

### Declaraciones de constantes simbólicas 
Representación de datos constantes, cuyo valor permanecer inalterado a lo largo de la ejecución del programa. Han de declararse al inicio de un programa obligatoriamente y no es posible su declaración dentro de funciones. En cES todas las constantes simbólicas son de tipo entero. La sintaxis para su declaración es la siguiente:

**#constante nombre valor;**

Ejemplos de constantes:
<pre>
#constante UNO 1;
#constante DOS 2;
</pre>
### Declaración de tipos

#### Tipos primitivos

Se encuentran disponibles directamente para que el programador tipifique las variables de su programa

• Tipo entero: El tipo entero representa valores enteros positivos y negativos, aunque en cES solo vamos a tener positivos. Se representa con la palabra reservada
entero
<pre>
  entero a;
  tipo entero vector[10];
</pre>
• Tipo vacío: Cuando se desea que una función se comporte como un procedimiento (su invocación no produce ningún valor de retorno), tipificar su tipo de retorno en la cabecera de la función con la palabra reservada vacio
<pre>
  vacio main () { ... }
</pre>
#### Tipos compuestos
permiten al programador definir estructuras de datos complejas y establecerlas como un tipo del lenguaje

• Tipo vector:  almacenar una secuencia ordenada de datos del mismo tipo. La sintáxis es:

**tipo entero nombre[tam];**

Donde nombre será el identificador del vector y tam una constante literal numérica o simbólica que indica el número de elementos que contiene el vector.
<pre>
#constante MAX 7;
tipo entero vector1[MAX];
tipo entero vector2[3];
</pre>

### Declaraciones de variables

Es necesario declarar las variables antes de utilizarlas. Se utiliza la siguiente sintaxis, dentro de las áreas de declaración de variables:

**nombre-tipo var1 [ = val1], var2 [ = val2], ...;**
<pre>
entero a, b;
entero a = 1, b = 3;
vector miVector;
</pre>


### Declaraciones de subprogramas

Una función es una secuencia ordenada de instrucciones encapsuladas bajo un nombre y declarada con unos parámetros (puede no llevar ninguno). La sintaxis de la declaración de una función es

<pre>
tipo-retorno nombre (tipo1 param1, tipo2 param2,...){
    /* declaración de tipos y variables locales */
    /* sentencias */
    devuelve expresión;
}
</pre>

Ejemplos: 
<pre>
entero sumar (entero x, entero y) {
    devuelve x + y;
}

vacio escribeEntero (entero x) {
    escribeEnt (x);
    devuelve;
}
</pre>

### Paso de parámetros

Es posible llamar a las funciones pasando expresiones, variables, constantes simbólicas y elementos de vectores como parámetros a una función. El Analizador Semántico
comprobará que se pasa el número adecuado de parámetros y del tipo correcto.

<pre>
entero incrementa (entero x) {
    x++;
    devuelve x;
}
</pre>

### Sentencias y expresiones

#### Expresiones

Construcción del lenguaje que devuelve un valor de retorno. 

• Expresiones	aritméticas: Devuelve un valor de tipo entero al contexto de evaluación.

• Expresiones lógicas: Devuelve un valor de tipo lógico al contexto de evaluación.  En cES no existe tipo primitivo lógicos, cuando una expresión aritmética se evalúa en un contexto lógico y devuelve 0 este resultado se interpreta como falso, mientras que si el resultado es distinto de 0 será de verdadero

• Expresiones	de	acceso	a	campos	de	registros: El acceso a los datos de un vector se realiza de forma indexada. Para acceder a cada elemento, se utilizan los operadores de acceso a vector []

• Autoincrementos: incrementa una unidad la variable que acompaña al operador ++

• Invocación	de	funciones: Para llamar a un subprograma ha de escribirse su identificador indicando entre paréntesis los parámetros.

#### Precedencia	y	asociatividad	de	operadores
En la siguiente tabla la prioridad decrece por filas. Los operadores en la misma fila tienen igual precedencia:

<pre>
Precedencia    Asociatividad

( )            Izquierda
[ ]            Izquierda
++ , !         Izquierda
*              Izquierda
+              Izquierda
<              Izquierda
==             Izquierda
&&             Izquierda
</pre>

### Sentencias

cES dispone de una serie de sentencias que permiten realizar determinadas operaciones dentro del flujo de ejecución de un programa.

• Sentencias	de	asignación:

Las instrucciones de asignación en cES sirven para asignar un valor a una variable o un elemento de un vector. Para ello se escribe primero una referencia a alguno de estos
elementos seguido del operador de asignación (=) y a su derecha una expresión:
<pre>
ref = expresion;
</pre>

• Sentencias	de	asignación con suma:

<pre>
ref += expresion
ref = ref + expresion
</pre>

• Sentencia	de control si - sino:

Permite alterar el flujo normal de ejecución de un programa en según el resultado de una expresión lógica
<pre>
si (expresionLogica)
    /* sentencias1 */
si (expresionLogica)
    /* sentencias1 */
sino
    /* sentencias2 */
</pre>

• Sentencia	de control alternativas:

corresponde con la sentencia switch del lenguaje C:
<pre>
alternativas (expresion) {
    caso constante1: /* sentencias 1*/ corte;
    caso constante2: /* sentencias 2*/ corte;
    pordefecto: /* sentencias*/ corte;
}
</pre>

• Sentencias de control mientras:

Se utiliza para realizar iteraciones sobre una sentencia o un bloque de sentencias 
<pre>
mientras (expresionLogica)
 /* sentencias */
</pre>

• Sentencias de llamada a una función vacío:

En cES es posible declarar funciones que devuelvan el tipo vacío para que se comporten como procedimientos. Esto implica que su invocación no es una expresión sino una sentencia. Una función con tipo de retorno vacio no puede ubicarse donde se espera una expresión sino solamente donde se espera una sentencia. 

• Sentencias	de	salida:

cES dispone de funciones que muestran por la salida estándar resultados de diferentes tipos. Disponemos de 2 funciones: 

- escribe(). Toma una constante literal de tipo cadena de texto y la muestra por la salida estándar. 

- escribeEnt(). Recibe una expresión de tipo entero y muestra su resultado por la salida estándar. 

## Aspectos semánticos

El análisis semántico se encargará principalmente de:

• Comprobación de la unicidad de declaraciones y definiciones. No permitir que existan dos declaraciones con el mismo nombre en el mismo ámbito.

• Comprobación de tipos. Las variables y constantes simbólicas referenciadas en el contexto de una expresión han sido previamente declaradas y el tipo de cada construcción coincide con el previsto en su contexto.

• Comprobación de concordancia en las referencias. El tipo de las expresiones que sirven para referenciar el rango de un conjunto de tipo entero y el rango cae dentro del rango de valores esperado según su declaración. En los registros se comprueba que el acceso a un campo de un registro coincide con alguno de aquellos indicados en la declaración.

• Comprobación de paso de parámetros. El orden y tipo de los parámetros actuales pasados en una invocación a un subprograma coincide con el orden y tipo de los parámetros formales indicados en la declaración. En caso de funciones comprobar que el tipo de retorno coincide con el tipo esperado según la declaración.

• Comprobación de la existencia de la sentencia de retorno en las funciones. Asegurar que cada función contiene una sentencia de retorno.

## Gestión de errores

Se pueden dar errores léxicos, sintácticos y semánticos. En cada caso, el compilador mostrará información sobre la naturaleza del error

## Tecnologías

* IDE: Eclipse 2021 – 03
* Java version "18" 2022-03-22
* Java(TM) SE Runtime Environment (build 18+36-2087)
* Java HotSpot(TM) 64-Bit Server VM (build 18+36-2087, mixed mode, sharing)



