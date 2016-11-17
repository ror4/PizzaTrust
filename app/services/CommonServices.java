package services;

import models.Garnitures;
import models.Pates;
import models.Sauces;
import models.Tailles;

import java.util.List;

/**
 * Created by Formation on 17/11/2016.
 */
public class CommonServices {

    public static List<Pates> getListPates(){
        return Pates.findAll();
    }

    public static List<Sauces> getListSauces(){
        return Sauces.findAll();
    }

    public static List<Tailles> getListTaillePrix(){
        return Tailles.findAll();
    }

    public static List<Garnitures> getListGarnitures(){
        return Garnitures.findAll();
    }
}
