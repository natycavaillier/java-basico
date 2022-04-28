package aula2;

public class para {
    public static void main(String[] args) {

        int limite = 10;
        int tabuadas = 10;

        for(int i = 1; i <= tabuadas; i++){
            System.out.println("Tabuada do " + i);
            for(int j = 1; j <= limite; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
