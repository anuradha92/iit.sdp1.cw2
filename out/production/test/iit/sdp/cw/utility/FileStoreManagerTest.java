package test.iit.sdp.cw.utility;

import iit.sdp.cw.module.Student;
import iit.sdp.cw.utility.FileStoreManager;
import junit.framework.TestCase;

/**
 * Created by harsha on 4/21/16.
 */
public class FileStoreManagerTest extends TestCase {

    public void testCreateEntity() throws Exception {

    }

    public void testWritToFfinallyile() throws Exception {
        FileStoreManager.createEntity("Harsha");
        Student student = new Student();
        student.setFirstName("Harsha");
        student.setLastName("Thirimanna");
        student.setRegNo("100000");
        FileStoreManager.writToFile("Harsha/result",student);
    }

    public void testReadToFile() throws Exception {

    }
}