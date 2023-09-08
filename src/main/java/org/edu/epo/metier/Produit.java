package org.edu.epo.metier;

import java.io.Serializable;

public class Produit implements Serializable {
    private int refProduit;
    private String nomProduit;
    private double prixProduit;
    private int quantite;

    public Produit() {
    }

    public Produit(String nomProduit, double prixProduit) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }

    public Produit(String nomProduit, double prixProduit, int quantite) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.quantite = quantite;
    }

    public int getRefProduit() {
        return refProduit;
    }

    public void setRefProduit(int refProduit) {
        this.refProduit = refProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
