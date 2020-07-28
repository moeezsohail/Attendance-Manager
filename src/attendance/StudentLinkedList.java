package attendance;

public class StudentLinkedList {
    private StudentNode front;
    private StudentNode back;
  
    /* Precondition: none
     * Postcondition: a new StudentLinkedList is created with no elements
     * Activity: Constructor, creates a new StudentLinkedList object with no elements*/
    public StudentLinkedList() {
        front = null;
    }
    
    /* Precondition: Student object
     * Postcondition: the Student object passed to the method is added to the end of the list
     * Activity: Adds an element to the end of the list by setting back’s next equal to the new StudentNode 
      created using the attributes from the Student passed when the method was called*/
    public void enqueue(Student st)
    {
      StudentNode newNode = new StudentNode(st);
      if(front == null)
        front = newNode;
      else
        back.setNext(newNode);
      back = newNode;
    }

    /* Precondition: none
     * Postcondition: the first element in the list is removed and the front is updated to the old front's next
     * Activity: Removes the first element in the list by setting front to front’s next*/
    public void dequeue()
    {
        if(isEmpty())
            return;
        front = front.getNext();
    }

    /* Precondition: none
     * Postcondition: a boolean is returned representing the list's status
     * Activity: Returns true if the list is empty or returns false if the list has elements. Is checked by seeing if 
      front is null*/
    public boolean isEmpty()
    {
        return front == null;
    }

    /* Precondition: none
     * Postcondition: the list has no elements
     * Activity: Removes all elements in the list by setting the first element (front) to null*/
    public void makeEmpty()
    {
      front = null;
    }

    /* Precondition: none
     * Postcondition: an integer is returned representing the size of the array
     * Activity: Returns the number of StudentNodes in the list*/
    public int size()
    {
      StudentNode current = front;
      int counter = 0;
      while(current != null)
      {
        counter++;
        current = current.getNext();
      }
      return counter;
    }

    /* Precondition: none
     * Postcondition: the front StudentNode is returned
     * Activity: Returns the first element of the list (front)*/
    public StudentNode getFront()
    {
        return front;
    }

    /* Precondition: StudentNode
     * Postcondition: front is set equal to the StudentNode passed to the method
     * Activity:Sets the first element of the list (front) equal to the argument passed when the method was called*/
    public void setFront(StudentNode f)
    {
        front = f;
    }

    /* Precondition: StudentNode
     * Postcondition: back is set equal to the StudentNode passed to the method
     * Activity: Sets the last element of the list (back) equal to the argument passed when the method was called*/
    public void setBack(StudentNode b)
    {
        back = b;
    }
}