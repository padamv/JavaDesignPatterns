package Service;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
