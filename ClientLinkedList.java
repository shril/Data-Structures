class ClientLinkedList
{
    public static void main(String[] args)
    {
        LinkedList ob = new LinkedList();
        ob.counter();
        
        ob.insert("S",1);
        ob.insert("H",2);
        ob.insert("R",3);
        ob.insert("I",4);
        ob.insert("L",5);
        
        ob.printlist();
        ob.delete();
        ob.delete();
        ob.delete();
        ob.delete();
        ob.delete();
        ob.delete();
        ob.delete();
        
        ob.counter();
        
        ob.insert("A",9);
        ob.insert("N",5);
        ob.insert("V",3);
        ob.counter();
        ob.printlist();
    }
}
        