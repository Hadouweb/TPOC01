package garage;

import java.io.*;
import java.util.List;

/**
 * Created by kengo on 24/08/2014.
 */
public class Garage {
    List<Vehicule> voitures;
    ObjectInputStream ois;
    ObjectOutputStream oos;
    DataOutputStream dos;
    String title;
    String newLine = System.getProperty("line.separator");

    public Garage()
    {

        title = "*************************"+newLine;
        title += "* Garage OpenClassrooms *"+newLine;
        title += "*************************";

    }

    public String toString() {

        try {
            ois = new ObjectInputStream(
                new BufferedInputStream(
                    new FileInputStream(
                        new File("voitures.txt"))));

            try {
                System.out.println(ois.readObject().toString());
            }catch(ClassNotFoundException e) {
                e.printStackTrace();
            }

            ois.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        title = "*************************"+newLine;
//        title += "* Garage OpenClassrooms *"+newLine;
//        title += "*************************";

        return "ok";
    }

    public void add(Vehicule voit) {

    }

    public void addVoiture(Vehicule lag1) {

        try {
            oos = new ObjectOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream(
                        new File("voitures.txt"))));

            oos.writeObject(lag1);
            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
