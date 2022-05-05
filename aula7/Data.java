package aula7;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private DiaSemana diaSemana;
    

    //Metodo construtor: para construir essa classe, é necessário que ela possua valores
    //#region Contrutores
    public Data(int dia, int mes, int ano, DiaSemana diaSemana) {
        super(); //Para poder trabalhar com enum
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }

    public Data() {
        super();
    }
    //#endregion

    

    //#region Encapsulamento
    public int getDia() {
        return dia;
    }


    public void setDia(int dia) {
        this.dia = dia;
    }


    public int getMes() {
        return mes;
    }


    public void setMes(int mes) {
        this.mes = mes;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public DiaSemana getDiaSemana() {
        return diaSemana;
    }


    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }
    //#endregion
    

    
    

}
