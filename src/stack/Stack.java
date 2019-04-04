package stack;

public class Stack {
    private int SIZE = 5;
    private int count = -1;
    private int elements[] = new int[SIZE];

    public int getSize(){
        return this.SIZE;
    }

    public int getCount(){
        return this.count+1;
    }

    public boolean push(int element){
        if(count == SIZE - 1){
            return false;
        }
        elements[++count] = element;
        return true;
    }

    public void printElements(){
        if(count == -1){
            System.out.println("Stack is empty ...");
            return;
        }
        for(int i=0;i<=count;i++){
            System.out.println(elements[i]);
        }
    }

    public Integer pop(){
        if(count == -1){
            return null;
        }
        return elements[count--];
    }

    public Integer peek(){
        if(count == 0)
            return null;

        return elements[count];
    }

}
