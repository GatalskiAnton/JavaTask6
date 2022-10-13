import java.util.Arrays;
import java.util.function.Predicate;

public class Task6<T> {
    public static <T> boolean contains(T[] array, T element)
    {
      return Arrays.stream(array).allMatch(element::equals);
    }

    public static <T> long countOf(T[] array, T element)
    {
        return Arrays.stream(array).filter(element::equals).count();
    }

    public static  <T extends Comparable<T>> long countOfBigger(T[] array, T element)
    {
        return Arrays.stream(array).filter(el -> el.compareTo(element) > 0).count();
    }

    public static  <T extends Number>  double sumOfElements(T[] array)
    {
        return Arrays.stream(array).mapToDouble(el -> el.doubleValue()).sum();
    }

    public static  <T extends Number>  double getMedian(T[] array)
    {
        return Arrays.stream(array).mapToDouble(el -> el.doubleValue()).sum() / array.length;
    }

    public static <T> long countOf(T[] array, Predicate<T> predicate)
    {
        return Arrays.stream(array).filter(predicate).count();
    }
}
