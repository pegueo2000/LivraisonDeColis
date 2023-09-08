package org.edu.epo.metier;

import java.io.Serializable;

public class Adresse  implements Serializable {
    private int numAddress;
    private String ville;
    private String secteur;
    private String rue;
    private String numMaison;
    private String codePostal;

    public Adresse() {
    }

    public Adresse(String ville, String secteur, String rue, String numMaison, String codePostal) {
        this.ville = ville;
        this.secteur = secteur;
        this.rue = rue;
        this.numMaison = numMaison;
        this.codePostal = codePostal;
    }

    public int getNumAddress() {
        return numAddress;
    }

    public void setNumAddress(int numAddress) {
        this.numAddress = numAddress;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getNumMaison() {
        return numMaison;
    }

    public void setNumMaison(String numMaison) {
        this.numMaison = numMaison;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
}
