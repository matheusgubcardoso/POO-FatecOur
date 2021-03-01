
package Ex9;

import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;


public class Jog {
private String nome, pos, nasc, nac;
private float alt, peso;

public void setNome(String n){
nome = JOptionPane.showInputDialog("Digite o nome: ");
}
public String getNome(){
return nome;
}

public void setPos(String p){
pos = JOptionPane.showInputDialog("Digite a posição: ");
}
public String getPos(){
return pos;
}

public void setNasc(String nasci){
nasc = JOptionPane.showInputDialog("Digite a data de nascimento: ");
}
public String getNasc(){
return nasc;
}

public void setNac(String nc){
nac = JOptionPane.showInputDialog("Digite a nacionalidade: ");
}
public String getNac(){
return nac;
}

public void setAlt(){
alt = parseFloat(JOptionPane.showInputDialog("Informe sua altura: "));  
}

public float getAlt(){
return alt;
}
   
public void setPeso(){
peso = parseFloat(JOptionPane.showInputDialog("Informe o peso: "));  
}

public float getPeso(){
return peso;
}
    
}
