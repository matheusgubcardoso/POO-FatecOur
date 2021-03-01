import javax.swing.JOptionPane;

public class Principal {
public static void main(String args[]){
    
double v1, v2;

v1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: "));
v2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: "));

Calc res = new Calc();
res.som(v1,v2);
res.sub(v1,v2);
res.mul(v1,v2);
res.div(v1,v2);

    }

}