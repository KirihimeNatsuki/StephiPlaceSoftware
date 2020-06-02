package java_uf_application;

import java.awt.Color;
import java.sql.Timestamp;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author enzol
 */
public class GestionClients extends javax.swing.JFrame {

    /**
     * Creates new form GestionClients
     */
    CLIENT client = new CLIENT();
    public GestionClients() {
        initComponents();
        
        
        client.fillClientJTable(jTableClient);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIDClient = new javax.swing.JTextField();
        jTextFieldNomClient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPrenomClient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTelephone = new javax.swing.JTextField();
        jTextFieldMailClient = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClient = new javax.swing.JTable();
        jButtonAddClient = new javax.swing.JButton();
        jButtonEditClient = new javax.swing.JButton();
        jButtonSupprClient = new javax.swing.JButton();
        jButtonClearField = new javax.swing.JButton();
        jPasswordFieldClient = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jButtonRefreshJTable = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(42, 62, 80));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion des clients");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(465, 465, 465))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID :");

        jTextFieldIDClient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldNomClient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nom :");

        jTextFieldPrenomClient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prénom :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Téléphone :");

        jTextFieldTelephone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldMailClient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email :");

        jTableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Prenom", "Telephone", "Email", "Role"
            }
        )
        //Table plus modifiable
        {public boolean isCellEditable(int row, int column) {return false;}}

    );
    jTableClient.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTableClientMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTableClient);

    jButtonAddClient.setBackground(new java.awt.Color(0, 153, 51));
    jButtonAddClient.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jButtonAddClient.setText("Ajouter un nouveau client");
    jButtonAddClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonAddClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAddClientActionPerformed(evt);
        }
    });

    jButtonEditClient.setBackground(new java.awt.Color(255, 255, 0));
    jButtonEditClient.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jButtonEditClient.setText("Modifier un client existant");
    jButtonEditClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonEditClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditClientActionPerformed(evt);
        }
    });

    jButtonSupprClient.setBackground(new java.awt.Color(204, 0, 0));
    jButtonSupprClient.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jButtonSupprClient.setText("Supprimer un client");
    jButtonSupprClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonSupprClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonSupprClientActionPerformed(evt);
        }
    });

    jButtonClearField.setBackground(new java.awt.Color(51, 51, 255));
    jButtonClearField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jButtonClearField.setText("Effacer les champs");
    jButtonClearField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonClearField.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonClearFieldActionPerformed(evt);
        }
    });

    jPasswordFieldClient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jPasswordFieldClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jPasswordFieldClientActionPerformed(evt);
        }
    });

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Mot de passe :");

    jButtonRefreshJTable.setBackground(new java.awt.Color(51, 51, 255));
    jButtonRefreshJTable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jButtonRefreshJTable.setText("Refresh");
    jButtonRefreshJTable.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRefreshJTableActionPerformed(evt);
        }
    });

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Role :");

    jLabel9.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 0, 0));
    jLabel9.setText("Role 0 pour Client simple, 1 pour Vendeur");

    jComboBoxRole.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jComboBoxRole.setMaximumRowCount(4);
    jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

    jLabel10.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 0, 0));
    jLabel10.setText("(2 pour Agent et 3 pour Administrateur) -> Droits administrateur requis");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldPrenomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldIDClient, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldMailClient, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                        .addComponent(jPasswordFieldClient)
                                        .addComponent(jComboBoxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButtonAddClient)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonEditClient)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonSupprClient)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonClearField, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(156, 156, 156))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(107, 107, 107)))
                            .addGap(73, 73, 73)))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jButtonRefreshJTable, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(69, 69, 69))))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonRefreshJTable))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldIDClient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldPrenomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextFieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldMailClient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPasswordFieldClient, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel10)
                    .addGap(7, 7, 7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEditClient, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSupprClient, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jButtonClearField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(12, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddClientActionPerformed
            //Ajout d'un client
        
            //Récupération des données des champs d'entré (le fait que le nom et prenom soit inversé est normal -> erreur de bdd pas dramatique)
            String nom = jTextFieldNomClient.getText();
            String prenom = jTextFieldPrenomClient.getText();
            String tel = jTextFieldTelephone.getText();
            String email = jTextFieldMailClient.getText();
            int role = Integer.valueOf(jComboBoxRole.getSelectedItem().toString());
            String password = String.valueOf(jPasswordFieldClient.getPassword());
            Timestamp created_at = java.sql.Timestamp.from(java.time.Instant.now());
            Timestamp updated_at = java.sql.Timestamp.from(java.time.Instant.now());
            
            if(prenom.trim().equals("") || nom.trim().equals("") || email.trim().equals("") || password.trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Champs requis à minima --> Nom/Prenom + Email + Password", "Champs Vides", JOptionPane.WARNING_MESSAGE);
            }else {
                if(client.addClient(prenom, nom, tel, email, password, role, created_at, updated_at)){
                    JOptionPane.showMessageDialog(rootPane, "Nouveau Client ajouté avec succès", "Ajout Client", JOptionPane.INFORMATION_MESSAGE);
                
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Erreur dans l'ajout du nouveau client", "Erreur d'Ajout Client", JOptionPane.ERROR_MESSAGE);
                }
            }
                
                 
    }//GEN-LAST:event_jButtonAddClientActionPerformed

    private void jTableClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientMouseClicked
        // Afficher les données de la ligne du tableau sélectionnée dans les champs
        
        // Avoir le model du tableau jTable*
        DefaultTableModel model = (DefaultTableModel)jTableClient.getModel();
        
        int rIndex = jTableClient.getSelectedRow();
        
        jTextFieldIDClient.setText(model.getValueAt(rIndex, 0).toString());
        jTextFieldNomClient.setText(model.getValueAt(rIndex, 1).toString());
        jTextFieldPrenomClient.setText(model.getValueAt(rIndex, 2).toString());
        jTextFieldTelephone.setText(model.getValueAt(rIndex, 3).toString());
        jTextFieldMailClient.setText(model.getValueAt(rIndex, 4).toString());
        jComboBoxRole.setSelectedItem(model.getValueAt(rIndex, 5).toString());
        
       
     
    }//GEN-LAST:event_jTableClientMouseClicked

    private void jButtonEditClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditClientActionPerformed
        
            //Récupération des données des champs d'entrés (le fait que le nom et prenom soit inversé est normal -> erreur de bdd pas dramatique)
            int id = 0;
            String nom = jTextFieldNomClient.getText();
            String prenom = jTextFieldPrenomClient.getText();
            String tel = jTextFieldTelephone.getText();
            String email = jTextFieldMailClient.getText();
            int role = Integer.valueOf(jComboBoxRole.getSelectedItem().toString());
            Timestamp updated_at = java.sql.Timestamp.from(java.time.Instant.now());
            
          
            if(prenom.trim().equals("") || nom.trim().equals("") || email.trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Champs requis à minima --> Nom/Prenom + Email", "Champs Vides", JOptionPane.WARNING_MESSAGE);
            }else {
                
                try{
                    id = Integer.valueOf(jTextFieldIDClient.getText());
                    
                    if(client.modifierClient(id, prenom, nom, tel, email, role, updated_at)){
                        JOptionPane.showMessageDialog(rootPane, "Infos du client modifiées avec succès", "Modification Client", JOptionPane.INFORMATION_MESSAGE);
                
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Erreur dans la modification des infos du client", "Erreur de modification Client", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Veuillez d'abord entrer l'ID du client à modifier ou le sélectionner dans le tableau", "Erreur ID Client", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
    }//GEN-LAST:event_jButtonEditClientActionPerformed

    private void jButtonSupprClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprClientActionPerformed
        
        // Supprimer le client sélectionné
        
        try{
                    int id = Integer.valueOf(jTextFieldIDClient.getText());
                    
                    if(client.supprimerClient(id)){
                        JOptionPane.showMessageDialog(rootPane, "Client supprimé avec succès", "Suppression Client", JOptionPane.INFORMATION_MESSAGE);
                
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Le client n'a pas été supprimé ", "Erreur de suppression Client", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Veuillez d'abord entrer l'ID du client à supprimer ou le sélectionner dans le tableau", "Erreur ID Client", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_jButtonSupprClientActionPerformed

    private void jButtonClearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldActionPerformed
        // Enlever le texte présent sur les champs d'entré
        jTextFieldIDClient.setText("");
        jTextFieldNomClient.setText("");
        jTextFieldPrenomClient.setText("");
        jTextFieldTelephone.setText("");
        jTextFieldMailClient.setText("");
        jPasswordFieldClient.setText("");
    }//GEN-LAST:event_jButtonClearFieldActionPerformed

    private void jPasswordFieldClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldClientActionPerformed

    private void jButtonRefreshJTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshJTableActionPerformed
        // Rafraichis les données de la BDD dans le tableau
        // On vide d'abord le tableau
        jTableClient.setModel(new DefaultTableModel(null, new Object[]{"ID","Nom","Prenom","Telephone","Email","Role"}));
        
        //Puis on le remplis
        client.fillClientJTable(jTableClient);
    }//GEN-LAST:event_jButtonRefreshJTableActionPerformed

    
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
            java.util.logging.Logger.getLogger(GestionClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddClient;
    private javax.swing.JButton jButtonClearField;
    private javax.swing.JButton jButtonEditClient;
    private javax.swing.JButton jButtonRefreshJTable;
    private javax.swing.JButton jButtonSupprClient;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPasswordField jPasswordFieldClient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClient;
    private javax.swing.JTextField jTextFieldIDClient;
    private javax.swing.JTextField jTextFieldMailClient;
    private javax.swing.JTextField jTextFieldNomClient;
    private javax.swing.JTextField jTextFieldPrenomClient;
    private javax.swing.JTextField jTextFieldTelephone;
    // End of variables declaration//GEN-END:variables
}