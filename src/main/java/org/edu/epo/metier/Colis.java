package org.edu.epo.metier;

import java.io.Serializable;
import java.util.List;

public class Colis implements Serializable {
    private int numColis;
    private List<Produit> produits;
    private double prix_total;
    private Client client;
    private boolean paid;

    public Colis() {
    }

    public Colis(int numColis, List<Produit> produits, double prix_total, Client client, boolean paid) {
        this.numColis = numColis;
        this.produits = produits;
        this.prix_total = prix_total;
        this.client = client;
        this.paid = paid;
    }

    public Colis(int numColis, List<Produit> produits, double prix_total, Client client) {
        this.numColis = numColis;
        this.produits = produits;
        this.prix_total = prix_total;
        this.client = client;
    }

    public int getNumColis() {
        return numColis;
    }

    public void setNumColis(int numColis) {
        this.numColis = numColis;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public double getPrix_total() {
        return prix_total;
    }

    public void setPrix_total(double prix_total) {
        this.prix_total = prix_total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
