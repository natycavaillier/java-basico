package exercicio;

public class Xdois extends Equacao{
    private double x2;

    //#region Encapsulamento de atributos
    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    //#endregion

    public double calculaX2(double a, double b, double c, double d){
        super.setA(a);
        super.setB(b);
        super.setC(c);
        this.x2 = ((-super.getB() - Math.sqrt(d)) / (2 * super.getA()));
        return this.x2;
    }
}
