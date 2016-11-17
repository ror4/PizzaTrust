package services;

import models.Garnitures;
import models.Pates;
import models.Sauces;
import models.Tailles;

import java.util.List;

/**
 * Created by Formation on 17/11/2016.
 */
public class BackofficeServices extends CommonServices {

    public static void updatePate(Pates pate){
        pate.save();
    }

    public static void addPate(Pates pate){
        pate.save();
    }

    public static void updateSauce(Sauces sauce){
        sauce.save();
    }

    public static void addSauce(Sauces sauce){
        sauce.save();
    }

    public static void updateTaillePrix(Tailles taille){
        taille.save();
    }

    public static void addTaillePrix(Tailles taille){
        taille.save();
    }

    public static void updateGarniture(Garnitures garniture){
        garniture.save();
    }

    public static void addGarniture(Garnitures garniture){
        garniture.save();
    }
}
