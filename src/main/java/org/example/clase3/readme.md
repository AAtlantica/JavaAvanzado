# Errores y Excepciones
La filosofía básica de Java es que "EL CÓDIGO ERRÓNEO NO SERÁ EJECUTADO"

### Errores
Un error puede definirse como un suceso/evento anormal severo, y es el motivo por el cual una aplicación no puede recuperarse. Por ejemplo: un problema de memoria, el sistema operativo, una conexión de red se ha perdido en el proceso de comunicación, etc.
<br>Estos errores no son propiamente excepciones porque surgen fuera del control del usuario o el programador. Usualmente son ignorados en el código, ya que rara vez se puede hacer algo al respecto.

### Excepciones
Una excepción en cambio es un suceso/evento que ocurre durante la ejecución del programa. Cuando esto sucede provoca que el flujo normal de funcionamiento de nuestro programa se interrumpa y termine de forma anormal.<br>
Por tanto, cuando ocurren este tipo de excepciones deben ser tratadas o gestionadas. De estos existen dos tipos:<br>
- Las no chequeadas
- Las chequeadas

Antes de seguir avanzando veamos como se presentan estas situaciones en Java y como debemos tratarlas.

Todas las clases y objetos en Java extienden de la clase Object, en la API de Java existe una clase denominada Throwable.

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html
<br>
Esta clase es la encargada de gestionar todas las excepciones que nuestros programas pueda arrojar. De Throwable extiendes otras dos:
- La clase Error: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Error.html
- La clase Exception: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html
<br>

De esta última deriva una clase especial denominada RuntimeExceptión:
  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html

Volvamos ahora a los tipos de excepciones:
- Las no chequeadas: se producen en el momento de la ejecución, también denominadas excepciones en tiempo de ejecución, el compilador de java, no requiere que las controlemos. Todas la excepciones que extienden de RuntimeException, serán no chequeadas. Se suele decir que en este tipo de excepciones el problema radica en el desarrollador, ya que debe ser el mismo quien se encargue de gestionar todas las validaciones correspondientes para que el programa no se detenga por este tipo de eventos.
Algunos ejemplos: conversiones erróneas, acceso a índices de arrays fuera de límites, entre otras.

- Las chequeadas(checked): se producen en el momento de la compilación, son llamadas excepciones en tiempo de compilación, estas requieren la intervención del desarrollador y son advertidas por el compilador de Java. Se puede decir que es chequeada cuando no extiende de RuntimeExecption.

**_Importante!!!!
Todas las excepciones no comprobadas
(exception unchecked o exepciones en tiempo de ejecución)
son objetos instanciados de clases que heredan de 
Error o RuntimeException.
Todas las excepciones comprobadas(exception checked o excepciones en tiempo de compilación) son todas las que heredan de Exception, pero no de RuntimeException.
El compilador es el aliado del programador advirtiendo que deben ser tratadas y gestionadas._**

#GESTION DE EXCEPCIONES
Existen dos maneras de gestionar las excepciones:
-  Capturarla con el bloque try - catch
-  Lanzar la excepcion (Throws) para que la gestione el metodo o funcion que llamo a la función, donde se produjo la excepción. 

Ej de Captura:
```java
public class Main{
  public static void main(String[] args) {

      try {
        System.out.println(3 / 0);
      }catch (ArithmeticException e){
          /*Dentro de este bloque catch se debe informar cual fue el motivo por el cual el programa no funciona o
           * en su defecto tambien se puede otorgar una solución a la problematica*/
        System.out.println("No se puede dividir por cero");
      }
    System.out.println("El programa continua");
  }
}
```
Obervaciones: Si ejecutamos el código notaremos que el programa no se detiene por la excepcion y continua su proceso hasta imprimir el siguiente mensaje, sin embargo si quitasemos el bloque try-catch,
el programa se detendria de manera abrupta y no ejecutaria la siguiente instrucción con el mensaje "El programa continua"
<br>
Ej de lanzamiento:
```Java
public class Main{
  public static void main(String[] args) {

      try {
            divisionPorCero();
      }catch (ArithmeticException e){
          /*Dentro de este bloque catch se debe informar cual fue el motivo por el cual el programa no funciona o
           * en su defecto tambien se puede otorgar una solución a la problematica*/
        System.out.println("No se puede dividir por cero");
      }
    System.out.println("El programa continua");
  }
  
  //supongamos que ahora queremos creamos un metodo donde se llevaria a cabo la división por cero
  
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
Observaciones: En la firma del  metodo creado, declaramos la palabra reservada throws, esta palabra indica que la excepcion
generada en el metodo va a ser lanzada al lugar donde se lo este invocando al metodo para ser gestionada y tratada. Esta declaración no es necesaria por que la excepción lanzada es no chequeada,
sin embargo si la excepción lanzada fuera chequeada se debe declarar en la firma que dicha excepcion sera lanzada.


**_Importante!!_**

**Recuerden que las excepciones "No chequeadas", NO deben ser gestionadas como lo estamos haciendo en los ejemplos anteriores, esos ejemplos
son meramente ilustrativos.**
