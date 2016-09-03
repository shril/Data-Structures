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

    public void insert(String s, int n)
    {
        node temp = new node(s,n);  // to initialize the data of the linked list
        temp.link = start;
        start = temp;
        count++;
    }

    public void delete()
    {
        if(start!=null)
        {
            count--;
            System.out.println(start.data1+">>"+start.data2);
            node temp = start.link;
            start = start.link;
            temp = null; // temporary variable trar is made so that any other node
                         // doesn't keeps pointing to first node.
        }
        else
        {
            System.out.println("Underflow");
        }
    }
    
    public void printlist()
    {
        node temp = start;
        while(temp!=null)
        {
            System.out.print(temp.data1+" : "+temp.data2+" >> ");
            temp = temp.link;
        }
        System.out.println();
    }
    
    public void counter()
    {
        System.out.println("Number of items in the list are : "+this.count);
    }
}