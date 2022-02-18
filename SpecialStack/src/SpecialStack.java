public class SpecialStack {

    private int arr[];
    private int top;
    private int capacity;
    int  min=Integer.MAX_VALUE;

    SpecialStack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;

    }

    public void push(int x){


        if(isfull()){
        System.out.println("stack overflow");
        System.exit(1);
    }

        System.out.println("Inserting element "+x);
        min=Math.min(x,min);

        arr[++top]=x;



    }


    public int getmin(){
        return min;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            System.exit(1);
        }

        return arr[top--];
    }

    public boolean isEmpty(){
        return top ==-1;
    }

    public boolean isfull(){
        return top== capacity -1;
    }

    public void printstack(){
        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i] );
        }
    }

    public static void main(String args[]){

        SpecialStack st=new SpecialStack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);

        st.pop();
        System.out.println("Stack after popping out an element");
        st.printstack();
        int t=st.getmin();
        System.out.println("Minimum element in the stack is "+t);






    }



}
