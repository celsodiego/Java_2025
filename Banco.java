package exercicio32;

public class Banco {
    public double saldo = 0.0;

    public void definirSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }

    public double obterSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0 ){
            saldo += valor;
        }else {
            System.out.println("Valor inválido");
        }

    }
    public void levantar(double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
        } else{
            System.out.println("Valor inválido");
        }
        
    }

}
