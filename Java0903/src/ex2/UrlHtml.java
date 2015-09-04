/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author kosta
 */
public class UrlHtml extends javax.swing.JFrame {

    /**
     * Creates new form UrlHtml
     */
    public UrlHtml() {
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

        jLabel1 = new javax.swing.JLabel();
        InputUrl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultHtml = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("URL :");

        InputUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUrlActionPerformed(evt);
            }
        });

        resultHtml.setColumns(20);
        resultHtml.setRows(5);
        jScrollPane1.setViewportView(resultHtml);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputUrl))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(InputUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUrlActionPerformed
         
        // 다시 입력후 빈 문자열로 초기화! 
        resultHtml.setText("");
        
        // 1. Path 를 저장
        String path = InputUrl.getText().trim();
        InputStream is= null;
        BufferedReader br = null;
        Scanner sc = null;
        
        try {
            URL url = new URL(path);
            URLConnection  conn = url.openConnection();
            
            // 컨텐츠 타입을 가져온다
            String contentType=conn.getContentType();
            String encoding=conn.getContentEncoding();
            System.out.println(contentType);
            
            // contentType 중에서 인코딩 형식만 파싱 
            int con=contentType.lastIndexOf("=");
            contentType= contentType.substring(con+1,contentType.length());
            System.out.println("contentType : "+contentType);
            
            // 컨텐츠 타입이 없는 경우에는 Euc-kr 로 초기화 
            if(con==-1){
                contentType = "Euc-kr";
            }
            
            // inputStream 얻어온다.
            is = conn.getInputStream();
            br = new BufferedReader(new InputStreamReader(is,contentType));   

            // scanner 로 구현 (강사님 코드 ) 
//            sc  = new Scanner(is,contentType);
//            while (sc.hasNext()) {
//               resultHtml.append(sc.next()+"\n");
//            }
//            sc.close();
           
            String res =null;
            while ((res =br.readLine())!=null) {          
                resultHtml.append(res+"\n");
            }
            br.close();
        } catch (MalformedURLException ex) {
            
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_InputUrlActionPerformed

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
            java.util.logging.Logger.getLogger(UrlHtml.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrlHtml.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrlHtml.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrlHtml.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrlHtml().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputUrl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultHtml;
    // End of variables declaration//GEN-END:variables
}
