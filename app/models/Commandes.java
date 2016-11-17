package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created by Formation on 17/11/2016.
 */
@Entity
public class Commandes extends Model{

    public String nom;
    public String adresse;
    public String telephone;
}
