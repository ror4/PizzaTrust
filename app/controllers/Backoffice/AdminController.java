package controllers.Backoffice;

import models.*;
import play.mvc.Controller;
import services.BackofficeServices;

import java.util.List;

/**
 * Created by Formation on 17/11/2016.
 */
public class AdminController extends Controller {

    public static void accueil(){
        renderTemplate("/Backoffice/accueil.html");
    }

    public static void gestionPates(){
        List<Pates> pates = BackofficeServices.getListPates();
        renderTemplate("/Backoffice/gestionPates.html",pates);
    }

    public static void addPate(Pates pate){
        BackofficeServices.addPate(pate);
        gestionPates();
    }

    public static void addSauce(Sauces sauce){
        BackofficeServices.addSauce(sauce);
        gestionSauces();
    }

    public static void addGarniture(Garnitures garniture){
        BackofficeServices.addGarniture(garniture);
        gestionGarnitures();
    }

    public static void addTaillePrix(Tailles taille){
        BackofficeServices.addTaillePrix(taille);
        gestionTailles();
    }

    public static void gestionSauces(){
        List<Sauces> sauces = BackofficeServices.getListSauces();
        renderTemplate("/Backoffice/gestionSauces.html",sauces);
    }

    public static void gestionTailles(){
        List<Tailles> tailles = BackofficeServices.getListTaillePrix();
        renderTemplate("/Backoffice/gestionTaillePrix.html",tailles);
    }

    public static void gestionGarnitures(){
        List<Garnitures> garnitures = BackofficeServices.getListGarnitures();
        renderTemplate("/Backoffice/gestionGarnitures.html",garnitures);
    }

    public static void gestionCommandes(){
        List<Commandes> commandes = BackofficeServices.getListCommandes();
        renderTemplate("/Backoffice/historiqueCommande.html",commandes);
    }

    public static void deleteSauce(long id){
        BackofficeServices.deleteSauce(id);
        gestionSauces();
    }

    public static void deletePate(long id){
        BackofficeServices.deletePate(id);
        gestionPates();
    }

    public static void deleteGarniture(long id){
        BackofficeServices.deleteGarniture(id);
        gestionGarnitures();
    }

    public static void deleteTaille(long id){
        BackofficeServices.deleteTaillePrix(id);
        gestionTailles();
    }
}
