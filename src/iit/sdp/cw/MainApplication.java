package iit.sdp.cw;

import iit.sdp.cw.dao.ModuleResultDAO;
import iit.sdp.cw.module.Module;
import iit.sdp.cw.module.Student;
import iit.sdp.cw.processor.StudentProcessor;
import iit.sdp.cw.processor.Level5Processor;
import iit.sdp.cw.processor.Level6Processor;

import java.util.Map;

public class MainApplication {


    public static void main(String []args){
        Student student = StudentProcessor.process();
        if(student == null){
            return ;
        }
        Map<String, Module[]> allResults = ModuleResultDAO.getAllResults(student.getRegNo());
        if(allResults.get("6") != null){
            Level6Processor level6 = new Level6Processor();
            level6.process(student.getRegNo());
        }else if(allResults.get("5") != null){
            Level5Processor level5 = new Level5Processor();
            boolean level5done = level5.process(student.getRegNo());
            if(level5done) {
                Level6Processor level6 = new Level6Processor();
                level6.process(student.getRegNo());
            }
        }else if(allResults.get("4") != null){

        }

    }

}
