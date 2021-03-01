package Ex7;

public class Principal {
public static void main(String args[]){

Cliente c = new Cliente();
c.setNome("Godofredo");
c.setCpf("1234567890");
c.setSaldo(10.00);
c.setConta("1234-0");

System.out.println("Nome: "+c.getNome());
System.out.println("Cpf: "+c.getCpf());
System.out.println("Conta: "+c.getConta());
System.out.println("Saldo: "+c.getSaldo());
    }
}