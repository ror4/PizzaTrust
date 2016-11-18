package controllers;

import models.Commandes;
import play.mvc.Controller;
import services.PizzaService;

import java.util.List;

/**
 * Created by Formation on 17/11/2016.
 */
public class ClientController extends Controller {

    public static void entrerDonnees(Commandes commande1, List<String> garn){
        Commandes commande = PizzaService.enregistrer(commande1,garn);
        renderTemplate("/DonnéesClient/formulaireClient.html");
    }

    public static void valider(Commandes commande){
        commande.save();
//        renderTemplate("/Recapitulatif/recapitulatif.html",commande);
    }
}
