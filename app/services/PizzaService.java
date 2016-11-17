package services;

import models.Pates;
import models.Tailles;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Formation on 17/11/2016.
 */
public class PizzaService {

    public static List<String> getAllTypedePates(){
        List<Pates> pates = CommonServices.getListPates();
        List<String> typeDePates = new ArrayList<String>();
        for (int i=0; i<pates.size(); ++i) {
            typeDePates.add(pates.get(i).typeDePate);
        }
        return typeDePates;
    }

    public static List<String> getAllTaille(){
        List<Tailles> taillesPrix = CommonServices.getListTaillePrix();
        List<String> tailles = new ArrayList<String>();
        for (int i=0; i<taillesPrix.size(); ++i) {
            tailles.add(taillesPrix.get(i).taille);
        }
        return tailles;
    }
}
