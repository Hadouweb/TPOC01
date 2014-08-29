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
        this.options = new ArrayList();
    }

    public String toString()
    {
        String str = "+ Voiture "+this.nomMarque+" : "+this.nom+" Moteur "+this.moteur.type+" "+this.moteur.cylindre+" ("+this.moteur.prix+"€) ";
<<<<<<< HEAD
        str += this.options + " d'une valeur totale de "+getPrix() + " €";

=======
        str += this.options;
>>>>>>> a052d45f01775d8f9b642d745f652b34efdcd80d

        return str;
    }

    public void addOption(Option pOpt) {
<<<<<<< HEAD
=======
        this.options = new ArrayList();
>>>>>>> a052d45f01775d8f9b642d745f652b34efdcd80d
        this.options.add(pOpt);
    }

    public Marque getMarque() {
        return null;
    }

    public List<Option> getOptions() {
        return options;
    }

    public Double getPrix() {
<<<<<<< HEAD

        for(int i = 0; i < this.options.size(); i++) {
            this.prix += this.options.get(i).getPrix();
        }


        return prix;
=======
        return null;
>>>>>>> a052d45f01775d8f9b642d745f652b34efdcd80d
    }


    public void setMoteur(MoteurEssence moteur) {
        this.moteur = moteur;
    }

    public MoteurEssence getMoteur() {
        return moteur;
    }
}