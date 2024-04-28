package JavaAssignment02;

import java.util.*;

public class LanguageVector {

    public static void main(String[] args) {

        Vector list = new Vector();

        int length = args.length;
        for (int i = 0; i < length; i++) {
            list.addElement(args[i]);
        }
        list.insertElementAt("Ada", 0);
        list.insertElementAt("BASIC", 1);
        list.insertElementAt("COBOL", 2);
        list.insertElementAt("C++", 3);
        list.insertElementAt("FORTRAN", 4);
        list.insertElementAt("Java", 5);

        int size = list.size();

        String listArray[] = new String[size];

        list.copyInto(listArray);

        System.out.println("List of Languages");

        for (int i = 0; i < size; i++) {

            System.out.println(listArray[i]);
        }
    }
}
