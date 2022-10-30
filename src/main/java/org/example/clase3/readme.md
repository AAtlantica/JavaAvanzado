# Errores y Excepciones
La filosofía básica de Java es que "EL CÓDIGO ERRÓNEO NO SERÁ EJECUTADO"

### Errores
Un error puede definirse como un suceso/evento anormal severo, y es el motivo por el cual una aplicación no puede recuperarse. Por ejemplo: un problema de memoria, el sistema operativo, una conexión de red se ha perdido en el proceso de comunicación, etc.
<br>Estos errores no son propiamente excepciones porque surgen fuera del control del usuario o el programador. Usualmente, son ignorados en el código, ya que rara vez se puede hacer algo al respecto.

### Excepciones 
Una excepción, en cambio, es un suceso/evento que ocurre durante la ejecución del programa. Cuando esto sucede provoca que el flujo normal de funcionamiento de nuestro programa se interrumpa y termine de forma anormal.<br>
Por tanto, cuando ocurren este tipo de excepciones deben ser tratadas o gestionadas. De estos existen dos tipos:<br>
- Las no chequeadas
- Las chequeadas

Antes de seguir avanzando veamos como se presentan estas situaciones en Java y como debemos tratarlas.

Todas las clases y objetos en Java extienden de la clase Object, no es la excepción a la regla la clase denominada Throwable...

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html
<br>
Esta clase es la encargada de gestionar todas las excepciones que nuestros programas puedan arrojar. De Throwable extienden otras dos:
- La clase Error(mencionada en los primeros párrafos): https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Error.html
- La clase Exception: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html
<br>

De esta última deriva una clase especial denominada RuntimeException:
  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html

Volvamos ahora a los tipos de excepciones:
- Las no chequeadas: se producen en el momento de la ejecución, también denominadas excepciones en tiempo de ejecución, el compilador de java, no requiere que las controlemos. Todas la excepciones que extienden de RuntimeException, serán no chequeadas. Se suele decir que en este tipo de excepciones el problema radica en el desarrollador, ya que debe ser el mismo quien se encargue de gestionar todas las validaciones correspondientes para que el programa no se detenga por este tipo de eventos.
Algunos ejemplos: conversiones erróneas, acceso a índices de arrays fuera de límites, entre otras.

- Las chequeadas(checked): se producen en el momento de la compilación, son llamadas excepciones en tiempo de compilación, estas requieren la intervención del desarrollador y son advertidas por el compilador de Java. Se puede decir que es chequeada cuando no extiende de RuntimeExecption.

**_Importante!!!!
Todas las excepciones no comprobadas
(exception unchecked o excepciones en tiempo de ejecución)
son objetos instanciados de clases que heredan de 
Error o RuntimeException.
Todas las excepciones comprobadas (exception checked o excepciones en tiempo de compilación) son todas las que heredan de Exception, pero no de RuntimeException.
El compilador es el aliado del programador advirtiendo que deben ser tratadas y gestionadas._**

# GESTIÓN DE EXCEPCIONES
Existen dos maneras de gestionar las excepciones:
-  Capturarla con el bloque try - catch
-  Lanzar la excepción (Throws) para que la gestione el método o función que llamo a la función, donde se produjo la excepción. 

Ej de Captura:
```java
public class Main{
  public static void main(String[] args) {

      try {
        System.out.println(3 / 0);
      }catch (ArithmeticException e){
          /*Dentro de este bloque catch se debe informar cuál fue el motivo por el cual el programa no funciona o
           * en su defecto también se puede otorgar una solución a la problemática*/
        System.out.println("No se puede dividir por cero");
      }finally {
        System.out.println("Siempre me imprimo");
      }
    System.out.println("El programa continua");
  }
}
```
Observaciones: Si ejecutamos el código notaremos que el programa no se detiene por la excepción y continua su proceso hasta imprimir el siguiente mensaje; sin embargo, si quitásemos el bloque try-catch, el programa se detendría de manera abrupta y no ejecutaría la siguiente instrucción con el mensaje "El programa continúa".<br>
En el caso de que la/las sentencias ubicadas dentro del bloque try{ ..sentencias..} arrojes mas de una excepción, dicho bloque puede contener más de un catch para capturar la excepción.
El bloque finally es opcional, siempre debe aparece luego del o los bloques catch, suele utilizarse para cerrar la conexión con los ficheros, entre otras. 
<br>
Ej de lanzamiento:
```Java
public class Main{
  public static void main(String[] args) {

      try {
            divisionPorCero();
      }catch (ArithmeticException e){
          /*Dentro de este bloque catch se debe informar cuál fue el motivo por el cual el programa no funciona o
           * en su defecto también se puede otorgar una solución a la problemática*/
        System.out.println("No se puede dividir por cero");
      }
    System.out.println("El programa continua");
  }
  
  //supongamos que ahora creamos un método donde se llevaria a cabo la división por cero
  
  public static void divisionPorCero() throws ArithmeticException{

    int valor1 = 2;
    int valor2 = 0;
    if(valor2 == 0){
      throw new ArithmeticException();
    }
    System.out.println(3/0);
  }
}
```
Observaciones: En la firma del método creado, declaramos la palabra reservada throws, esta palabra indica que la exception generada en el método va a ser lanzada al lugar donde se lo esté invocando al método para ser gestionada y tratada. Esta declaración no es necesaria porque la excepción lanzada es no chequeada, sin embargo si la excepción lanzada fuera chequeada se debe declarar en la firma que dicha excepción será lanzada.

**_¡Importante!!_**
**Recuerden que las excepciones "No chequeadas", NO deben ser gestionadas como lo estamos haciendo en los ejemplos anteriores, esos ejemplos son meramente ilustrativos.**
<br>
# Excepciones personalizadas
En Java también podemos crear nuestras propias excepciones, las cuales consideramos que son más acorde al mensaje o solución que deseamos mostrar.
Para ello debemos crear una clase y que dicha clase herede de la clase Exception, y a continuación en el constructor de la excepción personalizada llamamos al método súper de la clase padre.
<br>Ej excepción personalizada
```java
public class ExcepcionPersonalizada extends Exception{
    public ExcepcionPersonalizada(String mensaje){
        super(mensaje);
    }
}
```

```java
import org.example.clase3.ExcepcionesPersonalizadas.ExceptionPersonalizada;

public class Main {
  public static void main(String[] args) {
    try {
      System.out.println(3 / 0);
    } catch (ExceptionPersonalizada e) {
      /*Dentro de este bloque catch se debe informar cuál fue el motivo por el cual el programa no funciona o
       * en su defecto también se puede otorgar una solución a la problemática*/
      System.out.println("No se puede dividir por cero" + e);
    }
    System.out.println("El programa continua");
  }
}
```
