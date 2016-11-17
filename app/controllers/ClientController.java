package controllers;

import play.mvc.Controller;

/**
 * Created by Formation on 17/11/2016.
 */
public class ClientController extends Controller {

    public static void entrerDonnees(String pate, String taille){
        renderTemplate("/DonnéesClient/formulaireClient.html",pate,taille);
    }
}
