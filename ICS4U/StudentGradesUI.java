/**
 *
 * @author Hrithik
 */
public class StudentGradesUI extends javax.swing.JFrame {

    /**
     * Creates new form StudentGradesUI
     */
    public StudentGradesUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        fnamein = new javax.swing.JTextField();
        lnamein = new javax.swing.JTextField();
        test1 = new javax.swing.JLabel();
        test2 = new javax.swing.JLabel();
        test3 = new javax.swing.JLabel();
        test4 = new javax.swing.JLabel();
        test1in = new javax.swing.JTextField();
        test2in = new javax.swing.JTextField();
        test3in = new javax.swing.JTextField();
        test4in = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        studentaverages = new javax.swing.JButton();
        list = new javax.swing.JButton();
        courseaverages = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grades = new javax.swing.JTextArea();
        output = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fname.setText("First Name:");

        lname.setText("Last Name:");

        fnamein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameinActionPerformed(evt);
            }
        });

        lnamein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameinActionPerformed(evt);
            }
        });

        test1.setText("Test 1");

        test2.setText("Test 2");

        test3.setText("Test 3");

        test4.setText("Test 4");

        test1in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test1inActionPerformed(evt);
            }
        });

        test2in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test2inActionPerformed(evt);
            }
        });

        test3in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test3inActionPerformed(evt);
            }
        });

        test4in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test4inActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        studentaverages.setText("Student Averages");
        studentaverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentaveragesActionPerformed(evt);
            }
        });

        list.setText("List");
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        courseaverages.setText("Course Averages");
        courseaverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseaveragesActionPerformed(evt);
            }
        });

        grades.setColumns(20);
        grades.setRows(5);
        jScrollPane1.setViewportView(grades);

        title.setText("Student Grades");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(test1)
                                        .addGap(18, 18, 18)
                                        .addComponent(test1in, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(test2)
                                        .addGap(18, 18, 18)
                                        .addComponent(test2in, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(test3)
                                        .addGap(18, 18, 18)
                                        .addComponent(test3in, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(add)
                                            .addComponent(list))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(exit)
                                        .addGap(125, 125, 125))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(test4)
                                        .addGap(18, 18, 18)
                                        .addComponent(test4in, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 39, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(fname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnamein, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lnamein))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseaverages)
                            .addComponent(studentaverages))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname)
                    .addComponent(lname)
                    .addComponent(fnamein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnamein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(studentaverages))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(test2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(list)
                                    .addComponent(courseaverages)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(test2in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exit)
                            .addComponent(test3)
                            .addComponent(test3in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test1in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(test1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test4)
                            .addComponent(test4in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(229, 229, 229))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void fnameinActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void lnameinActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void test1inActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void test2inActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void test3inActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void test4inActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    // create array for students
    String names [] = new String [15];
    // create array for their marks
    int marks [] = new int [60]; // 4 marks per student (15*4) == 60
    // counter to for array input
    int count = 0;
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        
        // get all inputs and store in variable
      if (!test1in.getText ().equals ("") || !test2in.getText ().equals ("") || !test3in.getText ().equals ("") || !test4in.getText ().equals ("") || !fnamein.getText ().equals ("") || !lnamein.getText ().equals (""))
      {
        if (count < 14)
        {// 15 students max
        int test1 = Integer.parseInt(test1in.getText ());  
        int test2 = Integer.parseInt(test2in.getText ());
        int test3 = Integer.parseInt(test3in.getText ());
        int test4 = Integer.parseInt(test4in.getText ());
        String fname = fnamein.getText ();
        String lname = lnamein.getText ();
        
        names[count] = fname +" "+ lname;
        marks[count*4] = test1;
        marks[(count*4)+1] = test2;
        marks[(count*4)+2] = test3;
        marks[(count*4)+3] = test4;
        
        output.setText ("Marks have been added to "+fname+"'s record.");
        count++;
        
        // reset
        test1in.setText ("");
        test2in.setText ("");
        test3in.setText ("");
        test4in.setText ("");
        fnamein.setText ("");
        lnamein.setText ("");
        }
      }
      else
      {
        output.setText ("Make sure you enter all fields");
      }
        
    }                                   

    private void listActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        for (int i = 0; i < names.length; i++)
        {
            if (names[i] != null)
            grades.append ("Student: "+names[i]+"\nTest 1: "+marks[i*4]+"\nTest 2: "+marks[(i*4)+1]+"\nTest 3: "+marks[(i*4)+2]+"\nTest 4: "+marks[(i*4)+3]+"\n");
        }
    }                                    

    private void courseaveragesActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        double tempsum = 0, sum = 0,counter = 0;
        for (int i = 0; i < names.length; i++)
        {
          if (names[i] != null)
          {
            tempsum = marks[i*4] + marks[(i*4)+1] + marks [(i*4)+2] + marks [(i*4)+3];
            tempsum = tempsum / 4;
            sum += tempsum;
            counter++;
          }
        }
        double courseaverage = sum/counter;
        output.setText ("The course average is: "+courseaverage);
    }                                              

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        System.exit (0);
    }                                    

    private void studentaveragesActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        String studentname = fnamein.getText () +" "+ lnamein.getText ();
        int num = 0;
        for (int i = 0; i < names.length; i++)
        {
            if (names [i].equals (studentname))
            {
                num = i;
                break;
            }
            else 
            {
              output.setText ("The name you have entered does not match."); 
            }
        }
        
        int sum = marks[num*4] + marks[(num*4)+1] + marks [(num*4)+2] + marks [(num*4)+3];
        double average = sum/4;
        output.setText (studentname+"'s average is: "+average);
    }                                               

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(StudentGradesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGradesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGradesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGradesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGradesUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton add;
    private javax.swing.JButton courseaverages;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fname;
    private javax.swing.JTextField fnamein;
    private javax.swing.JTextArea grades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton list;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField lnamein;
    private javax.swing.JTextField output;
    private javax.swing.JButton studentaverages;
    private javax.swing.JLabel test1;
    private javax.swing.JTextField test1in;
    private javax.swing.JLabel test2;
    private javax.swing.JTextField test2in;
    private javax.swing.JLabel test3;
    private javax.swing.JTextField test3in;
    private javax.swing.JLabel test4;
    private javax.swing.JTextField test4in;
    private javax.swing.JLabel title;
    // End of variables declaration                   
}