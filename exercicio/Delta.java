package exercicio;
import java.lang.Math;


public class Delta extends Equacao {

    private double delta;

    //#region Encapsulamento de atributos
    public double getDelta() {
        return delta;
    }
    public void setDelta(double delta) {
        this.delta = delta;
    }
    //#endregion


    public double calculaDelta(double a, double b, double c){
        super.setA(a);
        super.setB(b);
        super.setC(c);
        this.delta = (Math.pow(super.getB(), 2) - (4 * super.getA() * super.getC()));
        return this.delta;
    }
}