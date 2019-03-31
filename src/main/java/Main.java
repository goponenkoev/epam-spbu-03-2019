import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {


    FirstTask Task = new FirstTask();
    HashSet<Integer> FirstSet = new HashSet<Integer>();
    HashSet<Integer> SecondSet = new HashSet<Integer>();
    FirstSet.add(1);
    FirstSet.add(2);
    FirstSet.add(3);
    SecondSet.add(3);
    SecondSet.add(4);
    SecondSet.add(5);


    // 1 method
    System.out.println("Пересечение множеств:" + FirstSet + " и " + SecondSet + " = " + Task.intersection(FirstSet, SecondSet));
    // 2 method
    System.out.println("Объединение множеств:" + FirstSet + " и " + SecondSet + " = " + Task.union(FirstSet, SecondSet));

  }
  private static class FirstTask implements Task1{

    // 1 method
    @Override
    public Set<Integer> intersection(Set<Integer> s1, Set<Integer> s2) {
      Set <Integer> result1 = new HashSet<Integer>(s1);

      result1.retainAll(s2);
      return result1;
    }
    //2 method
    @Override
    public Set<Integer> union(Set<Integer> s1, Set<Integer> s2) {
      Set <Integer> result2 = new HashSet<>();
      result2.addAll(s1);
      result2.addAll(s2);
      return result2;
    }
  }


}
