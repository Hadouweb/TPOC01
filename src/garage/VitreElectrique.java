package garage;

/**
 * Created by kengo on 24/08/2014.
 */
public class VitreElectrique implements Option {

    public Double getPrix() {
        return 212.35;
    }

    public String toString(){
        String str = "Vitre electrique ("+getPrix()+"€)";
<<<<<<< HEAD

=======
>>>>>>> a052d45f01775d8f9b642d745f652b34efdcd80d
        return str;
    }

}
