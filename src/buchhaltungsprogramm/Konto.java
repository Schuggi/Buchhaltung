/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buchhaltungsprogramm;

/**
 *
 * @author Lukas
 */
public abstract class Konto {

    private int bezeichung;
    private String name;
    private double sollwert;
    private double habenwert;

    public Konto(int bezeichung, String name) {
        this.bezeichung = bezeichung;
        this.name = name;
    }

    public void addsollwert(double sollwertneu) {
        sollwert = sollwert +sollwertneu;
    }

    public void addHabenwert(double habenwertneu) {

        habenwert =  habenwert+habenwertneu;
    }

    public double getSollwert() {
        return sollwert;
    }

    public double getHabenwert() {
        return habenwert;
    }

    abstract double getsaldo();

    public String getName() {
        return this.name;
    }

    public int getBezeichung() {
        return bezeichung;
    }
}
