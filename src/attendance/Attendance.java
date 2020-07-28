package attendance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Attendance {
    private static int numStudents;
    private static String data[];
    private static String studentNames[];
    private static Student cl[];
    private static StudentLinkedList noCreditList = new StudentLinkedList();
    
    /*Returns int numStudents which is the number of students in the class*/
    public static int getNumStudents() {
        return numStudents;
    }
    
    /*Returns String[] data, the array that holds the data of the file that contains all 
      the classes added to the program*/
    public static String[] getData() {
        return data;
    }
    
    /*Returns String[] studentNames which is the array that holds the names of all the students in the class*/
    public static String[] getStudentNames() {
        return studentNames;
    }
    
    /*Returns Student[] cl, which is the array of Students that holds the data for all the students*/
    public static Student[] getStudents() {
        return cl;
    }
    
    /*Returns noCreditList, the list of all the students who have exceeded 10 or more absences*/
    public static StudentLinkedList getNoCreditList()
    {
        return noCreditList;
    }
    
    /*Checks to see if the student’s name (String studentName) has a space and if it does, a true is 
      returned and if it doesn’t, a false is returned*/
    public static boolean hasSpace(String studentName) {
        for(int i = 0; i < studentName.length(); i++) {
            if(Character.toString(studentName.charAt(i)).equals(" "))
                return true;
        }
        return false;
    }
    
    /*Checks to see if the String specified (String name) only contains letters and if it does, a true is 
      returned and if not a false is returned*/
    public static boolean onlyContainsLetters(String name) {
        char[] nameInChar = name.toCharArray();
        for(int index = 0; index < nameInChar.length; index++) {
            char letter = nameInChar[index];
            if(Character.isLetter(letter) == false)
                return false;
        }
        return true;
    }
    
    /*Initializes the attribute studentNames[] to the size specified (int numStudents)*/
    public static void initializeNamesArray(int numStudents) {
        studentNames = new String[numStudents];
    }
    
    /*Creates a class by calling the Student constructor and passing, the student name (specified in attribute 
      studentNames[]), the period (int period), the class name (String className) for a certain number of times 
      (int numOfStudents)*/
    public static void createClass(int period, String className, int numOfStudents) throws IOException {
        numStudents = numOfStudents;
        cl = new Student[numStudents];
        for(int index = 0; index < numStudents; index++) {
            cl[index] = new Student(studentNames[index], period, className);
        }
        sortClass(cl);
        outputClassesToFile(cl);
        outputClassToFile(cl);
        inputFromFile();
    }
    
    /*Outputs class details including the period, class name, and the number of students to the file 
      that holds all the classes that have been added to the program (“Attendance.txt”)*/
    public static void outputClassesToFile(Student cls[]) throws IOException {
        FileWriter fw = new FileWriter("Attendance.txt", true);
        PrintWriter output = new PrintWriter(fw);
        
        output.println(cls[0].getPeriod() + "\t" + cls[0].getClassName() + "\t" + numStudents);
        output.close();
    }
    
    /*Outputs the class details including the period, class name, and the names of all the students to a 
      file of format “Period className.txt”*/
    public static void outputClassToFile(Student cls[]) throws IOException {
        FileWriter fw = new FileWriter(cls[0].getPeriod() + " " + cls[0].getClassName() + ".txt");
        PrintWriter output = new PrintWriter(fw);
        output.println(cls[0].getPeriod());
        output.println(cls[0].getClassName());
        output.println(numStudents);
        for(int index = 0; index < cls.length; index++) {
            output.println(cls[index].getStudentName());
        }       
        output.close();
    }
    
    /*Scans the file that holds all the classes that have been added to the program (“Attendance.txt”) and 
      stores it in the attribute String data []*/
    public static void inputFromFile() throws FileNotFoundException {
        Scanner file = new Scanner(new File("Attendance.txt"));
        int maxIndx = -1;
        String text[] = new String[100];
        while(file.hasNext()) {
            text[++maxIndx] = file.nextLine();
        } 
        data = new String[maxIndx + 1];
        for(int index = 0; index <= maxIndx; index++)
            data[index] = text[index];
        Arrays.sort(data);
        file.close();
    }
    
    /*Check to see if the file that holds all the classes that have been added to the program (“Attendance.txt”)
      exists and if it does, a true is returned and if it doesn’t, a false is returned*/
    public static boolean fileExists() throws FileNotFoundException {
        File temp = new File("Attendance.txt");
        boolean exists = temp.exists();
        if(exists == true)
            inputFromFile();
        return exists;
    }
    
    /*Traverses through the data array that holds all the classes and adds the classes (all attributes) to the 
      DefaultTableModel */
    public static void addClassesToTable(DefaultTableModel model) {
        model.setRowCount(0);
        for(int index = 0; index < data.length; index++) {
            Scanner clss = new Scanner(data[index]);
            String pd = clss.next();
            String className = "";
            int numOfStudents = 0;
            while(clss.hasNext()) {
                String temp = clss.next();
                try {
                    numOfStudents = Integer.parseInt(temp);
                }
                catch(NumberFormatException e) {
                    className = className + " " + temp;
                }
            }
            model.addRow(new Object[] {
            pd, className, numOfStudents
            });
        }
    }
    
    /*Traverses through the noCreditList linked list and adds all the students in the list to the DefaultTableModel*/
    public static void addStudentsToTable(DefaultTableModel model) {
        model.setRowCount(0);
        StudentNode current = noCreditList.getFront();
        model.addRow(new Object[] {current.getStudentName(), current.getPeriod(), current.getClassName(), 
                current.getNumAbesences()});
        while(current.getNext() != null)
        {
            current = current.getNext();
            model.addRow(new Object[] {current.getStudentName(), current.getPeriod(), current.getClassName(), 
                current.getNumAbesences()});
        }
    }
    
    /*Deletes the file that holds all the classes that have been added to the program (“Attendance.txt”) and if 
      the file successfully deletes, a true is returned and if not, a false is returned*/
    public static boolean deleteFile() {
        File file = new File("Attendance.txt");
        boolean deleted = file.delete();
        return deleted;
    }
    
    /*Traverses through the data array that holds all the classes and the specified class (found using the 
      DefaultTableModel and the selected row) is deleted from the array*/
    public static void deleteClass(DefaultTableModel model, int selectedRow) throws FileNotFoundException, IOException {
        String period = (String)(model.getValueAt(selectedRow, 0));
        String className = (String)(model.getValueAt(selectedRow, 1));
        String fileName = period + className;
        boolean deleted = deleteFile(fileName);
        String extendedFileName = fileName + " Total Absences";
        boolean gone = deleteFile(extendedFileName);
        inputFromFile();
        int rowToDelete = -1;
        for(int i = 0; i < data.length; i++) {
            char pd = data[i].charAt(0);
            String prd = Character.toString(pd);
            if(prd.equals(period)) {
               rowToDelete = i; 
            } 
        }
        FileWriter fw = new FileWriter("Attendance.txt");
        PrintWriter output = new PrintWriter(fw);
        for(int i = 0; i < data.length; i++) {
            if(i != rowToDelete) {
                output.println(data[i]);
            }
        }
        output.close();
    }
    
    /*Traverses through the data array that holds all the classes and the specified class (found using the String clss) 
      is deleted from the array.*/
    public static void deleteClass(String clss) throws FileNotFoundException, IOException {
        Scanner temp = new Scanner(clss);
        temp.next();
        String period = temp.next();
        String className = "";
        while (temp.hasNext()) {
            className = className + " " + temp.next();
        }
        String fileName = period + className;
        boolean deleted = deleteFile(fileName);
        String extendedFileName = fileName + " Total Absences";
        boolean gone = deleteFile(extendedFileName);
        inputFromFile();
        int rowToDelete = -1;
        for(int i = 0; i < data.length; i++) {
            char pd = data[i].charAt(0);
            String prd = Character.toString(pd);
            if(prd.equals(period)) {
               rowToDelete = i; 
            } 
        }
        FileWriter fw = new FileWriter("Attendance.txt");
        PrintWriter output = new PrintWriter(fw);
        for(int i = 0; i < data.length; i++) {
            if(i != rowToDelete) {
                output.println(data[i]);
            }
        }
        output.close();
    }
    
    /*Checks to see if the file that holds all the classes that have been added to the program 
     (“Attendance.txt”) is empty and if it is, a true is returned and if it isn’t, a false is returned */
    public static boolean isFileEmpty() throws FileNotFoundException {
        boolean empty = false;
        Scanner file = new Scanner(new File("Attendance.txt"));
        if(file.hasNext() == false)
            empty = true;
        file.close();
        return empty;
    }
    
    /*Traverses through the data array that holds all the classes and adds the classes (period and class name only) 
      to the DefaultListModel*/
    public static void addElementsToList(DefaultListModel listModel) throws FileNotFoundException { //class names
        inputFromFile();
        for(int index = 0; index < data.length; index++) {
            Scanner sc = new Scanner(data[index]);
            String element = "Period " + sc.next();
            while(sc.hasNext()) {
                String temp = sc.next();
                try {
                    Integer.parseInt(temp);
                }
                catch(NumberFormatException e) {
                    element = element + " " + temp;
                }
            }
            listModel.addElement(element);
        }
    }
    
    /*Scans the file of the class specified (String className) that has already been created for the names of the 
      students in the class and adds the names to the DefaultListModel*/
    public static void addElementsToList(DefaultListModel model, String clss) throws FileNotFoundException { //student names
        Scanner temp = new Scanner(clss);
        temp.next();
        String cls = temp.next();
        while (temp.hasNext()) {
            cls = cls + " " + temp.next();
        }
        Scanner file = new Scanner(new File(cls + ".txt"));
        file.nextLine();
        file.nextLine();
        file.nextLine();
        for(int i = 0; i < cl.length; i++) {
            String element = file.nextLine();
            model.addElement(element);
        }
        file.close();
    }
    
    /*Creates a copy of the array of Students (cl) that has a size one less than the current size of 
      cl. Traverses through cl to find the student that needs to be removed (String student) and all 
      students are added to the copied array except for the student that needs to be removed*/
    public static boolean removeStudent(String student, String clss) throws IOException {
        numStudents -= 1;
        if(numStudents == 0) {
            deleteClass(clss);
            return true;
        }
        else {
            Student copyOfCl[] = new Student[cl.length - 1];
            int indexOfStudent = -1;
            for(int i = 0; i < cl.length; i++) {
                if(student.equals(cl[i].getStudentName()))
                    indexOfStudent = i;
            }
            boolean removed = false;
            for(int i = 0; i < copyOfCl.length; i++) {
                if(indexOfStudent == i)
                    removed = true;
                if(removed == false && indexOfStudent != i)
                    copyOfCl[i] = new Student(cl[i].getStudentName(), cl[i].getPeriod(), cl[i].getClassName());
                if(removed == true)
                    copyOfCl[i] = new Student(cl[i + 1].getStudentName(), cl[i + 1].getPeriod(), cl[i + 1].getClassName());
            }
            deleteFromTotalAbsences(cl[indexOfStudent]);
            sortClass(copyOfCl);
            outputClassToFile(copyOfCl);
            editClassInFile();
        }
        return false;
    }
    
    /*Deletes the passed student from its corresponding total absences file by finding which lines its stored in 
      and outputting the rest again*/
    public static void deleteFromTotalAbsences(Student st) throws IOException
    {
        String fileName = st.getPeriod() + " " + st.getClassName() + " Total Absences.txt";
        Scanner file = new Scanner(new File(fileName));
        String dataToOutput[] = new String[2 * (numStudents)];
        int counter = 0;
        while(file.hasNext())
        {
            String text = file.nextLine();
            if(text.equals(st.getStudentName()))
            {
                file.nextLine();
            }
            else
            {
                dataToOutput[counter] = text;
                counter++;
            }
        }
        file.close();
        FileWriter fw = new FileWriter(fileName, false);
        PrintWriter output = new PrintWriter(fw);
        for(int i = 0; i < dataToOutput.length; i++)
        {
            output.println(dataToOutput[i]);
        }
        output.close();
    }
    
    /*Scans the file that holds all the classes that have been added to the program and checks to see if 
      the period specified (int period) is in the file. If the period is there, a true is returned and if 
      not, a false is returned*/
    public static boolean duplicatePeriod(int period) {
        File file = new File("Attendance.txt");
        if(file.exists() == false)
            return false;
        for(int index = 0; index < data.length; index++) {
            Scanner sc = new Scanner(data[index]);
            int pd = Integer.parseInt(sc.next());
            if(period == pd)
                return true;
        }
        return false;
    }
    
    /*Checks to see if the date specified (String date) is a date and if it is, a true is returned and if not, 
      a false is returned*/
    public static boolean isDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
        try {
            Date dte = sdf.parse(date);
            
        } catch(ParseException e) {
            return false;
        }
        return true;
    }
    
    /*Scans the file of the class specified (String clss) and initializes all the data into the array of 
      Students (cl)*/
    public static void selectClass(String clss) throws FileNotFoundException, IOException {
        Scanner temp = new Scanner(clss);
        temp.next();
        String cls = temp.next();
        while (temp.hasNext()) {
            cls = cls + " " + temp.next();
        }
        Scanner file = new Scanner(new File(cls + ".txt"));
        int pd;
        String className;
        int numOfStudents;
        pd = Integer.parseInt(file.next());
        file.nextLine();
        className = file.nextLine();
        numOfStudents = Integer.parseInt(file.next());
        file.nextLine();
        numStudents = numOfStudents;
        String namesOfStudents[] = new String[numOfStudents];
        for(int i = 0; i < numOfStudents; i++) {
            namesOfStudents[i] = file.nextLine();
        }
        
        int numberOfAbsences[] = new int[numOfStudents];
        initializeClass(pd, className, numOfStudents, namesOfStudents, numberOfAbsences);
        
        File tmp = new File(cls + " Total Absences.txt");
        boolean exists = tmp.exists();
        if(exists == false)
        {
            outputTotalAbsencesToFile();
        }
        Scanner file2 = new Scanner(new File(cls + " Total Absences.txt")); 
        
        for(int i = 0; i < numOfStudents; i++)
        {
            file2.nextLine();
            numberOfAbsences[i] = file2.nextInt();
            file2.nextLine();
        }
        initializeClass(pd, className, numOfStudents, namesOfStudents, numberOfAbsences);
        file.close();
        file2.close();
    }
    
    /*Initializes the class to the program by calling the Student constructor and passing, the student name 
      (specified in namesOfStudents[]), the period (int period), the class name (String className) for a certain 
      number of times (int numOfStudents)*/
    public static void initializeClass(int period, String className, int numOfStudents, String namesOfStudents[],
                                                                                          int numberOfAbsences[]) {
        numStudents = numOfStudents;
        studentNames = namesOfStudents;
        cl = new Student[numStudents];
        for(int index = 0; index < numStudents; index++) {
            cl[index] = new Student(studentNames[index], period, className);
            cl[index].setTotalAbsences(numberOfAbsences[index]);
        }
        sortClass(cl);
    }
    
    /*Outputs the attendance with the names of all the students of the class initialized in the program to 
      its file in addition to the date (String date) attendance was taken for*/
    public static void outputAttendanceToFile(String date) throws IOException {
        FileWriter fw = new FileWriter(cl[0].getPeriod() + " " + cl[0].getClassName() + ".txt", true);
        PrintWriter output = new PrintWriter(fw);
        output.println("");
        output.println(date);
        for(int i = 0; i < numStudents; i++) {
            output.println(cl[i].getStudentName());
            output.println(cl[i].getAttendance());
        }
        output.close();
    }
    
    /*Outputs the name and total absences of each student in the class currently stored in the array of 
      Students (cl) to a file*/
    public static void outputTotalAbsencesToFile() throws IOException {
        FileWriter fw = new FileWriter(cl[0].getPeriod() + " " + cl[0].getClassName() + " Total Absences.txt", false);
        PrintWriter output = new PrintWriter(fw);
        for(int i = 0; i < numStudents; i++) {
            output.println(cl[i].getStudentName());
            output.println(cl[i].getTotalAbsences());
        }
        output.close();
    }
    
    /*Outputs the name and total absences of each student in the Student array cls to a file*/
    public static void outputTotalAbsencesToFile(Student cls[]) throws IOException {
        FileWriter fw = new FileWriter(cls[0].getPeriod() + " " + cls[0].getClassName() + " Total Absences.txt", false);
        PrintWriter output = new PrintWriter(fw);
        for(int i = 0; i < numStudents; i++) {
            output.println(cls[i].getStudentName());
            output.println(cls[i].getTotalAbsences());
        }
        output.close();
    }
    
    /*Checks if each student stored in the array of Students (cl) has 10 or more absences. If it does, the 
      student is enqueued to the list*/
    public static void updateNoCreditList()
    {
        for(int i = 0; i < cl.length; i++)
        {
            if(cl[i].getTotalAbsences() >= 10)
            {
                if(checkLinkedList(cl[i]) == false)
                    noCreditList.enqueue(cl[i]);
                else
                    updateNumAbsInList(cl[i]);
            }
        }
    }
    
    /*Updates the number of absences of each student stored in the noCreditList linked list*/
    public static void updateNumAbsInList(Student st)
    {
        StudentNode current = noCreditList.getFront();
        if(current.getStudentName().equals(st.getStudentName()))
            current.setNumAbsences(st.getTotalAbsences());
        else
        {
            while(current.getNext() != null)
            {
                if(current.getStudentName().equals(st.getStudentName()))
                current.setNumAbsences(st.getTotalAbsences());
            }
        }
    }
    
    /*Traverses through the noCreditList linked list and checks if the student passed to method is already in the 
      list. If it is the method returns true, if it isn’t the method returns false*/
    public static boolean checkLinkedList(Student st)
    {
        if(noCreditList.isEmpty())
            return false;
        StudentNode current = noCreditList.getFront();
        if(current.getNext() == null)
        {
            if(current.getStudentName().equals(st.getStudentName()) && current.getClassName().equals(st.getClassName()))
                return true;
            else
                return false;
        }
        while(current.getNext() != null)
        {
            if(current.getStudentName().equals(st.getStudentName()) && current.getClassName().equals(st.getClassName()))
                return true;
            current = current.getNext();
        }
        return false;
    }
    
    /*Adds the students in the array of Students (cl) to the DefaultTableModel*/
    public static void displayAttendance(DefaultTableModel model) {
        for(int i = 0; i < numStudents; i++){
            model.addRow(new Object[] {
            cl[i].getStudentName(), cl[i].getAttendance()
            });
        }
    }
    
    /*Checks if attendance has been taken for the class (String clss) and date (String date) specified by scanning 
      the file that has already been created for the date and returns true if date is found and false if date it not*/
    public static boolean attendanceTaken(String clss, String date) throws FileNotFoundException {
        boolean attendanceTaken = false;
        Scanner temp = new Scanner(clss);
        temp.next();
        String cls = temp.next();
        while (temp.hasNext()) {
            cls = cls + " " + temp.next();
        }
        Scanner file = new Scanner(new File(cls + ".txt"));
        while (file.hasNext()) {
            String test = file.next();
            if(test.equals(date))
                attendanceTaken = true;
        }
        file.close();
        return attendanceTaken;
    }
    
    /*Scans the file of the class specified (String clss) for the attendance on the date specified (String date) 
      and initializes it into the array of Students (cl)*/
    public static void setAttendance(String clss, String date) throws FileNotFoundException {
        Scanner temp = new Scanner(clss);
        temp.next();
        String cls = temp.next();
        while (temp.hasNext()) {
            cls = cls + " " + temp.next();
        }
        Scanner file = new Scanner(new File(cls + ".txt"));
        while (file.hasNext()) {
            String test = file.next();
            if(test.equals(date))
                break;
        }
        file.nextLine();
        for(int i = 0; i < numStudents; i++) {
            file.nextLine();
            String attendance = file.nextLine();
            cl[i].setAttendance(attendance);
        }   
        file.close();
    }
    
    /*Traverses through the data array that holds all the classes, scans each index for the period and class name 
      required for the class files that are going to be deleted (files are in format “Period ClassName.txt”) , and 
      deletes all the files*/
    public static void deleteAllClassFiles() throws FileNotFoundException {
        for(int i = 0; i < data.length; i++) {
            Scanner sc = new Scanner(data[i]);
            String fileName = sc.next();
            while(sc.hasNext()) {
                String temp = sc.next();
                try {
                    Integer.parseInt(temp);
                }
                catch(NumberFormatException e) {
                    fileName = fileName + " " + temp;
                }
            }
            boolean deleted = deleteFile(fileName);
            String extendedFileName = fileName + " Total Absences";
            boolean gone = deleteFile(extendedFileName);
        }
    }
    
    /*Deletes the file with the file name specified(String filename) and if the file successfully deletes, 
      a true is returned and if not, a false is returned*/
    public static boolean deleteFile(String fileName) {
        File file = new File(fileName + ".txt");
        boolean deleted = file.delete();
        return deleted;
    }
    
   /*Creates a copy of the class (array of Students) with the new size being the old size plus the number of 
     students the user wants to add (int numOfStudents) and calls the Student constructor to add the new students*/
    public static void addStudents(int numOfStudents) throws IOException {
        numStudents = numOfStudents + cl.length;
        Student copyOfCl[] = Arrays.copyOf(cl, (cl.length + numOfStudents));
        for(int i = cl.length, n = 0; i < copyOfCl.length; i++, n++) {
            copyOfCl[i] = new Student(studentNames[n], cl[0].getPeriod(), cl[0].getClassName());
        }
        sortClass(copyOfCl);
        outputClassToFile(copyOfCl);
        outputTotalAbsencesToFile(copyOfCl);
        editClassInFile();
    }
    
    /*Changes class information in the file that holds all the classes that have been added to the 
      program (“Attendance.txt”)  by removing the old class information and outputting the updated 
      class information   */
    public static void editClassInFile() throws FileNotFoundException, IOException {
        inputFromFile();
        int rowToEdit = -1;
        for(int i = 0; i < data.length; i++) {
            char pd = data[i].charAt(0);
            int prd = Integer.parseInt(Character.toString(pd));
            if(prd == cl[0].getPeriod()) {
               rowToEdit = i; 
            } 
        }
        FileWriter fw = new FileWriter("Attendance.txt");
        PrintWriter output = new PrintWriter(fw);
        for(int i = 0; i < data.length; i++) {
            if(i != rowToEdit) {
                output.println(data[i]);
            }
        }
        output.println(cl[0].getPeriod() + "\t" + cl[0].getClassName() + "\t" + numStudents);
        output.close();
    }
    
    /*Sorts the array of Students that is passed when the method is called */
    public static void sortClass(Student cls[]) {
        Comparator<Student> StudentComparator = new Comparator<Student>() {
            public int compare(Student student1, Student student2) {
                String student1FullName = student1.getStudentName();
                String student2FullName = student2.getStudentName();
                String student1LastName = getStudentLastName(student1FullName);
                String student2LastName = getStudentLastName(student2FullName);
                return student1LastName.compareTo(student2LastName);
            }
        };
        Arrays.sort(cls, StudentComparator);
    }
    
    /*Removes the first name from the student’s name (String studentName) and returns the updated name*/
    public static String getStudentLastName(String studentName) {
        int spaceIndex = 0;
        for(int i = 0; i < studentName.length(); i++) {
            if(Character.toString(studentName.charAt(i)).equals(" "))
                spaceIndex = i;
        }
        String studentLastName = studentName.substring(spaceIndex + 1);
        return studentLastName;
    }
}