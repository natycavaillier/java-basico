package aula9;

public class Aluno {
    private String nome;
    private String email;
    private double salario;
    private String cpf;

    //#region Encapsulamento
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //#endregion

    
    //#region Construtor
    public Aluno(String nome, String email, double salario, String cpf) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.cpf = cpf;
    }

    public Aluno(){
        super();
    }
    //#endregion

    
    //#region Regras de negocio
    public void guardaAluno(String valor){
        String[] valorSeparado = valor.split(";");
        this.setNome(valorSeparado[0]);
        this.setEmail(valorSeparado[1]);
        this.setSalario(Double.parseDouble(valorSeparado[2]));
        this.setCpf(valorSeparado[3]);
    }

    public void validaCpf(){
        String cpf = this.cpf.replace('.', ';');
        cpf = cpf.replace('-', ';');

        String[] valorSeparado = cpf.split(";");

        int c1 = Integer.parseInt(valorSeparado[0]);
        int c2 = Integer.parseInt(valorSeparado[1]);
        int c3 = Integer.parseInt(valorSeparado[2]);
        int d = Integer.parseInt(valorSeparado[3]);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(d);

    }
    //#endregion
    

    //#region toString
    @Override
    public String toString() {
        return "Aluno [cpf=" + cpf + ", email=" + email + ", nome=" + nome + ", salario=" + salario + "]";
    }
    //#endregion
}
