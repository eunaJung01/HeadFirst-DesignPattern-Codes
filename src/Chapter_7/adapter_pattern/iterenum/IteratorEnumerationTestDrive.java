package Chapter_7.adapter_pattern.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IteratorEnumerationTestDrive {

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>(Arrays.asList(args));

        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

}
