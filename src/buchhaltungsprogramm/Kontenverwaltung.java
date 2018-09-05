/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buchhaltungsprogramm;

import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class Kontenverwaltung {

    private ArrayList<Konto> konten = new ArrayList<Konto>();

    public Kontenverwaltung() {
        kontenplanerstellen();
    }

    public void kontenplanerstellen() {
        konten.add(new AktivKonto(100, "Flüssige Mittel"));
        konten.add(new AktivKonto(110, "FLL"));
        konten.add(new AktivKonto(120, "Vorräte"));
        konten.add(new AktivKonto(150, "Mobilien"));
        konten.add(new AktivKonto(160, "Immobilien"));
        konten.add(new PassivKonto(200, "VLL"));
        konten.add(new PassivKonto(240, "Langfristige VLL"));
        konten.add(new PassivKonto(290, "Reserven"));
        konten.add(new ErfolgsKonto(300, "Produktionserlös"));
        konten.add(new ErfolgsKonto(320, "Handelserlös"));
        konten.add(new ErfolgsKonto(340, "DLErlös"));
        konten.add(new AufwandKonto(400, "Matrialaufwand"));
        konten.add(new AufwandKonto(500, "Personalaufwand"));
        konten.add(new AufwandKonto(610, "Unterhalt, Reparatur, Eratz"));
        konten.add(new AufwandKonto(620, "Fahrzeugaufwand"));
        konten.add(new AufwandKonto(650, "Verwaltungsaufwand"));
        konten.add(new AufwandKonto(690, "Finanzaufwand"));
    }

    public void ausgabeKonten(String option) {
        if (option == "ER") {
            System.out.println("Erfolgsrechnung: ");
            for (Konto i : konten) {
                if (i instanceof ErfolgsKonto || i instanceof AufwandKonto) {
                    System.out.println("   "+i.getName() + " " + i.getsaldo());
                }
            }

        }
        if (option == "BL") {
            System.out.println("Bilanz: ");
            for (Konto i : konten) {
                if (i instanceof AktivKonto || i instanceof PassivKonto) {
                    System.out.println("  "+i.getName() + " " + i.getsaldo());
                }
            }
        }
    }

    public boolean addSollKontoBetrag(int sollKonto, double betrag) {
        boolean gefunden = false;
        for (Konto i : konten) {

            if (sollKonto == i.getBezeichung()) {
                i.addsollwert(betrag);
                System.out.println(betrag + " im Konto: " + i.getName() + " hinzugefügt!");
                gefunden = true;
            }
        }
        return gefunden;

    }

    public boolean addHabenKontoBetrag(int habenKonto, double betrag) {
        boolean gefunden = false;
        for (Konto i : konten) {
            if (i.getBezeichung() == habenKonto) {
                i.addsollwert(betrag);
                System.out.println(betrag + " im Konto: " + i.getName() + " hinzugefügt!");
                gefunden = true;
            }
        }
        return gefunden;
    }

}
