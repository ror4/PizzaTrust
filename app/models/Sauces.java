package models;

import play.db.jpa.Model;

/**
 * Created by Formation on 17/11/2016.
 */
import javax.persistence.Entity;

@Entity
public class Sauces extends Model {

    public String nom;
}
