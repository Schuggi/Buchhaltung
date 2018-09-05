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
public class EROption extends Option {

    public EROption() {
        super("ER");
    }
    
    @Override
    public void ausgabe(Kontenverwaltung kontenverwaltung) {
        kontenverwaltung.ausgabeKonten("ER");
    }
    
}
