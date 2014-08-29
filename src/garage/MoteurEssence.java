package garage;

public class MoteurEssence extends Moteur {

    public MoteurEssence(String pCylindre, double pPrix) {
        this.type = TypeMoteur.ESSENCE;
        this.cylindre = pCylindre;
        this.prix = pPrix;
    }

}
