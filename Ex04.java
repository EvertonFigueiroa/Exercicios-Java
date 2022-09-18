import java.util.Arrays;

public class Ex04 {

    public static void main(String[] args) {
        
        String [] letras = {"A", "B", "C", "D"};
        System.out.println(letras);

        for (int i=0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        System.out.println(Arrays.toString(letras));

        float [] numeros = {9, 10, 12, 25, 2};
        float maior = numeros[0];
        float menor = numeros[0];
        float media = 0;

        for (int i=0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);
        System.out.println("media " + media/numeros.length);

    }
}
