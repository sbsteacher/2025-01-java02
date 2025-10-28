package ch13.sec02.exam02;

public class MyArrayList<F> {
    private F[] arr;

    public MyArrayList() {
        this.arr = (F[])new Object[0];
    }

    public int size() { return arr.length; }

    public void add(F item) {
        int size = size();
        F[] temp = (F[])new Object[ size + 1 ];
        temp[size] = item;
        //기존값 복사
        for(int i=0; i<size; i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public void add(int index, F item) {
        int size = size();
        F[] temp = (F[])new Object[ size + 1 ];
        temp[index] = item;
        for(int i=0; i<size; i++) {
            temp[i < index ? i : i + 1] = arr[i];
        }
        this.arr = temp;
    }

    public F get(int idx) {
        return arr[idx];
    }

    public F pop() {
        int minusSize = size() - 1;
        F item = this.arr[minusSize];
        F[] temp = (F[])new Object[ minusSize ];
        for(int i=0; i<temp.length; i++) {
            temp[i] = arr[i];
        }
        return item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int size = size();
        if(size > 0) {
            sb.append(arr[0]);
            for(int i=1; i<size; i++) {
                sb.append(", ").append(arr[i]);
            }
        }
        return sb.append("]").toString();
    }
}
