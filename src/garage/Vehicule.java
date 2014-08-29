package garage;

import java.io.Serializable;
import java.util.*;

/**
 * Created by kengo on 24/08/2014.
 */
public class Vehicule implements Serializable, Option {

    private double prix;
    protected String nom;
    private List<Option> options;
    protected Marque nomMarque;
    private MoteurEssence moteur;

    public Vehicule() {
        this.options = new ArrayList();
    }

    public String toString()
    {
        String str = "+ Voiture "+this.nomMarque+" : "+this.nom+" Moteur "+this.moteur.type+" "+this.moteur.cylindre+" ("+this.moteur.prix+"€) ";
        str += this.options + " d'une valeur totale de "+getPrix() + " €";


        return str;
    }

    public void addOption(Option pOpt) {
        this.options.add(pOpt);
    }

    public Marque getMarque()
    {
        return null;
    }

    public List<Option> getOptions()
    {
        return options;
    }

    public Double getPrix() {

        for(int i = 0; i < this.options.size(); i++) {
            this.prix += this.options.get(i).getPrix();
        }


        return prix;
    }


    public void setMoteur(MoteurEssence moteur) {
        this.moteur = moteur;
    }

    public MoteurEssence getMoteur() {
        return moteur;
    }
}