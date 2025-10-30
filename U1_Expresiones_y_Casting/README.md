# 📚 Tarea 1: Expresiones Algorítmicas y Conversiones de Tipo (Java)

## 🎯 Objetivo de la Actividad
Crear un programa en Java que simule el cálculo de varias expresiones físicas y matemáticas, haciendo uso estricto de los **operadores aritméticos** y respetando las reglas de **precedencia**. El foco principal del ejercicio es la correcta aplicación de los **conversiones de tipo (casting)**, indicando los casos implícitos y explícitos.

---

## 📝 Conceptos de Programación Aplicados:

* **Lenguaje:** Java
* **Fundamentos:** Estructura básica de la clase `main`, declaración de variables y entrada/salida de datos (`Scanner`).
* **Operadores Aritméticos:** Dominio de `+`, `-`, `*`, `/`, y **precedencia** para minimizar el uso de paréntesis.
* **Estructuras:** Definición y uso de tipos enumerados (`enum`) para etiquetar los resultados de las operaciones.
* **Matemáticas:** Implementación de la constante PI mediante la **Serie de Leibniz** (usando los primeros 5 términos), sin recurrir a librerías externas.

---

## ⚙️ Análisis de las Conversiones de Tipo (Casting)

El principal aprendizaje de esta tarea fue la gestión de tipos de datos (`int` vs `double`) en Java, crucial para la precisión de los resultados en divisiones.

| Tipo de Conversión | Operación/Código Clave | De Tipo | A Tipo | Justificación |
| :--- | :--- | :--- | :--- | :--- |
| **Casting Implícito** | `masa * 9.8` | `int` | `double` | La variable `masa` (`int`) es ascendida (promocionada) automáticamente a `double` porque `9.8` es un literal `double`. |
| **Casting Implícito** | `x/4.0` | `int` | `double` | La variable `x` (`int`) es promocionada para que la división sea decimal, dado que `4.0` es `double`. |
| **Casting Explícito** | N/A | N/A | N/A | Se priorizó el uso de literales `double` (ej: `4.0`, `6.0`) para forzar la precisión y evitar el casting explícito manual (`(double)`) en las divisiones, demostrando conocimiento de la promoción automática de tipos. |

---

## 💻 Extracto de Código Clave (Serie de Leibniz)

```java
// Cálculo de PI por la Serie de Leibniz (usando los 5 primeros términos)
double pi = 4.0 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0);

// Operación con casting implícito (la masa es int, pero se multiplica por double)
double fuerzaPeso = masa * 9.8;
