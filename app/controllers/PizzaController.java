package controllers;

import models.Garnitures;
import models.Pates;
import models.Tailles;
import play.mvc.Controller;
import services.PizzaService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Formation on 17/11/2016.
 */
public class PizzaController extends Controller {

    public static void creer(){
        List<String> typedePates = PizzaService.getAllTypedePates();
        List<String> tailles = PizzaService.getAllTaille();
        renderTemplate("/CreationPizza/creationPizza.html",typedePates,tailles);
    }
}
