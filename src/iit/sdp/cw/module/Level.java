package iit.sdp.cw.module;

import java.io.Serializable;
import java.util.Arrays;


public class Level implements Serializable{
    private String level;
    private Module[] modules ;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "Level{" +
               "level='" + level + '\'' +
               ", modules=" + Arrays.toString(modules) +
               '}';
    }
}
