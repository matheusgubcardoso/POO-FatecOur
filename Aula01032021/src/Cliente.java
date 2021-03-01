public class Cliente {
private String nome, rg;
private double saldo;

public void setNome(String n){
nome = n;
}
public String getNome(){
return nome;
}

public void setRg(String r){
rg = r;
}

    /**
     *
     * @return
     */
    public String getRg(){
return rg;
}

    /**
     *
     * @param s
     */
    public void setSaldo(double s){
saldo = s;
}

    /**
     *
     * @return
     */
    public double getSaldo(){
return saldo;
}

    
}