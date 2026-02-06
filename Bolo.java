package exerciciosPoo;

public class Bolo {
//Variáveis de Instancia
    public String sabor;
    public int tamanho;
    public boolean cobertura;


    //Metodos da Instancia

    //Metodo para apresentar os detalhes do bolo
    public static void exibirdetalhes(String sabor, int tamanho, boolean cobertura){
        System.out.println("sabor: " + sabor);
        System.out.println("tamanho: " + tamanho);
        System.out.println("cobertura: " + cobertura);
    }

    //Metodo para adicionar cobertura ao bolo
    public void adicionarCobertura(){
        this.cobertura = true;
  
    }

    //Metoso GET/SET
    public void setSabor(String novoSabor){
        this.sabor = novoSabor;
    }

    public String getSabor(){
        return this.sabor;
    }

    public void setTamanho(int novoTamanho){
        this.tamanho = novoTamanho;
    }

    public int getTamanho(){
        return this.tamanho;
    }

   
}