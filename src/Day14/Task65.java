package Day14;

import java.util.function.Consumer;

public class Task65 {
    public static void main(String[] args) {

    }
    public static class App {

        static Consumer<double[]> cons = (double[] arr) -> {
            for(int i = 0;i < arr.length;i++){
                if(arr[i] > 2){
                    arr[i] *= 0.8;
                }
                else{
                    arr[i] *= 0.9;
                }
            }
        };

        public static double[] getChanged(double[] initialArray, Consumer<double[]> method) {
            double[] newArr = new double[initialArray.length];
            for(int i = 0;i < newArr.length;i++){
                newArr[i] = initialArray[i];
            }
            method.accept(newArr);
            return newArr;
        }

    }
}
