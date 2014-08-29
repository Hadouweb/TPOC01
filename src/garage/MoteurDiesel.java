package garage;

public class MoteurDiesel extends Moteur {

    public MoteurDiesel(String pCylindre, double pPrix) {
        this.type = TypeMoteur.DISEL;
        this.cylindre = pCylindre;
        this.prix = pPrix;
    }

}
