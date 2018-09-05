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
public abstract class Option{
    private final String bezeichung;

    public Option(String bezeichung) {
        this.bezeichung = bezeichung;
    }

    public String getBezeichung() {
        return bezeichung;
    }
    abstract void ausgabe(Kontenverwaltung kontenverwaltung);
}
