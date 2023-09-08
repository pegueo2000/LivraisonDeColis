package org.edu.epo.metier;

import java.util.Date;

public class Livraison {
    private int numLivraison;
    private Date date;
    private Livreur livreur;
    private boolean status;

    public Livraison() {
    }

    public Livraison(int numLivraison, Date date, Livreur livreur, boolean status) {
        this.numLivraison = numLivraison;
        this.date = date;
        this.livreur = livreur;
        this.status = status;
    }

    public Livraison(int numLivraison, Date date, Livreur livreur) {
        this.numLivraison = numLivraison;
        this.date = date;
        this.livreur = livreur;
    }

    public int getNumLivraison() {
        return numLivraison;
    }

    public void setNumLivraison(int numLivraison) {
        this.numLivraison = numLivraison;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Livreur getLivreur() {
        return livreur;
    }

    public void setLivreur(Livreur livreur) {
        this.livreur = livreur;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
