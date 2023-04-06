# Actividad en clase: Caso Palíndromos - Pruebas Unitarias
## Caso: Palíndromos - somordnílaP :osaC

#### Paso 1: Leer y entender el contexto problema. (15 mins.)

**1.1 Discutir y concluir:**
* Código Javascript:

![img.png](src/main/resources/codigoJS.png)

***¿Qué hace el método?***

El método recibe un **_String_**, le quita los espacios y lo da vuelta. Posteriormente retorna _**true**_ si el **_String_** en reversa es igual al **_String_** original, sino retorna **_false_**.

***¿Cómo lo hace?***

Se realiza utilizando los métodos **_split()_**, **_reverse()_** y **_join()_**, además de una variable local _resultado_ que almacena el **_String_** en reversa.

***¿Cómo lo uso?***

El uso del método sólo requiere un **_String_** como parámetro, luego devuelve un **_booleano_**.

Un ejemplo de uso es, pasarle el **_String_** _"palabra"_: 

1. Se crea la variable _resultado_ que almacena un **_String_** vacío _""_


2. **_split("")_** convierte el parámetro de entrada en un arreglo de la forma`["p", "a", "l", "a", "b", "r", "a"]`


3. **_reverse()_** invierte el arreglo,`["a", "r", "b", "a", "l", "a", "p"]`


4. **_join("")_** junta todos los elementos del arreglo en un **_String_** _"arbalap"_


5. Se guarda el **_String_** en la variable _resultado_


6. Finalmente, se devuelve **_true_** o **_false_**, si es que el parámetro ingresado es igual a la cadena invertida. En este caso **_false_**.

#### Paso 2: Entender el método JavaScript (15 mins.)

**2.2 Construya en grupo ahora una versión Java que sea 100% equivalente en funcionalidad (lo bueno y lo malo) al anterior método.**

Version 100% equivalente se encuentra en el repositorio, **_PalindromoOld.java_**

#### Paso 3: Ok! Si el método funciona ¿Qué puede malir sal? ;-) (15 mins.)

**3.1 Discutir en grupo el diseño de un plan de pruebas para este caso.**

El método puede fallar si el String recibido contiene mayúsculas y minúsculas, números, carácteres especiales, etc.

**3.2 A partir de su plan de pruebas, diseñe los casos de pruebas unitarias a implementar (aún no codifique nada!!!), considere al menos 5.**

Considerando que aún se mantiene el código original, 



==========================