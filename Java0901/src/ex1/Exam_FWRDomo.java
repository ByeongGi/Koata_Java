package ex1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class Exam_FWRDomo extends javax.swing.JFrame {
    private JFileChooser jc;
    /**
     * Creates new form Exam_FWRDomo
     */
    public Exam_FWRDomo() {
        initComponents();
        jc = new JFileChooser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputbtn = new javax.swing.JButton();
        outputbtn = new javax.swing.JButton();
        inputText = new javax.swing.JTextField();
        path = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Content");

        jLabel2.setText("PATH");

        inputbtn.setText("입력");
        inputbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputbtnActionPerformed(evt);
            }
        });

        outputbtn.setText("출력");
        outputbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputbtnActionPerformed(evt);
            }
        });

        outputText.setColumns(20);
        outputText.setRows(5);
        jScrollPane1.setViewportView(outputText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputText)
                    .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(inputbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(outputbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputbtnActionPerformed
            int rev = jc.showSaveDialog(this);
            if(rev == JFileChooser.APPROVE_OPTION){
                try {
                    f = jc.getSelectedFile();
                    this.path.setText(f.getAbsolutePath());
                    bw = new BufferedWriter(new FileWriter(f.getAbsoluteFile(),true));
                    saveData();
                } catch (IOException ex) {
                    
                } finally{
                    try {
                        if (bw !=null ) bw.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
     
        outputText.append(this.path.getText() +"경로에 파일을 저장했습니다! \n");
    }//GEN-LAST:event_inputbtnActionPerformed

    private void outputbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputbtnActionPerformed
        // TODO add your handling code here:
        int rev = jc.showOpenDialog(this);
        String path="";
        String res ="";
        Scanner sc =null;
        if(rev == JFileChooser.APPROVE_OPTION){
                try {
                    f = jc.getSelectedFile();
                    path = f.getAbsolutePath();
                    this.path.setText(path);
                    //res=roadData(path);
                    sc = new Scanner(new FileReader(f));
                    while (sc.hasNext()) {
                        outputText.append(sc.next());
                        
                    }
                } catch (Exception ex) {
                    
                } finally{
                    try {
                        
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }

    }//GEN-LAST:event_outputbtnActionPerformed
    private boolean check(){
        if (this.path.getText().trim().length() <=0 ) {
            JOptionPane.showMessageDialog(this, "반드시 경로를 지정해야함");
            this.path.requestFocus();
            return false; 
        }
        return true;
    }
    
    private void saveData() throws IOException{
        check();
        bw.write(inputText.getText());
        bw.newLine();
        bw.flush();
        inputText.setText("");
        inputText.requestFocus();
    } 
    
    private String roadData(String path) throws IOException, FileNotFoundException{
        String res =null;
        byte[] buff= new byte[1024];
        StringBuffer sb = new StringBuffer();
        br = new BufferedReader(new FileReader(f));
        while((res=br.readLine()) != null){
        res=br.readLine();
        //sb.append((char)res);
        }
        return new String(sb.toString().getBytes(),"UTF-8");
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
            java.util.logging.Logger.getLogger(Exam_FWRDomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exam_FWRDomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exam_FWRDomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exam_FWRDomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exam_FWRDomo().setVisible(true);
            }
        });
    }
    private File f;
    private BufferedWriter bw;
    private BufferedReader br;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputText;
    private javax.swing.JButton inputbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputText;
    private javax.swing.JButton outputbtn;
    private javax.swing.JTextField path;
    // End of variables declaration//GEN-END:variables
}