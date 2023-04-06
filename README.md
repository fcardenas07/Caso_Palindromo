# Actividad en clase: Caso Palíndromos - Pruebas Unitarias
## Caso: Palíndromos - somordnílaP :osaC

Paso 1: Leer y entender el contexto problema. (15 mins.)

1.1 Discutir y concluir:

¿Qué hace el método?

El método recibe un String, le quita los espacios y lo da vuelta. Posteriormente retorna true si el String en reversa es igual al String original, si no retorna false.}

¿Cómo lo hace?

Se realiza utilizando los metodos split(), reverse(), join(), además de una variable local resultado que va almacena el String en reversa.

¿Cómo lo uso?

El uso del método sólo requiere un String como parámetro, luego devuelve un booleano.

Paso 2: Entender el método JavaScript (15 mins.)

2.2 Construya en grupo ahora una versión Java que sea 100% equivalente en funcionalidad (lo bueno y lo malo) al anterior método.

Version 100% equivalente se encuentra en el repositorio, PalindromoOld.java

Paso 3: Ok! Si el método funciona ¿Qué puede malir sal? ;-) (15 mins.)

3.1 Discutir en grupo el diseño de un plan de pruebas para este caso.

El método puede fallar si el String recibido contiene mayúsculas y minúsculas, números, carácteres especiales, etc.

3.2 A partir de su plan de pruebas, diseñe los casos de pruebas unitarias a implementar (aún no codifique nada!!!), considere al menos 5.

Considerando que aún se mantiene el código original, 



==========================