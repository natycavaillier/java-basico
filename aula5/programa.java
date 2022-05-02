package aula5;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();

        p1.setNome("Almir Carrasco");
        p1.setEndereco("Rua das Flores");
        p1.setTelefone("(045)988582767");
        p1.setCpf("225.751.85-54");
        p1.setNomeCurso("Java Spring");
        p1.setSalario(45.6);

        System.out.println("Nome do aluno:");
        a1.setNome(entrada.nextLine());
        System.out.println("Endereço do aluno:");
        a1.setEndereco(entrada.nextLine());
        System.out.println("Telefone do aluno:");
        a1.setTelefone(entrada.nextLine());
        System.out.println("CPF do aluno:");
        a1.setCpf(entrada.nextLine());
        System.out.println("Curso do aluno:");
        a1.setCurso(entrada.nextLine());

        System.out.println("Nome do professor: " + p1.getNome());
        System.out.println("Nome do aluno: " + a1.getNome());
        

    }
}
