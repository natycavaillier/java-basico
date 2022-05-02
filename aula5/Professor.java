package aula5;

public class Professor extends Pessoa{
    private double salario;
    private String nomeCurso;

    //#region Encapsulamento [Getters e Setters]
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    //#endregion

    //#region Regras de Negócios
    public double calculaSalario(){
        super.getCpf();
        return 0;
    }
    //#endregion
}
