package attendance;

public class Student {
    private int period;
    private String studentName;
    private String className;
    private String attendance = "Present";
    private int totalAbsences = 0;
    
    /* Precondition: 2 Strings representing the student and class name, an int representing the period
     * Postcondition: a new Student object is created
     * Activity: Constructor, creates a new Student object with the arguments passed when the constructor 
      is called. Since attendance is not passed, the attendance attribute is defaulted to “Present”*/
    public Student(String sn, int pd, String cn) {
        studentName = sn;
	period = pd;
        className = cn;
    }
    
    /* Precondition: none
     * Postcondition: the period of the Student object is returned
     * Activity: Returns the period of Student objects*/
    public int getPeriod() {
        return period;
    }
    
    /* Precondition: none
     * Postcondition: the class name of the Student object is returned
     * Activity: Returns the class name of Student objects*/
    public String getClassName() {
        return className;
    }
       
    /* Precondition: none
     * Postcondition: the attendance of the Student object is returned
     * Activity: Returns the attendance of Student objects*/
    public String getAttendance() {
        return attendance;
    }
    
    /* Precondition: none
     * Postcondition: the student name of the Student object is returned
     * Activity: Returns the student name of Student objects*/
    public String getStudentName() {
        return studentName;
    }
    
    /* Precondition: none
     * Postcondition: the total absences of the Student object is returned
     * Activity: Returns the total absences of Student objects*/
    public int getTotalAbsences() {
        return totalAbsences;
    }
    
    /* Precondition: none
     * Postcondition: the student name of the Student is set to the String passed
     * Activity: Sets the student name of Student objects to the argument passed when called*/
    public void setStudentName(String sn) {
        studentName = sn;
    }
    
    /* Precondition: none
     * Postcondition: the period of the Student object is set to the int passed
     * Activity: Sets the period of Student objects to the argument passed when called*/
    public void setPeriod(int pd) {
        period = pd;
    }
    
    /* Precondition: none
     * Postcondition: the c;ass name of the Student object is set to the String passed
     * Activity: Sets the class name of Student objects to the argument passed when called*/
    public void setClassName(String cn) {
        className = cn;
    }
    
    /* Precondition: none
     * Postcondition: the attendance of the Student object is set to the String passed
     * Activity: Sets the attendance of Student objects to the argument passed when called*/
    public void setAttendance(String at) {
        attendance = at;
    }   
    
    /* Precondition: none
     * Postcondition: the total absences of the Student object is set to the int passed
     * Activity: Sets the total absences of Student objects to the argument passed when called*/
    public void setTotalAbsences(int numAbs) {
        totalAbsences = numAbs;
    }   
    
    /* Precondition: none
     * Postcondition: the attendance of the Student object is updated if needed
     * Activity: If the Student object’s attendance is unverified absence or excused absence, its total absences 
       is incremented by 1*/
    public void updateTotalAbsences() {
        if(attendance.equals("Unverified Absence") || attendance.equals("Excused Absence"))
            totalAbsences++;
    }
}