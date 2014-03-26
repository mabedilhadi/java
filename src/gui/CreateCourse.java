/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import database.AccountAccess;
import database.CourseAccess;
import static java.lang.System.in;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import types.Course;
import types.Instructor;
import types.TextAnalyzer;

/**
 *
 * @author Normal
 */
public class CreateCourse extends javax.swing.JPanel {

    /**
     * Creates new form CreateCoursePg1
     */
    public CreateCourse() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        create_course_panel = new javax.swing.JPanel();
        course_name_label = new javax.swing.JLabel();
        course_id_label = new javax.swing.JLabel();
        instructor_username_label = new javax.swing.JLabel();
        instructor_id_label = new javax.swing.JLabel();
        ta_name_label = new javax.swing.JLabel();
        ta_id_label = new javax.swing.JLabel();
        course_start_label = new javax.swing.JLabel();
        stud_list_label = new javax.swing.JLabel();
        course_end_label = new javax.swing.JLabel();
        course_name_field = new javax.swing.JTextField();
        course_id_field = new javax.swing.JTextField();
        instructor_username_field = new javax.swing.JTextField();
        instructor_id_field = new javax.swing.JTextField();
        ta_name_field = new javax.swing.JTextField();
        ta_id_field = new javax.swing.JTextField();
        course_start_formatfield = new javax.swing.JFormattedTextField();
        course_end_formatfield = new javax.swing.JFormattedTextField();
        stud_list_file_location_field = new javax.swing.JTextField();
        choose_file_student_list_button = new javax.swing.JButton();
        submit_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();

        create_course_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Create A Course"));

        course_name_label.setText("Course Name");

        course_id_label.setText("Course ID");

        instructor_username_label.setText("Instructor Username");

        instructor_id_label.setText("Instructor ID");

        ta_name_label.setText("TA/Marker Name");

        ta_id_label.setText("TA/Marker ID");

        course_start_label.setText("Course Start Date");

        stud_list_label.setText("Student List (.csv)");

        course_end_label.setText("Course End Date");

