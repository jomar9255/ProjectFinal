
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package culminatingcannon;
import javax.swing.JTextField;
/**
 *
 * @author jomar9255
 */ 
public class MainMenu extends javax.swing.JFrame {
    JTextField[] varFields;//stores the JTextFields where the user enters their known variables
    MenuHelper tools = new MenuHelper();
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        varFields = new JTextField[3];
        varFields[0] = varField1;
        varFields[1] = varField2;
        varFields[2] = varField3;
    
        tools.disableJTextFields(varFields,3);//all JTextFields within the array are setEnabled(false).
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        solveButton = new javax.swing.JButton();
        solutionsBox = new javax.swing.JComboBox();
        xVarSelect = new javax.swing.JComboBox();
        varField1 = new javax.swing.JTextField();
        varField2 = new javax.swing.JTextField();
        varField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        solveButton.setText("Solve");
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });

        solutionsBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        solutionsBox.setEnabled(false);
        solutionsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionsBoxActionPerformed(evt);
            }
        });

        xVarSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "v1", "v1x", "v1y", "v2", "v2y", "dx", "dy","t","a","theta1", "theta2"}));
        xVarSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xVarSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(varField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(xVarSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(solutionsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(varField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varField3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solutionsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xVarSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
    
    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        double[] varVals = new double[11];
        String xVar = tools.getSelectedJComboBoxItem(xVarSelect);
        String formula = tools.getSelectedJComboBoxItem(solutionsBox);
       
         switch(xVar)
        {
            case "v1":
                varVals = tools.v1SetValues(varVals, varFields,formula);
                
                break;
            
            case "v1x":
              
                break;
            
            case "v1y":
                
                break;
            case "v2":
                varVals = tools.v2SetValues(varVals, varFields, formula);
                break;
                
            case "v2y":
                
                break;
                 
            case "dx":
                
                break;
                
            case "dy":
                
                break;
                 
            case "t":
                
                break;
                
            case "a":
                
                break;
                
            case "theta1":
                
                break;
                
            case "theta2":
                
                break;       
        }
         decisionMaker dm = new decisionMaker(xVar,0,tools.format(formula),varVals);
         double ans = dm.decisionStatements();
         //format to 2 decimal places
         System.out.println(ans);
         printArray(varVals);
    }                                           
 
    private void solutionsBoxActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String var = tools.getSelectedJComboBoxItem(xVarSelect);
        String item = tools.getSelectedJComboBoxItem(solutionsBox);
        //tools.resetVals();
        
        /*
        the below switch enables the appropriate text fields based on the
        variable requirements of a given formula
        */
        switch(var)
        {
            case "v1":
                tools.v1SetVars(varFields, item);
                break;
            
            case "v1x":
                tools.v1xSetVars(varFields, item);
                break;
            
            case "v1y":
                tools.v1ySetVars(varFields, item);
                break;
            case "v2":
                tools.v2SetVars(varFields, item);
                break;
                
            case "v2y":
                tools.v2ySetVars(varFields, item);
                break;
                 
            case "dx":
                tools.dxSetVars(varFields, item);
                break;
                
            case "dy":
                tools.dySetVars(varFields, item);
                break;
                 
            case "t":
                tools.tSetVars(varFields, item);
                break;
                
            case "a":
                tools.aSetVars(varFields, item);
                break;
                
            case "theta1":
                tools.theta1SetVars(varFields, item);
                break;
                
            case "theta2":
                tools.theta2SetVars(varFields, item);
                break;
                
        }       
        
    }                                            

    private void xVarSelectActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Object o = xVarSelect.getModel().getSelectedItem(); 
        tools.getSolution(solutionsBox, o.toString());
        solutionsBox.setEnabled(true);
         
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
                    
            }
        });
    }
 
    // Variables declaration - do not modify                     
    public javax.swing.JComboBox solutionsBox;
    private javax.swing.JButton solveButton;
    private javax.swing.JTextField varField1;
    private javax.swing.JTextField varField2;
    private javax.swing.JTextField varField3;
    private javax.swing.JComboBox xVarSelect;
    // End of variables declaration                   
   
    public void printArray(double[] d){
       for(int i = 0; i < d.length; i++){
           System.out.println(d[i] + " ");
       }
        System.out.println("\n");
    }
}
