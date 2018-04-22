
import com.mysql.jdbc.StringUtils;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class BookMaintenance extends javax.swing.JPanel {

   Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    String sql;
    JTextField txtfld=new JTextField();
    public BookMaintenance() {
        initComponents();
        conn=JavaConnect.connectDB();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        txtPublisher = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbBook = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtISBNRmv = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAuthorRmv = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAvlBooks = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPublisherRmv = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtBookNameRmv = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        lblRemove = new javax.swing.JLabel();
        lblSearchRmv = new javax.swing.JLabel();
        cmbBookRmv = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtISBNUpdt = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtPriceUpdt = new javax.swing.JTextField();
        txtBookNameUpdt = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();
        lblSearchUpdt = new javax.swing.JLabel();
        cmbBookUpdt = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtAvlBooksUpdt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(534, 328));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Maintenance");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(534, 328));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ISBN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        jPanel1.add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 28));

        jLabel3.setText("Book Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 30, -1, -1));
        jPanel1.add(txtBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 50, 149, 28));

        jLabel4.setText("Author");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, -1, -1));
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 106, 140, 28));
        jPanel1.add(txtPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 108, 149, 28));

        jLabel5.setText("Publication");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 84, -1, -1));

        jLabel6.setText("Number of Books");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 145, -1, -1));

        jLabel7.setText("Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 145, -1, -1));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 166, 149, 28));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Plus_20px.png"))); // NOI18N
        jLabel14.setText("Add Book ");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 215, -1, 28));

        cmbBook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cmbBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBookActionPerformed(evt);
            }
        });
        jPanel1.add(cmbBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 140, 28));

        jTabbedPane1.addTab("Add Book", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("ISBN");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        jPanel2.add(txtISBNRmv, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 28));

        jLabel16.setText("Author");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, -1, -1));

        txtAuthorRmv.setEditable(false);
        jPanel2.add(txtAuthorRmv, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 106, 140, 28));

        jLabel17.setText("Number of Books");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 145, -1, -1));

        txtAvlBooks.setEditable(false);
        jPanel2.add(txtAvlBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 166, 149, 28));

        jLabel18.setText("Available Book");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 145, -1, -1));

        txtPublisherRmv.setEditable(false);
        jPanel2.add(txtPublisherRmv, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 108, 149, 28));

        jLabel25.setText("Publisher");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 84, -1, -1));

        txtBookNameRmv.setEditable(false);
        jPanel2.add(txtBookNameRmv, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 50, 149, 28));

        jLabel26.setText("Book Name");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 30, -1, -1));

        lblRemove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_20px.png"))); // NOI18N
        lblRemove.setText("Remove Book ");
        lblRemove.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoveMouseClicked(evt);
            }
        });
        jPanel2.add(lblRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 215, -1, 28));

        lblSearchRmv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_20px_1.png"))); // NOI18N
        lblSearchRmv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchRmvMouseClicked(evt);
            }
        });
        jPanel2.add(lblSearchRmv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 52, -1, -1));

        jPanel2.add(cmbBookRmv, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 140, 28));

        jTabbedPane1.addTab("Remove Book", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setText("ISBN");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        jPanel3.add(txtISBNUpdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 28));

        jLabel31.setText("Number of Books");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, -1, -1));

        jLabel32.setText("Price");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 84, -1, -1));
        jPanel3.add(txtPriceUpdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 108, 149, 28));
        jPanel3.add(txtBookNameUpdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 50, 149, 28));

        jLabel34.setText("Book Name");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 30, -1, -1));

        lblUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Available_Updates_20px.png"))); // NOI18N
        lblUpdate.setText("Update Book ");
        lblUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateMouseClicked(evt);
            }
        });
        jPanel3.add(lblUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, 28));

        lblSearchUpdt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_20px_1.png"))); // NOI18N
        lblSearchUpdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchUpdtMouseClicked(evt);
            }
        });
        jPanel3.add(lblSearchUpdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 52, -1, -1));

        cmbBookUpdt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel3.add(cmbBookUpdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 106, 140, 28));

        jLabel19.setText("Available Book");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 145, -1, -1));

        txtAvlBooksUpdt.setEditable(false);
        jPanel3.add(txtAvlBooksUpdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 140, 28));

        jTabbedPane1.addTab("Update Book", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Books in Library", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /**  method for searching dupilcation of ISBN no in the database.
    *  @param isbn book no
    *  @return true if not found else return false
    * */
    private boolean ISBNSearch(int isbn){
        
        String s = "select * from book where isbn = '"+isbn+"'";
        try{
            pst = conn.prepareStatement(s);
//            ResultSet rs2 = ;
            
            if(pst.executeQuery().next()){
                return false;
            }
            else{
                return true;
            }
        }
        catch(Exception e){
            return false;
        }
    }
    
//    method for checking string is number or not
    private boolean isNumber(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
    
//    ADD BOOK MOUSE CLICK EVENT PERFORMED
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       if(this.ISBNSearch(Integer.parseInt(txtISBN.getText().trim()))){
           sql="insert into book(isbn,name,author,publication,no_book,price)values(?,?,?,?,?,?)";
           try {
           pst=conn.prepareStatement(sql);
       
           
//        validating data from add book tab
           
//            validating for ISBN number
            if(this.isNumber(txtISBN.getText().toString())){
                if(txtISBN.getText().trim().length() == 10 || txtISBN.getText().trim().length() == 13 ){
                    pst.setString(1, txtISBN.getText());
                    txtISBN.setBorder(new JTextField().getBorder() );
                }
                else
                {
                    txtISBN.setBorder(BorderFactory.createLineBorder(Color.RED));
                    txtISBN.setToolTipText("ISBN Number must be of 10 or 13 digits");
                }
            }
            else{
                txtISBN.setBorder(BorderFactory.createLineBorder(Color.RED));
                txtISBN.setToolTipText("ISBN Number must be in digits");
            }
            
//            validating for Book Name
            if(txtBookName.getText().trim().length()!=0)
            {
                pst.setString(2,txtBookName.getText());
                txtBookName.setBorder(new JTextField().getBorder() );
            }
            else
            {
                txtBookName.setBorder(BorderFactory.createLineBorder(Color.RED));
                txtBookName.setToolTipText("Please ! Enter Book Name");
            }
        
            
            pst.setString(3,txtAuthor.getText());
            pst.setString(4,txtPublisher.getText());
            pst.setString(5, (String) cmbBook.getSelectedItem());
            
//            validating for Book Price
            if(Double.parseDouble(txtPrice.getText()) > 0)
            {
                pst.setString(6,txtPrice.getText());
                txtPrice.setBorder(new JTextField().getBorder() );
            }
            else
            {
                txtPrice.setBorder(BorderFactory.createLineBorder(Color.RED));
                txtPrice.setToolTipText("Book Price must greater than 0");
            }
        
            pst.execute();
            JOptionPane.showMessageDialog(null, "Book Added");
            rs.close();
            pst.close();
        
       }catch(Exception e){}
       }
       else{
           JOptionPane.showMessageDialog(null,"Book is Already avilable !");
       }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void lblSearchRmvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchRmvMouseClicked
        sql="select * from book where isbn='"+txtISBNRmv.getText()+"'";
        try{
            pst=conn.prepareStatement(sql);
            
            rs=pst.executeQuery();
            if(rs.next())
            {
                
                txtISBNRmv.setText(rs.getString(2));
//                String a2=;
                txtBookNameRmv.setText(rs.getString(3));
                
                txtAuthorRmv.setText(rs.getString(4)); 
                
                txtPublisherRmv.setText(rs.getString(5));
                
                for(int i=1;i<=Integer.parseInt(rs.getString(6));i++)
                {
                cmbBookRmv.addItem(Integer.toString(i));
                }
                txtAvlBooks.setText(rs.getString(6));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Book is not in the List");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_lblSearchRmvMouseClicked

    private void lblRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMouseClicked
        int avaBook = Integer.parseInt(txtAvlBooks.getText());
        int rmvBook = Integer.parseInt((String) cmbBookRmv.getSelectedItem());
        int rmvBook1 = avaBook - rmvBook;
        if(Integer.parseInt(txtAvlBooks.getText())==Integer.parseInt(cmbBookRmv.getSelectedItem().toString()))
      sql="delete from book where isbn='"+txtISBNRmv.getText()+"'";
      else
          sql="update book set no_book='"+rmvBook1+"' where isbn='"+txtISBNRmv.getText()+"'";
      try
        {
            pst=conn.prepareStatement(sql);
            
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Book Removed Successfully");
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
      
            
              

    }//GEN-LAST:event_lblRemoveMouseClicked

    private void lblSearchUpdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchUpdtMouseClicked
        sql="select * from book where isbn='"+txtISBNUpdt.getText()+"'";
        try
        {
            pst=conn.prepareStatement(sql);
            
            rs=pst.executeQuery();
            if(rs.next())
            {
                
                txtISBNUpdt.setText(rs.getString(2));

                txtBookNameUpdt.setText(rs.getString(3));
                txtPriceUpdt.setText(rs.getString(7));
                txtAvlBooksUpdt.setText(rs.getString(6));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Book is not in the List");
            }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_lblSearchUpdtMouseClicked

    private void lblUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMouseClicked
        int avaBook = Integer.parseInt(txtAvlBooksUpdt.getText());
        int uptBook = Integer.parseInt((String) cmbBookRmv.getSelectedItem());
        int uptBook1 = avaBook + uptBook;     
        sql="update book set name='"+txtBookNameUpdt.getText()+"','"+txtPriceUpdt.getText()+"','"+uptBook1+"'where isbn='"+txtISBNUpdt.getText()+"'";
        try
        {
            pst=conn.prepareStatement(sql);
            if(txtBookName.getText().trim().length()!=0)
            {
                pst.setString(2,txtBookName.getText());
                txtBookName.setBorder(new JTextField().getBorder() );
            }
            else
            {
                txtBookName.setBorder(BorderFactory.createLineBorder(Color.RED));
                txtBookName.setToolTipText("Please ! Enter Book Name");
            }
             if(Integer.parseInt(txtPrice.getText()) >0)
            {
                pst.setString(6,txtPrice.getText());
                txtPrice.setBorder(new JTextField().getBorder() );
            }
            else
            {
                txtPrice.setBorder(BorderFactory.createLineBorder(Color.RED));
                txtPrice.setToolTipText("Book Price must greater than 0");
            }
             
             
             pst.execute();
             JOptionPane.showMessageDialog(null, "Book Updated");
             
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_lblUpdateMouseClicked

    private void cmbBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbBook;
    private javax.swing.JComboBox<String> cmbBookRmv;
    private javax.swing.JComboBox<String> cmbBookUpdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblRemove;
    private javax.swing.JLabel lblSearchRmv;
    private javax.swing.JLabel lblSearchUpdt;
    private javax.swing.JLabel lblUpdate;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtAuthorRmv;
    private javax.swing.JTextField txtAvlBooks;
    private javax.swing.JTextField txtAvlBooksUpdt;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtBookNameRmv;
    private javax.swing.JTextField txtBookNameUpdt;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtISBNRmv;
    private javax.swing.JTextField txtISBNUpdt;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPriceUpdt;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtPublisherRmv;
    // End of variables declaration//GEN-END:variables
}
