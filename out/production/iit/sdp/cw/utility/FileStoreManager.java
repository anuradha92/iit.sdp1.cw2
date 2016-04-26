package iit.sdp.cw.utility;

import java.io.BufferedInputStream;
import java.io.File;
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
            entityDir.mkdir();
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
            oos.close();
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
    public void readToFile(String filePath){
        return;
    }
    

}
