package iit.sdp.cw.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Utility {

    public static Map<String, List<String>> levelModuleMap = new HashMap<String, List<String>>();

    static {
        List<String> level1 = new ArrayList<String>();
        level1.add("code001");
        level1.add("code002");
        levelModuleMap.put("1", level1);

        List<String> level2 = new ArrayList<String>();
        level1.add("xxxxx");
        levelModuleMap.put("2", level2);


    }

    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
}
