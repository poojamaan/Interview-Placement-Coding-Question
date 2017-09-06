
package javaconcept;

public class ListNode {
    
    private int data;
    public ListNode next;
    public ListNode(int data)
    {
        this.data=data;
    }
    public void setData(int data)
    {
        this.data=data;
    }
    public int getData()
    {
        return data;
        
    }
    public void setNext(ListNode next)
    {
        this.next=next;
    }
    public ListNode getNext()
    {
        return next;
    }
}
