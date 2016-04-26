package test.iit.sdp.cw.utility;

import iit.sdp.cw.module.Level;
import iit.sdp.cw.util.FileStoreManager;
import junit.framework.TestCase;

/**
 * Created by harsha on 4/21/16.
 */
public class FileStoreManagerTest extends TestCase {

    public void testCreateEntity() throws Exception {

    }

    public void testWritToFfinallyile() throws Exception {
        /*FileStoreManager.createEntity("Harsha");
        Student student = new Student();
        student.setFirstName("Harsha");
        student.setLastName("Thirimanna");
        student.setRegNo("100000");
        FileStoreManager.writToFile("Harsha/profile",student);*/
        FileStoreManager.createEntity("0001");
        Level result = new Level();
        result.setLevel("4");

        Level[] results = new Level[1];
        results[0] = result ;

        FileStoreManager.writToFile("0001/4-ABC2",results);
    }

    public void testReadFromFile() throws Exception {
        /*Object object = FileStoreManager.readFromFile("Harsha/profile");
        Student student = (Student)object ;
        System.out.print(student.getFirstName());*/
        Object object = FileStoreManager.readFromFile("0001/4-ABC2");
        Level[] result = (Level[])object ;
        System.out.print(result);
    }
}