package org.edu.epo.fonctionalites;

import org.edu.epo.metier.Produit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MesFonctionsImplTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void commander() {
    }

    @Test
    void payer() {
    }

    @Test
    void livrer() {
    }

    @Test
    void confirmerLivraison() {
    }

    @Test
    void totalPrixProduits() {
        MesFonctionsImpl mes = new MesFonctionsImpl();
        Produit p1 = new Produit(mes.mesId(),"bic",175,25);
        Produit p2 = new Produit(mes.mesId(),"academi",500,25);
        List<Produit> produits = new ArrayList<>();
        produits.add(p1);
        produits.add(p2);
        Assertions.assertEquals(16875,mes.totalPrixProduits(produits));

    }

    @Test
    void mesId() {
    }
}