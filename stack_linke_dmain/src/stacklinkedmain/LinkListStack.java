
package stacklinkedmain;

public class LinkListStack {
    LinkList li = new LinkList();

public void push(int data) {
    li.insertFirst(data);
}

public void pop() {
    if(!li.isEmpty()){
    li.deleteFirst();
    }
}

public void displayStack() {
    System.out.println("  ");
    li.displayList();
  }
}
