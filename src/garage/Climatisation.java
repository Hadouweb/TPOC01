package garage;

public class Climatisation implements Option {

    public Double getPrix() {
        return 347.3;
    }

    public String toString(){
        String str = "Climatisation ("+getPrix()+"€)";
        return str;
    }


}
