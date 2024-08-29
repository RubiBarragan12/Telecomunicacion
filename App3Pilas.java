package pilas;
import java.util.Stack;

import javax.swing.JOptionPane;
import pilas.PilaEnlazada;
/**
 * Se lee cadena de caracteres , luego se inserta cada caracter
 * de la cadena en una pila y luego se extraen los caracteres de la pila y
 * se muestran en la salida.
 * 
 * NOTA:La cadena leida en la entrada, se mostrara en la salida
 *de manera invertiva, por ejemplo:
 *Hola ---> aloH
 *Osito--> otisO
 *oso----> oso     //Es un palindromo
 */
public class App3Pilas {
	
	public static void main (String [] args) {
		String cadenaEntrada = JOptionPane.showInputDialog("Inserta una cadena");
		PilaEnlazada<Character> pila = new PilaEnlazada();
		for (char c: cadenaEntrada.toCharArray()) {
			pila.push(c);
		}
		String salida = cadenaEntrada + "    ---->    ";
		while(!pila.isEmpty()) {
			salida += pila.pop();
		}
		JOptionPane.showMessageDialog(null, salida);
		
		System.out.println("Esta la pila vacia? " + (pila.isEmpty()? "Si": "No"));
	}
//mayra azenet
//perla rubi
//karla janeth
}
