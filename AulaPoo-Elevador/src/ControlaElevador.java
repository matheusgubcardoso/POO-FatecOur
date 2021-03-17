import javax.swing.JOptionPane;


public class ControlaElevador {
    public static void main(String[] args) {
        int opcao;
        Elevador elevador = new Elevador();
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("0: sair"
                    + "\n1: Inicializar "
                    + "\n2: Entrar"
                    + "\n3: Sair"
                    + "\n4: Subir"
                    + "\n5: descer"));
            switch(opcao){
                case 1:
                    int capacidade,totalAndares;
                    capacidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a capacidade do elevador?"));
                    totalAndares = Integer.parseInt(JOptionPane.showInputDialog("Qual o total de andares?"));
                    elevador.inicializa(totalAndares, capacidade);
                    break;
                case 2:
                    elevador.entra();
                    break;
                case 3:
                    elevador.sai();
                    break;
                case 4:
                    elevador.sobe();
                    break;
                case 5:
                    elevador.desce();
                    break;
            }
        }while(opcao!=0);
    }
}
