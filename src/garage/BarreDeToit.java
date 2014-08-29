package garage;

public class BarreDeToit implements Option {

    public Double getPrix() {
        return 29.9;
    }

    public String toString(){
        String str = "Barre de toit ("+getPrix()+"€)";
        return str;
    }

}
