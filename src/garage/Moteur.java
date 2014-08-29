package garage;

/**
 * Created by kengo on 24/08/2014.
 */
public class Moteur extends Vehicule{

    protected TypeMoteur type;
    protected String cylindre;
    protected Double prix;

    public void setMoteur(String pCylindre, Double pPrix)
    {
        this.cylindre = pCylindre;
        this.prix = pPrix;
    }

}
