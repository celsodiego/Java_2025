package exerciciosPoo;

public class Main {
    public static void main(String[] args) {
        //Cria um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa();

        //Dar sentido aos metodos da instancia para pessoa 1 
        pessoa1.setIdade(22);
        System.out.println("Obtém a idade da pessoa 1: " + pessoa1.getIdade());


        Pessoa pessoa2 = new Pessoa();
        //Dar sentido aos metodos para pessoa 2
        pessoa2.setNome("Diego Lima");
        System.out.println("Nome da pessoa 2: " + pessoa2.getNome());


        
    }
    
}
