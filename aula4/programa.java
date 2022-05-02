package aula4;
import java.util.Scanner;


public class programa {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Carro van = new Carro();
        van.marca = "Toyota";
        van.modelo = "Hiace";
        van.capCombustiveis = 76;
        van.numPassageiro = 10;
        van.consCombustiveis = 8.2;

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.capCombustiveis = 42;
        fusca.numPassageiro = 5;
        fusca.consCombustiveis = 7.4;

        System.out.println("Informe o indice do eco desempenho do seu estado:");
        double indice = Double.parseDouble(entrada.nextLine());
 
        //Modelo do carro | Autonomia do carro
        System.out.println("Modelo: " + van.modelo + " | Autonomia: " + van.calculaAutonomia());
        System.out.println("Eco Taxa: " + van.verificaEcoDesempenho());

        if(van.validaEcoDesempenho(indice) == true){
            System.out.println("É eco eficiente");
        }else{
            System.out.println("Não é eco eficiente");
        }
        System.out.println(van);

        //Modelo do carro | Autonomia do carro
        System.out.println("Modelo: " + fusca.modelo + " | Autonomia: " + fusca.calculaAutonomia());
        System.out.println("Eco Taxa: " + fusca.verificaEcoDesempenho());
        if(fusca.validaEcoDesempenho(indice) == true){
            System.out.println("É eco eficiente");
        }else{
            System.out.println("Não é eco eficiente");
        }
        System.out.println(fusca);

    }
}