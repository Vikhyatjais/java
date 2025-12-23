class TestBox<T> {
    private T value;

    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
}
class Box{
    public static void main(String[] args) {
        TestBox<Integer> box = new TestBox<>();
        box.setValue(1000);
        System.out.print("Box value: " + box.getValue());    
    }
}
