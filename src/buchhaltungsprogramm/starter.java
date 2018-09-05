/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buchhaltungsprogramm;
/**
 *
 * @author Joel
 */
public class starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Benutzer lukas = new Benutzer("LukasKa", 1234);
//        Benutzer Joel = new Benutzer("JoelEu", 444);
//
//        Buchung buchungfalsch = new Buchung(1234, "LukasKa", 10000000, 2000000, 100);
        Buchung buchungrichtig = new Buchung(1234, "LukasKa", 500, 340, 100);
        Buchung buchungMitOption = new Buchung(1234, "LukasKa", 150, 200, "ER", 3000);
        BuchungsProgramm buchungsProgramm = new BuchungsProgramm();
        buchungsProgramm.addBenutzer(lukas);
        //buchungsProgramm.addBenutzer(Joel);

        //buchungsProgramm.addBuchung(buchungfalsch);
        buchungsProgramm.addBuchung(buchungrichtig);
        buchungsProgramm.addBuchung(buchungMitOption);
    }

}
