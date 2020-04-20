public class Doublendedqueueusingarray {
    int data;
    int arr[];
    int front;
    int rear;
    public Doublendedqueueusingarray(int size){
        front = -1;
        rear=-1;
        arr = new int[size];
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFullrear(){
        return rear==arr.length-1;
    }
    public boolean isFullfront(){
        return front ==0;
    }
    public void enqueueRear(int data){
        if(isEmpty()){
            front++;
            rear++;
            arr[front]=data;
        }else if(isFullrear()){
            System.out.println("Queue is Full in rear");
        }else{
            rear++;
            arr[rear]=data;
        }
    }
    public void enqueueFront(int data){
        if(isEmpty()){
            front++;
            rear++;
            arr[front]=data;
        }else if(isFullfront()){
            System.out.println("Queue is full in front. No value can be added in front now");
        }else{
            front--;
            arr[front]=data;
        }
    }
    public void dequeueFront(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else if(front==rear){
            System.out.println("value removed : "+arr[front]);
            front=rear=-1;
        }else{
            System.out.println("value removed : "+arr[front]);
            front++;
        }
    }
    public void dequeueRear(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else if(front==rear){
            System.out.println("value removed : "+arr[front]);
            front=rear=-1;
        }else{
            System.out.println("value removed : "+arr[rear]);
            rear--;
        }
    }
    public void display(){
        if(front==-1){
            System.out.println("Queue is Empty");
        }else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Doublendedqueueusingarray obj = new Doublendedqueueusingarray(5);
        obj.enqueueFront(10);
        obj.display();
        System.out.println("Front = "+obj.front);
        obj.dequeueFront();
        System.out.println("Front = "+obj.front);
        obj.display();
        obj.enqueueFront(20);
        obj.display();
        System.out.println("Front = "+obj.front);
        obj.enqueueFront(30);
        obj.enqueueRear(40);
        obj.enqueueRear(50);
        obj.display();
        obj.dequeueFront();
        obj.dequeueFront();
        obj.display();
        obj.enqueueRear(60);
        obj.enqueueRear(70);
        obj.display();
        System.out.println("Front = "+obj.front);
        obj.enqueueFront(80);
        System.out.println("Front = "+obj.front);
        obj.enqueueFront(90);
        System.out.println("Front = "+obj.front);
        obj.display();
        obj.dequeueFront();
        obj.display();
        obj.dequeueRear();
        obj.display();
        obj.dequeueRear();
        obj.display();
        obj.dequeueRear();
        obj.display();
    }
}
