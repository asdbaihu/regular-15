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
public class StackArray {
//isempty,push,pop,peek
    // int size,int[] array,int top

    private int size;
    private Object[] array;
    private int top;
    private Object finded;

    StackArray(int size) {

        this.size = size;
        this.array = new Object[size];
        this.top = -1;
    }

    public int search(int a) {

        int count = 0;
        this.finded = a;
        for (int i = 0; i < array.length; i++) {
            if (finded == array[i]) {
                count++;
                System.out.println("положение найденного входного значения " + (i + 1));
            }

        }
        if (count == 0) {
            System.out.println("не найдено");
            return 0;
        } else {
            System.out.println("Количество найденых эдементов " + count);
            return count;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(Object a) {
        int i = ++top;

        array[i] = a;
        System.out.println("top is " + top);
        System.out.println("top is []   " + array[i]);
    }

    public Object pop() {

        if (isEmpty()) {
            System.out.println("стэк пустой");
            return null;
        } else {
            System.out.println("top is " + top);
            return array[top--];
        }
        //  System.out.println(top);
    }

    public Object pick() {
        if (isEmpty()) {
            System.out.println("стэк пустой ");
            return null;
        } else {
            System.out.println("top is " + top);
            return array[top];

        }
    }
}
