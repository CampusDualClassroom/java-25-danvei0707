package com.campusdual.classroom;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercise25 {
    protected static String[] data = {
            "Smith",
            "Montessori",
            "Peralta",
            "House"
    };

    public static Stack<String> createStack() {
       Stack<String> s = new Stack<String>();

        for (String x : data) {
            s.push(x);
        }

        return s;
    }

    public static void printAndEmptyStack(Stack<String> s) {
        while (!s.isEmpty()){
            System.out.println("\t" + s.pop());
        }
        System.out.println("\n\tPila vacía");
    }

    public static void main(String[] args) {
        // Objetivo 1
        Stack<String> s = createStack();

        // Objetivo 2
        System.out.println("Elemento en la cima: " + s.peek());

        // Objetivo 3
        System.out.println("Enumerando: ");
        printAndEmptyStack(s);

    }



}
