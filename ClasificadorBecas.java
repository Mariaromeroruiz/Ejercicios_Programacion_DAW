
	import java.util.Scanner;

	public class ClasificadorBecas {

	    public static void main(String[] args) {
	        
	        Scanner teclado = new Scanner(System.in);
	        int notaMedia;
	        int rentaAnual;
	        String resultado;

	        System.out.println("--- CLASIFICADOR DE BECAS ---");
	        
	        // 1. ENTRADA DE DATOS (Nota)
	        System.out.print("Introduce la Nota Media (entero): ");
	        if (teclado.hasNextInt()) {
	            notaMedia = teclado.nextInt();
	        } else {
	            System.out.println("Nota no válida. Asumiendo 5.");
	            notaMedia = 5;
	            teclado.next(); 
	        }

	        // 2. ENTRADA DE DATOS (Renta)
	        System.out.print("Introduce la Renta Anual (entero, sin puntos ni comas): ");
	        if (teclado.hasNextInt()) {
	            rentaAnual = teclado.nextInt();
	        } else {
	            System.out.println("Renta no válida. Asumiendo 30000.");
	            rentaAnual = 30000;
	            teclado.next(); 
	        }

	        // --- 3. LÓGICA DE CLASIFICACIÓN (Usando &&) ---
	        
	        // 1. BECA COMPLETA: Nota >= 9 AND Renta < 15000
	        if (notaMedia >= 9 && rentaAnual < 15000) {
	            resultado = "¡Felicidades! Beca Completa Otorgada.";
	        } 
	        // 2. BECA PARCIAL: Nota >= 8 AND Renta < 25000 (Si no calificó para la completa)
	        else if (notaMedia >= 8 && rentaAnual < 25000) {
	            resultado = "Beca Parcial Otorgada.";
	        }
	        // 3. SIN BECA: Cualquier otro caso
	        else {
	            resultado = "No cumple los requisitos para beca.";
	        }
	        
	        // ------------------------------------------------

	        System.out.println("\n--- RESULTADO DE LA BECA ---");
	        System.out.println(resultado); 
	        
	        teclado.close();
	    }
	}
