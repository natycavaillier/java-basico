package aula5;
import java.lang.Math;

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
    private double calculaSalario(){
        return Math.round((this.salario * 44) * 4.5);
    }
    public String montaHolerite(){
        String holerite;
        holerite = ("Nome do Funcionario: " + super.getNome());
        holerite += (" | CPF: " + super.getCpf());
        holerite += (" | Valor Salario: " + this.calculaSalario());
        holerite += (" | Valor hora: " + this.salario);
        holerite += (" | Curso Referente: " + this.nomeCurso);
        return holerite;
    }
    //#endregion
}
