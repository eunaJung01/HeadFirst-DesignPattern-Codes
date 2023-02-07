package Chapter_08.sort;

public class Duck implements Comparable<Duck> {

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        return Integer.compare(this.weight, otherDuck.weight);
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }

}
