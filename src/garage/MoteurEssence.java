package garage;

/**
 * Created by kengo on 24/08/2014.
 */
public class MoteurEssence extends Moteur {

    public MoteurEssence(String pCylindre, double pPrix) {
        type = TypeMoteur.ESSENCE;
        cylindre = pCylindre;
        prix = pPrix;
    }

}
