package aula5;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();

        p1.setNome("Almir Carrara");
        p1.setEndereco("Rua das Flores");
        p1.setTelefone("(045)988582767");
        p1.setCpf("225.751.85-54");
        p1.setNomeCurso("Java Spring");
        p1.setSalario(45.6);

        a1.setNome("Sergio BonaVentura");
        a1.setEndereco("Rua dos Alfeneiros");
        a1.setTelefone("(085)988582767");
        a1.setCpf("524.751.85-54");
        a1.setCurso("Java Spring");
        double[] notas = {7.5, 9.5, 7.5, 6.3};
        a1.setNotas(notas);

        System.out.println(a1.calculaMedia());

        //System.out.println(p1.montaHolerite());
        

    }
}
