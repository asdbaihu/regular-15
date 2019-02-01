package stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Stack1 {

    int size;
    Object[] array;
    private int top;
    char element, post;

    Stack1(String top) {
        this.size = top.length();
        System.out.println(size);
        this.array = new Object[size];

        for (int i = 0; i < array.length; i++) {
            element = top.charAt(i);
            if (element == '(' || element == '[' || element == '{') {
                push(element);
                post = element;
            }
            
            if (element == ')' && post == '(') {
                pop();
               // post = (char) array[i];
                System.out.println("Previous "+post);
            }
            if (element == ']' && post == '[') {
                pop();
                //post = (char) array[i];
                System.out.println("Previous "+post);
            }
            if (element == '}' && post == '{') {
                pop();
               // post = (char) array[i];
                System.out.println("Previous "+post);
            }
        }
        if (isEmpty())
            System.out.println("Верно");
        else 
            System.out.println("Не верно");
    }

    void push(Object a) {
        int i = ++top;
        array[i] = a;
        System.out.println("top is " + top);
        System.out.println("top is []   " + array[i]);
    }

    public boolean isEmpty() {
        return (top == 0);
    }

    public Object pop() {

        if (isEmpty()) {
            System.out.println("стэк пустой");
            return null;
        } else {
            System.out.println("top is " + top);
            post=(char)array[top--];
            return array[top--];
        }
       
    }

}
