package garage;


public class VitreElectrique implements Option {
    public Double getPrix() {
        return 212.35;
    }

    public String toString(){
        String str = "Vitre electrique ("+getPrix()+"€)";

        return str;
    }
}
