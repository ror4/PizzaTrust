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
        Long idCommande =PizzaService.enregistrer(commande1,garn);
        renderTemplate("/DonnéesClient/formulaireClient.html",idCommande);
    }

    public static void valider(Long idCommande,String nom, String telephone, String adresse, String codePostal, String ville){
        Commandes commande = PizzaService.completer((Commandes)Commandes.findById(idCommande),nom,telephone,adresse,codePostal,ville);
        renderTemplate("/Recapitulatif/recapitulatif.html",commande);
    }

    public static void finir(Long idCommande){
        PizzaService.finir((Commandes)Commandes.findById(idCommande));
        renderTemplate("/Recapitulatif/merci.html");
    }
}
