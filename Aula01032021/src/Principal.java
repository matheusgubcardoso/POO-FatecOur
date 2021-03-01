public class Principal {
public static void main(String args[]){

Cliente c = new Cliente();
c.setNome("Godofredo");
c.setRg("1234567890");
c.setSaldo(10.00);

System.out.println(c.getNome());
System.out.println(c.getRg());
System.out.println(c.getSaldo());
}
}