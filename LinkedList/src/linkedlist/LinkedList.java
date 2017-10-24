/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author chathura
 */
public class LinkedList {

    private Link first;

    public LinkedList ()
    {
        first=null;
    }
    
    public void insertLast(String n)
    {
        Link f =first;
        Link l = new Link(n);
        if(first != null)
        {
            while(f.next != null)
            {
                f=f.next;
            }
            f.next =l;
        }
        else
        {
         first=l;   
        }
    }
    
    public Link deleteFirst()
    {
        Link t=first;
        first=first.next;
        return t;
    }
    
    public boolean isEmpty()
    {
        return (first == null);
    }
    
    public Link getFirst()
    {
        return first;
    }
}
