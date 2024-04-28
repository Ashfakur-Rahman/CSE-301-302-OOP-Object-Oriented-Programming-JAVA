package JavaAssignment02;

import package1.ClassA;
import package2.ClassB;

public class PackageTest02 {

    public static void main(String[] args) {

        ClassA objectA = new ClassA();

        ClassB objectB = new ClassB();

        objectA.displayA();
        objectB.displayB();
    }
}

class ClassC extends ClassB {

    int n = 20;

    void displayC() {

        System.out.println("Class  C");
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
