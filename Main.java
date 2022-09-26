

class Node{
  int data;
  Node next;
}

class linked{
  Node front;
  void init (){
    front = null;
  }



Node makeNode(int num){  
 Node temp;
 temp = new Node();
 temp.data = num;
 temp.next= null;
 return temp;
}
  


Node findTail(){
  Node current;
  current = front;
  while(current.next != null){
    current=current.next;
  }
  return current;
} 

void buildSimple(int n){
     int j;
Node tail;
init();
for(j=0;j<n;j++){
  if (j==0)
    front=makeNode(j);
  else{
    tail=findTail();
  tail.next=makeNode(j);
  }
}
}

  void showList(){
    Node current;
    current = front;
    while (current != null) {
      println(current.data);
       current= current.next;

    }
  }
  Node findSpot(int num){
    Node current,pervious;
    current=pervious=front;
    while(current.data < num){
      pervious= current;
      current= current.next;
    }
    return pervious;
  }




  
}

