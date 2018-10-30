package finallab;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.*;

/**
 *
 * @author scottianderson Apr 9, 2018 5:35:38 PM
 */
public class ControlPanel extends javax.swing.JPanel {

    private AbstractController controller;

    public ControlPanel() {
        initComponents();
        setLayout(null);
        controller = new Controller(this);
        this.hookUpSlider(withdrawLimitSlider, withdrawLimitTextField, 100, 800, 2500);
        this.hookUpSlider(malfunctionProbabilitySlider, malfunctionProbabilityTextField, 0, 5, 20);
        //this.hookUpSlider(aTMCountSLider, aTMCountTextField, 1, 1, 5);
        this.hookUpSlider(costOfATMSlider, costOfATMTextField, 3000, 5000, 10000);
        this.hookUpSlider(costOfTransactionSlider, costOfTransactionTextField, 100, 150, 1000);
        this.hookUpSlider(cashLoadSlider, cashLoadTextField, 500, 2000, 10000);
        this.hookUpSlider(avgTransactionLengthSlider, avgTransactionLengthTextField, 1, 2, 10);
        this.hookUpSlider(avgPatienceSlider, avgPatienceTextField, 1, 5, 60);
        this.hookUpSlider(avgNumberPerDaySlider, avgNumberPerDayTextField, 1, 30, 100);
        setVisible(true);
    }

    public void paintComponent(Graphics g) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        withdrawLimitSlider = new javax.swing.JSlider();
        withdrawLimitTextField = new javax.swing.JTextField();
        malfunctionProbabilitySlider = new javax.swing.JSlider();
        malfunctionProbabilityTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        costOfATMSlider = new javax.swing.JSlider();
        costOfATMTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        costOfTransactionSlider = new javax.swing.JSlider();
        costOfTransactionTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cashLoadSlider = new javax.swing.JSlider();
        cashLoadTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        avgNumberPerDaySlider = new javax.swing.JSlider();
        avgPatienceSlider = new javax.swing.JSlider();
        avgTransactionLengthSlider = new javax.swing.JSlider();
        avgTransactionLengthTextField = new javax.swing.JTextField();
        avgPatienceTextField = new javax.swing.JTextField();
        avgNumberPerDayTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        numberOfDaysTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        runButton = new javax.swing.JButton();
        impatientCustomersLabel = new javax.swing.JLabel();
        suggestionLabel = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("ATM");
        add(jLabel1);
        jLabel1.setBounds(10, 10, 280, 30);

        jLabel4.setText("Withdraw Limit");
        add(jLabel4);
        jLabel4.setBounds(10, 50, 180, 30);
        add(withdrawLimitSlider);
        withdrawLimitSlider.setBounds(170, 50, 210, 29);

        withdrawLimitTextField.setText("0");
        add(withdrawLimitTextField);
        withdrawLimitTextField.setBounds(380, 50, 100, 26);
        add(malfunctionProbabilitySlider);
        malfunctionProbabilitySlider.setBounds(170, 80, 210, 29);

        malfunctionProbabilityTextField.setText("0");
        add(malfunctionProbabilityTextField);
        malfunctionProbabilityTextField.setBounds(380, 80, 100, 26);

        jLabel5.setText("Malfunction Probability");
        add(jLabel5);
        jLabel5.setBounds(10, 80, 180, 30);
        add(costOfATMSlider);
        costOfATMSlider.setBounds(170, 110, 210, 29);

        costOfATMTextField.setText("0");
        add(costOfATMTextField);
        costOfATMTextField.setBounds(380, 110, 100, 26);

        jLabel7.setText("Cost of ATM");
        add(jLabel7);
        jLabel7.setBounds(10, 110, 180, 30);
        add(costOfTransactionSlider);
        costOfTransactionSlider.setBounds(170, 140, 210, 29);

        costOfTransactionTextField.setText("0");
        add(costOfTransactionTextField);
        costOfTransactionTextField.setBounds(380, 140, 100, 26);

        jLabel8.setText("Cost of Transaction");
        add(jLabel8);
        jLabel8.setBounds(10, 140, 180, 30);
        add(cashLoadSlider);
        cashLoadSlider.setBounds(170, 170, 210, 29);

        cashLoadTextField.setText("0");
        add(cashLoadTextField);
        cashLoadTextField.setBounds(380, 170, 100, 26);

