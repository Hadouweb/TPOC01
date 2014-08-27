package garage;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
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
        String str = "+ Voiture "+this.nomMarque+" : "+this.nom+" Moteur "+this.moteur.type+" "+this.moteur.cylindre+" ("+this.moteur.prix+"€) ";
        str += this.getOptions();


        return str;
    }

    public void addOption(Option pOpt)
    {
        Hashtable options = new Hashtable();
        options.put(1, pOpt);

        options = options.elements();

    }

    public Marque getMarque()
    {
        return null;
    }

    public List<Option> getOptions()
    {
        Enumeration e = options.elements();

        while(e.hasMoreElements())
            System.out.println(e.nextElement());

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