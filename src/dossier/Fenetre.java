package dossier;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Fenetre extends javax.swing.JFrame {
    
    ArrayList<Etudiant>  etudiants = new ArrayList<>();
    DefaultTableModel modele;
    
    
    public Fenetre() throws SQLException {
        initComponents();
        modele = (DefaultTableModel)tableuEtudiant.getModel();
        Cnx cnx = new Cnx();
           
       Statement  stmt = cnx.con.createStatement();
          String sql = "select * from etudiant";
           ResultSet rs1=stmt.executeQuery(sql);
            while(rs1.next()){
                Etudiant e = new Etudiant(rs1.getString("firstName"),rs1.getString("lastName"),rs1.getInt("age"),rs1.getInt("cin"));
                etudiants.add(e);
            modele.addRow(new Object[]{rs1.getInt("id"),rs1.getString("firstName"),
            rs1.getString("lastName"),rs1.getInt("age"),rs1.getInt("cin")});
           
            }
       
    }
     public void myFunction(String text) {
            lblWelcome.setText("Welcome "+text);
          if(!text.equals("admin")){
            btnSupprimer.setEnabled(false);
            btnModifier.setEnabled(false);
            btnAjouter.setEnabled(false);
            
          }
        }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtCin = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtChercher = new javax.swing.JTextField();
        btnChercher = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableuEtudiant = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jPanel2.setBackground(new java.awt.Color(103, 65, 114));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FirstName:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LastName:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CIN:");

        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomKeyTyped(evt);
            }
        });

        txtPrenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrenomKeyTyped(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        txtCin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCinKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNom)
                    .addComponent(txtPrenom)
                    .addComponent(txtAge)
                    .addComponent(txtCin, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new java.awt.Color(103, 65, 114));

        btnModifier.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnModifier.setText("modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnSupprimer.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnSupprimer.setText("supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnAjouter.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnAjouter.setText("ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(103, 65, 114));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("chercher un etudiant");

        btnChercher.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnChercher.setText("valider");
        btnChercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChercherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtChercher))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtChercher, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnChercher, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tableuEtudiant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nom", "prenom", "age", "CIN"
            }
        ));
        tableuEtudiant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableuEtudiantMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableuEtudiant);

        jPanel5.setBackground(new java.awt.Color(248, 148, 6));

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("main");

        lblclose.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblclose.setForeground(new java.awt.Color(204, 0, 0));
        lblclose.setText("x");
        lblclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });

        lblmin.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblmin.setForeground(new java.awt.Color(204, 0, 0));
        lblmin.setText("-");
        lblmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblclose)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWelcome)
                .addGap(42, 42, 42))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmin)
                    .addComponent(lblclose))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        try {
            ajouterEtudiant();
        } catch (SQLException ex) {
            Logger.getLogger(Fenetre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        try {
            modele = (DefaultTableModel)tableuEtudiant.getModel();
            int ligne = tableuEtudiant.getSelectedRow();
            System.out.println("ligne : "+tableuEtudiant);
            if(ligne!=-1){
                  Cnx zz = new Cnx();
            Statement stmt=zz.con.createStatement();
            String query = "DELETE from etudiant WHERE cin ='"+txtCin.getText()+"'";
            stmt.executeUpdate(query);
                etudiants.remove(ligne);
                modele.removeRow(ligne);
                
                viderChamps();
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(Fenetre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        modele = (DefaultTableModel)tableuEtudiant.getModel();
        int ligne = tableuEtudiant.getSelectedRow();
        System.out.println("ligne : "+ligne);
        if(ligne!=-1){
           modele.setValueAt(txtNom.getText(), ligne, 1);
           modele.setValueAt(txtPrenom.getText(), ligne, 2);
           modele.setValueAt(txtAge.getText(), ligne, 3);
           modele.setValueAt(txtCin.getText(), ligne, 4);
           etudiants.get(ligne).setNom(txtNom.getText());
           etudiants.get(ligne).setPrenom(txtPrenom.getText());
           etudiants.get(ligne).setAge(Integer.valueOf(txtAge.getText()));
           etudiants.get(ligne).setCin(Integer.valueOf(txtCin.getText()));
        }
        
      
        try {
             Cnx zz = new Cnx();
              System.out.print(txtNom.getText());
               System.out.print(Integer.valueOf(txtCin.getText()));
               Statement stmt=zz.con.createStatement();
      String query = "UPDATE etudiant SET firstName = '"+txtNom.getText()+"', lastName = '"+txtPrenom.getText()+"', age = '"+Integer.valueOf(txtAge.getText())+"' WHERE cin ='"+Integer.valueOf(txtCin.getText())+"'";
     stmt.executeUpdate(query);
      
  
          
        } catch (SQLException ex) {
            Logger.getLogger(Fenetre.class.getName()).log(Level.SEVERE, null, ex);
        }
     

      // execute the java preparedstatement

    }//GEN-LAST:event_btnModifierActionPerformed

    private void tableuEtudiantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableuEtudiantMouseClicked
         modele = (DefaultTableModel)tableuEtudiant.getModel();
        int ligne = tableuEtudiant.getSelectedRow();
        System.out.print(ligne);
        if(ligne!=-1){
        txtNom.setText(etudiants.get(ligne).getNom());
        txtPrenom.setText(etudiants.get(ligne).getPrenom());
        txtAge.setText(String.valueOf(etudiants.get(ligne).getAge()));
        txtCin.setText(String.valueOf(etudiants.get(ligne).getCin()));
        }
    }//GEN-LAST:event_tableuEtudiantMouseClicked

    private void btnChercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChercherActionPerformed
        modele = (DefaultTableModel)tableuEtudiant.getModel();
        int ligne = tableuEtudiant.getSelectedRow();
        boolean trouve = false;
        int indice=0;
        if(txtChercher.getText().equals("")){
            JOptionPane.showMessageDialog(this, "entrer le nom d'etudiant a chercher svp", "Nom manquant", JOptionPane.ERROR_MESSAGE);
        }else{
        String nomChercher = txtChercher.getText();
        for(int i=0;i<etudiants.size();i++){
            Etudiant e = etudiants.get(i);
            if(nomChercher.equals(e.getNom())){
                trouve=true;
                indice=i;
                break;
            }
        }
        }
        if(trouve){
        txtNom.setText(etudiants.get(indice).getNom());
        txtPrenom.setText(etudiants.get(indice).getPrenom());
        txtAge.setText(String.valueOf(etudiants.get(indice).getAge()));
        txtCin.setText(String.valueOf(etudiants.get(indice).getCin()));
        tableuEtudiant.setRowSelectionInterval(indice, indice);
        }else{
                JOptionPane.showMessageDialog(this, "cet etudiant n'exist pas", "Etudiant inexistant", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnChercherActionPerformed

    private void txtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyTyped
        char touche = evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtNom.getText().equals("")){
            txtPrenom.requestFocus();
            
        }
        if(Character.isDigit(touche)){
                evt.consume();
            }
    }//GEN-LAST:event_txtNomKeyTyped

    private void txtPrenomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrenomKeyTyped
        char touche = evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtPrenom.getText().equals("")){
            txtAge.requestFocus();
        }
        if(Character.isDigit(touche)){
                evt.consume();
            }
    }//GEN-LAST:event_txtPrenomKeyTyped

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        char touche = evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtAge.getText().equals("")){
            txtCin.requestFocus();
            
        }
        if(Character.isLetter(touche)){
                evt.consume();
            }
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtCinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCinKeyTyped
        char touche = evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtCin.getText().equals("")){
            try {          
                ajouterEtudiant();
            } catch (SQLException ex) {
                Logger.getLogger(Fenetre.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Character.isLetter(touche)){
                evt.consume();
            }
    }//GEN-LAST:event_txtCinKeyTyped

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked

        System.exit(0);

    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_lblminMouseClicked

    private void viderChamps() {
        txtNom.setText("");
        txtPrenom.setText("");
        txtAge.setText("");
        txtCin.setText("");
        txtNom.requestFocus();
    }

    private void ajouterEtudiant() throws SQLException {
        modele = (DefaultTableModel)tableuEtudiant.getModel(); 
        boolean ajout = true;
        if(txtNom.getText().equals("")||txtPrenom.getText().equals("")
                ||txtAge.getText().equals("")||txtCin.getText().equals("")){
        JOptionPane.showMessageDialog(this, "remplisser tous les champ SVP", "Champ vide", JOptionPane.ERROR_MESSAGE);
        ajout = false;
        }
        for(Etudiant e:etudiants){
            if(Integer.valueOf(e.getCin()).equals(Integer.valueOf(txtCin.getText()))){
                JOptionPane.showMessageDialog(this, "Cet etudiant exist deja", "Etudiant exist", JOptionPane.ERROR_MESSAGE);
                ajout = false;
                viderChamps();
            }
        }
        
        
        if(ajout){
            
          
                // nekhdmou khedmetna hnéééééééééé
                Cnx cnx = new Cnx();
           Statement stmt=cnx.con.createStatement();
            String sql = "insert into etudiant(firstName,lastName,age,cin)  values( '"+txtNom.getText()+"', '"+txtPrenom.getText()+"', '"+txtAge.getText()+"', '"+txtCin.getText()+"')";
                stmt.executeUpdate(sql);
                 cnx.con.close(); 
                  Cnx xx = new Cnx();
                
                Statement stmt1=xx.con.createStatement();
                String sql1 = "select id from etudiant where firstName='"+txtNom.getText()+"'";
               ResultSet rs2=stmt1.executeQuery(sql1);
               if (rs2.next()) {
                Etudiant etudiant = new Etudiant(txtNom.getText(),txtPrenom.getText(),
            Integer.valueOf(txtAge.getText()),Integer.valueOf(txtCin.getText()));
            etudiants.add(etudiant);
            modele.addRow(new Object[]{rs2.getInt("id"),etudiant.getNom(),
            etudiant.getPrenom(),etudiant.getAge(),etudiant.getCin()});
                   
               }
                 
             xx.con.close();
            cnx.con.close(); 
           
            
            viderChamps();
        }
    
    }
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fenetre f = new Fenetre();
                f.setTitle("Gestion d'Etudiants");
                f.setResizable(false);
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnChercher;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JTable tableuEtudiant;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtChercher;
    private javax.swing.JTextField txtCin;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    // End of variables declaration//GEN-END:variables

    
}
