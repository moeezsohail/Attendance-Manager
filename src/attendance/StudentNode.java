package attendance;

public class StudentNode {
    private int period;
    private String studentName;
    private String className;
    private int numAbsences;
    private StudentNode next;
    
    /* Precondition: Student
     * Postcondition: a new StudentNode object is created
     * Activity: Constructor, creates a new StudentNode object using the attributes of the Student object 
      passed when the constructor is called.*/
    public StudentNode(Student st) {
      period = st.getPeriod();
      studentName = st.getStudentName();
      className = st.getClassName();
      numAbsences = st.getTotalAbsences();
      next = null;
    }
    
    /* Precondition: none
     * Postcondition: StudentNode's next is returned
     * Activity: Returns a pointer to the StudentNode’s next node*/
    public StudentNode getNext() {
      return(next);
    }
    
    /* Precondition: StudentNode
     * Postcondition: The StudentNode's next is set equal to the StudentNode passed to the method
     * Activity: Sets the next pointer of StudentNode objects to the argument passed when called*/
    public void setNext(StudentNode newNode) {
      next = newNode;
    }
    
    /* Precondition: none
     * Postcondition: the period of the StudentNode object is returned
     * Activity: Returns the period of StudentNode objects*/
    public int getPeriod() {
        return period;
    }
    
    /* Precondition: none
     * Postcondition: the class name of the StudentNode object is returned
     * Activity: Returns the class name of StudentNode objects*/
    public String getClassName() {
        return className;
    }
          
    /* Precondition: none
     * Postcondition: the number of absences of the StudentNode object is returned
     * Activity: Returns the total absences of StudentNode objects*/
    public int getNumAbesences() {
        return numAbsences;
    }
    
    /* Precondition: none
     * Postcondition: the student name of the StudentNode object is returned
     * Activity: Returns the student name of StudentNode objects*/
    public String getStudentName() {
        return studentName;
    }
    
    /* Precondition: int
     * Postcondition: the number of absences of the StudentNode is set equal to the int passed to the method
     * Activity: Sets the total absences of StudentNode objects to the argument passed when called*/
    public void setNumAbsences(int numAbs)
    {
        numAbsences = numAbs;
    }
}
