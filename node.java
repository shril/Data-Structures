// Class is decalred public so
// that it can be used by any 
// program in the package.

public class node
{
    public String data1;
    public int data2;
    public node link;
    
    public node(String d1, int d2)
    {
        this.data1 = d1;
        this.data2 = d2;
        link=null;
    }
}