package Klausuraufgaben.ptwotter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class UserManager implements ObjectManager<User> {
    private static final String fname = "user.dat";

    @Override
    public void serialize(List<User> object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname))){

            oos.writeObject(object);

        }catch(Exception e){
            throw new RuntimeException("objekt konnte nicht geschrieben werden" + e.getMessage(),e);
        }
    }

    @Override
    public List<User> deserialize() {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname))){
            return (List<User>) ois.readObject();


        }catch(Exception e){
            throw new RuntimeException("konnte nicht gelesen werden" + e.getMessage(),e);
        }
    }
}
