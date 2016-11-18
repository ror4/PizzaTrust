package services;

import models.Commandes;
import models.Garnitures;
import models.Pates;
import models.Tailles;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Formation on 17/11/2016.
 */
public class PizzaService {

    public static List<String> getAllTypedePates() {
        List<Pates> pates = CommonServices.getListPates();
        List<String> typeDePates = new ArrayList<String>();
        for (int i = 0; i < pates.size(); ++i) {
            typeDePates.add(pates.get(i).typeDePate);
        }
        return typeDePates;
    }

    public static List<String> getAllTaille() {
        List<Tailles> taillesPrix = CommonServices.getListTaillePrix();
        List<String> tailles = new ArrayList<String>();
        for (int i = 0; i < taillesPrix.size(); ++i) {
            tailles.add(taillesPrix.get(i).taille);
        }
        return tailles;
    }

    public static List<String> getAllGarnitures() {
        List<Garnitures> garnituresDispo = CommonServices.getListGarnitures();
        List<String> garnitures = new ArrayList<String>();
        for (int i = 0; i < garnituresDispo.size(); ++i) {
            garnitures.add(garnituresDispo.get(i).garniture);
        }
        return garnitures;
    }

    public static Commandes enregistrer(Commandes commande, List<String> garnitures) {
        Class classe = commande.getClass();
        Field[] champs = classe.getFields();
        int i = 0;
        for (Field champ : champs) {
            if (i < garnitures.size() && champ.getName().startsWith("garniture")) {
                String garn = garnitures.get(i);
                champ.setAccessible(true);
                try {
                    champ.set(commande, garn);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                i = i + 1;
            }
        }
//        commande.etat="Pizza choisie";
//        commande.save();
        return commande;
    }
}
