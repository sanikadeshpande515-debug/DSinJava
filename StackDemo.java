class Stack
{
    int maxSize;
    int top;
    int StackArray[];

    Stack(int size)
    {
        maxSize=size;
        top=-1;
        StackArray= new int[maxSize];
    }

    public void push(int value)
    {
        if(top==maxSize-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            StackArray[++top]=value;
            System.out.println(value+"is pushed in Stack");
        }
    
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        else
        {   
            System.out.println(StackArray[top]+"is being poped");
            return StackArray[--top];

        }

    }
    void display()
    {   
        
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        System.out.println("Stack Element are");
        for(int i=0;i<=top;i++)
        {
            
             System.out.print(StackArray[i]+"\t");
        }
    }
    public void getMin()
    {    
        int min=StackArray[0];
        for(int i=0; i<=top;i++)
        {
            if(StackArray[i]<min)
            {
                min=StackArray[i];
            }
        }
        System.out.println(min+"is smallest element");
    }
    public void getMax()
    {    
        int max=StackArray[0];
        for(int i=0; i<=top;i++)
        {
            if(StackArray[i]>max)
            {
                max=StackArray[i];
            }
        }
        System.out.println(max+"is largest element");
    }
    public int top()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return(StackArray[top]);

        }

    }

}
class StackDemo
{
    public static void main(String S[])
    {
        Stack Stack1= new Stack(5);
        Stack1.push(10);
        Stack1.push(20);
        Stack1.push(30);
        Stack1.push(40);
        Stack1.push(50);
        Stack1.push(60);

        Stack1.pop();
        

        Stack1.display();
        Stack1.getMin();
        Stack1.getMax();
        int topValue=Stack1.top();
        System.out.println(topValue+"is the value of top element of Stack");

    }
}