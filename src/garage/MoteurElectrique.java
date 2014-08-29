package garage;

public class MoteurElectrique extends Moteur {

    public MoteurElectrique(String pCylindre, double pPrix) {
        this.type = TypeMoteur.ELECTRIQUE;
        this.cylindre = pCylindre;
        this.prix = pPrix;
    }

}
