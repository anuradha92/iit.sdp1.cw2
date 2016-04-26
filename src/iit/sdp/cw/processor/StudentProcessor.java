package iit.sdp.cw.processor;

import iit.sdp.cw.dao.StudentDAO;
import iit.sdp.cw.module.Student;
import iit.sdp.cw.util.Utility;

import java.util.Scanner;

public class StudentProcessor {

    public static Student  process(){
        System.out.println("Enter student name");
        String name = Utility.readString();

        System.out.println("Enter student reg number");
        String regNo = Utility.readString();

        Student student = new Student();
        student.setFirstName(name);
        student.setRegNo(regNo);

        StudentDAO.addStudent(student);

        return student ;
    }
}
