package aula1;

public class ImprimeIdade {
    public static void main(String[] args) {
        // String nome = "Victor Icoma";
        // boolean acompanhado = false;
        int idade = 20;
        double peso = 75;
        double altura = 1.82;

        double imc = (peso) / (altura * altura);

        if (idade >= 40) {

            if (imc < 22) {
                System.out.print("IMC = " + imc + ", você está com subnutrição.");
            } else if (imc <= 30) {
                System.out.print("IMC = " + imc + ", parabéns! Você está mantendo o seu peso ideal.");
            } else if (imc <= 35) {
                System.out.print("IMC = " + imc + ", você está com sobrepeso.");
            } else {
                System.out.print("IMC = " + imc + ", você está com obesidade.");
            }
        } else {
            if (imc < 25) {
                System.out.print("IMC = " + imc + ", procure um nutricionista, você está subnutrido");
            } else if (imc < 35) {
                System.out.print("IMC = " + imc + ", você está com um pouco de sobrepeso, mas no controle.");
            } else {
                System.out.print("IMC = " + imc + ", você precisa fazer mais exercícios.");
            }
        }
    }
}