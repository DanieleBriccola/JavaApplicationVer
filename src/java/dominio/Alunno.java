/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author DAN.BRICCOLA
 */
public class Alunno implements Serializable {
    private String nome;
    private String cognome; 
    private long ID;

    public Alunno() {
    }

    public String getNome() {
        return nome;
    }

    public long getID() {
        return ID;
    }

    public String getCognome() {
        return cognome;
    }

    public Alunno(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
}
