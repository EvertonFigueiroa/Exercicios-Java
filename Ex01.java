
public class Ex01 {
        public static void main(String[] args) {

        int nota = 90;
        String graduacao;

        if (nota <= 60) {
            graduacao = "D";
        } else if (nota < 70) {
            graduacao = "C";
        } else if (nota < 80) {
            graduacao = "B";
        } else {
            graduacao = "A";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Reprovado!");
                break;
            default:
                System.out.println("Graduação invalida!");
        }

    }
}
