package controllers;

import play.mvc.Controller;

import java.util.List;

/**
 * Created by Formation on 17/11/2016.
 */
public class ClientController extends Controller {

    public static void entrerDonnees(String pate, String taille,List<String> garn){
        renderTemplate("/DonnéesClient/formulaireClient.html",pate,taille,garn);
    }
}
