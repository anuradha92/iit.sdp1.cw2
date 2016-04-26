package iit.sdp.cw.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Anuradha on 4/21/2016.
 */
public class FileStoreManager {

    public static void createEntity(String entityName){
        String filePath = Constans.FILE_STORE_PATH + File.separator + entityName ;
        File entityDir = new File(filePath);
        if(!entityDir.exists()) {
            boolean mkdir = entityDir.mkdir();
            System.out.println("Directory for student is created : " + mkdir);
        }
    }


    public static void writToFile(String relativeFilePath,Object object){
        String filePath = Constans.FILE_STORE_PATH + File.separator + relativeFilePath ;
        File file = new File(filePath);
        FileOutputStream fos = null ;
        ObjectOutputStream oos = null ;
        try {
            file.createNewFile();
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(object);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public static Object readFromFile(String relativeFilePath){
        String filePath = Constans.FILE_STORE_PATH + File.separator + relativeFilePath ;
        File file = new File(filePath);
        if(!file.exists()){
            return null ;
        }
        FileInputStream fis = null ;
        ObjectInputStream ois = null ;
        Object object = null ;
        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);

            object = ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return object ;
    }


}
