package exerc_ia;

public class ExercicioIA2 {
    public static void main(String[] args) {
        int andar = 1;

        switch(andar) {
            case 0:
                System.out.println("Você está no térreo!");
                break;
            case 1:
                System.out.println("Você está no primeiro andar!");
                break;
            case 2:
                System.out.println("Você está no segundo andar!");
            default:
                System.out.println("Você chegou ao último andar");
                break;
        }
    }
}
