package org.edu.epo.metier;

import java.io.Serializable;

public class Client implements Serializable {
    private int numClient;
    private String nom;
    private String prenom;
    private int age;
    private String numTel;
    private Adresse adresse;

    public Client() {
    }

    public Client(int numClient, String nom, String prenom, int age, String numTel) {
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numTel = numTel;
    }

    public Client(int numClient, String nom, String prenom, int age, String numTel, Adresse adresse) {
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numTel = numTel;
        this.adresse = adresse;
    }

    public int getNumClient() {
        return numClient;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
