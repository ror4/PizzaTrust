package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created by Formation on 17/11/2016.
 */
@Entity
public class Garnitures extends Model {

    public String garniture;
    public boolean estDisponible;
}
