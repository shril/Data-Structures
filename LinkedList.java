// Class to implement the common function 
// of a linkedlist.
class LinkedList
{
    private node start;
    private int count;
    // class constructor
    public LinkedList()
    {
        start = null;
        count = 0;
    }

    public boolean isEmpty()
    {
        return start == null;
    }

    public void insert(String s)
    {
        node temp = new node(s);  // to initialize the data of the linked list
        temp.link = start;
        start = temp;
        count++;
    }

    public void insertEnd(String s)
    {
        node temp = new node(s);
        if(start == null)
        {
            start = temp;
        }
        else
        {
            node trar = start;
            while(trar.link!=null)
            {
                trar = trar.link;
            }
            trar.link = temp;
        }
        count++;
    }

    public void delete()
    {
        if(start!=null)
        {
            System.out.println(start.data);
            node temp = start.link;
            start = start.link;
            temp = null; // temporary variable trar is made so that any other node
                         // doesn't keeps pointing to first node.
            count--;
        }
        else
        {
            System.out.println("Underflow");
        }
    }

    public void deleteEnd()
    {
        if(start==null)
        {
            System.out.println("Underflow");
        }
        else if(start.link == null)
        {
            System.out.println(start.data);
            start = null;
            count--;
        }
        else
        {
            node temp = start;
            node trar = temp.link;
            while(trar.link!=null)
            {
                temp = trar;
                trar = trar.link;
            }
            temp.link = null;
            System.out.println(trar.data);
            count--;
        }
    } 

    public void printlist()
    {
        node temp = start;
        while(temp!=null)
        {
            System.out.print(temp.data+"   ");
            temp = temp.link;
        }
        System.out.println();
    }

    public int counter()
    {
        return this.count;
    }
    public void deleteList()
    {
        start = null;
        count = 0;
        System.out.println("List Suspended");
    }
}