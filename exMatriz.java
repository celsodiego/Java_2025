import java.util.Scanner;

public class exMatriz {
    // criar método
    static void criarMatriz(){

        //Método com linhas e colunas pedidas ao utilizador
    
    }

    static void CriarMatriz (int linhas, int colunas){

        Scanner teclado = new Scanner (System.in);

           //criar matriz com dados do user
         int matriz[][] = new int[linhas][colunas];

         //pedir ao user para inserir os dados 
         for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j<matriz.length; i++){
                System.out.printf("Posição [%d][%d]: %n" ,i , j);
                matriz [i][j] = teclado.nextInt(); 
            }
            System.out.println();

            teclado.close();
        }

      }


    public static void main(String [] args){

        //criar objeto scanner
        Scanner teclado = new Scanner(System.in);

        //Pedir linhas ao user 
        System.out.println("Insira a quantidade de linhas: ");
        int linhas = teclado.nextInt();
        //Pedir colunas ao user 
        System.out.println("Insira a quantidade de colunas");
        int colunas = teclado.nextInt();

        CriarMatriz(linhas, colunas);

        teclado.close();
        
    }
}