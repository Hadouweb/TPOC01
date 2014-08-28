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

    }

    public String toString()
    {
        String str = "+ Voiture "+this.nomMarque+" : "+this.nom+" Moteur "+this.moteur.type+" "+this.moteur.cylindre+" ("+this.moteur.prix+"€) ";

        return str;
    }

    public void addOption(Option pOpt)
    {
        this.options = new ArrayList();
        options.add(pOpt);

    }

    public Marque getMarque()
    {
        return null;
    }

    public List<Option> getOptions()
    {
        return options;
    }

    public Double getPrix()
    {

        return null;
    }


    public void setMoteur(MoteurEssence moteur) {
        this.moteur = moteur;
    }

    public MoteurEssence getMoteur() {
        return moteur;
    }
}