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
        if(this.calculaMedia() >= 7){
            return true;
        }else{
            return false;
        }
    }

    public String montaBoletim(){
        String boletim;
        double notaAtual = 0;
        boletim = "BOLETIM DO ALUNO: " + super.getNome();

        for(int i = 0; i < this.notas.length ; i++){
            //notaAtual = this.notas[i];

            boletim += ("\nA nota da Prova " + (i + 1)+ " foi: " + this.notas[i]);
        }

        //boletim += "\nMEDIA: " + this.calculaMedia();
        if(this.verificaAprovacao() == true){
            boletim += ("\nRESULTADO: Parabéns, você foi aprovado com média " + this.calculaMedia()); 
        }else{
            boletim += ("\nRESULTADO: Sinto muito, você foi reprovado com média " + this.calculaMedia()); 
        }
        
        return boletim;
    }
    //#endregions

}
