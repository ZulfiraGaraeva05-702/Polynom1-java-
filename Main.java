package com.company;
public class Main {

    public static void main(String[] args) {
        double[] m = new double[8];
        m[0] = -1;
        m[1] = -1;
        m[2] = 0;
        m[3] = -4;
        m[4] = 5;
        m[5] = 1;
        m[6] = 7;
        m[7] = 8;
        Polynom a = new Polynom(m);
        System.out.println(a);

        double[] l = new double[8];
        l[0] = 1;
        l[1] = 1;
        l[2] = 2;
        l[3] = 3;
        l[4] = 4;
        l[5] = 5;
        l[6] = 6;
        l[7] = 7;
        Polynom b = new Polynom(l);
        System.out.println(b);

        double[] k = new double[8];
        k[0] = m[0] + l[0];
        k[1] = m[1] + l[1];
        k[2] = m[2] + l[2];
        k[3] = m[3] + l[3];
        k[4] = m[4] + l[4];
        k[5] = m[5] + l[5];
        k[6] = m[6] + l[6];
        k[7] = m[7] + l[7];
        Polynom c = new Polynom(k);
        System.out.println(c);

    }
}
