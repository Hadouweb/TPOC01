package garage;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kengo on 24/08/2014.
 */
public class Vehicule implements Serializable {

    private double prix;
    protected String nom;
    private List<Option> options;
    protected Marque nomMarque;
    private MoteurEssence moteur;

    public Vehicule() {

    }

    public String toString()
    {
        String str = "+ Voiture "+this.nomMarque+" : "+this.nom;

        return str;
    }

    public void addOption(Option opt)
    {

    }

    public Marque getMarque()
    {


        return null;
    }

    public List<Option> getOptions()
    {

        return null;
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