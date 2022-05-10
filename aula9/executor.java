package aula9;

import java.util.Scanner;

public class executor {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Scanner entrada = new Scanner(System.in);

        //ts -> tipo segmentado
        Wrapper ts = new Wrapper();

        // System.out.println(ts.num8);
        // System.out.println(ts.num9);
        // System.out.println(ts.num10);
        // System.out.println(ts.flag2);
        // System.out.println(ts.b);
        // System.out.println(ts.num11);

        System.out.println("Digite nome, email, salario e cpf separados por ';': ");
        String valor = entrada.nextLine();

        //String valor = "Mariano;mariano.pereira@gmail.com;1500;261.161.460-15";

        a1.guardaAluno(valor);
        System.out.println(a1);
        a1.validaCpf();
    }
}
