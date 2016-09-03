class ClientLinkedList
{
    public static void main(String[] args)
    {
        LinkedList ob = new LinkedList();
        ob.counter(); // Checking the initial length
        
        // Inserting elements
        /*ob.insert("S",1);
        ob.insert("H",2);
        ob.insert("R",3);
        ob.insert("I",4);
        ob.insert("L",5);
        ob.printlist();*/
        
        ob.insertEnd("S",1);
        ob.insertEnd("H",2);
        ob.insertEnd("R",3);
        ob.insertEnd("I",4);
        ob.insertEnd("L",5);
        // Printing the elements
        ob.printlist();
        
        // Deleting and checking underflow
        ob.delete();
        ob.delete();
        ob.delete();
        ob.delete();
        ob.delete();
        ob.delete();
        ob.delete();
        
        ob.insertEnd("S",1);
        ob.insertEnd("H",2);
        ob.insertEnd("R",3);
        ob.insertEnd("I",4);
        ob.insertEnd("L",5);
        
        ob.counter();
        
        ob.deleteEnd();
        ob.deleteEnd();
        ob.deleteEnd();
        ob.deleteEnd();
        ob.deleteEnd();
        ob.deleteEnd();
        
        ob.counter();
        
        ob.insert("A",9);
        ob.insert("N",5);
        ob.insert("V",3);
        ob.counter();
        ob.printlist();
    }
}
        