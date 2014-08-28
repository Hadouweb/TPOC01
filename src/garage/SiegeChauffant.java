package garage;

/**
 * Created by kengo on 24/08/2014.
 */
public class SiegeChauffant implements Option {

    public Double getPrix() {
        return 562.9;
    }

    public String toString(){
        String str = "Siège chauffant ("+getPrix()+"€)";
        return str;
    }

}
