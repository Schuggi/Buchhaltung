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
public class AufwandKonto extends Konto{
        

    public AufwandKonto(int bezeichung, String name) {
        super(bezeichung, name);
    }

  

    @Override
    double getsaldo() {
        return getSollwert()-getHabenwert();
    }
    
}
