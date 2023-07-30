public class Main {
    public static void main(String[] args) {

        Conta c1 = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c1.depositar(100.00);
        System.out.println(c1);

        c1.transferir(cp, 20.0);
        System.out.println(cp);
        System.out.println(c1);
    }
}