public class Property<T> {

    private T t;

    public T get(){
        return this.t;
    }

    public void set(String string){
        this.t = (T) string;
    }

    public void set(int i) {
    }
    
}