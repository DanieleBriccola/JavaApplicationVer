/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DAN.BRICCOLA
 */
public abstract class Persistenza<Key, Value> {
    private Map<Key,Value> lista = new HashMap();
    
    protected abstract Map<Key,Value> getLista();
    
    //tutta la storia della sovraclasse
    public Persistenza(){
        lista = getLista();
    }
    public void create(Key chiave,Value valore){
        // Maniera Molto easy, non generiamo eccezioni
        lista.put(chiave, valore);
    }
    
    public Value read(Key chiave,Value valore){
        // Maniera Molto easy, non generiamo eccezioni
        return lista.get(chiave);
    }
    
    public void update(Key chiave,Value valore){
        // Maniera Molto easy, non generiamo eccezioni
        lista.replace(chiave,valore);
    }
    
    public void delete(Key chiave){
        // Maniera Molto easy, non generiamo eccezioni
        lista.remove(chiave);
    }
    
    public List<Value> listAll(){
        return new ArrayList(lista.values());
    }
}
