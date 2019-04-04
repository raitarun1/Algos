package stack;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStackOperations {

    public static void main(String[] args) {
        ;
        ArrayList<Integer> inputList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Stack stack = new Stack();

        for(int input : inputList){
            if(!stack.push(input)) {
                System.out.println("Stack is full cannot add " + input);
                break;
            }
        }

        stack.printElements();
    }
}
