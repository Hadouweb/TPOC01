package garage;

/**
 * Created by kengo on 24/08/2014.
 */
public class Moteur extends Vehicule{

    private TypeMoteur type;
    private String cylindre;
    private Double prix;


    public Moteur()
    {

    }

    public void Moteur(String cylindre, Double prix)
    {

    }

    public void setMoteur(String pCylindre, Double pPrix)
    {
        cylindre = pCylindre;
        prix = pPrix;
    }

}
