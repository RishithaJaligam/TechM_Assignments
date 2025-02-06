package streams;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
public class Max_Min {
	public static void main(String args[])
	{
    List<Integer> a = Arrays.asList(10, 45, 2, 67, 33, 89, 5);
    System.out.println("List:"+a);
    Optional<Integer> max = a.stream().max(Integer::compareTo);
    Optional<Integer> min = a.stream().min(Integer::compareTo);
    System.out.println("Maximum Value: " + max);
    System.out.println("Minimum Value: " + min);
}
}
