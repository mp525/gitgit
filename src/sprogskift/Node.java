package sprogskift;


public class Node {
    Dog data;
    Node next;
    
    public Node(Dog data){
        this.data = data;
    }
    public void setNExt(Node node){
        this.next = node;
    }
    public Dog getData(){
        return this.data;
    }
    public Node getNext() {
        return next;
    }
    
    

}
