package org.edu.epo.metier;

import java.io.Serializable;

public class Livreur implements Serializable {
    private int numLivreur;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private String tel;

    public Livreur() {
    }

    public Livreur(int numLivreur, String nom, String prenom, Adresse adresse, String tel) {
        this.numLivreur = numLivreur;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
    }

    public Livreur(int numLivreur, String nom, String prenom, String tel) {
        this.numLivreur = numLivreur;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
    }

    public int getNumLivreur() {
        return numLivreur;
    }

    public void setNumLivreur(int numLivreur) {
        this.numLivreur = numLivreur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
