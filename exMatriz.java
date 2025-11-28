import java.util.Scanner;

public class exMatriz {
    // criar método
    static void criarMatriz(){

        //criar matriz
        int matriz[][] = new int[3][3];

        //preencher a matriz
        matriz[0][0] = 00; matriz[0][1] = 01; matriz[0][2] = 02;
        matriz[1][0] = 10 ;matriz[1][1] = 11; matriz[1][2] = 12;
        matriz[2][0]= 20;matriz[2][1] = 21; matriz[2][2] = 22;

        //chamar matriz
        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; i<matriz.length; i++){
                System.out.println(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        criarMatriz();
        
    }
}