        jLabel9.setText("Cash Load");
        add(jLabel9);
        jLabel9.setBounds(10, 170, 180, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("Customers");
        add(jLabel2);
        jLabel2.setBounds(10, 210, 280, 30);

        jLabel10.setText("Avg Transaction Length");
        add(jLabel10);
        jLabel10.setBounds(10, 250, 180, 30);

        jLabel11.setText("Avg Patience");
        add(jLabel11);
        jLabel11.setBounds(10, 280, 180, 30);

        jLabel12.setText("Days");
        add(jLabel12);
        jLabel12.setBounds(220, 360, 80, 30);
        add(avgNumberPerDaySlider);
        avgNumberPerDaySlider.setBounds(170, 310, 210, 29);
        add(avgPatienceSlider);
        avgPatienceSlider.setBounds(170, 280, 210, 29);
        add(avgTransactionLengthSlider);
        avgTransactionLengthSlider.setBounds(170, 250, 210, 29);

        avgTransactionLengthTextField.setText("0");
        add(avgTransactionLengthTextField);
        avgTransactionLengthTextField.setBounds(380, 250, 100, 26);

        avgPatienceTextField.setText("0");
        add(avgPatienceTextField);
        avgPatienceTextField.setBounds(380, 280, 100, 26);

        avgNumberPerDayTextField.setText("0");
        add(avgNumberPerDayTextField);
        avgNumberPerDayTextField.setBounds(380, 310, 100, 26);
        add(jSeparator1);
        jSeparator1.setBounds(0, 340, 490, 12);
        add(jSeparator2);
        jSeparator2.setBounds(0, 200, 490, 12);

        numberOfDaysTextField.setText("1");
        numberOfDaysTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfDaysTextFieldActionPerformed(evt);
            }
        });
        add(numberOfDaysTextField);
        numberOfDaysTextField.setBounds(130, 360, 90, 30);

        jLabel13.setText("AVG Number per Day");
        add(jLabel13);
        jLabel13.setBounds(10, 310, 180, 30);

        jLabel14.setText("Run simulation for ");
        add(jLabel14);
        jLabel14.setBounds(10, 360, 180, 30);

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });
        add(runButton);
        runButton.setBounds(260, 360, 220, 29);

        impatientCustomersLabel.setText("Average Number of Impatient Customers: ???");
        add(impatientCustomersLabel);
        impatientCustomersLabel.setBounds(10, 386, 460, 40);
        add(suggestionLabel);
        suggestionLabel.setBounds(10, 406, 460, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void numberOfDaysTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfDaysTextFieldActionPerformed
       
    }//GEN-LAST:event_numberOfDaysTextFieldActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        //controller.reset();
        //for (int i = 0; i < Integer.parseInt(aTMCountTextField.getText()); i++) {
            AbstractATM atm = new ATM();
            atm.setWithdrawLimit(Integer.parseInt(withdrawLimitTextField.getText()));
            atm.setMalfunctionProbability(Integer.parseInt(malfunctionProbabilityTextField.getText()));
            atm.setCostOfATM(Integer.parseInt(costOfATMTextField.getText()));
            atm.setCostOfTransaction(Double.parseDouble(costOfTransactionTextField.getText()) / 100);
            atm.setCashLoad(Integer.parseInt(cashLoadTextField.getText()));
           // atm.setdays(Integer.parseInt(numberOfDaysTextField.getText()));
            controller.addATM(atm);
        //}
        controller.setAvgTransactionLength(Integer.parseInt(avgTransactionLengthTextField.getText()));
        controller.setAvgPatience(Integer.parseInt(avgPatienceTextField.getText()));
        controller.setAvgNumber(Integer.parseInt(avgNumberPerDayTextField.getText()));

        
        controller.run(Integer.parseInt(numberOfDaysTextField.getText()));
        
        double impatientCustomers = controller.getAvgImpatientCustomers();
        impatientCustomersLabel.setText("Average Number of Impatient Customers: " + impatientCustomers);
        if (impatientCustomers >= 15) {
            suggestionLabel.setText("Second ATM recommended");
        } else {
            suggestionLabel.setText("");
        }
        GraphFrame gF = new GraphFrame();
        gF.setColor(Color.blue);
        System.out.println(controller.getWaitTimePerDayList());
        gF.graph("Average Customer Wait Time", controller.getWaitTimePerDayList());
        GraphFrame gF2 = new GraphFrame();
        gF2.setColor(Color.RED);
        gF2.graph("Impatient Customers", controller.getImpatientCustomersList());
        GraphFrame gF3 = new GraphFrame();
        gF3.setColor(Color.green);
        double d = controller.getMoneyMade();
        gF3.graph("Money Earned (Total " +  d + ")", controller.getMoneyMadeList());
        
    }//GEN-LAST:event_runButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider avgNumberPerDaySlider;
    private javax.swing.JTextField avgNumberPerDayTextField;
    private javax.swing.JSlider avgPatienceSlider;
    private javax.swing.JTextField avgPatienceTextField;
    private javax.swing.JSlider avgTransactionLengthSlider;
    private javax.swing.JTextField avgTransactionLengthTextField;
    private javax.swing.JSlider cashLoadSlider;
    private javax.swing.JTextField cashLoadTextField;
    private javax.swing.JSlider costOfATMSlider;
    private javax.swing.JTextField costOfATMTextField;
    private javax.swing.JSlider costOfTransactionSlider;
    private javax.swing.JTextField costOfTransactionTextField;
    private javax.swing.JLabel impatientCustomersLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider malfunctionProbabilitySlider;
    private javax.swing.JTextField malfunctionProbabilityTextField;
    private javax.swing.JTextField numberOfDaysTextField;
    private javax.swing.JButton runButton;
    private javax.swing.JLabel suggestionLabel;
    private javax.swing.JSlider withdrawLimitSlider;
    private javax.swing.JTextField withdrawLimitTextField;
    // End of variables declaration//GEN-END:variables

    private void hookUpSlider(JSlider slider, JTextField field, int min, int def, int max) {
        slider.setMaximum(max);
        slider.setMinimum(min);
        slider.setValue(def);
        slider.addChangeListener((ChangeEvent e) -> {
            int value = slider.getValue();
            field.setText("" + value);
        });
        field.setText(def + "");
        field.addActionListener((ActionEvent e) -> {
            int value = Integer.parseInt(field.getText());
            if (value > max) {
                value = max;
            }
            if (value < min) {
                value = min;
            }
            slider.setValue(value);
        });
    }

}
