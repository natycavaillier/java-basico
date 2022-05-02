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
        double somaDasNotas = 0;
        int qtdNotas = this.notas.length;
        
        for(int i = 0; i < qtdNotas; i++){
            somaDasNotas += this.notas[i];
        }

        double media = somaDasNotas / qtdNotas;
        return media;
    }

    public boolean verificaAprovacao(){
        return true;
    }
    //#endregions

}
