package Chapter_08.list;

import java.util.List;

public class MyListTestDrive {

    public static void main(String[] args) {
        String[] ducks = {"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList ducksList = new MyStringList(ducks);
        for (String s : ducksList) {
            System.out.println(s);
        }

        String oldDuck = ducksList.set(3, "Donald Duck");
        System.out.println("\nReplacing " + oldDuck);

        System.out.println("\nNew List:");
        for (String s : ducksList) {
            System.out.println(s);
        }

        // Now the real test... subList()
        List<String> ducksSubList = ducksList.subList(1, 3);
        System.out.println("\nCreated a sub list of ducks, with size: " + ducksSubList.size());
        for (String s : ducksSubList) {
            System.out.println(s);
        }
    }

}