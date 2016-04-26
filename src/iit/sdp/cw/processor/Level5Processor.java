package iit.sdp.cw.processor;

import iit.sdp.cw.util.Utility;

/**
 * Created by harsha on 4/26/16.
 */
public class Level5Processor{

    public boolean process(String regNo) {

        System.out.println("Enter student name");
        String name = Utility.readString();

        boolean passed = analyze(regNo);

        return passed ;
    }
    public boolean analyze(String regNo) {
        return false;
    }
}
