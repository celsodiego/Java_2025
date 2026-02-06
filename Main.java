package exercicio32;

public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco();

        System.out.println("Saldo inicial: " + banco1.obterSaldo());
        
        banco1.definirSaldo(1000.0);
        System.out.println("Saldo inicial: " + banco1.obterSaldo());

        banco1.depositar(100.0);
        System.out.println("Saldo inicial: " + banco1.obterSaldo());

        banco1.levantar(900);
        System.out.println("Saldo inicial: " + banco1.obterSaldo());



    }
    
}
