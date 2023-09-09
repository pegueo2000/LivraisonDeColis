package org.edu.epo.fonctionalites;

import org.edu.epo.metier.*;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class MesFonctionsImpl implements mesFonctions{
    @Override
    public Colis commander(Client client,List<Produit> produits) {
        return new Colis(mesId(),produits,totalPrixProduits(produits),client,false);
    }

    @Override
    public boolean payer(Colis colis) {
        colis.setPaid(true);
        return colis.isPaid();
    }

    @Override
    public Livraison livrer(Livreur livreur, Colis colis) {
        return new Livraison(mesId(),new Date(),livreur,false);
    }

    @Override
    public boolean confirmerLivraison(Livraison livraison) {
        livraison.setStatus(true);
        return livraison.isStatus();
    }

    @Override
    public double totalPrixProduits(List<Produit> produits) {
        double total =0;
        for (Produit p: produits)
        {
          total+=p.getPrixProduit();
        }
        return total;
    }

    @Override
    public int mesId() {
        String generateUUIDNo = String.format("%010d",new BigInteger(UUID.randomUUID().toString().replace("-",""),16));
        String unique_no = generateUUIDNo.substring( generateUUIDNo.length() - 10);
        return Integer.parseInt(unique_no);
    }
}
