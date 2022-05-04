package exercicio;

public class Xum extends Equacao{
    private double x1;

    //#region Encapsulamento de atributos
    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    //#endregion

    public double calculaX1(double a, double b, double c, double d){
        super.setA(a);
        super.setB(b);
        super.setC(c);
        this.x1 = ((-super.getB() + Math.sqrt(d)) / (2 * super.getA()));
        return this.x1;
    }
}
