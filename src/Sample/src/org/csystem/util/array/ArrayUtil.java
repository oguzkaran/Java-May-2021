package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
    public static void display(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);

        System.out.println();
    }

    public static void display(double [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%f", a[i]);

        System.out.println();
    }

    public static void fillRandomArray(int [] a, int min, int max)
    {
        fillRandomArray(new Random(), a, min, max);
    }

    public static void fillRandomArray(Random r, int [] a, int min, int max)
    {

    }

    public static int [] getRandomArray(int n, int min, int max) //[min, max]
    {
        return getRandomArray(new Random(), n, min, max);
    }

    public static int [] getRandomArray(Random r, int n, int min, int max) //[min, max]
    {
        int [] a = new int[n];

        for (int i = 0; i < n; ++i)
            a[i] = r.nextInt(max - min + 1) + min;

        return a;
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }
}
