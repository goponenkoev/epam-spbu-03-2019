import java.util.Set;
import java.util.HashSet;


public class Main {

  public static void main(String[] args) {

    HashSet<Integer> first = new HashSet<>();

    first.add(1);
    first.add(2);
    first.add(3);
    first.add(4);

    System.out.println("Первое множество: " + first);

    HashSet<Integer> second = new HashSet<>();

    second.add(4);
    second.add(5);
    second.add(6);
    second.add(7);

    System.out.println("Второе множество: " +second);

    //TODO: test your implementation here

    Set<Integer> intersection = new HashSet<>(first);
    intersection.retainAll(second);
    System.out.println("Пересечение двух множеств: " + intersection);

    Set<Integer> union = new HashSet<>(first);
    union.addAll(second);
    System.out.println("Объединение двух множеств: " + union);

  }
}
