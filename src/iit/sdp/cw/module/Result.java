package iit.sdp.cw.module;

import java.io.Serializable;

/**
 * Created by Anuradha on 4/21/2016.
 */
public class Result implements Serializable{
    private String level;
    private String module;
    private int result;
    private int attempt;

    public void setLevel(String level) {

        this.level = level;
    }
    public String getLevel() {
        return level;
    }

    public void setModule(String module) {
        this.module = module;
    }
    public String getModule() {
        return module;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int getAttempt() {
        return attempt;
    }

    @Override
    public String toString() {
        return "Result{" +
               "level='" + level + '\'' +
               ", module='" + module + '\'' +
               ", result=" + result +
               ", attempt=" + attempt +
               '}';
    }
}
