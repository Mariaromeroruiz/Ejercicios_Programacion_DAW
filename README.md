# 📚 Tarea 1: Expresiones Algorítmicas y Conversiones de Tipo (Java)

## 🎯 Objetivo de la Actividad
Crear un programa en Java que simule el cálculo de varias expresiones físicas y matemáticas, haciendo uso estricto de los **operadores aritméticos** y respetando las reglas de **precedencia**. El foco principal del ejercicio es la correcta aplicación de los **conversiones de tipo (casting)**.

---

## 📝 Conceptos de Programación Aplicados:

* **Lenguaje:** Java
* **Fundamentos:** Declaración de variables, estructura básica de la clase `main` y entrada/salida de datos (`Scanner`).
* **Operadores Aritméticos:** Dominio de `+`, `-`, `*`, `/`, y **precedencia** para minimizar el uso de paréntesis.
* **Estructuras:** Definición y uso de tipos enumerados (`enum`) para etiquetar resultados.
* **Matemáticas:** Implementación de constantes (Pi) mediante la **Serie de Leibniz** (usando los primeros 5 términos).

---

## ⚙️ Análisis de las Conversiones de Tipo (Casting)

El principal aprendizaje de esta tarea fue la gestión de tipos de datos en Java, crucial para la precisión de los resultados:

| Tipo de Conversión | Operación/Código | De Tipo | A Tipo | Justificación |
| :--- | :--- | :--- | :--- | :--- |
| **Casting Implícito** | `masa * 9.8` | `int` | `double` | La variable `masa` (`int`) es promocionada automáticamente a `double` porque `9.8` es `double`. |
| **Casting Implícito** | `x/4.0` | `int` | `double` | La variable `x` (`int`) es promocionada para que la división sea decimal, dado que `4.0` es `double`. |
| **Casting Implícito** | **No requerido:** Se priorizó el uso de literales `double` (ej: `4.0`, `6.0`) para forzar la precisión y evitar el casting explícito manual, demostrando conocimiento de la promoción automática. | N/A | N/A | Si la división fuera `x/4`, requeriría un *casting* explícito como `(double)x/4` para forzar el resultado decimal. |

---


## 💻 Código Fuente (`ExpresionesAlgoritmicas.java`)

import java.util.Scanner;

public class NombreProgramaJava {
	
	public enum TipoCalculo{OPERACION,FUERZA_PESO,NUMERO_VUELTAS,AREA_CIRCULO};
 
    public static void main(String[] args) {
    	
    	int x;
    	int masa;
    	int tiempo; 
    	double frecuencia; 
    	double radio; 
    	
        Scanner teclado= new Scanner (System.in);
   
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        
        System.out.println("Introduce el valor de x: ");
        x = teclado.nextInt();
        
        System.out.println("Introduce el valor de masa: ");
        masa = teclado.nextInt();
        
        System.out.println("Introduce el valor de tiempo: ");
        tiempo = teclado.nextInt();
        
        System.out.println("Introduce el valor de frecuencia: ");
        frecuencia = teclado.nextDouble();
        
        System.out.println("Introduce el valor de radio: ");
        radio = teclado.nextDouble();
        
        double operacion = (x + (x/4.0)) / (6.0 - (x / 2.0));
        double fuerzaPeso = masa * 9.8; 
        double numVueltasCompletas =  (double) frecuencia * tiempo;
        double pi = 4.0 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0);
        double areaCirculo = pi * radio * radio;
     
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println(TipoCalculo.OPERACION + ": " + operacion);
        System.out.println(TipoCalculo.FUERZA_PESO + ": " + fuerzaPeso);
        System.out.println(TipoCalculo.NUMERO_VUELTAS + ": " + numVueltasCompletas);
        System.out.println(TipoCalculo.AREA_CIRCULO + ": " + areaCirculo);
        
        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}
