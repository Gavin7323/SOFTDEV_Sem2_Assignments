public class Property<T extends Comparable<T>> implements Inequality<T> {

    private T t;

    public Property(T t) {
        this.t = t;
    }

    public Property() {
        this.t = null;
    }

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    @Override
    public boolean isGreaterThan(Property<T> other) {
        if (t.compareTo(other.t) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isLessThan(Property<T> other) {
        if (t.compareTo(other.t) == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isEqual(Property<T> other) {
        return false; // TODO: Fix this by actually implementing the code
    }

    @Override
    public boolean isNotEqual(Property<T> other) {
        return !isEqual(other);
    }

    @Override
    public boolean isGreaterThanOrEqual(Property<T> other) {
        // TODO Auto-generated method stub
        // You already have an isGreaterThan method
        // You already have an isEqual method
        // Use logical or (||) and return the result.
        throw new UnsupportedOperationException("Unimplemented method 'isGreaterThanOrEqual'");
    }

    @Override
    public boolean isLessThanOrEqual(Property<T> other) {
        // TODO Auto-generated method stub
        // You already have an isLessThan method
        // You already have an isEqual method
        // Use logical or (||) and return the result.
        throw new UnsupportedOperationException("Unimplemented method 'isLessThanOrEqual'");
    }

}
