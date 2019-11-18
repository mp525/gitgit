package sprogskift;


public class DogLinkedList {
    
    Node head;
    
    public void add(Dog dog){
        if(this.head == null){
            Node myNode = new Node(dog);
            this.head = myNode;
        } else {
            Node myNode = new Node(dog);
            myNode.next = head;
            this.head = myNode;
        }
        
    }
    public void printList(int limit){
        Node currentNode = this.head;
        int counter = 0;
        while (currentNode != null){
            if (counter > limit){
                break;
            }
            System.out.println(currentNode.getData().getName());
            currentNode = currentNode.getNext();
        }
        
    }

}
