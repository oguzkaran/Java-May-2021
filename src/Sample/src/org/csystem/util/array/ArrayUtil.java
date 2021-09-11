/*----------------------------------------------------------------------
	FILE        : ArrayUtil.java
	AUTHOR      : Java-May-2021 Group
	LAST UPDATE : 11.09.2021

	Utility class for array operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
    public static void display(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (int i = 0; i < a.length; ++i)
            System.out.printf(fmt, a[i]);

        System.out.println();
    }

    public static void display(int [] a)
    {
        display(1, a);
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
        for (int i = 0; i < a.length; ++i)
            a[i] = r.nextInt(max - min + 1) + min;
    }

    public static int [] getRandomArray(int n, int min, int max) //[min, max]
    {
        return getRandomArray(new Random(), n, min, max);
    }

    public static int [] getRandomArray(Random r, int n, int min, int max) //[min, max]
    {
        int [] a = new int[n];

        fillRandomArray(r, a, min, max);

        return a;
    }

    public static void reverse(int [] a)
    {
        int halfLen = a.length / 2;

        for (int i = 0; i < halfLen; ++i)
            swap(a, i, a.length - 1 - i);
    }

    public static int [] reversed(int [] a)
    {
        int [] r = new int[a.length];

        for (int i = a.length - 1; i >= 0; --i)
            r[a.length - 1 - i] = a[i];

        return r;
    }

    public static void shuffle(Random r, int [] a, int count)
    {
        while (count-- > 0)
            swap(a, r.nextInt(a.length), r.nextInt(a.length));
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
