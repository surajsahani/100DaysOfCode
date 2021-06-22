// Java program to illustrate the
// concept of Multilevel inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class oneA {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class twoA extends oneA {
    public void print_for() { System.out.println("for"); }
}

class three extends twoA {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

// Drived class
public class MainMultipleInheritance {
    public static void main(String[] args)
    {
        three g = new three();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
