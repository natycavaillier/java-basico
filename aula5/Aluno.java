package aula5;

public class Aluno extends Pessoa{
    private String curso;
    private double[] notas;

    //#region Encapsulamento [Getters e Setters]
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double[] getNotas() {
        return notas;
    }
    //#endregion

    //#region Regras de negócios
    public double calculaMedia(){
        return 0;
    }

    public boolean verificaAprovacao(){
        return true;
    }
    //#endregions

}
