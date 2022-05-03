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
    private double calculaMedia(){
        double somaDasNotas = 0;
        int qtdNotas = this.notas.length;
        
        for(int i = 0; i < qtdNotas; i++){
            somaDasNotas += this.notas[i];
        }

        double media = somaDasNotas / qtdNotas;
        return media;
    }

    private boolean verificaAprovacao(){
        double media = this.calculaMedia();
        if(media >= 7){
            return true;
        }else{
            return false;
        }
    }



    public String montaBoletim(){
        String boletim;

        boletim = "BOLETIM DO ALUNO: " + super.getNome();

        if(this.verificaAprovacao()){
            for(int i = 0; i < this.notas.length ; i++){
                boletim += (System.lineSeparator() + "A nota da Prova " + (i + 1) + " foi: " + this.notas[i]);
            }
            boletim += (System.lineSeparator() + "RESULTADO: Parabéns, você foi aprovado com média " + this.calculaMedia()); 
        }else{
            boletim += (System.lineSeparator() + "Devido a Políticas da Academia, o boletim está indisponível online."); 
            
        }
        return boletim;
    }
    //#endregions

}
