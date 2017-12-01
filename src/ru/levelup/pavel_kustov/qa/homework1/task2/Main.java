package ru.levelup.pavel_kustov.qa.homework1.task2;


/**
 *  Class show answer on 1st home work
 *  tasks 2:
 *  binary search
 *
 * @version 1.0
 * @author  Kustov Pavel
 */
public class Main {

    static int vArr[] = { 11, 22, 34, 65, 2, 5, 12, 63, 54, 3, 32, 4, 85};  // main working array


    /**
     *  Entry point
     */
    public static void main(String[] args)
    {
        Main app = new Main();
        app.startApp();
    }

    /**
     *  Function that todo all work
     */
    public void startApp()
    {
        System.out.println("Input array:");
        printArr();

        int val = 12;
        int index  = binarySearch(val, 0, vArr.length-1, vArr);
        System.out.format("Index val: %d in Array is %d (begin from zero) \n", val, index);

    }

    /**
     *  Method for printing main array
     */
    static void printArr() {
        for (int i = 0; i < vArr.length; i++) {
            System.out.print(vArr[i]);
            System.out.print(" ");
        }
        System.out.println(";");
    }

    /**
     *  Algorithm binary search
     */
    static int binarySearch(int val, int startIndex, int endIndex, int[] arr) {
        if (startIndex > endIndex) {
            return -1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;

        if (val < arr[middle]) {
            return binarySearch(val, startIndex, middle-1, arr);
        }
        else if (val > arr[middle]) {
            return binarySearch(val, middle + 1 , endIndex, arr);
        }
        else {
            return middle;
        }
    }

    /**
     *  Algorithm sorting without usage extension memory
     */
    static void sortMagic(int i, int j) {
        int ii = vArr[i];
        int jj = vArr[j];

        ii = ii ^ jj;
        jj = ii ^ jj;
        ii = ii ^ jj;

        vArr[i] = ii;
        vArr[j] = jj;
    }

}
