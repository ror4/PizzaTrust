package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import java.sql.Date;

/**
 * Created by Formation on 17/11/2016.
 */
@Entity
public class Commandes extends Model{

    //infos client
    public String nom;
    public String adresse;
    public String codePostal;
    public String ville;
    public String telephone;
    //infos pizza
    public String taille;
    public String pate;
    public String sauce;
    public String garniture1;
    public String garniture2;
    public String garniture3;
    public String garniture4;
    public String garniture5;
    //infos prix
    public float total;
    public Date dateCommande;


}
