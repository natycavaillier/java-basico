package aula2;
import java.util.Random;

public class multiplos {
    public static void main(String[] args) {
        Random randomico = new Random();
        
        int c = 0;
        double i = 0;
        double t = 0;
        double p = 0;

        while(c < 1) {
            t++;
            i = randomico.nextInt(30);

            if(i % 7 == 0 && i != 0){
                c++;
                System.out.println("Sorteio: " + i + ", múltiplo de 7.");
            }else{
                System.out.println("Sorteio: " + i + ", não é múltiplo de 7");
            }
        }

        p = ((c / t) * 100);
        
        System.out.println("Percentual do sorteio: " + p + "%, quantos múltiplos de 7 encontrou: " + c + ", total de sorteios: " + t);

    }
}