        course_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_name_fieldActionPerformed(evt);
            }
        });

        instructor_username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructor_username_fieldActionPerformed(evt);
            }
        });

        course_start_formatfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        course_start_formatfield.setText("yyyy/MM/dd");

        course_end_formatfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        course_end_formatfield.setText("yyyy/MM/dd");
        course_end_formatfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_end_formatfieldActionPerformed(evt);
            }
        });

        stud_list_file_location_field.setText("File Location...");

        choose_file_student_list_button.setText("Choose File");
        choose_file_student_list_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_file_student_list_buttonActionPerformed(evt);
            }
        });

        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout create_course_panelLayout = new javax.swing.GroupLayout(create_course_panel);
        create_course_panel.setLayout(create_course_panelLayout);
        create_course_panelLayout.setHorizontalGroup(
            create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_course_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(create_course_panelLayout.createSequentialGroup()
                            .addComponent(course_start_label)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(course_start_formatfield, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(course_end_label)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(course_end_formatfield, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(create_course_panelLayout.createSequentialGroup()
                            .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ta_name_label)
                                .addComponent(instructor_id_label))
                            .addGap(137, 137, 137)
                            .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(instructor_id_field)
                                .addComponent(ta_name_field)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_course_panelLayout.createSequentialGroup()
                            .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ta_id_label)
                                .addComponent(course_id_label)
                                .addComponent(course_name_label)
                                .addComponent(instructor_username_label))
                            .addGap(118, 118, 118)
                            .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(instructor_username_field)
                                .addComponent(course_name_field)
                                .addComponent(course_id_field)
                                .addGroup(create_course_panelLayout.createSequentialGroup()
                                    .addComponent(ta_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(create_course_panelLayout.createSequentialGroup()
                        .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(create_course_panelLayout.createSequentialGroup()
                                .addComponent(stud_list_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stud_list_file_location_field, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(submit_button))
                        .addGap(18, 18, 18)
                        .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choose_file_student_list_button)
                            .addComponent(cancel_button, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        create_course_panelLayout.setVerticalGroup(
            create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_course_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_id_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructor_username_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instructor_username_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructor_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instructor_id_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ta_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ta_name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ta_id_label)
                    .addComponent(ta_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_start_label)
                    .addComponent(course_start_formatfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_end_label)
                    .addComponent(course_end_formatfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stud_list_label)
                    .addComponent(stud_list_file_location_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choose_file_student_list_button))
                .addGap(18, 18, 18)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_button)
                    .addComponent(cancel_button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(create_course_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(create_course_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<String> accounts_list; //The list of accounts in arraylist string format
    
    private void course_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_name_fieldActionPerformed

    private void instructor_username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructor_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instructor_username_fieldActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed

        Instructor instructor_taken;
        instructor_taken = (Instructor) AccountAccess.constructAccountObject(instructor_username_field.getText());
        if(instructor_taken == null) {
            JOptionPane.showMessageDialog(this, "Invalid instructor username, please re-enter");
        } else {
        Course new_course = new Course(course_name_field.getText(), course_id_field.getText(), instructor_taken, course_start_formatfield.getText(), course_end_formatfield.getText());
        
        //Add the course to course db
        CourseAccess.createCourse(new_course);
        
        //Add the TA to the TA table
        CourseAccess.addTA(course_id_field.getText(), Integer.parseInt(ta_id_field.getText()), ta_name_field.getText());
        
        //Add the CSV file
        CourseAccess.clearStudentList(course_id_field.getText());
        String student_name;
        String student_id;
        
        for (String i : accounts_list)
        {
            String [] arr= i.split(", ");
            student_name = arr[0];
            student_id = arr[1];
            
            //Push the student to the database
            CourseAccess.addStudent(student_name, Integer.parseInt(student_id), course_id_field.getText());
        }
        }
        //Redirect back to the page NO REDIRECT AS OF YET
        
    }//GEN-LAST:event_submit_buttonActionPerformed

     //Purpose is to assign the values of the text file to global variable accounts_list
     //From http://stackoverflow.com/questions/10621687/how-to-get-full-path-directory-from-file-choosers
    private void choose_file_student_list_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose_file_student_list_buttonActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle("choosertitle");
    chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    chooser.setAcceptAllFileFilterUsed(true);
    
    String path_container;

    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
    System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
    path_container = chooser.getSelectedFile().toString();
    
    stud_list_file_location_field.setText(path_container);
    accounts_list = TextAnalyzer.getInput(path_container);
    
    System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
    } 
    
    else {
    System.out.println("No Selection ");
    accounts_list = null; //Set the array list accounts_list to null if nothing initiated.
    }
    
    }//GEN-LAST:event_choose_file_student_list_buttonActionPerformed

    private void course_end_formatfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_end_formatfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_end_formatfieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JButton choose_file_student_list_button;
    private javax.swing.JFormattedTextField course_end_formatfield;
    private javax.swing.JLabel course_end_label;
    private javax.swing.JTextField course_id_field;
    private javax.swing.JLabel course_id_label;
    private javax.swing.JTextField course_name_field;
    private javax.swing.JLabel course_name_label;
    private javax.swing.JFormattedTextField course_start_formatfield;
    private javax.swing.JLabel course_start_label;
    private javax.swing.JPanel create_course_panel;
    private javax.swing.JTextField instructor_id_field;
    private javax.swing.JLabel instructor_id_label;
    private javax.swing.JTextField instructor_username_field;
    private javax.swing.JLabel instructor_username_label;
    private javax.swing.JTextField stud_list_file_location_field;
    private javax.swing.JLabel stud_list_label;
    private javax.swing.JButton submit_button;
    private javax.swing.JTextField ta_id_field;
    private javax.swing.JLabel ta_id_label;
    private javax.swing.JTextField ta_name_field;
    private javax.swing.JLabel ta_name_label;
    // End of variables declaration//GEN-END:variables

  
}
