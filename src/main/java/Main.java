import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    TreeSet<Integer> first = new TreeSet<>();
    first.add(5);
    first.add(1);
    first.add(10);

    TreeSet<Integer> second = new TreeSet<>();
    second.add(3);
    second.add(5);
    second.add(8);
    second.add(1);

    Realization example = new Realization();

    System.out.println("Intersection result:");
    for (Object o : example.intersection(first, second)) {
      System.out.println(o);
    }

    System.out.println("Union result:");
    for (Object o : example.union(first, second)) {
      System.out.println(o);
    }
  }
}
