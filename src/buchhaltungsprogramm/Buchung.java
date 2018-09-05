/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buchhaltungsprogramm;

import javax.swing.JOptionPane;

/**
 *
 * @author Lukas
 */
public class Buchung {

    private int passwort;
    private String benutzerName;
    private int sollKonto;
    private int habenKonto;
    private String option;
    private double betrag;

   
    public Buchung(int passwort, String benutzerName, int sollKonto, int habenKonto,  double betrag) {
        this.passwort = passwort;
        this.benutzerName = benutzerName;
        this.sollKonto = sollKonto;
        this.habenKonto = habenKonto;
        this.betrag = betrag;
        this.option = null;
    }

    public double getBetrag() {
        return betrag;
    }

    public Buchung(int passwort, String benutzerName, int sollKonto, int habenKonto, String option, double betrag) {
       this.passwort = passwort;
        this.benutzerName = benutzerName;
        this.sollKonto = sollKonto;
        this.habenKonto = habenKonto;
        this.betrag = betrag;
        this.option = option;
    }

    public String getBenutzername() {
        return benutzerName;
    }

    public int getPasswort() {
        return passwort;
    }

    public int getSollKonto() {
        return sollKonto;
    }

    public int getHabenKonto() {
        return habenKonto;
    }

    public String getOption() {
        return option;
    }
}
