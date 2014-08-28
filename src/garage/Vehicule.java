package garage;

import java.io.Serializable;
import java.util.*;

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
        String str = "+ Voiture "+this.nomMarque+" : "+this.nom+" Moteur "+this.moteur.type+" "+this.moteur.cylindre+" ("+this.moteur.prix+"€) ";
        str += this.options;

        return str;
    }

    public void addOption(Option pOpt) {
        this.options = new ArrayList();
        this.options.add(pOpt);
    }

    public Marque getMarque() {
        return null;
    }

    public List<Option> getOptions() {
        return options;
    }

    public Double getPrix() {
        return null;
    }


    public void setMoteur(MoteurEssence moteur) {
        this.moteur = moteur;
    }

    public MoteurEssence getMoteur() {
        return moteur;
    }
}