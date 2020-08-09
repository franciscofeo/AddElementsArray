// With this package you can add any element (type: double) in your array!

public class AddElements {
    public static double[] addOneNum(int size, double[] arr, double element) {
        double[] newArr = new double[size + 1];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        newArr[size] = element;

        return newArr;
    }

    public static double[] addNums(int size, double[] arr, double... elements) {
        double[] newArr = new double[size + elements.length];

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        if (newArr.length - arr.length > 0)
            System.arraycopy(elements, 0, newArr, arr.length, elements.length);

        return newArr;

    }
}
