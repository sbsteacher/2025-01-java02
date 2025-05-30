package ch05;

public class Confirmation06 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88},
        };
        System.out.println(array.length);

        int[] child0 = array[0];
        System.out.println("array[0] == child0: " + (array[0] == child0));
        System.out.println("array[0].length: " + array[0].length);
        System.out.println("child0.length: " + child0.length);
        System.out.println("array[2].length: " + array[2].length);

        int val = array[0][1]; //86
        int val2 = child0[1]; //86
    }
}
