package misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class VarUsage {
    public static void main(String[] args) {
        var name = "A";
        //name = 1;
        var list = List.of(1, 2, 3);
        list = new ArrayList<>();
        //list = new HashSet<>();
        System.out.println(name);
        System.out.println(list);
        System.out.println(list instanceof List);
        System.out.println(list instanceof ArrayList);
    }
}
