package garage;

public class MoteurHybride extends Moteur {

    public MoteurHybride(String pCylindre, double pPrix) {
        this.type = TypeMoteur.HYBRIDE;
        this.cylindre = pCylindre;
        this.prix = pPrix;
    }

}
