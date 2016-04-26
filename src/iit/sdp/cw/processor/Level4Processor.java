package iit.sdp.cw.processor;


import iit.sdp.cw.dao.ModuleResultDAO;
import iit.sdp.cw.module.Module;
import iit.sdp.cw.util.Utility;

public class Level4Processor{
    public boolean process(String regNo) {

        System.out.println("Enter student name");
        String name = Utility.readString();

        boolean passed = analyze(regNo);

        return passed ;
    }
    public boolean analyze(String regNo) {
        Module[] modules = ModuleResultDAO.getModuleResults(regNo, "4");


        return false;
    }

}
