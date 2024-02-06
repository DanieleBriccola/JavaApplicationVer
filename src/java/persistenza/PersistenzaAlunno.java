/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenza;

import dominio.Alunno;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DAN.BRICCOLA
 */
public class PersistenzaAlunno extends Persistenza<Long, Alunno> {
    private static Map<Long,Alunno> listAlunni = new HashMap<>();
    
    protected Map<Long, Alunno> GetLista() {
        return listAlunni;
    }

    @Override
    protected Map<Long, Alunno> getLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Alunno read(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
