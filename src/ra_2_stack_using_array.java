/*
Stack elements: 10 20 30
Top element is: 30
Removed: 30
Stack elements: 10 20
 */


import java.util.Scanner;

class Stack{
    final int[] array;
    private int top;
    final int capacity;

    Stack(int size){
        array = new int[size];
        top = -1;
        capacity = size;
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity - 1;
    }


    public void push(int x){
        if(isFull()){
            System.out.println("stack is full.");
            return;
        }
        array[++top] = x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("\nStack Underflow, can't pop");
            return -1;
        }
        return array[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("no element is present.");
            return -1;
        }
        return array[top];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("\nstack is empty nothing to show.");
        }
        else{
            System.out.print("\nStack elements: ");
            for(int i = 0; i <= top; i++){
                System.out.printf(array[i] + " ");
            }
        }
        System.out.println();
    }
}
public class ra_2_stack_using_array {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        Stack stack = new Stack(n);

        System.out.println("Enter elements (space separated): ");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        stack.display();

        System.out.print("\nTop element is: " + stack.peek());
        System.out.print("\nRemove: " + stack.pop());

        stack.display();

    }
}
