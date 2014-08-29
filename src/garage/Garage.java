package garage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Garage {
    List<Vehicule> voitures;
    ObjectInputStream ois;
    ObjectOutputStream oos;
    DataOutputStream dos;
    String title;
    String newLine = System.getProperty("line.separator");

    public Garage()
    {
        this.voitures = new ArrayList();
    }

    public String toString() {

        title = "*************************"+newLine;
        title += "* Garage OpenClassrooms *"+newLine;
        title += "*************************"+newLine;

        String str = title;


        try {
            ois = new ObjectInputStream(
                new BufferedInputStream(
                    new FileInputStream(
                        new File("voitures.txt"))));

            try {
                str += ois.readObject().toString()+newLine;
                str += ois.readObject().toString()+newLine;
                str += ois.readObject().toString()+newLine;
                str += ois.readObject().toString()+newLine;
                str += ois.readObject().toString()+newLine;
            }catch(ClassNotFoundException e) {
                e.printStackTrace();
            }

            ois.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }

    public void addVoiture(Vehicule voiture) {



        this.voitures.add(voiture);

        try {
            oos = new ObjectOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream(
                        new File("voitures.txt"))));

        for(int i = 0; i < this.voitures.size(); i++) {
            oos.writeObject(this.voitures.get(i));
        }

            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
