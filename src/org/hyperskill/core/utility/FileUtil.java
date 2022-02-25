package org.hyperskill.core.utility;

import java.io.*;

public class FileUtil {
    public static void writeObjectToFile(String name, Serializable obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name))){
            oos.writeObject(obj);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Object readFromFile(String name) {
        Object object = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(name))){
            object = objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
