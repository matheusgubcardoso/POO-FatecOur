
package Ex9;

import java.text.ParseException;
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String args[]) throws ParseException{

Jog d = new Jog();


d.setNome("");
d.setPos("");
d.setNasc("");
d.setNac("");
d.setAlt();
d.setPeso();
		


        JOptionPane.showMessageDialog(null,
                "Nome: "+d.getNome() + ("\n") +
                "Posição: "+d.getPos() + ("\n") +
                "Data de nascimento: "+d.getNasc() + ("\n") +
                "Nacionalidade: "+d.getNac() + ("\n") +
                "Altura: "+d.getAlt() + ("\n") +
                "Peso: "+d.getPeso() + ("\n"));  

    }
}



