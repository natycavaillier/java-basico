package aula3;
import java.util.Random;

public class vetores {
    public static void main(String[] args) {
        Random a = new Random();
        double[] valores = {a.nextInt(30), a.nextInt(70), a.nextInt(90)};

        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
    }
}
