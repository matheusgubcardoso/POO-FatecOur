
package Ex8;

import java.text.ParseException;
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String args[]) throws ParseException{

Dados d = new Dados();


d.setNome("");
d.setNasc();
d.setAlt();

		


        JOptionPane.showMessageDialog(null,"Nome: "+d.getNome()+"\n"+"Ano Nascimento: "+d.getNasc()+"\n"+"Altura: "+d.getAlt());  
        JOptionPane.showMessageDialog(null,"Idade: "+d.idade());  


    }
}



