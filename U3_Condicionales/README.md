# 📚Tarea U2: Clasificador de Becas (Lógica Condicional Avanzada)

## Tarea: Clasificador de Becas (Lógica Condicional Avanzada)

Enlace: [Ver Documentación y Código] https://github.com/Mariaromeroruiz/Ejercicios_Programacion_DAW/new/main/U3_Condicionales

Este proyecto simula un sistema de evaluación de solicitudes de beca demostrando el dominio de las estructuras condicionales en Java (if-else if-else) aplicadas a la toma de decisiones complejas.

# 🛠️Conceptos Clave Demostrados

El código (ClasificadorBecas.java) fue desarrollado para afianzar los siguientes conceptos:

Entrada Múltiple con Scanner: Lectura eficiente de dos valores numéricos (int para Nota Media y Renta Anual).

Validación de Entrada: Implementación de teclado.hasNextInt() para prevenir errores de tipo de dato y aumentar la robustez del programa.

# Operador Lógico AND (&&):

Demostración del uso de && para exigir que dos condiciones (Nota Mínima y Renta Máxima) sean verdaderas simultáneamente para la concesión de la beca.

Priorización de Reglas (if-else if-else): La estructura asegura que la regla más restrictiva (Beca Completa) se evalúe primero para garantizar la correcta jerarquía de la lógica de negocio.

# ⚙️Reglas de Clasificación Implementadas

El sistema clasifica las solicitudes según estas reglas:

Tipo de Beca

Condición Lógica Aplicada

Beca Completa

if (notaMedia >= 9 && rentaAnual < 15000)

Beca Parcial

else if (notaMedia >= 8 && rentaAnual < 25000)

Sin Beca

else (Cualquier otro caso)

# 🚀 Ejemplo de Ejecución

El programa solicita los dos criterios y ofrece un diagnóstico:

--- CLASIFICADOR DE BECAS ---
Introduce la Nota Media (entero): 9
Introduce la Renta Anual (entero, sin puntos ni comas): 14000

--- RESULTADO DE LA BECA ---
¡Felicidades! Beca Completa Otorgada.
