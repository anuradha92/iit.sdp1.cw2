package iit.sdp.cw.dao;

import iit.sdp.cw.module.Level;
import iit.sdp.cw.module.Module;
import iit.sdp.cw.util.FileStoreManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModuleResultDAO {

    public static void addModuleResult(String studentRegNo, String level, Module module){

        Module[] modules = (Module[])FileStoreManager.readFromFile(studentRegNo + "/" + level);
        if(modules == null){
            modules = new Module[1];
            modules[0] = module ;
        }else{
            boolean isUpdated = false ;
            for (int i = 0; i < modules.length ; i++) {
                Module tmpModule = modules[i];
                if(tmpModule != null && tmpModule.getCode().equals(module.getCode())){
                    modules[i] = module;
                    isUpdated = true ;
                    break;
                }
            }
            if(!isUpdated){
                modules = Arrays.copyOf(modules,modules.length+1);
                modules[modules.length-1] = module ;
            }
       }
        FileStoreManager.writToFile(studentRegNo + "/" + level,modules);
    }

    public static Module[] getModuleResults(String studentRegNo, String level){
        Module[] modules = (Module[])FileStoreManager.readFromFile(studentRegNo + "/" + level);
        return modules ;
    }

    public static Map<String, Module[]> getAllResults(String studentRegNo){

        Map<String, Module[]> modulesMap = new HashMap<String, Module[]>();
        Module[] modulesInLevel4 = (Module[])FileStoreManager.readFromFile(studentRegNo + "/" + "4");
        if(modulesInLevel4 != null) {
            modulesMap.put("4", modulesInLevel4);
        }
        Module[] modulesInLevel5 = (Module[])FileStoreManager.readFromFile(studentRegNo + "/" + "5");
        if(modulesInLevel5 != null) {
            modulesMap.put("5", modulesInLevel5);
        }
        Module[] modulesInLevel6 = (Module[])FileStoreManager.readFromFile(studentRegNo + "/" + "6");
        if(modulesInLevel6 != null) {
            modulesMap.put("6", modulesInLevel6);
        }
        return modulesMap ;
    }
}
