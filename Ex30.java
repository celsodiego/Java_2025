public class Ex30 {
     public static void main(String[] args) {
  
        double[] notas = {16.0, 16.0, 16.0, 16.0, 16.0};

        int totalAlunos = notas.length;
       
        double soma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / totalAlunos;

        int mediaConvertida = (int) media;

        System.out.println("Número total de alunos: " + totalAlunos);
        System.out.printf("Média das notas(original): %.1f\n", + media);
        System.out.println("Média das notas (convertida para int): " + mediaConvertida);
    }
    
}
