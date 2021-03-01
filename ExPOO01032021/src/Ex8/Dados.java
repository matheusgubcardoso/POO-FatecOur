
package Ex8;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


public class Dados {
    private String nome;
private float alt;
private int nasc, idade;

public void setNome(String n){
nome = JOptionPane.showInputDialog("Digite o nome: ");
}
public String getNome(){
return nome;
}

        public void setNasc(){
        nasc = parseInt(JOptionPane.showInputDialog("Informe ano nascimento: "));  

}

    public int getNasc(){
return nasc;
}

        public void setAlt(){
        alt = parseFloat(JOptionPane.showInputDialog("Informe sua altura: "));  

}

    public float getAlt(){
return alt;
}
    
    public int idade(){
    return 2021-nasc;
    }

   
    
}
