package Literarium;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;

public class Store extends javax.swing.JFrame {

    // biar bisa lgsg run (delete later)
    public static void main(String args[]) {
       
        try {
            // Set the Nimbus look and feel
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Launch the Login window directly
        java.awt.EventQueue.invokeLater(() -> {
            new Store().setVisible(true);
        });
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borderPanel = new javax.swing.JPanel();
        adminScreen = new javax.swing.JTabbedPane();
        bookManagementTab = new javax.swing.JPanel();
        searchSubtitle = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        searchIcon = new javax.swing.JLabel();
        authorSubtitle = new javax.swing.JLabel();
        bookAuthorLabel = new javax.swing.JTextField();
        titleSubtitle = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JTextField();
        priceSubtitle = new javax.swing.JLabel();
        bookPriceLabel = new javax.swing.JTextField();
        qtySubtitle = new javax.swing.JLabel();
        bookQtyLabel = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        addToBill = new javax.swing.JButton();
        bookImageLabel = new javax.swing.JLabel();
        bookTableScroll = new javax.swing.JScrollPane();
        bookStoreTable = new javax.swing.JTable();
        bookSynopsisLabel = new javax.swing.JLabel();
        billScroll = new javax.swing.JScrollPane();
        billText = new javax.swing.JTextArea();
        clearBill = new javax.swing.JButton();
        printBill = new javax.swing.JButton();
        billSubtitle = new javax.swing.JLabel();
        purchaseHistoryTab = new javax.swing.JPanel();
        pageTitle5 = new javax.swing.JLabel();
        customerInventoryTableScroll3 = new javax.swing.JScrollPane();
        purchaseHistoryTable = new javax.swing.JTable();
        searchPurchase = new javax.swing.JTextField();
        searchIcon1 = new javax.swing.JLabel();
        customerIDSubtitle2 = new javax.swing.JLabel();
        purchaseBillLabel = new javax.swing.JLabel();
        purchaseHistoryTab1 = new javax.swing.JPanel();
        pageTitle6 = new javax.swing.JLabel();
        customerInventoryTableScroll4 = new javax.swing.JScrollPane();
        ReviewsTable = new javax.swing.JTable();
        publisherInventorySubtitle2 = new javax.swing.JLabel();
        authorSubtitle1 = new javax.swing.JLabel();
        titleSubtitle1 = new javax.swing.JLabel();
        rateSubtitle = new javax.swing.JLabel();
        rateNumber = new javax.swing.JComboBox<>();
        addReview = new javax.swing.JButton();
        authorNameComboBox = new javax.swing.JComboBox<>();
        bookTitleComboBox = new javax.swing.JComboBox<>();
        logo = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        borderPanel.setBackground(new java.awt.Color(217, 185, 155));

        adminScreen.setForeground(new java.awt.Color(123, 63, 0));
        adminScreen.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N

        bookManagementTab.setBackground(new java.awt.Color(250, 250, 250));

        searchSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 20)); // NOI18N
        searchSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        searchSubtitle.setText("Book Available");

        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        searchIcon.setBackground(new java.awt.Color(255, 255, 255));
        searchIcon.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        searchIcon.setForeground(new java.awt.Color(123, 63, 0));
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Literarium/Images/Search.png"))); // NOI18N

        authorSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        authorSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        authorSubtitle.setText("AUTHOR NAME");

