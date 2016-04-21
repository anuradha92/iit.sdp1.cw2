package iit.sdp.cw.module;

import java.io.Serializable;

/**
 * Created by Anuradha on 4/21/2016.
 */
public class Student implements Serializable{
    private String firstName;
    private String lastName;
    private String regNo;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
         return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setRegNo(String regNo){
        this.regNo = regNo;
    }
    public String getRegNo(){
        return regNo;
    }
}
