package services;

import models.*;

import java.util.List;

/**
 * Created by Formation on 17/11/2016.
 */
public class BackofficeServices extends CommonServices {

    public static void updatePate(Pates pate){
        pate.save();
    }

    public static void addPate(Pates pate){
        pate.estDisponible = true;
        pate.save();
    }

    public static void deletePate(Long id){
        ((Pates)Pates.findById(id)).delete();
    }

    public static void updateSauce(Sauces sauce){
        sauce.save();
    }

    public static void addSauce(Sauces sauce){
        sauce.save();
    }

    public static void deleteSauce(long id){
        ((Sauces)Sauces.findById(id)).delete();
    }

    public static void updateTaillePrix(Tailles taille){
        taille.save();
    }

    public static void addTaillePrix(Tailles taille){
        taille.save();
    }

    public static void deleteTaillePrix(long id){
        ((Tailles)Tailles.findById(id)).delete();
    }

    public static void updateGarniture(Garnitures garniture){
        garniture.save();
    }

    public static void addGarniture(Garnitures garniture){
        garniture.estDisponible = true;
        garniture.save();
    }

    public static List<Commandes> getListCommandes() {
        List<Commandes> commandes = Commandes.find("ORDER BY dateCommande").fetch();
        return commandes;
    }

    public static void deleteGarniture(long id) {
        ((Garnitures)Garnitures.findById(id)).delete();
    }
}
