package ch15;

import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size() {
        return arr.length;
    }

    public void add(String item) {
        String[] temp = new String[ size() + 1 ];
        temp[size()] = item;
        //기존값 복사
        for(int i=0; i<size(); i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public void add(int index, String item) {
        String[] temp = new String[ size() + 1 ];
        temp[index] = item;
        for(int i=0; i<size(); i++) {
//            if(i < index) {
//                temp[i] = arr[i];
//            } else {
//                temp[i + 1] = arr[i];
//            }
            temp[i < index ? i : i + 1] = arr[i];
        }
        this.arr = temp;
    }

    public String remove(){
        String[] temp = new String[ size() - 1 ];
        String etc = arr[temp.length];
        for(int i=0; i<temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return etc;
    }

    public String remove(int index){
        String[] temp = new String[ size() - 1 ];
        String etc = arr[index];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[ i < index ? i : i + 1 ];
        }
        arr = temp;
        return etc;
    }

    public String get(int index) {
        return this.arr[index];
    }

    //점검용
    public void checkValues() {
        System.out.println(Arrays.toString(this.arr));
    }
}




