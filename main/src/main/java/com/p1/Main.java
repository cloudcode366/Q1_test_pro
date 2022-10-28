package com.p1;

import java.util.Scanner;

// 
// Decompiled by Procyon v0.5.36
// 

public class Main
{
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int xStep2 = 0;
        System.out.println();
        System.out.print("Enter desert: ");
        final String xDesert = sc.nextLine();
        System.out.print("Enter step: ");
        final int xStep3 = sc.nextInt();
        sc.nextLine();
        System.out.println("1. Test getDesert()");
        System.out.println("2. Test setStep()");
        System.out.print("Enter TC (1 or 2): ");
        final int tc = sc.nextInt();
        sc.nextLine();
        final Camel t = new Camel(xDesert, xStep3);
        if (tc == 2) {
            System.out.print("Enter new step: ");
            xStep2 = sc.nextInt();
            sc.nextLine();
            t.setStep(xStep2);
        }
        System.out.println("OUTPUT:");
        switch (tc) {
            case 1: {
                final String u = t.getDesert();
                System.out.printf("%s\r\n", u);
                break;
            }
            case 2: {
                final int v = t.getStep();
                System.out.printf("%d\r\n", v);
                break;
            }
            default: {
                return;
            }
        }
        System.out.println();
    }
}