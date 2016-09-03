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
        
        ob.insertEnd("S");
        ob.insertEnd("H");
        ob.insertEnd("R");
        ob.insertEnd("I");
        ob.insertEnd("L");
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
        
        ob.insertEnd("S");
        ob.insertEnd("H");
        ob.insertEnd("R");
        ob.insertEnd("I");
        ob.insertEnd("L");
        
        System.out.println("Number of items in the list are : "+ob.counter());
        
        ob.deleteEnd();
        ob.deleteEnd();
        ob.deleteEnd();
        ob.deleteEnd();
        ob.deleteEnd();
        ob.deleteEnd();
        
        System.out.println("Number of items in the list are : "+ob.counter());
        
        ob.insert("A");
        ob.insert("N");
        ob.insert("V");
        ob.counter();
        ob.printlist();
        
        ob.deleteList();
        System.out.println("Number of items in the list are : "+ob.counter());
    }
}
        