/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buchhaltungsprogramm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lukas
 */
public class Benutzer {

    private String benutzername;
    private int password;
    private Kontenverwaltung kontenverwaltung;
    private List<Option> optionenListe = new ArrayList<Option>();

    public Benutzer(String benutzername, int password) {
        this.benutzername = benutzername;
        this.password = password;
        this.kontenverwaltung = new Kontenverwaltung();
        optionenListe.add(new BLOption());
        optionenListe.add(new EROption());
    }

    public void buchen(int sollKonto, int habenKonto, double betrag) {
        if (kontenverwaltung.addSollKontoBetrag(sollKonto, betrag) == false) {
            System.out.println("Das soll Konto wurde nicht gefunden");
        }
        if (kontenverwaltung.addHabenKontoBetrag(habenKonto, betrag) == false) {
            System.out.println("Das haben Konto wurde nicht gefunden");
        }
    }

    public void option(String option) {
        boolean gibtes = false;
        for (Option i : optionenListe) {
            if (i.getBezeichung().equals(option)) {
                i.ausgabe(kontenverwaltung);
                gibtes = true;
            }}
            if(!gibtes){
                System.out.println("Die Option wurde nicht gefunden");
            }
        

    }

    public String getBenutzername() {
        return benutzername;
    }

    public int getPassword() {
        return password;
    }
}
