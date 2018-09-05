/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buchhaltungsprogramm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lukas
 */
public class BuchungsProgramm {

    List<Benutzer> benutzerliste = new ArrayList<Benutzer>();

    public void addBuchung(Buchung buchung) {
        System.out.println("\n"+(char) 27 + "[31m" + "Buchung");
        Benutzer i = benutzerÜberprüfung(buchung.getBenutzername(), buchung.getPasswort());
        if (i != null) {
           

//           if(tryParseDouble(buchung.getBetrag)&&tryParseInt(buchung.getHabenKonto())&&tryParseInt(buchung.getSollKonto()))  
//       }
            i.buchen(buchung.getSollKonto(), buchung.getHabenKonto(), buchung.getBetrag());
            if (buchung.getOption() != null) {
                i.option(buchung.getOption());
            }
        }

    }

    private Benutzer benutzerÜberprüfung(String benutzername, int passwort) {

        boolean benutzerGibtEs = false;

        for (Benutzer i : benutzerliste) {
            if (benutzername.equals(i.getBenutzername())) {
                benutzerGibtEs = true;
                if (passwort == (i.getPassword())) {
                    System.out.println("Erfolgreich eingeloggt!");
                    return i;
                    //
                } else {
                    System.out.println("Passwort ist falsch!");
                    return null;
                }
            }
        }
        if (!benutzerGibtEs) {
            System.out.println("Wollen Sie mit diesen Login Daten ein Account erstellen? J/N ");
            if (getBenutzerErstellenJN().equals("J")) {
                System.out.println("Neuer Benutzer erstellt");
                Benutzer i = new Benutzer(benutzername, passwort);
                benutzerliste.add(i);
                return i;

            } else {
                System.out.println("Abgebrochen");
                return null;
            }
        }
        return null;
    }

    public void addBenutzer(Benutzer benutzer) {
        benutzerliste.add(benutzer);

    }

    private String getBenutzerErstellenJN() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String d = null;
        try {
            d = br.readLine();
            //System.out.println("StdIn: " + d);
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return d;
    }

}
