import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        long a =2;

        System.out.println(nightDegree(a));
    }
public static long nightDegree(long a){
        return cube(cube(a));
}
public static long cube(long a){
        return a*a*a;
}
}


