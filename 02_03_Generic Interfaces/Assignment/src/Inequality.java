public interface Inequality<T> {

    public boolean isGreaterThan(T other);

    public boolean isLessThan(T other);

    public boolean isEqual(T other);

}