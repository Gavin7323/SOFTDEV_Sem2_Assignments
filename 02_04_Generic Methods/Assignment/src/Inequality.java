
public interface Inequality<T extends Comparable<T>> {

    public boolean isGreaterThan(Property<T> other);

    public boolean isLessThan(Property<T> other);

    public boolean isEqual(Property<T> other);

    public boolean isNotEqual(Property<T> other);

    public boolean isGreaterThanOrEqual(Property<T> other);

    public boolean isLessThanOrEqual(Property<T> other);

}
