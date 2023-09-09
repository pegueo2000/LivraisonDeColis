package org.edu.epo;

import org.edu.epo.fonctionalites.MesFonctionsImpl;
import org.edu.epo.metier.Produit;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MesFonctionsImpl mes = new MesFonctionsImpl();
        Produit p1 = new Produit(mes.mesId(),"bic",175,25);
        Produit p2 = new Produit(mes.mesId(),"academi",500,25);
        List<Produit> produits = new ArrayList<>();
        produits.add(p1);
        produits.add(p2);
        System.out.println(mes.totalPrixProduits(produits));
    }
}