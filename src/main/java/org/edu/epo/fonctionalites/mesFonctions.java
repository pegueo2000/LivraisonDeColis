package org.edu.epo.fonctionalites;

import org.edu.epo.metier.*;

import java.util.List;

public interface mesFonctions {
    public Colis commander(Client client,List<Produit> produits);
    public  boolean payer(Colis colis);
    public Livraison livrer(Livreur livreur, Colis colis) ;
    public boolean confirmerLivraison (Livraison livraison);
    public double totalPrixProduits(List<Produit> produits);
    public int mesId ();
}
