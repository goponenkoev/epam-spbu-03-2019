import java.util.HashSet;
import java.util.Set;

public interface Task1 {

  /**
   * Операция пересечения целочисленных множеств.
   * @param first Первое множество.
   * @param second Второе множество.
   * @return Результат пересечения множеств.
   */
  Set<Integer> intersection(Set<Integer> first, Set<Integer> second);

  /**
   * Операция объединения целочисленных множеств.
   * @param first Первое множество.
   * @param second Второе множество.
   * @return Результат объединения множеств.
   */
  Set<Integer> union(Set<Integer> first, Set<Integer> second);
}

class Realization implements Task1 {
  @java.lang.Override
  public Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
    Set<Integer> intersectionResult = new HashSet<>(first);
    intersectionResult.retainAll(second);
    return intersectionResult;
  }

  @java.lang.Override
  public Set<Integer> union(Set<Integer> first, Set<Integer> second) {
    Set<Integer> unionResult = new HashSet<>(first);
    unionResult.addAll(second);
    return unionResult;
  }
}