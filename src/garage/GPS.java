package garage;

/**
 * Created by kengo on 24/08/2014.
 */
public class GPS implements Option {

    public Double getPrix() {
        return 113.5d;
    }

    public String toString(){
        String str = "GPS ("+getPrix()+"€)";

        return str;
    }

}
