import java.util.Scanner;

public class Cadenas {
 
    public static void main(String[] args) {
    	
        Scanner teclado= new Scanner (System.in);
        
        
        System.out.println("USO DE CADENAS DE CARACTERES");
        System.out.println("----------------------");
        System.out.println("Introduzca la letra del grupo al que perteneces: ");
      
        
        char letraGrupo = teclado.next().charAt(0);
        final String cadenaOriginal = "   Don Quijote de la Mancha  ";
        String texto = cadenaOriginal;

        texto = texto.trim();
        texto = texto.replace("Don Quijote", "");
        texto = texto.replace('M', 'L');
        texto = texto + "-" + letraGrupo;
        
        System.out.println("Cadena original: " + cadenaOriginal);
        
        int longitudFinal = texto.length();
        int posicionCentral = longitudFinal / 2; 
        char caracterCentral = texto.charAt(posicionCentral);
        
        String resultadoM = texto.contains("M")
        ? "Sí, contiene el carácter 'M'"
        : "No, NO contiene el carácter 'M'";
        
        char ultimoCaracter = Character.toLowerCase(texto.charAt(longitudFinal - 1));
        boolean esConsonante = (ultimoCaracter != 'a' && 
                ultimoCaracter != 'e' && 
                ultimoCaracter != 'i' && 
                ultimoCaracter != 'o' && 
                ultimoCaracter != 'u');
        
        String resultadoConsonante = esConsonante 
                ? "Sí, termina en consonante" 
                : "No, termina en vocal o símbolo";
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("La cadena final es: " + texto);
        System.out.println("La cadena final contiene: " + longitudFinal + "" + "" + " caracteres");
        System.out.println("La cadena final tiene el caracter: " + caracterCentral + "" + "" + " en su posicion central");
        System.out.println("La cadena final contiene el caracter 'M': " + resultadoM);
        System.out.println("La cadena final termina en consonante: " + resultadoConsonante);
        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}
