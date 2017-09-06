
package javaconcept;
public class LinkedList {
    ListNode head;
    //count length 
    public int ListLength(ListNode headNode)
    {
       
    ListNode currentNode=headNode;
    while(currentNode!=null)
    {
        length++;
        currentNode=currentNode.getNext();
        
    }
    return length;
    }
    
    //return the first node
    
    public synchronized ListNode getHead()
    {
        return head;
    }
    // construtor for length
    public  LinkedList()
    {
        length=0;
    }
    private int length=0;
  
    
    // insert a node at the beginning
    
    public synchronized void insertAtBegin(ListNode node)
    {
        node.setNext(node);
        head=node;
        length++;
    }
    
    // insert at the end
    
    public synchronized void insertAtEnd(ListNode node)
    {
        if(head==null)
        {
            head=null;
        }
        else
        {
            ListNode p,q;
            for(p=head;(q=p.getNext())!=null;p=q)
                p.setNext(node);
            length++;
        }
    }
    
    //add new value to the list at a given position 
    // All values at the postition to the end move over to make room
    
    public void insert(int data,int position)
    {
        if(position<0)
        {
            position=0;
        }
        if(position >length)
        {
            position=length;
        }
        // if the list is empty
        
        if(head==null)
        {
            head=new ListNode(data);
            
        }
        
        // if adding at the front of the list..
        else if(position==0)
        {
            ListNode temp=new ListNode(data);
            temp.next= head;
            head=temp;
            
         }
        else 
        {
            ListNode temp=head;
            for(int i=1;i<=position;i++)
                temp=temp.getNext();
            
            ListNode newNode=new ListNode(data);
            newNode.next=temp.next;
            temp.setNext(newNode);
            
        }
        length++;
    }
    
    // Removr and return the node at the head of list 
    
    public synchronized ListNode removeFromBegin()
    {
        ListNode node=head;
        if(node!=null)
        {
            head=node.getNext();
                    node.setNext(null);
        }
        return node;
    }
    // remove  node from end
    public synchronized ListNode removeFromEnd()
    {
        if(head==null)
        {
            return null;
        }
        ListNode p=head,q=null,next=head.getNext();
        
        if(next==null)
        {
            head=null;
            return p;
        }
        while((next=p.getNext())!=null)
        {
            q=p;
            p=next;
        }
        q.setNext(null);
        return p;
    }
    // Remove a node matching the sepcified node from the list
    // use equals instead of == to test for a matched node
    
    
    public synchronized void removeMatched(ListNode node)
    {
        if(head==node)
        {
            return;
        }
        if(node.equals(head))
        {
            head=null;
            
            return;
        }
        ListNode p=head,q=null,next=head.getNext();
        while((next=p.getNext())!=null)
        {
            if(node.equals(q))
            {
                p.setNext(q.getNext());
                return;
            }
            
        }
        p=q;
        length--;
    }
    
    // remove the value at a given position 
    // if the position is less than 0, remove the value at position 0
    // if postion is greater than 0 , remove the element at the last
    
    public void remove(int position)
    {
        //fix position
        
        if(position <0)
        {
            position=0;
        }
        if(position>=length)
        {
            position=length-1;
        }
        
        if(position ==0)
        {
          head=head.getNext();
        }
       else 
        {
           ListNode temp=head;
           for(int i=1;i<=length;i++)
           {
               temp=temp.getNext();
           }

           temp.setNext(temp.getNext().getNext());
         }
        
        length--;
    }
   
    // return a string representation of this collection in this form ["str1","str2"..]
    
    public String toString()
    {
        String result="[";
        if(head==null)
        {
            return result+"]";
            
        }
        result =result+head.getData();
        ListNode temp=head.getNext();
        while (temp!=null)
        {
            result=result+","+temp.getData();
            temp=temp.getNext();
        }
        
        return result +"]";
    }
    
    public int length()
    {
        return length;
    }
    
    public int getPosition(int data)
    {
        ListNode temp=head;
        int pos=0;
        while(temp!=null)
        {
            if(temp.getData()==data)
            {
                return pos;
            }
            pos+=1;
            temp=temp.getNext();
        }
        return Integer.MIN_VALUE;
    }
    
    // Remove everthing from the list
    
    public void clearList()
    {
        head=null;
        length=0;
    }
    
    public static void main(String ar[])
    {
        LinkedList l=new LinkedList();
        l.insertAtBegin(56/);
    }
   
}


