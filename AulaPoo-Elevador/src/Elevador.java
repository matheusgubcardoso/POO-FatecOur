
import javax.swing.JOptionPane;

/*
1. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (excluindo o térreo), capacidade do elevador, e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
Sobe: para subir um andar (não deve subir se já estiver no último andar);
Desce: para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos setters e getters)
 */

public class Elevador {
    
    private int andar;
    private int totalAndares;
    private int capacidade;
    private int lotacao;
    
    public void inicializa(int ta, int c){
    andar = 0;
    totalAndares = ta;
    capacidade = c;
    lotacao = 0;
    JOptionPane.showMessageDialog(null, "Ok!");
    }
    
    public void entra (){
    if (lotacao<capacidade){
        lotacao++;
        JOptionPane.showMessageDialog(null, "Ok!");
        }else {JOptionPane.showMessageDialog(null, "Lotado");}
    }
    
    public void sai(){
    if (lotacao>0){
        lotacao--;
        JOptionPane.showMessageDialog(null, "Ok!");
        }else {JOptionPane.showMessageDialog(null, "Elevador está vazio!");}
    }
    
    public void sobe(){
    if (andar<totalAndares){
    andar++;
    JOptionPane.showMessageDialog(null, "Ok!");
    }else {JOptionPane.showMessageDialog(null, "Elevador está no último andar!");}
    }
    
    public void desce(){
    if (andar>0){
    andar++;
    JOptionPane.showMessageDialog(null, "Ok!");
    }else {JOptionPane.showMessageDialog(null, "Elevador está no térreo!");}
    }  
    
}
