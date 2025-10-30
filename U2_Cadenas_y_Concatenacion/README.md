# 📚 Tarea 2: Manejo de Cadenas, Concatenación y Operador Ternario (Java)

## 🎯 Objetivo de la Actividad
Crear un programa en Java que manipule y analice la cadena inicial `"  Don Quijote de la Mancha  "`. El foco principal es la aplicación secuencial de métodos de la clase `String` y la toma de decisiones básica mediante el **operador condicional ternario (`? :`)** para evitar el uso de estructuras `if/else`.

---

## 📝 Conceptos de Programación Aplicados:

* **Lenguaje:** Java (`String`, `char`, `Scanner`).
* **Manipulación de Cadenas:** Uso secuencial de métodos clave (`.trim()`, `.replace()`, `.length()`, `.charAt()`, concatenación `+`).
* **Lógica Condicional:** Aplicación del **operador ternario** (`condición ? valor_si_true : valor_si_false`) para sustituir las estructuras de control condicionales.
* **Indexación y Tipos:** Manejo de índices (`.charAt(longitud - 1)`) y conversión de tipos (uso de `Character.toLowerCase()`) para asegurar la consistencia en las comprobaciones.

---

## ⚙️ Operaciones Implementadas

El programa realiza las siguientes manipulaciones y análisis sobre la cadena, almacenando el resultado en la variable de trabajo:

1.  **Limpieza:** Eliminación de espacios en blanco al inicio y al final (`.trim()`).
2.  **Sustracción:** Eliminación de la subcadena `"Don Quijote"`.
3.  **Reemplazo:** Sustitución del carácter `'M'` por `'L'`.
4.  **Concatenación:** Adición de un guion seguido del carácter del grupo leído por teclado.
5.  **Cálculos:** Obtención de la longitud final y del carácter que se encuentra en la posición central.
6.  **Comprobaciones:** Uso del operador ternario para verificar si la cadena final contiene el carácter `'M'` o si termina en consonante.

---

## 💻 Extracto de Código Clave (Operador Ternario)

El desafío principal se resolvió implementando la lógica condicional en una sola expresión:

```java
// Comprobación si contiene 'M': Utiliza el método .contains()
String resultadoM = cadenaTrabajo.contains("M") 
                    ? "Sí, contiene el carácter 'M'" 
                    : "No, NO contiene el carácter 'M'";

// Comprobación si termina en consonante: Se verifica que el último carácter (convertido a minúscula)
// NO sea ninguna de las vocales mediante una única expresión booleana combinada (&&).
char ultimoCaracter = Character.toLowerCase(cadenaTrabajo.charAt(longitudFinal - 1));

boolean esConsonante = (ultimoCaracter != 'a' && 
                        ultimoCaracter != 'e' && 
                        ultimoCaracter != 'i' && 
                        ultimoCaracter != 'o' && 
                        ultimoCaracter != 'u');

String resultadoConsonante = esConsonante 
                             ? "Sí, termina en consonante" 
                             : "No, termina en vocal o símbolo";