        bookAuthorLabel.setEditable(false);
        bookAuthorLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        bookAuthorLabel.setForeground(new java.awt.Color(102, 102, 102));
        bookAuthorLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        bookAuthorLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAuthorLabelActionPerformed(evt);
            }
        });

        titleSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        titleSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        titleSubtitle.setText("BOOK TITLE");

        bookTitleLabel.setEditable(false);
        bookTitleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        bookTitleLabel.setForeground(new java.awt.Color(102, 102, 102));
        bookTitleLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        bookTitleLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTitleLabelActionPerformed(evt);
            }
        });

        priceSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        priceSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        priceSubtitle.setText("PRICE");

        bookPriceLabel.setEditable(false);
        bookPriceLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        bookPriceLabel.setForeground(new java.awt.Color(102, 102, 102));
        bookPriceLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        qtySubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        qtySubtitle.setForeground(new java.awt.Color(123, 63, 0));
        qtySubtitle.setText("QUANTITY");

        bookQtyLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        bookQtyLabel.setForeground(new java.awt.Color(102, 102, 102));
        bookQtyLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cancel.setBackground(new java.awt.Color(123, 63, 0));
        cancel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cancel.setBorderPainted(false);
        cancel.setPreferredSize(new java.awt.Dimension(78, 43));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        addToBill.setBackground(new java.awt.Color(123, 63, 0));
        addToBill.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        addToBill.setForeground(new java.awt.Color(255, 255, 255));
        addToBill.setText("Add to Bill");
        addToBill.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addToBill.setBorderPainted(false);
        addToBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBillActionPerformed(evt);
            }
        });

        bookImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        bookStoreTable.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        bookStoreTable.setSelectionBackground(new java.awt.Color(217, 185, 155));
        bookStoreTable.setSelectionForeground(new java.awt.Color(102, 102, 102));
        bookStoreTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookStoreTableMouseClicked(evt);
            }
        });
        bookTableScroll.setViewportView(bookStoreTable);

        bookSynopsisLabel.setBackground(new java.awt.Color(255, 255, 255));
        bookSynopsisLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        bookSynopsisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookSynopsisLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        billText.setEditable(false);
        billText.setColumns(20);
        billText.setRows(5);
        billScroll.setViewportView(billText);

        clearBill.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        clearBill.setText("Clear");
        clearBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBillActionPerformed(evt);
            }
        });

        printBill.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        printBill.setText("Checkout");
        printBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBillActionPerformed(evt);
            }
        });

        billSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 20)); // NOI18N
        billSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        billSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billSubtitle.setText("Bill");

        javax.swing.GroupLayout bookManagementTabLayout = new javax.swing.GroupLayout(bookManagementTab);
        bookManagementTab.setLayout(bookManagementTabLayout);
        bookManagementTabLayout.setHorizontalGroup(
            bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookManagementTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clearBill)
                .addGap(20, 20, 20)
                .addComponent(printBill)
                .addGap(56, 56, 56))
            .addGroup(bookManagementTabLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookManagementTabLayout.createSequentialGroup()
                                .addComponent(bookTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookManagementTabLayout.createSequentialGroup()
                                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(addToBill, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookManagementTabLayout.createSequentialGroup()
                                                    .addComponent(titleSubtitle)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(bookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookManagementTabLayout.createSequentialGroup()
                                                    .addComponent(priceSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(bookPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookManagementTabLayout.createSequentialGroup()
                                                    .addComponent(qtySubtitle)
                                                    .addGap(44, 44, 44)
                                                    .addComponent(bookQtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(authorSubtitle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bookAuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(101, 101, 101))
                            .addGroup(bookManagementTabLayout.createSequentialGroup()
                                .addComponent(bookImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookSynopsisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)))
                        .addComponent(billScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookManagementTabLayout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchSubtitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(billSubtitle)
                        .addGap(172, 172, 172))))
        );
        bookManagementTabLayout.setVerticalGroup(
            bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookManagementTabLayout.createSequentialGroup()
                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(searchSubtitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookManagementTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(billSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bookManagementTabLayout.createSequentialGroup()
                                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bookAuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(authorSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bookPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bookQtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qtySubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addToBill, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bookImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookSynopsisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(billScroll))
                .addGap(18, 18, 18)
                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearBill)
                    .addComponent(printBill))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        adminScreen.addTab("Book Store", bookManagementTab);

        purchaseHistoryTab.setBackground(new java.awt.Color(250, 250, 250));

        pageTitle5.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 36)); // NOI18N
        pageTitle5.setForeground(new java.awt.Color(123, 63, 0));
        pageTitle5.setText("PURCHASE HISTORY");

        purchaseHistoryTable.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        purchaseHistoryTable.setSelectionBackground(new java.awt.Color(217, 185, 155));
        purchaseHistoryTable.setSelectionForeground(new java.awt.Color(102, 102, 102));
        purchaseHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseHistoryTableMouseClicked(evt);
            }
        });
        customerInventoryTableScroll3.setViewportView(purchaseHistoryTable);

        searchPurchase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        searchPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPurchaseActionPerformed(evt);
            }
        });
        searchPurchase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchPurchaseKeyReleased(evt);
            }
        });

        searchIcon1.setBackground(new java.awt.Color(255, 255, 255));
        searchIcon1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        searchIcon1.setForeground(new java.awt.Color(123, 63, 0));
        searchIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Literarium/Images/Search.png"))); // NOI18N

        customerIDSubtitle2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        customerIDSubtitle2.setForeground(new java.awt.Color(123, 63, 0));
        customerIDSubtitle2.setText("PURCHASE ID");

        purchaseBillLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout purchaseHistoryTabLayout = new javax.swing.GroupLayout(purchaseHistoryTab);
        purchaseHistoryTab.setLayout(purchaseHistoryTabLayout);
        purchaseHistoryTabLayout.setHorizontalGroup(
            purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
                .addGroup(purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(pageTitle5))
                    .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
                                .addComponent(searchPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(searchIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
                                .addComponent(customerInventoryTableScroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(purchaseBillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(customerIDSubtitle2))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        purchaseHistoryTabLayout.setVerticalGroup(
            purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(pageTitle5)
                .addGap(69, 69, 69)
                .addComponent(customerIDSubtitle2)
                .addGap(18, 18, 18)
                .addGroup(purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(purchaseBillLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerInventoryTableScroll3, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        adminScreen.addTab("Purchase History", purchaseHistoryTab);

        purchaseHistoryTab1.setBackground(new java.awt.Color(250, 250, 250));

        pageTitle6.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 36)); // NOI18N
        pageTitle6.setForeground(new java.awt.Color(123, 63, 0));
        pageTitle6.setText("BOOK REVIEW");

        ReviewsTable.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        ReviewsTable.setSelectionBackground(new java.awt.Color(217, 185, 155));
        ReviewsTable.setSelectionForeground(new java.awt.Color(102, 102, 102));
        customerInventoryTableScroll4.setViewportView(ReviewsTable);

        publisherInventorySubtitle2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        publisherInventorySubtitle2.setForeground(new java.awt.Color(123, 63, 0));
        publisherInventorySubtitle2.setText("Your Reviews");

        authorSubtitle1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        authorSubtitle1.setForeground(new java.awt.Color(123, 63, 0));
        authorSubtitle1.setText("AUTHOR NAME");

        titleSubtitle1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        titleSubtitle1.setForeground(new java.awt.Color(123, 63, 0));
        titleSubtitle1.setText("BOOK TITLE");

        rateSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        rateSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        rateSubtitle.setText("RATE");

        rateNumber.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        rateNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        addReview.setBackground(new java.awt.Color(123, 63, 0));
        addReview.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        addReview.setForeground(new java.awt.Color(255, 255, 255));
        addReview.setText("Add Review");
        addReview.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addReview.setBorderPainted(false);
        addReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addReviewActionPerformed(evt);
            }
        });

        authorNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bookTitleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout purchaseHistoryTab1Layout = new javax.swing.GroupLayout(purchaseHistoryTab1);
        purchaseHistoryTab1.setLayout(purchaseHistoryTab1Layout);
        purchaseHistoryTab1Layout.setHorizontalGroup(
            purchaseHistoryTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseHistoryTab1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(purchaseHistoryTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purchaseHistoryTab1Layout.createSequentialGroup()
                        .addComponent(pageTitle6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(purchaseHistoryTab1Layout.createSequentialGroup()
                        .addGroup(purchaseHistoryTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorSubtitle1)
                            .addComponent(titleSubtitle1)
                            .addComponent(rateSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(purchaseHistoryTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(purchaseHistoryTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addReview, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rateNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(authorNameComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bookTitleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addComponent(customerInventoryTableScroll4, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaseHistoryTab1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(publisherInventorySubtitle2)
                .addGap(370, 370, 370))
        );
        purchaseHistoryTab1Layout.setVerticalGroup(
            purchaseHistoryTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseHistoryTab1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(pageTitle6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(publisherInventorySubtitle2)
                .addGap(20, 20, 20)
                .addGroup(purchaseHistoryTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purchaseHistoryTab1Layout.createSequentialGroup()
                        .addGroup(purchaseHistoryTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorSubtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(purchaseHistoryTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookTitleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleSubtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(purchaseHistoryTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rateSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(addReview, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(customerInventoryTableScroll4, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        adminScreen.addTab("Book Review", purchaseHistoryTab1);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Literarium/Images/Logo2.png"))); // NOI18N

        logout.setBackground(new java.awt.Color(217, 185, 155));
        logout.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Literarium/Images/Logout.png"))); // NOI18N
        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout borderPanelLayout = new javax.swing.GroupLayout(borderPanel);
        borderPanel.setLayout(borderPanelLayout);
        borderPanelLayout.setHorizontalGroup(
            borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanelLayout.createSequentialGroup()
                .addGroup(borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borderPanelLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout))
                    .addGroup(borderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(adminScreen)))
                .addContainerGap())
        );
        borderPanelLayout.setVerticalGroup(
            borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderPanelLayout.createSequentialGroup()
                .addGroup(borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(borderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql;
    int customerId; 
    
    int count = 0;
    String id;
    int quantityAsked;
    double total;
    double netTotal = 0;
    
    public Store() {
        initComponents();
        Con = databaseConnection.mycon();
        populateTableBooks();
        populateTablePurchases();
        populateTableRatings();
        populateAuthorNameComboBox();
        populateBookTitleComboBox();
    }

    // logout button
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    // search button
    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        DefaultTableModel model = (DefaultTableModel) bookStoreTable.getModel();

        // Create a new TableRowSorter and associate it with the table model
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        bookStoreTable.setRowSorter(trs);

        // Apply the filter based on the search query (case-insensitive by using (?i))
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + search.getText()));
    }//GEN-LAST:event_searchKeyReleased

    // cancel button
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        bookAuthorLabel.setText(null);
        bookTitleLabel.setText(null);
        bookPriceLabel.setText(null);
        bookQtyLabel.setText(null);
        bookImageLabel.setIcon(null);
        bookSynopsisLabel.setText(null);
    }//GEN-LAST:event_cancelActionPerformed
 
    // clear bill button
    private void clearBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBillActionPerformed
        // TODO add your handling code here:
        billText.setText(null);
        netTotal = 0;
        count = 0;
    }//GEN-LAST:event_clearBillActionPerformed

    //called when the user clicks on a row in the bookStoreTable component and displays book info
    private void bookStoreTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookStoreTableMouseClicked
        int index = bookStoreTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) bookStoreTable.getModel();

        id = model.getValueAt(index, 1).toString();
        bookAuthorLabel.setText(model.getValueAt(index, 2).toString());
        bookTitleLabel.setText(model.getValueAt(index, 3).toString());
        bookPriceLabel.setText(model.getValueAt(index, 4).toString());
        
        Connection conn = databaseConnection.mycon();
        
        String bookImage = "";
        String bookSynopsis = "";

        try {
 

            // Create a statement for executing SQL queries
            Statement stmt = conn.createStatement();

            // Replace "image" and "synopsis" with the actual column names in your database
            final String IMAGE_QUERY = "SELECT image FROM Book WHERE bookId = '" + id + "'";
            ResultSet imageResultSet = stmt.executeQuery(IMAGE_QUERY);

            if (imageResultSet.next()) {
                bookImage = "src/Literarium/Images/bookImgs/" + imageResultSet.getString("image") + ".jpg";
            }

            final String SYNOPSIS_QUERY = "SELECT synopsis FROM Book WHERE bookId = '" + id + "'";
            ResultSet synopsisResultSet = stmt.executeQuery(SYNOPSIS_QUERY);

            if (synopsisResultSet.next()) {
                bookSynopsis = synopsisResultSet.getString("synopsis");
            }

            // Close the result sets and statement
            imageResultSet.close();
            synopsisResultSet.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage());
        }

        // Ensure that there is a valid image path before attempting to load image
        if (!bookImage.isEmpty()) {
            try {
                ImageIcon icon = new ImageIcon(bookImage);
                Image image = icon.getImage().getScaledInstance(bookImageLabel.getWidth(), bookImageLabel.getHeight(), Image.SCALE_SMOOTH);
                bookImageLabel.setIcon(new ImageIcon(image));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error loading image");
            }
        }

        // Set the font and text style for the book synopsis
        String formattedSynopsis = "<html>" + wrapText(bookSynopsis, bookSynopsisLabel.getWidth(), bookSynopsisLabel.getHeight()).replaceAll("\n", "<br>") + "</html>";
        bookSynopsisLabel.setText(formattedSynopsis);
        Font labelFont = bookSynopsisLabel.getFont();
        bookSynopsisLabel.setFont(new Font(labelFont.getName(), Font.PLAIN, 13));
    }//GEN-LAST:event_bookStoreTableMouseClicked

    // add to bill button
    private void addToBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBillActionPerformed
        int index = bookStoreTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) bookStoreTable.getModel();
        String query = "SELECT quantity From Book Where bookId = ?";
        
        int quantityAvail = 0;
        

        id = model.getValueAt(index, 1).toString();
        String strQuantity = model.getValueAt(index, 5).toString();
        int quantity = Integer.parseInt(strQuantity);
        
        Connection conn = databaseConnection.mycon();
        
         try {
            // Create a PreparedStatement
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, id); 

            // Execute the query and get the result set
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if the result set has any rows
            if (resultSet.next()) {
                // Get the value from the result set (assuming maxPurchased is an int)
                quantityAvail = resultSet.getInt("quantity");

                // Now you can use maxInt as needed
                System.out.println("Maximum purchase ID: " + quantityAvail);
            } 
        } catch (SQLException e) {
           e.printStackTrace(); // Handle potential SQLException
       }
        
        String inputText = bookQtyLabel.getText();
        int qty = Integer.parseInt(inputText);
        try {
            quantityAsked = Integer.parseInt(inputText);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a valid integer.");
        }

        

        bookTitleLabel.setText(model.getValueAt(index, 3).toString());
        bookPriceLabel.setText(model.getValueAt(index, 4).toString());
        
        // checking if all info is available 
        if (bookTitleLabel.getText().isEmpty() || bookPriceLabel.getText().isEmpty() || bookQtyLabel.getText().isEmpty() || bookAuthorLabel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Incomplete data.");
            return;
        }
        try {
//            int qty = Integer.parseInt(bookQtyLabel.getText());
            if (qty <= 0) {
                JOptionPane.showMessageDialog(null, "Please enter only a positive integer.");
                return;
            }
            // If inputted value is not an integer
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter only a positive integer.");
            return;
        }
        
        // Adding order to the bill text area
        if (quantity >= 0 && quantityAvail > qty) {
            count++;        
            total = Double.parseDouble(bookPriceLabel.getText()) * (Double.valueOf(bookQtyLabel.getText()));
            netTotal += total;
            if (count == 1) {
                billText.setText(billText.getText() + "························································································································\n");
                billText.setText(billText.getText() + "\t\tLiterarium \n");
                billText.setText(billText.getText() + "························································································································\n");
                billText.setText(billText.getText() + "  " + "TITLE" + "\t\t\tPRICE" + "\tQUANTITY" + "\tTOTAL\n " + " " + String.format("%-25s", bookTitleLabel.getText()) + "\t\t" + "$" + bookPriceLabel.getText() + "\t" + bookQtyLabel.getText() + "\t" + "$" + total + "\n");
            }
            if (count > 1) {
                billText.setText(billText.getText() + "  " + String.format("%-25s", bookTitleLabel.getText()) + "\t\t" + "$" + bookPriceLabel.getText() + "\t" + bookQtyLabel.getText() + "\t" + "$" + total + "\n");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Book quantity insufficient.");
        }
        // Reset labels and fields
        bookAuthorLabel.setText(null);
        bookQtyLabel.setText(null);
        bookTitleLabel.setText(null);
        bookPriceLabel.setText(null);
        bookImageLabel.setIcon(null);
        bookSynopsisLabel.setText(null);
    }//GEN-LAST:event_addToBillActionPerformed
   
    // print bill button
    private void printBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBillActionPerformed
        // update the quantity in the Book table
        Connection conn = databaseConnection.mycon();
        String updateBookQuery = "UPDATE Book SET quantity = quantity - ? WHERE bookId = ?";
        String insertPurchaseQuery = "INSERT INTO Purchase (customerId, quantity, total, deliveryTime, purchaseTime, image) VALUES (?, ?, ?, CURRENT_TIMESTAMP + INTERVAL 3 DAY, CURRENT_TIMESTAMP, ?)";
        String query = "SELECT MAX(purchaseId) AS maxPurchased FROM Purchase";
        
        int maxInt = 0;
        
        try {
            // Create a PreparedStatement
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            // Execute the query and get the result set
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if the result set has any rows
            if (resultSet.next()) {
                // Get the value from the result set (assuming maxPurchased is an int)
                maxInt = resultSet.getInt("maxPurchased") + 1;

                // Now you can use maxInt as needed
                System.out.println("Maximum purchase ID: " + maxInt);
            } 
        } catch (SQLException e) {
           e.printStackTrace(); // Handle potential SQLException
       }
        String text = billText.getText();
        String max = String.valueOf(maxInt);
        System.out.println(max);
        createImage(text,max);
        
        try (PreparedStatement updateBookStatement = conn.prepareStatement(updateBookQuery);
           PreparedStatement insertPurchaseStatement = conn.prepareStatement(insertPurchaseQuery)) {

           // Set the parameter values for updating Book table
           updateBookStatement.setInt(1, quantityAsked);
           updateBookStatement.setString(2, id);

           // Execute the update query for Book table
           int rowsAffected = updateBookStatement.executeUpdate();

           // Check if the update was successful
           if (rowsAffected > 0) {
               System.out.println("Update successful. Rows affected: " + rowsAffected);

               // Get the customerId from SharedData
               String customerId = SharedData.getCustomerId();

               // Set the parameter values for inserting into Purchase table
               System.out.print(customerId);
               insertPurchaseStatement.setString(1, customerId);
               insertPurchaseStatement.setInt(2, quantityAsked);
               insertPurchaseStatement.setDouble(3, netTotal);
               int imgName = maxInt + 1;
               insertPurchaseStatement.setInt(4, maxInt);
               

               // Execute the insert query for Purchase table
               int purchaseRowsAffected = insertPurchaseStatement.executeUpdate();

               // Check if the insert was successful
               if (purchaseRowsAffected > 0) {
                   System.out.println("Purchase recorded successfully. Rows affected: " + purchaseRowsAffected);
               } else {
                   System.out.println("Failed to record purchase. No rows affected.");
               }
           } else {
               System.out.println("Update failed. No rows affected.");
           }
       } catch (SQLException e) {
           e.printStackTrace(); // Handle potential SQLException
       }
       

        // Rest of your code to update the billText
        billText.setText(billText.getText() + "······················································································································\n");
        billText.setText(billText.getText() + "\t\t\t\tYOUR TOTAL: $" + netTotal);
        billText.setText(billText.getText() + "\n\n********************************************************************************\n");
        billText.setText(billText.getText() + "\t\tTHANK YOU \n");
        billText.setText(billText.getText() + "********************************************************************************\n");
        
        refreshTables();
    }//GEN-LAST:event_printBillActionPerformed

    
    private void purchaseHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseHistoryTableMouseClicked
        int index = purchaseHistoryTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) purchaseHistoryTable.getModel();

        String img = model.getValueAt(index, 6).toString();
        String bookImage = "src/Literarium/Images/purchaseImgs/" + img + ".png";

        // Ensure that there is a valid image path before attempting to load image
        if (!bookImage.isEmpty()) {
            try {
                System.out.println(bookImage);
                ImageIcon icon = new ImageIcon(bookImage);
                Image image = icon.getImage().getScaledInstance(purchaseBillLabel.getWidth(), purchaseBillLabel.getHeight(), Image.SCALE_SMOOTH);
                purchaseBillLabel.setIcon(new ImageIcon(image));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error loading image");
            }
        }
    }//GEN-LAST:event_purchaseHistoryTableMouseClicked

    private void searchPurchaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchPurchaseKeyReleased
        DefaultTableModel model = (DefaultTableModel) purchaseHistoryTable.getModel();

        // Create a new TableRowSorter and associate it with the table model
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        purchaseHistoryTable.setRowSorter(trs);

        // Apply the filter based on the search query to the first column (index 0)
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + searchPurchase.getText(), 1));
    }//GEN-LAST:event_searchPurchaseKeyReleased

    // button for adding a review
    private void addReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReviewActionPerformed
        // Assuming authorNameComboBox, bookTitleComboBox, and rateNumber are variables holding the values from GUI
        String authorReviewText = authorNameComboBox.getSelectedItem().toString(); 
        String titleReviewText = bookTitleComboBox.getSelectedItem().toString(); 
        Object selectedRate = rateNumber.getSelectedItem();

        Connection conn = databaseConnection.mycon();
        String currentCustomerId = SharedData.getCustomerId();

        // Check if authorId and bookId exist
        int authorId = findAuthorIdByName(authorReviewText);
        int bookId = findBookIdByTitle(titleReviewText);

        if (authorId != -1 && bookId != -1) {
            // Both authorId and bookId exist, proceed to insert the review
            String insertReviewQuery = "INSERT INTO Rating (customerId, bookId, rating) VALUES (?, ?, ?)";

            try (PreparedStatement insertReviewStatement = conn.prepareStatement(insertReviewQuery)) {
                insertReviewStatement.setString(1, currentCustomerId);
                insertReviewStatement.setInt(2, bookId);
                insertReviewStatement.setObject(3, selectedRate);

                int reviewRowsAffected = insertReviewStatement.executeUpdate();

                // Check if the insert was successful
                if (reviewRowsAffected > 0) {
                    System.out.println("Review recorded successfully. Rows affected: " + reviewRowsAffected);
                } else {
                    System.out.println("Failed to record review. No rows affected.");
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Handle potential SQLException
            }
        } else {
            System.out.println("Author or Book not found. Unable to record the review.");
        }

        refreshTables();
    }//GEN-LAST:event_addReviewActionPerformed

// Method to find the author ID based on the author name
private int findAuthorIdByName(String authorName) {
    int authorId = -1;  // Default value if author ID is not found

    // Query the database to find the author ID based on the author name
    String query = "SELECT authorId FROM Author WHERE authorName = ?";

    try (PreparedStatement preparedStatement = databaseConnection.mycon().prepareStatement(query)) {
        preparedStatement.setString(1, authorName);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            authorId = resultSet.getInt("authorId");
        }

    } catch (SQLException e) {
        e.printStackTrace(); // Handle potential SQLException
    }

    return authorId;
}

