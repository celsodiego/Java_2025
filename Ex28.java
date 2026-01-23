public class Ex28 {

    public static void main (String [] args){

        int idade = 30;

        double tempo = 30.5;

        float fahrenheit = 305.9f;
        
        String idadeString = Integer.toString(idade);

        String tempoString = Double.toString(tempo);

        String fahrenheitString = Float.toString(fahrenheit);

        System.out.println("valor int idade em string: " + idadeString);
        System.out.println("valor double tempo em String: " + tempoString);
         System.out.println("valor float fahrenheit em String: " + fahrenheitString);
    }
    
}
