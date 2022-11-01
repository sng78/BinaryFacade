package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String arg0 = "110011";
        String arg1 = "100011";

        System.out.println(bins.sum(arg0, arg1));
        System.out.println(bins.mult(arg0, arg1));
    }
}