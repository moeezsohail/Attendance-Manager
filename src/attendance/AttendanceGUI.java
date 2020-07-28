package attendance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AttendanceGUI extends javax.swing.JFrame {

    public AttendanceGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        createClass = new javax.swing.JButton();
        viewClasses = new javax.swing.JButton();
        editAttendance = new javax.swing.JButton();
        attendanceLabel = new javax.swing.JLabel();
        viewAttendance = new javax.swing.JButton();
        removeStudentsButton = new javax.swing.JButton();
        addStudentsButton = new javax.swing.JButton();
        noCreditListButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        createClassPanel = new javax.swing.JPanel();
        classPeriodLabel = new javax.swing.JLabel();
        classPeriodTextField = new javax.swing.JTextField();
        classNameLabel = new javax.swing.JLabel();
        classNameTextField = new javax.swing.JTextField();
        numStudentsLabel = new javax.swing.JLabel();
        numStudentsTextField = new javax.swing.JTextField();
        classCreate = new javax.swing.JButton();
        createAClassLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        studentNamesPanel = new javax.swing.JPanel();
        studentNameLabel = new javax.swing.JLabel();
        studentNameTextField = new javax.swing.JTextField();
        addStudent = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        studentNamesTextArea = new javax.swing.JTextArea();
        studentsLabel = new javax.swing.JLabel();
        addStudentsLabel = new javax.swing.JLabel();
        viewClassesPanel = new javax.swing.JPanel();
        returnButton1 = new javax.swing.JButton();
        classesLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        classesTable = new javax.swing.JTable();
        resetButton = new javax.swing.JButton();
        chooseClassEditPanel = new javax.swing.JPanel();
        chooseClassLabel = new javax.swing.JLabel();
        returnButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        classList = new javax.swing.JList<>();
        classPrompt = new javax.swing.JLabel();
        datePrompt = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        editAttendancePanel = new javax.swing.JPanel();
        attendanceLbl = new javax.swing.JLabel();
        returnButton5 = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentTextArea = new javax.swing.JTextArea();
        attendanceComboBox = new javax.swing.JComboBox<>();
        editAttendanceLabel = new javax.swing.JLabel();
        chooseClassViewPanel = new javax.swing.JPanel();
        chooseClssLabel = new javax.swing.JLabel();
        clssPrompt = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        clssList = new javax.swing.JList<>();
        datePrompt1 = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        returnButton3 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        viewAttendancePanel = new javax.swing.JPanel();
        viewAttendanceLabel = new javax.swing.JLabel();
        returnButton4 = new javax.swing.JButton();
        classLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        chooseClassAddStudentsPanel = new javax.swing.JPanel();
        addStudentsLbl = new javax.swing.JLabel();
        chooseClassPrompt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        classesjList = new javax.swing.JList<>();
        numStudentsPrompt = new javax.swing.JLabel();
        returnButton6 = new javax.swing.JButton();
        nxtButton = new javax.swing.JButton();
        numOfStudentsTextField = new javax.swing.JTextField();
        addStudentsPanel = new javax.swing.JPanel();
        addStudentsjLabel = new javax.swing.JLabel();
        addStudentButton = new javax.swing.JButton();
        studentNameTxtField = new javax.swing.JTextField();
        studentNameLbl = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        studentNamesTxtArea = new javax.swing.JTextArea();
        studentsLbl = new javax.swing.JLabel();
        chooseClassRemoveStudentsPanel = new javax.swing.JPanel();
        removeStudentsLabel = new javax.swing.JLabel();
        removePrompt = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        classesList = new javax.swing.JList<>();
        returnButton7 = new javax.swing.JButton();
        nextjButton = new javax.swing.JButton();
        removeStudentsPanel = new javax.swing.JPanel();
        removeStudentsLbl = new javax.swing.JLabel();
        studentsRemovePrompt = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        studentsList = new javax.swing.JList<>();
        returnButton8 = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        noCreditListPanel = new javax.swing.JPanel();
        noCreditListLabel = new javax.swing.JLabel();
        noCreditPrompt = new javax.swing.JLabel();
        noCreditPrompt2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        noCreditTable = new javax.swing.JTable();
        dequeueButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendance");
        setResizable(false);

        mainPanel.setLayout(new java.awt.CardLayout());

        menuPanel.setLayout(null);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menuPanel.add(exit);
        exit.setBounds(350, 240, 152, 51);

        createClass.setText("Create Class");
        createClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClassActionPerformed(evt);
            }
        });
        menuPanel.add(createClass);
        createClass.setBounds(10, 80, 157, 60);

        viewClasses.setText("View Classes");
        viewClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClassesActionPerformed(evt);
            }
        });
        menuPanel.add(viewClasses);
        viewClasses.setBounds(10, 160, 157, 60);

        editAttendance.setText("Edit Attendance");
        editAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAttendanceActionPerformed(evt);
            }
        });
        menuPanel.add(editAttendance);
        editAttendance.setBounds(180, 80, 152, 60);

        attendanceLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        attendanceLabel.setText(" Attendance ");
        menuPanel.add(attendanceLabel);
        attendanceLabel.setBounds(150, -20, 214, 120);

        viewAttendance.setText("View Attendance");
        viewAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAttendanceActionPerformed(evt);
            }
        });
        menuPanel.add(viewAttendance);
        viewAttendance.setBounds(180, 160, 152, 60);

        removeStudentsButton.setText("Remove Students");
        removeStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentsButtonActionPerformed(evt);
            }
        });
        menuPanel.add(removeStudentsButton);
        removeStudentsButton.setBounds(350, 160, 152, 60);

        addStudentsButton.setText("Add Students");
        addStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentsButtonActionPerformed(evt);
            }
        });
        menuPanel.add(addStudentsButton);
        addStudentsButton.setBounds(350, 80, 152, 60);

        noCreditListButton.setText("No Credit List");
        noCreditListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noCreditListButtonActionPerformed(evt);
            }
        });
        menuPanel.add(noCreditListButton);
        noCreditListButton.setBounds(180, 240, 150, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendance/desk-601543__340.jpg"))); // NOI18N
        menuPanel.add(background);
        background.setBounds(0, 0, 519, 309);

        mainPanel.add(menuPanel, "card2");

        createClassPanel.setBackground(new java.awt.Color(255, 220, 166));

        classPeriodLabel.setText("Class Period:");

        classPeriodTextField.setText("Enter Period");

        classNameLabel.setText("Class Name:");

        classNameTextField.setText("Enter Name");
        classNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classNameTextFieldActionPerformed(evt);
            }
        });

        numStudentsLabel.setText("Number of Students:");

        numStudentsTextField.setText("Enter Number Of Students");
        numStudentsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numStudentsTextFieldActionPerformed(evt);
            }
        });

        classCreate.setText("Create Class");
        classCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classCreateActionPerformed(evt);
            }
        });

        createAClassLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        createAClassLabel.setText("Create A Class");

        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createClassPanelLayout = new javax.swing.GroupLayout(createClassPanel);
        createClassPanel.setLayout(createClassPanelLayout);
        createClassPanelLayout.setHorizontalGroup(
            createClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createClassPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(createClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createClassPanelLayout.createSequentialGroup()
                        .addComponent(createAClassLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(createClassPanelLayout.createSequentialGroup()
                        .addGroup(createClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classPeriodLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numStudentsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(createClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(numStudentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(createClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(classNameTextField)
                                    .addComponent(classPeriodTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))
                            .addComponent(classCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        createClassPanelLayout.setVerticalGroup(
            createClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createClassPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createAClassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classPeriodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classPeriodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(createClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classNameLabel)
                    .addComponent(classNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(createClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numStudentsLabel)
                    .addComponent(numStudentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(createClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        mainPanel.add(createClassPanel, "card3");

        studentNamesPanel.setBackground(new java.awt.Color(255, 220, 166));

        studentNameLabel.setText("Student Name:");

        studentNameTextField.setText("Enter Student Name");
        studentNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameTextFieldActionPerformed(evt);
            }
        });

        addStudent.setText("Add Student");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        studentNamesTextArea.setEditable(false);
        studentNamesTextArea.setColumns(20);
        studentNamesTextArea.setRows(5);
        jScrollPane10.setViewportView(studentNamesTextArea);

        studentsLabel.setText("Students:");

        addStudentsLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        addStudentsLabel.setText("Add Students");

        javax.swing.GroupLayout studentNamesPanelLayout = new javax.swing.GroupLayout(studentNamesPanel);
        studentNamesPanel.setLayout(studentNamesPanelLayout);
        studentNamesPanelLayout.setHorizontalGroup(
            studentNamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentNamesPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(studentNamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentNamesPanelLayout.createSequentialGroup()
                        .addComponent(addStudentsLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(studentNamesPanelLayout.createSequentialGroup()
                        .addGroup(studentNamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(studentNamesPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, studentNamesPanelLayout.createSequentialGroup()
                                .addComponent(studentsLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, studentNamesPanelLayout.createSequentialGroup()
                                .addComponent(studentNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        studentNamesPanelLayout.setVerticalGroup(
            studentNamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentNamesPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(addStudentsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentNamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        mainPanel.add(studentNamesPanel, "card4");

        viewClassesPanel.setBackground(new java.awt.Color(255, 220, 166));

        returnButton1.setText("Return");
        returnButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton1ActionPerformed(evt);
            }
        });

        classesLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        classesLabel.setText("Classes");

        deleteButton.setText("Delete Class");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        classesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"No Classes", null, null}
            },
            new String [] {
                "Period", "Class Name", "Number Of Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(classesTable);

        resetButton.setText("Reset Classes");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewClassesPanelLayout = new javax.swing.GroupLayout(viewClassesPanel);
        viewClassesPanel.setLayout(viewClassesPanelLayout);
        viewClassesPanelLayout.setHorizontalGroup(
            viewClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewClassesPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(viewClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewClassesPanelLayout.createSequentialGroup()
                        .addComponent(classesLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewClassesPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewClassesPanelLayout.createSequentialGroup()
                        .addComponent(returnButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(resetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        viewClassesPanelLayout.setVerticalGroup(
            viewClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewClassesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(returnButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        mainPanel.add(viewClassesPanel, "card5");

        chooseClassEditPanel.setBackground(new java.awt.Color(255, 220, 166));

        chooseClassLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        chooseClassLabel.setText("Choose Class");

        returnButton2.setText("Return");
        returnButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton2ActionPerformed(evt);
            }
        });

        classList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(classList);

        classPrompt.setText("Please choose which class you would like to edit the attendance for:");

        datePrompt.setText("Please enter the date you would like to take attendance for in MM//DD/YYYY format:");

        dateLabel.setText("Date:");

        dateTextField.setText("Enter Date");
        dateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextFieldActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chooseClassEditPanelLayout = new javax.swing.GroupLayout(chooseClassEditPanel);
        chooseClassEditPanel.setLayout(chooseClassEditPanelLayout);
        chooseClassEditPanelLayout.setHorizontalGroup(
            chooseClassEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseClassEditPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(chooseClassEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(chooseClassEditPanelLayout.createSequentialGroup()
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTextField))
                    .addGroup(chooseClassEditPanelLayout.createSequentialGroup()
                        .addGroup(chooseClassEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datePrompt)
                            .addComponent(classPrompt))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(chooseClassEditPanelLayout.createSequentialGroup()
                        .addGroup(chooseClassEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseClassLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        chooseClassEditPanelLayout.setVerticalGroup(
            chooseClassEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseClassEditPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(chooseClassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classPrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datePrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chooseClassEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(chooseClassEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        mainPanel.add(chooseClassEditPanel, "card6");

        editAttendancePanel.setBackground(new java.awt.Color(255, 220, 166));

        attendanceLbl.setText("Please enter attendance for the following student:");

        returnButton5.setText("Return");
        returnButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton5ActionPerformed(evt);
            }
        });

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        studentTextArea.setEditable(false);
        studentTextArea.setColumns(20);
        studentTextArea.setRows(5);
        jScrollPane3.setViewportView(studentTextArea);

        attendanceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Unverified Absence", "Excused Absence", "Unexcused Tardy", "Excused Tardy" }));

        editAttendanceLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        editAttendanceLabel.setText("Edit Attendance");

        javax.swing.GroupLayout editAttendancePanelLayout = new javax.swing.GroupLayout(editAttendancePanel);
        editAttendancePanel.setLayout(editAttendancePanelLayout);
        editAttendancePanelLayout.setHorizontalGroup(
            editAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editAttendancePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(editAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editAttendancePanelLayout.createSequentialGroup()
                        .addComponent(attendanceLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editAttendancePanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(returnButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(editAttendancePanelLayout.createSequentialGroup()
                        .addGroup(editAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editAttendanceLabel)
                            .addGroup(editAttendancePanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(attendanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(56, Short.MAX_VALUE))))
        );
        editAttendancePanelLayout.setVerticalGroup(
            editAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editAttendancePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(editAttendanceLabel)
                .addGap(18, 18, 18)
                .addComponent(attendanceLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(editAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editAttendancePanelLayout.createSequentialGroup()
                        .addComponent(attendanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editAttendancePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(editAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        mainPanel.add(editAttendancePanel, "card9");

        chooseClassViewPanel.setBackground(new java.awt.Color(255, 220, 166));

        chooseClssLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        chooseClssLabel.setText("Choose Class");

        clssPrompt.setText("Please choose which class you would like to view the attendance for:");

        clssList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(clssList);

        datePrompt1.setText("Please enter the date you would like to view attendance for:");

        dateLbl.setText("Date:");

        dateTF.setText("Enter Date");
        dateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTFActionPerformed(evt);
            }
        });

        returnButton3.setText("Return");
        returnButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton3ActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chooseClassViewPanelLayout = new javax.swing.GroupLayout(chooseClassViewPanel);
        chooseClassViewPanel.setLayout(chooseClassViewPanelLayout);
        chooseClassViewPanelLayout.setHorizontalGroup(
            chooseClassViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chooseClassViewPanelLayout.createSequentialGroup()
                .addGroup(chooseClassViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chooseClassViewPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(chooseClassViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(chooseClassViewPanelLayout.createSequentialGroup()
                                .addGroup(chooseClassViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chooseClssLabel)
                                    .addComponent(datePrompt1)
                                    .addComponent(clssPrompt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chooseClassViewPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(chooseClassViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chooseClassViewPanelLayout.createSequentialGroup()
                                .addComponent(dateLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateTF))
                            .addGroup(chooseClassViewPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(returnButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(16, 16, 16))
        );
        chooseClassViewPanelLayout.setVerticalGroup(
            chooseClassViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseClassViewPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(chooseClssLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clssPrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datePrompt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chooseClassViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLbl)
                    .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chooseClassViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        mainPanel.add(chooseClassViewPanel, "card8");

        viewAttendancePanel.setBackground(new java.awt.Color(255, 220, 166));

        viewAttendanceLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        viewAttendanceLabel.setText("View Attendance");

        returnButton4.setText("Return");
        returnButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton4ActionPerformed(evt);
            }
        });

        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Student Attendance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(attendanceTable);

        javax.swing.GroupLayout viewAttendancePanelLayout = new javax.swing.GroupLayout(viewAttendancePanel);
        viewAttendancePanel.setLayout(viewAttendancePanelLayout);
        viewAttendancePanelLayout.setHorizontalGroup(
            viewAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAttendancePanelLayout.createSequentialGroup()
                .addGroup(viewAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewAttendancePanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(viewAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewAttendanceLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewAttendancePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(viewAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        viewAttendancePanelLayout.setVerticalGroup(
            viewAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAttendancePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(viewAttendanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        mainPanel.add(viewAttendancePanel, "card9");

        chooseClassAddStudentsPanel.setBackground(new java.awt.Color(255, 220, 166));

        addStudentsLbl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        addStudentsLbl.setText("Add Students");

        chooseClassPrompt.setText("Please choose which class you would like to add students to:");

        jScrollPane1.setViewportView(classesjList);

        numStudentsPrompt.setText("Please enter the number of students you would like to add:");

        returnButton6.setText("Return");
        returnButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton6ActionPerformed(evt);
            }
        });

        nxtButton.setText("Next");
        nxtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtButtonActionPerformed(evt);
            }
        });

        numOfStudentsTextField.setText("Enter Number of Students");
        numOfStudentsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfStudentsTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chooseClassAddStudentsPanelLayout = new javax.swing.GroupLayout(chooseClassAddStudentsPanel);
        chooseClassAddStudentsPanel.setLayout(chooseClassAddStudentsPanelLayout);
        chooseClassAddStudentsPanelLayout.setHorizontalGroup(
            chooseClassAddStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseClassAddStudentsPanelLayout.createSequentialGroup()
                .addGroup(chooseClassAddStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(chooseClassAddStudentsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chooseClassAddStudentsPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(chooseClassAddStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chooseClassAddStudentsPanelLayout.createSequentialGroup()
                                .addComponent(numStudentsPrompt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numOfStudentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addStudentsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseClassPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(chooseClassAddStudentsPanelLayout.createSequentialGroup()
                                .addComponent(returnButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nxtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        chooseClassAddStudentsPanelLayout.setVerticalGroup(
            chooseClassAddStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseClassAddStudentsPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(addStudentsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chooseClassPrompt)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(chooseClassAddStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numStudentsPrompt)
                    .addComponent(numOfStudentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(chooseClassAddStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nxtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        mainPanel.add(chooseClassAddStudentsPanel, "card10");

        addStudentsPanel.setBackground(new java.awt.Color(255, 220, 166));

        addStudentsjLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        addStudentsjLabel.setText("Add Students");

        addStudentButton.setText("Add Student");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        studentNameTxtField.setText("Enter Student Name");
        studentNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameTxtFieldActionPerformed(evt);
            }
        });

        studentNameLbl.setText("Student Name:");

        studentNamesTxtArea.setEditable(false);
        studentNamesTxtArea.setColumns(20);
        studentNamesTxtArea.setRows(5);
        studentNamesTxtArea.setToolTipText("");
        jScrollPane9.setViewportView(studentNamesTxtArea);

        studentsLbl.setText("Students:");

        javax.swing.GroupLayout addStudentsPanelLayout = new javax.swing.GroupLayout(addStudentsPanel);
        addStudentsPanel.setLayout(addStudentsPanelLayout);
        addStudentsPanelLayout.setHorizontalGroup(
            addStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStudentsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(addStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStudentsPanelLayout.createSequentialGroup()
                        .addGroup(addStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addStudentsPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(addStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(addStudentsPanelLayout.createSequentialGroup()
                                        .addComponent(studentNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(studentNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15))
                    .addGroup(addStudentsPanelLayout.createSequentialGroup()
                        .addGroup(addStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentsLbl)
                            .addComponent(addStudentsjLabel))
                        .addContainerGap(347, Short.MAX_VALUE))))
        );
        addStudentsPanelLayout.setVerticalGroup(
            addStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStudentsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addStudentsjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(addStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        mainPanel.add(addStudentsPanel, "card12");

        chooseClassRemoveStudentsPanel.setBackground(new java.awt.Color(255, 220, 166));

        removeStudentsLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        removeStudentsLabel.setText("Remove Students");

        removePrompt.setText("Please choose which class you would like to remove students from:");

        jScrollPane5.setViewportView(classesList);

        returnButton7.setText("Return");
        returnButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton7ActionPerformed(evt);
            }
        });

        nextjButton.setText("Next");
        nextjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chooseClassRemoveStudentsPanelLayout = new javax.swing.GroupLayout(chooseClassRemoveStudentsPanel);
        chooseClassRemoveStudentsPanel.setLayout(chooseClassRemoveStudentsPanelLayout);
        chooseClassRemoveStudentsPanelLayout.setHorizontalGroup(
            chooseClassRemoveStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseClassRemoveStudentsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(chooseClassRemoveStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removePrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeStudentsLabel)
                    .addGroup(chooseClassRemoveStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(chooseClassRemoveStudentsPanelLayout.createSequentialGroup()
                            .addComponent(returnButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        chooseClassRemoveStudentsPanelLayout.setVerticalGroup(
            chooseClassRemoveStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseClassRemoveStudentsPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(removeStudentsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removePrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chooseClassRemoveStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        mainPanel.add(chooseClassRemoveStudentsPanel, "card13");

        removeStudentsPanel.setBackground(new java.awt.Color(255, 220, 166));

        removeStudentsLbl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        removeStudentsLbl.setText("Remove Students");

        studentsRemovePrompt.setText("Please select which student you would like to remove:");

        jScrollPane8.setViewportView(studentsList);

        returnButton8.setText("Return");
        returnButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton8ActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeStudentsPanelLayout = new javax.swing.GroupLayout(removeStudentsPanel);
        removeStudentsPanel.setLayout(removeStudentsPanelLayout);
        removeStudentsPanelLayout.setHorizontalGroup(
            removeStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeStudentsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(removeStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentsRemovePrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeStudentsLbl)
                    .addGroup(removeStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(removeStudentsPanelLayout.createSequentialGroup()
                            .addComponent(returnButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        removeStudentsPanelLayout.setVerticalGroup(
            removeStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeStudentsPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(removeStudentsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentsRemovePrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(removeStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        mainPanel.add(removeStudentsPanel, "card11");

        noCreditListPanel.setBackground(new java.awt.Color(255, 220, 166));

        noCreditListLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        noCreditListLabel.setText("No Credit Status List");

        noCreditPrompt.setText("The following students have 10 or more absences and have been put on the no credit");

        noCreditPrompt2.setText("status list.");

        backButton.setText("Return");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        noCreditTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"No Students", null, null, null}
            },
            new String [] {
                "Student Name", "Student Period", "Student Class", "Days Missed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(noCreditTable);

        dequeueButton.setText("Dequeue");
        dequeueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dequeueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout noCreditListPanelLayout = new javax.swing.GroupLayout(noCreditListPanel);
        noCreditListPanel.setLayout(noCreditListPanelLayout);
        noCreditListPanelLayout.setHorizontalGroup(
            noCreditListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noCreditListPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(noCreditListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(noCreditPrompt, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(noCreditListPanelLayout.createSequentialGroup()
                        .addGroup(noCreditListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noCreditPrompt2)
                            .addComponent(noCreditListLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(noCreditListPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dequeueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        noCreditListPanelLayout.setVerticalGroup(
            noCreditListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noCreditListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noCreditListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noCreditPrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noCreditPrompt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(noCreditListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dequeueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        mainPanel.add(noCreditListPanel, "card14");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void createClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClassActionPerformed
        menuPanel.setVisible(false);
        studentNamesPanel.setVisible(false);
        viewClassesPanel.setVisible(false);
        classPeriodTextField.setText("Enter Period");
        classNameTextField.setText("Enter Name");
        numStudentsTextField.setText("Enter Number Of Students");
        studentNamesTextArea.setText("");
        studentNameTextField.setText("Enter Student Name");
        createClassPanel.setVisible(true);
    }//GEN-LAST:event_createClassActionPerformed

    private void viewClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassesActionPerformed
        menuPanel.setVisible(false);
        viewClassesPanel.setVisible(true);
        classesTable.setAutoCreateRowSorter(true);
        try {
            if(Attendance.fileExists()) {
                DefaultTableModel model = (DefaultTableModel)classesTable.getModel();
                Attendance.addClassesToTable(model);
            }
        }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No classes have been added. Please add a class.");
        }
    }//GEN-LAST:event_viewClassesActionPerformed

    private void editAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAttendanceActionPerformed
        File file = new File("Attendance.txt");
        try {
            if(file.exists() == false || Attendance.isFileEmpty())
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            else {
                menuPanel.setVisible(false);
                chooseClassEditPanel.setVisible(true);
                DefaultListModel listModel = new DefaultListModel();
                try {
                    Attendance.addElementsToList(listModel);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
                }
                classList.setModel(listModel);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
        }
    }//GEN-LAST:event_editAttendanceActionPerformed

    private void classNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classNameTextFieldActionPerformed

    private void classCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classCreateActionPerformed
        boolean noErrors = true;
        String period = classPeriodTextField.getText();
        if(period.equals("Enter Period") || period.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a Period.");
            classPeriodTextField.setText("");
            noErrors = false;
        }
        int classPeriod = 0;
        try{
            classPeriod  = Integer.parseInt(period);
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a number for the Class Period.");
            classPeriodTextField.setText("");
            noErrors = false;
        }
        File file = new File("Attendance.txt");
        if(file.exists()) {
            try {
                Attendance.inputFromFile();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            }
        }
        if(Attendance.duplicatePeriod(classPeriod) == true) {
            JOptionPane.showMessageDialog(null, "A class with the period entered already exists. Please enter another period.");
            classPeriodTextField.setText("");
            noErrors = false;
        }

        String className = classNameTextField.getText();
        String classNameNoSpace = className.replaceAll("\\s","");
        if(className.equals("Enter Name") || className.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a Class Name.");
            classNameTextField.setText("");
            noErrors = false;
        }
        else if(Attendance.onlyContainsLetters(classNameNoSpace) == false) {
            JOptionPane.showMessageDialog(null, "Please do not enter numbers for the Class Name.");
            classNameTextField.setText("");
            noErrors = false;
        }
        
        String numOfStudents = numStudentsTextField.getText();
        if(numOfStudents.equals("Enter Number Of Students") || numOfStudents.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the Number of Students.");
            numStudentsTextField.setText("");
            noErrors = false;
        }
        try{
            int numStudents  = Integer.parseInt(numOfStudents);
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a number for the Number of Students.");
            numStudentsTextField.setText("");
            noErrors = false;
        }
        
        if (noErrors == true){
            createClassPanel.setVisible(false);
            studentNamesPanel.setVisible(true);
        }
    }//GEN-LAST:event_classCreateActionPerformed

    private void studentNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNameTextFieldActionPerformed
    
    
    private int counter = 0;
    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        int period = Integer.parseInt(classPeriodTextField.getText());
        String className = classNameTextField.getText();
        int numStudents = Integer.parseInt(numStudentsTextField.getText());
        if(counter == 0)
            Attendance.initializeNamesArray(numStudents);
        
        String studentName = studentNameTextField.getText();
        String studentNameNoSpace = studentName.replaceAll("\\s","");
        if(studentName.equals("Enter Student Name") || studentName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the student's name.");
            studentNameTextField.setText("");
        }
        else if(Attendance.hasSpace(studentName) == false) {
            JOptionPane.showMessageDialog(null, "Please enter a last name for the student.");
        }
        else if(Attendance.onlyContainsLetters(studentNameNoSpace) == false) {
            JOptionPane.showMessageDialog(null, "Please only enter a name.");
            studentNameTextField.setText("");
        }   
        else {
            studentNamesTextArea.append(studentName + "\n");
            studentNameTextField.setText("");
            String studentNames[] = Attendance.getStudentNames();
            studentNames[counter] = studentName;
            counter++;
            if(counter == numStudents)
            {
                try { 
                    Attendance.createClass(period, className, numStudents);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "An IOException was thrown.");
                }
                studentNamesPanel.setVisible(false);
                menuPanel.setVisible(true);
                JOptionPane.showMessageDialog(null, "Class Created.");
                counter = 0;
            }
        }
    }//GEN-LAST:event_addStudentActionPerformed

    private void numStudentsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numStudentsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numStudentsTextFieldActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
       createClassPanel.setVisible(false);
       menuPanel.setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void returnButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton2ActionPerformed
        chooseClassEditPanel.setVisible(false);
        menuPanel.setVisible(true);
    }//GEN-LAST:event_returnButton2ActionPerformed

    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextFieldActionPerformed

    private void viewAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAttendanceActionPerformed
        File file = new File("Attendance.txt");
        try {
            if(file.exists() == false || Attendance.isFileEmpty())
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            else {
                menuPanel.setVisible(false);
                chooseClassViewPanel.setVisible(true);
                DefaultListModel listModel = new DefaultListModel();
                try {
                    Attendance.addElementsToList(listModel);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
                }
                clssList.setModel(listModel);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
        }
    }//GEN-LAST:event_viewAttendanceActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        boolean noErrors = true;
        String clss = "";
        if(classList.isSelectionEmpty() == true) {
            JOptionPane.showMessageDialog(null, "No class is selected. Please select a class.");
            noErrors = false;
        }
        else
            clss = classList.getSelectedValue();
        
        String date = dateTextField.getText();
        if(date.equals("Enter Date") || date.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a date.");
            dateTextField.setText("");
            noErrors = false;
        }
        else if(Attendance.isDate(date) == false) {
            JOptionPane.showMessageDialog(null, "Please enter the date in MM/DD/YYYY format.");
            dateTextField.setText("");
            noErrors = false;
        }
        
        if(noErrors == true) {
            try {
                Attendance.selectClass(clss);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "File was not created successfully.");
            }
            Student[] cl = Attendance.getStudents();
            studentTextArea.setText(cl[count].getStudentName());
            chooseClassEditPanel.setVisible(false);
            editAttendancePanel.setVisible(true);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void returnButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton5ActionPerformed
        dateTextField.setText("Enter Date");
        editAttendancePanel.setVisible(false);
        chooseClassEditPanel.setVisible(true);
    }//GEN-LAST:event_returnButton5ActionPerformed

    private int count = 0;
    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        int numStudents = Attendance.getNumStudents();
        Student cl[] = Attendance.getStudents();
        if(count != numStudents) {
            String attendance = attendanceComboBox.getSelectedItem().toString();
            cl[count].setAttendance(attendance);
            cl[count].updateTotalAbsences();
            count++;
            if(count != numStudents) {
                studentTextArea.setText(cl[count].getStudentName());
            }
        }
        if(count == numStudents) {
            try {
                Attendance.outputAttendanceToFile(dateTextField.getText());
                Attendance.outputTotalAbsencesToFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "An IOException was thrown.");
            }
            Attendance.updateNoCreditList();
            count = 0;
            editAttendancePanel.setVisible(false);
            menuPanel.setVisible(true);
            JOptionPane.showMessageDialog(null, "Attendance has successfully been entered for " + 
                    cl[0].getClassName() + " on " +dateTextField.getText());
            dateTextField.setText("Enter Date");
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void dateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTFActionPerformed

    private void returnButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton3ActionPerformed
       chooseClassViewPanel.setVisible(false);
       menuPanel.setVisible(true);
    }//GEN-LAST:event_returnButton3ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        boolean noErrors = true;
        boolean classSelected = false;
        boolean isDate = true;
        String clss = "";
        if(clssList.isSelectionEmpty() == true) {
            JOptionPane.showMessageDialog(null, "No class is selected. Please select a class.");
            noErrors = false;
        }
        else {
            clss = clssList.getSelectedValue();
            classSelected = true;
        }
        
        String date = dateTF.getText();
        if(date.equals("Enter Date") || date.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a date.");
            dateTF.setText("");
            noErrors = false;
            isDate = false;
        }
        else if(Attendance.isDate(date) == false) {
            JOptionPane.showMessageDialog(null, "Please enter the date in MM/DD/YYYY format.");
            dateTF.setText("");
            noErrors = false;
            isDate = false;
        }
        if(classSelected == true && isDate == true) {
            try {
                if(Attendance.attendanceTaken(clss, date) == false) {
                    noErrors = false;
                    JOptionPane.showMessageDialog(null, "Attendance has not been taken for the date entered. Please enter a valid date.");
                    dateTF.setText("");
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            }
        }
        
        if(noErrors == true) {
            try {
                Attendance.selectClass(clss);
                Attendance.setAttendance(clss, date);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "File was not created successfully.");
            }
            Student cl[] = Attendance.getStudents();
            classLabel.setText("Attendance for " + cl[0].getClassName() + " on " + dateTF.getText());
            DefaultTableModel model = (DefaultTableModel)attendanceTable.getModel();
            Attendance.displayAttendance(model);
            attendanceTable.setAutoCreateRowSorter(true);
            chooseClassViewPanel.setVisible(false);
            viewAttendancePanel.setVisible(true);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void returnButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton4ActionPerformed
        dateTF.setText("Enter Date");
        viewAttendancePanel.setVisible(false);
        chooseClassViewPanel.setVisible(true);
        DefaultTableModel model = (DefaultTableModel)attendanceTable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_returnButton4ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        boolean noErrors = true;
        DefaultTableModel model = (DefaultTableModel)classesTable.getModel();
        String test = "";
        if(model.getRowCount() != 0) {
            test = (String)(model.getValueAt(0, 0));
        }
        if(test.equals("No Classes") || model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            noErrors = false;
        }
        else if (classesTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Select a class to delete.");
            noErrors = false;
        } 
        
        if(noErrors == true) {        
            int selectedOption = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this class?", 
                    "Attendance", JOptionPane.YES_NO_OPTION); 
            if (selectedOption == JOptionPane.YES_OPTION) {
                int selectedRow = -1;
                if (classesTable.getSelectedRow() != -1) {
                    selectedRow = classesTable.getSelectedRow();
                }
                File file = new File("Attendance.txt");
                if(file.exists() && noErrors == true) {
                    try {
                        Attendance.deleteClass(model, selectedRow);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "An IOException was thrown.");
                    }
                    model.removeRow(classesTable.getSelectedRow());
                }
            }
        } 
        
        if(model.getRowCount() == 0) {
            model.addRow(new Object[]{"No Classes"});
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void returnButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton1ActionPerformed
        viewClassesPanel.setVisible(false);
        menuPanel.setVisible(true);
    }//GEN-LAST:event_returnButton1ActionPerformed

    private void removeStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentsButtonActionPerformed
        File file = new File("Attendance.txt");
        try {
            if(file.exists() == false || Attendance.isFileEmpty())
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            else {
                menuPanel.setVisible(false);
                chooseClassRemoveStudentsPanel.setVisible(true);
                DefaultListModel listModel = new DefaultListModel();
                try {
                    Attendance.addElementsToList(listModel);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
                }
                classesList.setModel(listModel);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
        }
    }//GEN-LAST:event_removeStudentsButtonActionPerformed

    private void addStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentsButtonActionPerformed
        File file = new File("Attendance.txt");
        try {
            if(file.exists() == false || Attendance.isFileEmpty())
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            else {
                menuPanel.setVisible(false);
                chooseClassAddStudentsPanel.setVisible(true);
                DefaultListModel listModel = new DefaultListModel();
                try {
                    Attendance.addElementsToList(listModel);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
                }
                classesjList.setModel(listModel);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
        }
    }//GEN-LAST:event_addStudentsButtonActionPerformed

    private void nxtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtButtonActionPerformed
        boolean noErrors = true;
        
        String clss = "";
        if(classesjList.isSelectionEmpty() == true) {
            JOptionPane.showMessageDialog(null, "No class is selected. Please select a class.");
            noErrors = false;
        }
        else
            clss = classesjList.getSelectedValue();
        
        String numStudents = numOfStudentsTextField.getText();
        if(numStudents.equals("Enter Number of Students") || numStudents.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the number of students you would like to add.");
            numOfStudentsTextField.setText("");
            noErrors = false;
        }
        int numOfStudents = 0;
        try{
            numOfStudents  = Integer.parseInt(numStudents);
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a number for the Number of Students");
            numOfStudentsTextField.setText("");
            noErrors = false;
        }
        
        if(noErrors == true) {
            try {
                Attendance.selectClass(clss);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "File was not created successfully.");
            }
            chooseClassAddStudentsPanel.setVisible(false);
            addStudentsPanel.setVisible(true);
        }
    }//GEN-LAST:event_nxtButtonActionPerformed

    private void numOfStudentsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOfStudentsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOfStudentsTextFieldActionPerformed
    
    private int tally = 0;
    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        int numStudents = Integer.parseInt(numOfStudentsTextField.getText());
        if(tally == 0)
            Attendance.initializeNamesArray(numStudents);
        String studentName = studentNameTxtField.getText();
        String studentNameNoSpace = studentName.replaceAll("\\s","");
        if(studentName.equals("Enter Student Name") || studentName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the student's name.");
            studentNameTxtField.setText("");
        }
        else if(Attendance.hasSpace(studentName) == false) {
            JOptionPane.showMessageDialog(null, "Please enter a last name for the student.");
        }
        else if(Attendance.onlyContainsLetters(studentNameNoSpace) == false) {
            JOptionPane.showMessageDialog(null, "Please only enter a name.");
            studentNameTxtField.setText("");
        }   
        else {
            studentNamesTxtArea.append(studentName + "\n");
            studentNameTxtField.setText("");
            String studentNames[] = Attendance.getStudentNames();
            studentNames[tally] = studentName;
            tally++;
            if(tally == numStudents)
            {
                try {
                    Attendance.addStudents(numStudents);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "An IOException was thrown.");
                }
                addStudentsPanel.setVisible(false);
                menuPanel.setVisible(true);
                numOfStudentsTextField.setText("Enter Number of Students");
                studentNamesTxtArea.setText("");
                JOptionPane.showMessageDialog(null, "Students have been added.");
                tally = 0; 
            }
        }
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void studentNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNameTxtFieldActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        File file = new File("Attendance.txt");
        int selectedOption = 0;
        if(file.exists()) {
            try {
                Attendance.inputFromFile();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            }
            selectedOption = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete all classes?", 
                    "Attendance", JOptionPane.YES_NO_OPTION);
        }
        else
            JOptionPane.showMessageDialog(null, "No classes have been made. Please create new classes.");
        
        
        if (selectedOption == JOptionPane.YES_OPTION) {
            if(Attendance.deleteFile()) {
                try {
                    Attendance.deleteAllClassFiles();
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
                }
                DefaultTableModel model = (DefaultTableModel)classesTable.getModel();
                model.setRowCount(0);
                model.addRow(new Object[] {"No Classes"});
                JOptionPane.showMessageDialog(null, "All classes have been deleted.");
            }
        }
    }//GEN-LAST:event_resetButtonActionPerformed

    private void returnButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton6ActionPerformed
        chooseClassAddStudentsPanel.setVisible(false);
        menuPanel.setVisible(true);
    }//GEN-LAST:event_returnButton6ActionPerformed

    private void returnButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton7ActionPerformed
        chooseClassRemoveStudentsPanel.setVisible(false);
        menuPanel.setVisible(true);
    }//GEN-LAST:event_returnButton7ActionPerformed

    private void nextjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextjButtonActionPerformed
        String clss = "";
        if(classesList.isSelectionEmpty() == true) {
            JOptionPane.showMessageDialog(null, "No class is selected. Please select a class.");
        }
        else {
            clss = classesList.getSelectedValue();
            DefaultListModel listModel = new DefaultListModel();
            try {
                Attendance.selectClass(clss);
                Attendance.addElementsToList(listModel, clss);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "File was not created successfully.");
            }
            studentsList.setModel(listModel);
            chooseClassRemoveStudentsPanel.setVisible(false);
            removeStudentsPanel.setVisible(true);
        }
    }//GEN-LAST:event_nextjButtonActionPerformed

    private void returnButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton8ActionPerformed
        removeStudentsPanel.setVisible(false);
        chooseClassRemoveStudentsPanel.setVisible(true);
    }//GEN-LAST:event_returnButton8ActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        String student = "";
        String clss = classesList.getSelectedValue();
        DefaultListModel listModel = new DefaultListModel();
        boolean wasDeleted = false;
        if(studentsList.isSelectionEmpty() == true) {
            JOptionPane.showMessageDialog(null, "No student is selected. Please select a student.");
        }
        else {
            student = studentsList.getSelectedValue();
            try {
                wasDeleted = Attendance.removeStudent(student, clss);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "An IOException was thrown.");
            }
            if(wasDeleted == false) {
                try {
                    Attendance.selectClass(clss);
                    Attendance.addElementsToList(listModel, clss);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
                } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "File was not created successfully.");
            }
                studentsList.setModel(listModel);
            }
            else if(wasDeleted == true) {
                JOptionPane.showMessageDialog(null, "The class has been deleted since there was no students "
                        + "left after removing the selected student.");
                removeStudentsPanel.setVisible(false);
                menuPanel.setVisible(true);
            }
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void noCreditListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noCreditListButtonActionPerformed
        File file = new File("Attendance.txt");
        try {
            if(file.exists() == false || Attendance.isFileEmpty())
                JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
            else {
                menuPanel.setVisible(false);
                noCreditListPanel.setVisible(true);
                if(Attendance.getNoCreditList().isEmpty() == false)
                {
                    noCreditTable.setAutoCreateRowSorter(true);
                    DefaultTableModel model = (DefaultTableModel)noCreditTable.getModel();
                    Attendance.addStudentsToTable(model);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No class has been created. Please create a class first.");
        }
    }//GEN-LAST:event_noCreditListButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        noCreditListPanel.setVisible(false);
        menuPanel.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void dequeueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dequeueButtonActionPerformed
        if(Attendance.getNoCreditList().isEmpty() == false)
        {
            Attendance.getNoCreditList().dequeue();
            JOptionPane.showMessageDialog(null, "The first student in the list has been dequeued successfully.");
            noCreditTable.setAutoCreateRowSorter(true);
            DefaultTableModel model = (DefaultTableModel)noCreditTable.getModel();
            model.setRowCount(0);
            if(Attendance.getNoCreditList().isEmpty() == false)
                Attendance.addStudentsToTable(model);
            else
                model.addRow(new Object[] {"No Students", null, null, null});
        }
    }//GEN-LAST:event_dequeueButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AttendanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton addStudentsButton;
    private javax.swing.JLabel addStudentsLabel;
    private javax.swing.JLabel addStudentsLbl;
    private javax.swing.JPanel addStudentsPanel;
    private javax.swing.JLabel addStudentsjLabel;
    private javax.swing.JComboBox<String> attendanceComboBox;
    private javax.swing.JLabel attendanceLabel;
    private javax.swing.JLabel attendanceLbl;
    private javax.swing.JTable attendanceTable;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JPanel chooseClassAddStudentsPanel;
    private javax.swing.JPanel chooseClassEditPanel;
    private javax.swing.JLabel chooseClassLabel;
    private javax.swing.JLabel chooseClassPrompt;
    private javax.swing.JPanel chooseClassRemoveStudentsPanel;
    private javax.swing.JPanel chooseClassViewPanel;
    private javax.swing.JLabel chooseClssLabel;
    private javax.swing.JButton classCreate;
    private javax.swing.JLabel classLabel;
    private javax.swing.JList<String> classList;
    private javax.swing.JLabel classNameLabel;
    private javax.swing.JTextField classNameTextField;
    private javax.swing.JLabel classPeriodLabel;
    private javax.swing.JTextField classPeriodTextField;
    private javax.swing.JLabel classPrompt;
    private javax.swing.JLabel classesLabel;
    private javax.swing.JList<String> classesList;
    private javax.swing.JTable classesTable;
    private javax.swing.JList<String> classesjList;
    private javax.swing.JList<String> clssList;
    private javax.swing.JLabel clssPrompt;
    private javax.swing.JLabel createAClassLabel;
    private javax.swing.JButton createClass;
    private javax.swing.JPanel createClassPanel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel datePrompt;
    private javax.swing.JLabel datePrompt1;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton dequeueButton;
    private javax.swing.JButton editAttendance;
    private javax.swing.JLabel editAttendanceLabel;
    private javax.swing.JPanel editAttendancePanel;
    private javax.swing.JButton exit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton next;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton nextjButton;
    private javax.swing.JButton noCreditListButton;
    private javax.swing.JLabel noCreditListLabel;
    private javax.swing.JPanel noCreditListPanel;
    private javax.swing.JLabel noCreditPrompt;
    private javax.swing.JLabel noCreditPrompt2;
    private javax.swing.JTable noCreditTable;
    private javax.swing.JTextField numOfStudentsTextField;
    private javax.swing.JLabel numStudentsLabel;
    private javax.swing.JLabel numStudentsPrompt;
    private javax.swing.JTextField numStudentsTextField;
    private javax.swing.JButton nxtButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel removePrompt;
    private javax.swing.JButton removeStudentsButton;
    private javax.swing.JLabel removeStudentsLabel;
    private javax.swing.JLabel removeStudentsLbl;
    private javax.swing.JPanel removeStudentsPanel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton returnButton1;
    private javax.swing.JButton returnButton2;
    private javax.swing.JButton returnButton3;
    private javax.swing.JButton returnButton4;
    private javax.swing.JButton returnButton5;
    private javax.swing.JButton returnButton6;
    private javax.swing.JButton returnButton7;
    private javax.swing.JButton returnButton8;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JLabel studentNameLbl;
    private javax.swing.JTextField studentNameTextField;
    private javax.swing.JTextField studentNameTxtField;
    private javax.swing.JPanel studentNamesPanel;
    private javax.swing.JTextArea studentNamesTextArea;
    private javax.swing.JTextArea studentNamesTxtArea;
    private javax.swing.JTextArea studentTextArea;
    private javax.swing.JLabel studentsLabel;
    private javax.swing.JLabel studentsLbl;
    private javax.swing.JList<String> studentsList;
    private javax.swing.JLabel studentsRemovePrompt;
    private javax.swing.JButton viewAttendance;
    private javax.swing.JLabel viewAttendanceLabel;
    private javax.swing.JPanel viewAttendancePanel;
    private javax.swing.JButton viewClasses;
    private javax.swing.JPanel viewClassesPanel;
    // End of variables declaration//GEN-END:variables
}