// Method to find the book ID based on the book title
private int findBookIdByTitle(String title) {
    int bookId = -1;  // Default value if book ID is not found

    // Query the database to find the book ID based on the book title
    String query = "SELECT bookId FROM Book WHERE title = ?";

    try (PreparedStatement preparedStatement = databaseConnection.mycon().prepareStatement(query)) {
        preparedStatement.setString(1, title);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            bookId = resultSet.getInt("bookId");
        }

    } catch (SQLException e) {
        e.printStackTrace(); // Handle potential SQLException
    }

    return bookId;
}

    private void bookAuthorLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAuthorLabelActionPerformed
        
    }//GEN-LAST:event_bookAuthorLabelActionPerformed

    private void bookTitleLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTitleLabelActionPerformed
        
    }//GEN-LAST:event_bookTitleLabelActionPerformed

    private void searchPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPurchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchPurchaseActionPerformed

    // creates the table of books (1st page)
    public void populateTableBooks() {

    // SQL query to select all columns from the 'catalogue' table
    final String QUERY = "SELECT Book.bookId, Book.title, Book.price, Book.quantity, Book.synopsis, Book.image, Author.authorId, Author.authorName " +
                     "FROM Book " +
                     "INNER JOIN Author ON Book.authorId = Author.authorId";

    try {
        // Establish a connection to the database
        Connection conn = databaseConnection.mycon();

        // Create a statement for executing SQL queries
        Statement stmt = conn.createStatement();

        // Execute the SELECT query
        ResultSet rs = stmt.executeQuery(QUERY);
        
        // Define column names for the JTable
        String column[] = {"authorId", "bookId", "authorName", "title", "price", "quantity", "synopsis", "image"};

        // Create a DefaultTableModel with no data
        DefaultTableModel tableModel = new DefaultTableModel(column, 0);

        // Iterate through the result set and add data to the table model
        while (rs.next()) {
            String authorId = rs.getString("authorId");
            String bookId = rs.getString("bookId");
            String authorName = rs.getString("authorName");
            String title = rs.getString("title");
            double price = Double.parseDouble(rs.getString("price"));
            int quantity = Integer.parseInt(rs.getString("quantity"));
            String synopsis = rs.getString("synopsis");
            String image = rs.getString("image");

            Object[] data = {authorId, bookId, authorName, title, price, quantity, synopsis, image};
            tableModel.addRow(data);
        }

        // Set the JTable model with the populated data
        bookStoreTable.setModel(tableModel);

        } catch (SQLException e) {
            // Handle any SQL exceptions that may occur
            System.out.println("Error: " + e);
        }
    }
    
    // table of purchases
    public void populateTablePurchases() {
    // Get the customerId from SharedData
    String currentCustomerId = SharedData.getCustomerId();

    final String QUERY3 = "SELECT Purchase.purchaseId, Purchase.customerId, Purchase.deliveryTime, " +
            "Purchase.purchaseTime, Purchase.quantity, Purchase.total, Purchase.image " +
            "FROM Purchase " +
            "WHERE Purchase.customerId = " + currentCustomerId;

    try {
        // Establish a connection to the database
        Connection conn3 = databaseConnection.mycon();

        // Create a statement for executing SQL queries
        Statement stmt = conn3.createStatement();

        // Execute the SELECT query
        ResultSet rs = stmt.executeQuery(QUERY3);

        // Define column names for the JTable
        String column[] = {"customerId", "purchaseId", "deliveryTime", "purchaseTime", "quantity", "total", "image"};

        // Create a DefaultTableModel with no data
        DefaultTableModel tableModel3 = new DefaultTableModel(column, 0);

        // Iterate through the result set and add data to the table model
        while (rs.next()) {
            int purchaseId = Integer.parseInt(rs.getString("purchaseId"));
            int customerId = Integer.parseInt(rs.getString("customerId"));
            String deliveryTime = rs.getString("deliveryTime");
            String purchaseTime = rs.getString("purchaseTime");
            int quantity = Integer.parseInt(rs.getString("quantity"));
            double total = Double.parseDouble(rs.getString("total"));

            // Assuming image is a String type, modify accordingly if it's binary data
            String image = rs.getString("image");

            Object[] data = {customerId, purchaseId, deliveryTime, purchaseTime, quantity, total, image};
            tableModel3.addRow(data);
        }

        // Set the JTable model with the populated data
        purchaseHistoryTable.setModel(tableModel3);

    } catch (SQLException e) {
        // Handle any SQL exceptions that may occur
        System.out.println("Error: " + e);
    }

}
    
    // creates the table of books ratings
    public void populateTableRatings() {
        // Get the customerId from SharedData
        String currentCustomerId = SharedData.getCustomerId();
               
        final String QUERY = "SELECT Book.bookId, Book.title, Book.price, Book.quantity, Book.synopsis, Book.image, Author.authorId, Author.authorName " +
                     "FROM Book " +
                     "INNER JOIN Author ON Book.authorId = Author.authorId";
        final String QUERY2 = "SELECT Rating.ratingId, Rating.customerId, Rating.bookId, Rating.rating, " +
                      "Book.title, Book.price, Author.authorName " +
                      "FROM Rating " +
                      "JOIN Book ON Rating.bookId = Book.bookId " +
                      "JOIN Author ON Book.authorId = Author.authorId " +
                      "WHERE Rating.customerId = " + currentCustomerId;
        
        try {
        // Establish a connection to the database
        Connection conn2 = databaseConnection.mycon();

        // Create a statement for executing SQL queries
        Statement stmt = conn2.createStatement();

        // Execute the SELECT query
        ResultSet rs = stmt.executeQuery(QUERY2);
        
        // Define column names for the JTable
        String column[] = {"bookTitle", "authorName", "price", "rating"};

        // Create a DefaultTableModel with no data
        DefaultTableModel tableModel2 = new DefaultTableModel(column, 0);

        // Iterate through the result set and add data to the table model
        while (rs.next()) {
            String bookTitle = rs.getString("title");
            String authorName = rs.getString("authorName");
            double price = Double.parseDouble(rs.getString("price"));
            int rating = Integer.parseInt(rs.getString("rating"));


            Object[] data = {bookTitle, authorName, price, rating};
            tableModel2.addRow(data);
        }

        // Set the JTable model with the populated data
        ReviewsTable.setModel(tableModel2);

        } catch (SQLException e) {
            // Handle any SQL exceptions that may occur
            System.out.println("Error: " + e);
        }
    }
    
    // wraps a given text to fit within the specified width and height, adding line breaks if necessary.
    private String wrapText(String text, int width, int height) {
        FontMetrics metrics = bookSynopsisLabel.getFontMetrics(bookSynopsisLabel.getFont());
        StringBuilder wrappedText = new StringBuilder();

        // Line width and height represents the maximum size available for displaying text on a single line
        int lineWidth = 0;
        
        // Split a string by space or whitespace characters
        String[] words = text.split("\\s+"); 

        for (String word : words) {
            int wordWidth = metrics.stringWidth(word);
            int wordWithSpaceWidth = wordWidth + metrics.stringWidth(" ");
            
            if (lineWidth + wordWithSpaceWidth <= width) {
                wrappedText.append(word).append(" ");
                lineWidth += wordWithSpaceWidth;
            } else {
                wrappedText.append("<br>").append(word).append(" ");
                lineWidth = wordWithSpaceWidth;
            }
        }
        return wrappedText.toString();
    }

