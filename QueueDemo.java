class Queue
{
    int front;
    int rear;
    int count;
    int maxSize;
    int QueueArray[];


    Queue(int size)
    {
        front=0;
        rear=-1;
        count=0;
        maxSize=size;
        QueueArray= new int[maxSize];
    }

    public void enqueue(int value)
    {
        if(rear==maxSize-1)
        {
            System.out.println("Queue is full");
        }
        else
        {
            rear=(rear+1)%maxSize;
            QueueArray[rear]=value;
            System.out.println(value+"is inserted in the Queue");
            count++;
        }
    }
    public void dequeue()
    {
        if(rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println(QueueArray[front]+"is served ");
            front=(front+1)%maxSize;
            count--;

        }
    }
    public void display()
    {
        if(rear==-1)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Queue Element are");
            for(int i=0; i<count;i++)
            {
                int index=(front+i)%maxSize;
                System.out.println(QueueArray[index]+"\t");
            }

        }
    }

}
class QueueDemo
{
    public static void main(String s[])
    {
        Queue q1= new Queue(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.dequeue();
        q1.dequeue();
        q1.display();



    }
}
