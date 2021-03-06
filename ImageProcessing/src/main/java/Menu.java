/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Main class of the project. Includes GUI and main method.
 * Latest version: 5:49 PM, 5/3/2019. Now the program has multiple classes.
 * Older versions: 2:45 PM, 4/25/2019.
 *	 Didnt record older versions.
 */

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame
{
	static Camera cam = new Camera();
	OCR ocr = new OCR();
	Database db = new Database();
	
	String weekNo;
	String className;
	
	/**
	 * Creates new form Menu
	 */
	public Menu()
	{
		initComponents();
	}
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jTabbedPane1 = new javax.swing.JTabbedPane();
      jPanel1 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTextPane1 = new javax.swing.JTextPane();
      photoAndOcr = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      password = new javax.swing.JPasswordField();
      jLabel1 = new javax.swing.JLabel();
      studentNumber = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      manualSubmit = new javax.swing.JButton();
      jSeparator1 = new javax.swing.JSeparator();
      jLabel4 = new javax.swing.JLabel();
      weeks = new javax.swing.JComboBox<>();
      jLabel5 = new javax.swing.JLabel();
      classes = new javax.swing.JComboBox<>();
      jLabel6 = new javax.swing.JLabel();
      password1 = new javax.swing.JPasswordField();
      set = new javax.swing.JButton();
      jLabel7 = new javax.swing.JLabel();
      jPanel3 = new javax.swing.JPanel();
      jLabel8 = new javax.swing.JLabel();
      text = new javax.swing.JButton();
      jLabel9 = new javax.swing.JLabel();
      excel = new javax.swing.JButton();
      jSeparator2 = new javax.swing.JSeparator();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Control Panel");

      jScrollPane1.setViewportView(jTextPane1);

      photoAndOcr.setText("Take photo & OCR");
      photoAndOcr.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            photoAndOcrActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(84, 84, 84)
                  .addComponent(photoAndOcr)))
            .addContainerGap(16, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(photoAndOcr)
            .addContainerGap())
      );

      jTabbedPane1.addTab("User", jPanel1);

      password.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            passwordActionPerformed(evt);
         }
      });

      jLabel1.setText("> Manual Submit");

      studentNumber.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            studentNumberActionPerformed(evt);
         }
      });

      jLabel2.setText("Student ID:");

      jLabel3.setText("Password:");

      manualSubmit.setText("Submit");
      manualSubmit.setToolTipText("");
      manualSubmit.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            manualSubmitActionPerformed(evt);
         }
      });

      jLabel4.setText("Week:");

      weeks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "week1", "week2", "week3", "week4", "week5", "week6", "week7", "week8", "week9", "week10", "week11", "week12" }));
      weeks.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            weeksActionPerformed(evt);
         }
      });

      jLabel5.setText("Class:");

      classes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      classes.setEditor(null);
      classes.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            classesActionPerformed(evt);
         }
      });

      jLabel6.setText("Password:");

      password1.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            password1ActionPerformed(evt);
         }
      });

      set.setText("Set");
      set.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            setActionPerformed(evt);
         }
      });

      jLabel7.setText("> Set Week & Class");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabel5)
                  .addComponent(jLabel4))
               .addComponent(jLabel1)
               .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(manualSubmit)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                     .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                     .addGap(18, 18, 18)
                     .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(studentNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addComponent(password))))
               .addComponent(jLabel7)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGap(1, 1, 1)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(set)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                           .addComponent(weeks, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(classes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addContainerGap(24, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(studentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3)
               .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(manualSubmit)
            .addGap(18, 18, 18)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(weeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5)
               .addComponent(classes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel6)
               .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(set)
            .addContainerGap(54, Short.MAX_VALUE))
      );

      jTabbedPane1.addTab("Admin", jPanel2);

      jLabel8.setText("> Export participation data to text file.");

      text.setText("Export to Text");
      text.setToolTipText("");
      text.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            textActionPerformed(evt);
         }
      });

      jLabel9.setText("> Export participation data to excel.");

      excel.setText("Export to Excel");
      excel.setToolTipText("");
      excel.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            excelActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(excel)
               .addComponent(jLabel9)
               .addComponent(text)
               .addComponent(jLabel8))
            .addContainerGap(55, Short.MAX_VALUE))
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addComponent(jLabel8)
            .addGap(18, 18, 18)
            .addComponent(text)
            .addGap(21, 21, 21)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel9)
            .addGap(18, 18, 18)
            .addComponent(excel)
            .addContainerGap(207, Short.MAX_VALUE))
      );

      jTabbedPane1.addTab("Output", jPanel3);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents
	
   private void photoAndOcrActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_photoAndOcrActionPerformed
   {//GEN-HEADEREND:event_photoAndOcrActionPerformed
		if (weekNo == null || className == null)
		{
			jTextPane1.setText(jTextPane1.getText() + "Set week and class from "
				+ "Admin tab first." + "\n\n");
		}
		else
		{
			// Take a photo and save it as id.jpg.
			cam.takeAPhoto();

			// Making sure we reset the studentNumber from last OCR.
			ocr.studentNumber = 0;
			/* OCR the id.jpg. Return student number if photo is valid. Return error 
			message(Try again) if it is invalid. */
			String str = ocr.analyze(className);

			// Decide whether image was valid or not. Prompt user to submit or try again.
			if ("13".equals(str.substring(0, 2)))
			{
				// Image was valid.
				submit();
			}
			else
			{
				// Image was not valid.
				jTextPane1.setText(jTextPane1.getText() + str + "\n\n");
			}
		}
   }//GEN-LAST:event_photoAndOcrActionPerformed
	
	private void submit()
	{
		if (weekNo == null || className == null)
		{
			jTextPane1.setText(jTextPane1.getText() + "Set week and class from "
				+ "Admin tab first." + "\n\n");
		}
		else
		{
			if (ocr.securityFlag2 == true)
			{
				db.operation(ocr.studentNumber, weekNo, className, ocr.operation);
				jTextPane1.setText(jTextPane1.getText() + "Submitted " + ocr.studentNumber
					+ "\n\n");
				
				// Making sure we reset the studentNumber and securityFlag2 after using them.
				ocr.studentNumber = 0;
				ocr.securityFlag2 = false;
			}
			else
			{
				jTextPane1.setText(jTextPane1.getText() + "You need to take a photo with "
					+ "a valid student ID card first.\n\n");
			}	
		}
	}
	
   private void manualSubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_manualSubmitActionPerformed
   {//GEN-HEADEREND:event_manualSubmitActionPerformed
		try
		{
			String studentNoStr = studentNumber.getText();
			// This also checks whether the entered String is a number or not.
			int studentNoInt = Integer.parseInt(studentNoStr);
			
			if (weekNo == null || className == null)
			{
				jTextPane1.setText(jTextPane1.getText() + "Set week and class from "
				+ "Admin tab first." + "\n\n");
			}
			else
			{
				if ("13".equals(studentNoStr.substring(0, 2)) && studentNumber.
					getText().length() == 10 && "dagtekin13".equals(password.getText()))
				{
					if (db.isRegistered(studentNoInt, className))
					{
						db.operation(studentNoInt, weekNo, className, "update");
						jTextPane1.setText(jTextPane1.getText() + "Submitted "
							+ studentNoStr + "\n\n");
					}
					else
					{
						String answer = JOptionPane.showInputDialog("StudentID "
							+ studentNumber.getText() + " is not in student list. Enter "
							+ "\"y\" to add it to student list. Enter \"n\" to take "
							+ "another photo.");
						if ("y".equals(answer))
						{
							db.operation(studentNoInt, weekNo, className, "insert");
							jTextPane1.setText(jTextPane1.getText() + "Submitted "
								+ studentNoStr + "\n\n");
						}
					}
				}
				else
				{
					jTextPane1.setText(jTextPane1.getText() + "Student number or password "
						+ "is wrong.\n\n");
				}
			}
			
			// Reset both fields and focus on studentNumber field.
			studentNumber.setText("");
			password.setText("");
			studentNumber.requestFocus();
		}
		catch (StringIndexOutOfBoundsException | NumberFormatException e)
		{
			jTextPane1.setText(jTextPane1.getText() + "Student number or password "
					+ "is wrong.\n\n");
			
			// Reset both fields and focus on studentNumber field.
			studentNumber.setText("");
			password.setText("");
			studentNumber.requestFocus();
		}
   }//GEN-LAST:event_manualSubmitActionPerformed
	
	// Pressing enter in studentNumber textfield takes you to password textfield
   private void studentNumberActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_studentNumberActionPerformed
   {//GEN-HEADEREND:event_studentNumberActionPerformed
      password.requestFocus();
   }//GEN-LAST:event_studentNumberActionPerformed
	
	// Pressing enter in password passwordfield invokes manualSubmit button.
   private void passwordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_passwordActionPerformed
   {//GEN-HEADEREND:event_passwordActionPerformed
      manualSubmitActionPerformed(evt);
   }//GEN-LAST:event_passwordActionPerformed
	
   private void password1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_password1ActionPerformed
   {//GEN-HEADEREND:event_password1ActionPerformed
      setActionPerformed(evt);
   }//GEN-LAST:event_password1ActionPerformed
	
   private void setActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_setActionPerformed
   {//GEN-HEADEREND:event_setActionPerformed
      if ( "dagtekin13".equals(password1.getText()))
		{
			weekNo = weeks.getSelectedItem().toString();
			className = classes.getSelectedItem().toString();
			
			jTextPane1.setText(jTextPane1.getText() + "Week set to: " + weekNo + 
				"\nClass set to: " + className + "\n\n");
		}
		else
		{
			jTextPane1.setText(jTextPane1.getText() + "Wrong password." + "\n\n");
		}
		
		password1.setText("");
		password1.requestFocus();
   }//GEN-LAST:event_setActionPerformed
	
   private void classesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_classesActionPerformed
   {//GEN-HEADEREND:event_classesActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_classesActionPerformed
	
   private void weeksActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_weeksActionPerformed
   {//GEN-HEADEREND:event_weeksActionPerformed
      if (classes.getItemCount() == 0)
		{
			String[] classList = db.getClassList();

			for (String className : classList)
			{
				classes.addItem(className);
			}
		}
   }//GEN-LAST:event_weeksActionPerformed
	
   private void textActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textActionPerformed
   {//GEN-HEADEREND:event_textActionPerformed
		db.toText();
   }//GEN-LAST:event_textActionPerformed
	
   private void excelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_excelActionPerformed
   {//GEN-HEADEREND:event_excelActionPerformed
		db.toExcel();
   }//GEN-LAST:event_excelActionPerformed
		
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try
		{
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new Menu().setVisible(true);
			}
		});
		
		// Starting video feed as soon as program starts.
		new Thread(new Runnable() {
        public void run(){
            cam.run();
        }
		}).start();
	}
	
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JComboBox<String> classes;
   private javax.swing.JButton excel;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JTabbedPane jTabbedPane1;
   private javax.swing.JTextPane jTextPane1;
   private javax.swing.JButton manualSubmit;
   private javax.swing.JPasswordField password;
   private javax.swing.JPasswordField password1;
   private javax.swing.JButton photoAndOcr;
   private javax.swing.JButton set;
   private javax.swing.JTextField studentNumber;
   private javax.swing.JButton text;
   private javax.swing.JComboBox<String> weeks;
   // End of variables declaration//GEN-END:variables
}
