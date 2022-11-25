package org.apache.commons.math3.util;

import java.util.Arrays;

public class TestMathArrays {
    public static void main(String[] args) {
        TestMathArrays test = new TestMathArrays();
        test.testScale();
        test.testEbeAdd();
        test.testDistance1();
    }

    public void testScale(){
        double val = 3;
        double [] arr = {1, 2, 3, 4, 5};
        double [] a;
        double [] b = new double[arr.length];

        for(int i = 0; i < arr.length; i++)
            b[i] = arr[i] * val;

        System.out.println("scale():\n预期结果为：");
        System.out.println(Arrays.toString(b));

        a = MathArrays.scale(val, arr);
        System.out.println("测试结果如下：");
        System.out.println(Arrays.toString(a));
    }

    public void testEbeAdd(){
        double [] a = {1, 2, 3, 4, 5};
        double [] b = {1, 2, 3, 4, 5};
        double [] s;
        double [] c = a.clone();

        for(int i = 0; i < a.length; i++)
            c[i] += a[i];

        System.out.println("\nebeAdd():\n预期结果为：");
        System.out.println(Arrays.toString(c));

        s = MathArrays.ebeAdd(a, b);
        System.out.println("测试结果如下：");
        System.out.println(Arrays.toString(s));
    }

    public void testDistance1(){
        double [] p1 = {1, 2, 3, 4, 5};
        double [] p2 = {2, 3, 4, 5, 6};
        double s, c = 0;

        for(int i = 0; i < p1.length; i++)
            c += FastMath.abs(p1[i] - p2[i]);;

        System.out.println("\nebeAdd():\n预期结果为：");
        System.out.println(c);

        s = MathArrays.distance1(p1, p2);
        System.out.println("测试结果如下：");
        System.out.println(s);
    }
}
