import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
      Integer [] firstSet = {1, 2, 3, 4, 5};
      Integer [] secondSet = {6};
      //тест методов
      test(firstSet,secondSet);
  }

//реализация интерфейса
  private static class MyTask1 implements Task1{

    @Override
    public Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
      first.retainAll(second);
      return  first;
    }

    @Override
    public Set<Integer> union(Set<Integer> first, Set<Integer> second) {
      Set <Integer> result = new HashSet<>();
      result.addAll(first);
      result.addAll(second);
      return result;
    }
  }
  private static void test(Integer [] first, Integer[] second){
    MyTask1 myTask1 = new MyTask1();
    Set<Integer> set1 = new HashSet<Integer>();
    Set<Integer> set2 = new HashSet<Integer>();
    for (int i = 0; i < first.length; i++){
      set1.add(first[i]);
    }
    for (int i = 0; i < second.length; i++){
      set2.add(second[i]);
    }
    Set<Integer> set1_copy = (Set<Integer>) ((HashSet<Integer>) set1).clone();
    Set<Integer> set2_copy = (Set<Integer>) ((HashSet<Integer>) set2).clone();
    System.out.println("До:"+ set1+","+set2);
    System.out.println("Пересечение:" + myTask1.intersection(set1,set2));
    System.out.println("Объединение:" + myTask1.union(set1_copy,set2_copy));
  }

}
