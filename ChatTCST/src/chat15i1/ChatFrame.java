/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat15i1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Dell
 */
public class ChatFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChatFrame
     */
    
    public static String CURRENT_USER;
    final private DefaultListModel<String> friendListModel;
    final private HashMap<String,String> mapChatContent;
    public ChatFrame() {
        friendListModel = new DefaultListModel<>();
        mapChatContent = new HashMap<>();
        initComponents();
        lstFriends.setModel(friendListModel);
        CURRENT_USER = LoginFrame.USER_NAME;
        lblUsername.setText(CURRENT_USER);
        getAndDisplayUser();
        TuDongNhanTinnhan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstFriends = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtChatContent = new javax.swing.JTextArea();
        txtChat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblReceiver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lstFriends.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFriendsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstFriends);

        txtChatContent.setColumns(20);
        txtChatContent.setRows(5);
        jScrollPane3.setViewportView(txtChatContent);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Chat ");

        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("jLabel2");

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblReceiver.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(111, 111, 111)
                                .addComponent(lblUsername))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblReceiver)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblUsername)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(lblReceiver)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstFriendsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFriendsValueChanged
        // TODO add your handling code here:
        String s = lblReceiver.getText();
        String content = txtChatContent.getText();
        mapChatContent.put(s, content);
        
        if (!evt.getValueIsAdjusting()){
            JList source = (JList)evt.getSource();
            String selected = source.getSelectedValue().toString();
            lblReceiver.setText(selected);
            content = mapChatContent.get(selected);
            txtChatContent.setText(content);
        }
        
    }//GEN-LAST:event_lstFriendsValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s = txtChat.getText().trim();
        if (s.length() > 0){
            txtChatContent.append(CURRENT_USER + ": " + s + "\n");
            txtChat.setText("");
            try{
                MyMessage m = new MyMessage();
                m.sender = CURRENT_USER;
                m.receiver = lblReceiver.getText();
                m.type = "chat";
                m.content = s;
                ChatClient client = new ChatClient();
                MyMessage r = client.sendMessage(m);
                
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
 //
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
public void TuDongNhanTinnhan(){
    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
           while(true){
        try{
            Thread.sleep(1100);
            MyMessage m = new MyMessage();
            m.sender = CURRENT_USER;
            m.receiver = "server";
            m.type = "getmessages";
            m.content = lblReceiver.getText();
            ChatClient client = new ChatClient();
            MyMessage r = client.sendMessage(m);
            System.out.println(r.content);
            ObjectMapper mapper = new ObjectMapper();
            ArrayList<String> b = mapper.readValue(r.content, ArrayList.class);
            for (String s:b){
                txtChatContent.append(lblReceiver.getText() + ": " + s + "\n");
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
        }
    });
   thread.start();
     
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
            java.util.logging.Logger.getLogger(ChatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblReceiver;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JList lstFriends;
    private javax.swing.JTextField txtChat;
    private javax.swing.JTextArea txtChatContent;
    // End of variables declaration//GEN-END:variables
    
    /*20171102*/
    private void getAndDisplayUser(){
        try{
           
            MyMessage m = new MyMessage();
            m.sender = CURRENT_USER;
            m.receiver = "server";
            m.type = "getusers";
            ChatClient client = new ChatClient();
            MyMessage r = client.sendMessage(m);
            ObjectMapper mapper = new ObjectMapper();
            ArrayList<String> b = mapper.readValue(r.content, ArrayList.class);
            for (int i=0; i<b.size(); i++){
                String s = b.get(i);
                friendListModel.addElement(s);
                mapChatContent.put(s, "");
                if (i==0){
                    lblReceiver.setText(s);
                    //txtChatContent = txtChatContentTemp;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}
