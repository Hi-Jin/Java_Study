package lab11.filter;

@FunctionalInterface
public interface Predicate<T> {

	boolean test(T type);
}
