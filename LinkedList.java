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

    public void insertEnd(String s, int n)
    {
        node temp = new node(s,n);

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
            System.out.println(start.data1+" : "+start.data2);
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
            System.out.println(start.data1+" : "+start.data2);
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
            System.out.println(trar.data1+" : "+trar.data2);
            count--;
        }
    } 

    public void printlist()
    {
        node temp = start;
        while(temp!=null)
        {
            System.out.print(temp.data1+" : "+temp.data2+"     ");
            temp = temp.link;
        }
        System.out.println();
    }

    public void counter()
    {
        System.out.println("Number of items in the list are : "+this.count);
    }
}