package iit.sdp.cw.dao;


import iit.sdp.cw.module.Module;
import iit.sdp.cw.module.Student;
import iit.sdp.cw.util.FileStoreManager;

import java.util.Arrays;

public class StudentDAO {

    public static void addStudent(Student student){
        FileStoreManager.createEntity(student.getRegNo());
        FileStoreManager.writToFile(student.getRegNo() + "/profile", student );
    }

    public static Student getStudent(String studentRegNo){
        return (Student)FileStoreManager.readFromFile(studentRegNo + "/profile") ;
    }
}