private void createImage(String text, String name) {
        BufferedImage image = new BufferedImage(
                billText.getWidth(),
                billText.getHeight(),
                BufferedImage.TYPE_INT_ARGB
        );

        Graphics g = image.getGraphics();
        billText.paint(g);

        // Save the image to a file with a specific name and extension
        try {
            ImageIO.write(image, "PNG", new File("/Users/clarissaaudrey/Desktop/Literarium-main/src/Literarium/Images/purchaseImgs/" + name + ".png"));
            System.out.println("Image saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public void populateAuthorNameComboBox() {
    try {
        // Establish a connection to the database
        Connection conn = databaseConnection.mycon();

        // Create a statement for executing SQL queries
        Statement stmt = conn.createStatement();

        // Execute the SELECT query
        ResultSet rs = stmt.executeQuery("SELECT authorName FROM Author");

        // Clear existing items in the combo box
        authorNameComboBox.removeAllItems();

        // Add author names to the combo box
        while (rs.next()) {
            String authorName = rs.getString("authorName");
            authorNameComboBox.addItem(authorName);
        }

        // Close resources
        rs.close();
        stmt.close();
        conn.close();

        // Set the selected item to null
        authorNameComboBox.setSelectedItem(null);

    } catch (SQLException e) {
        // Handle any SQL exceptions that may occur
        e.printStackTrace();
    }
}

public void populateBookTitleComboBox() {
    try {
        // Establish a connection to the database
        Connection conn = databaseConnection.mycon();

        // Create a statement for executing SQL queries
        Statement stmt = conn.createStatement();

        // Execute the SELECT query
        ResultSet rs = stmt.executeQuery("SELECT title FROM Book");

        // Clear existing items in the combo box
        bookTitleComboBox.removeAllItems();

        // Add author names to the combo box
        while (rs.next()) {
            String title = rs.getString("title");
            bookTitleComboBox.addItem(title);
        }

        // Close resources
        rs.close();
        stmt.close();
        conn.close();

        // Set the selected item to null
        bookTitleComboBox.setSelectedItem(null);

    } catch (SQLException e) {
        // Handle any SQL exceptions that may occur
        e.printStackTrace();
    }
}

    // refreshes all tables
    private void refreshTables() {
        populateTableBooks();
        populateTablePurchases();
        populateTableRatings();
        populateAuthorNameComboBox();
        populateBookTitleComboBox();
    }
  
 
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ReviewsTable;
    private javax.swing.JButton addReview;
    private javax.swing.JButton addToBill;
    private javax.swing.JTabbedPane adminScreen;
    private javax.swing.JComboBox<String> authorNameComboBox;
    private javax.swing.JLabel authorSubtitle;
    private javax.swing.JLabel authorSubtitle1;
    private javax.swing.JScrollPane billScroll;
    private javax.swing.JLabel billSubtitle;
    private javax.swing.JTextArea billText;
    private javax.swing.JTextField bookAuthorLabel;
    private javax.swing.JLabel bookImageLabel;
    private javax.swing.JPanel bookManagementTab;
    private javax.swing.JTextField bookPriceLabel;
    private javax.swing.JTextField bookQtyLabel;
    private javax.swing.JTable bookStoreTable;
    private javax.swing.JLabel bookSynopsisLabel;
    private javax.swing.JScrollPane bookTableScroll;
    private javax.swing.JComboBox<String> bookTitleComboBox;
    private javax.swing.JTextField bookTitleLabel;
    private javax.swing.JPanel borderPanel;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clearBill;
    private javax.swing.JLabel customerIDSubtitle2;
    private javax.swing.JScrollPane customerInventoryTableScroll3;
    private javax.swing.JScrollPane customerInventoryTableScroll4;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logout;
    private javax.swing.JLabel pageTitle5;
    private javax.swing.JLabel pageTitle6;
    private javax.swing.JLabel priceSubtitle;
    private javax.swing.JButton printBill;
    private javax.swing.JLabel publisherInventorySubtitle2;
    private javax.swing.JLabel purchaseBillLabel;
    private javax.swing.JPanel purchaseHistoryTab;
    private javax.swing.JPanel purchaseHistoryTab1;
    private javax.swing.JTable purchaseHistoryTable;
    private javax.swing.JLabel qtySubtitle;
    private javax.swing.JComboBox<String> rateNumber;
    private javax.swing.JLabel rateSubtitle;
    private javax.swing.JTextField search;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JLabel searchIcon1;
    private javax.swing.JTextField searchPurchase;
    private javax.swing.JLabel searchSubtitle;
    private javax.swing.JLabel titleSubtitle;
    private javax.swing.JLabel titleSubtitle1;
    // End of variables declaration//GEN-END:variables
}
