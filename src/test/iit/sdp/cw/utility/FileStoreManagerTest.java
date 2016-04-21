package test.iit.sdp.cw.utility;

import iit.sdp.cw.module.Result;
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
        /*FileStoreManager.createEntity("Harsha");
        Student student = new Student();
        student.setFirstName("Harsha");
        student.setLastName("Thirimanna");
        student.setRegNo("100000");
        FileStoreManager.writToFile("Harsha/profile",student);*/
        FileStoreManager.createEntity("0001");
        Result result = new Result();
        result.setLevel("4");
        result.setModule("ABC2");
        result.setResult(50);
        result.setAttempt(1);

        FileStoreManager.writToFile("0001/4-ABC2",result);
    }

    public void testReadFromFile() throws Exception {
        /*Object object = FileStoreManager.readFromFile("Harsha/profile");
        Student student = (Student)object ;
        System.out.print(student.getFirstName());*/
        Object object = FileStoreManager.readFromFile("0001/4-ABC2");
        Result result = (Result)object ;
        System.out.print(result);
    }
}