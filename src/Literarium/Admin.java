package Literarium;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import com.toedter.calendar.JCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class Admin extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borderPanel = new javax.swing.JPanel();
        adminScreen = new javax.swing.JTabbedPane();
        bookManagementTab = new javax.swing.JPanel();
        pageTitle1 = new javax.swing.JLabel();
        bookIDSubtitle = new javax.swing.JLabel();
        bookIdLabel = new javax.swing.JTextField();
        titleSubtitle = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JTextField();
        priceSubtitle = new javax.swing.JLabel();
        deleteBook = new javax.swing.JButton();
        clearBook = new javax.swing.JButton();
        bookInventoryTableScroll = new javax.swing.JScrollPane();
        bookInventoryTable = new javax.swing.JTable();
        bookInventorySubtitle = new javax.swing.JLabel();
        updateBook = new javax.swing.JButton();
        addBook = new javax.swing.JButton();
        bookQtyLabel = new javax.swing.JTextField();
        bookPriceLabel = new javax.swing.JTextField();
        authorSubtitle = new javax.swing.JLabel();
        bookImageLabel = new javax.swing.JLabel();
        qtySubtitle = new javax.swing.JLabel();
        bookImage = new javax.swing.JTextField();
        uploadBookImage = new javax.swing.JButton();
        uploadBookSynopsis = new javax.swing.JButton();
        bookSynopsisScroll = new javax.swing.JScrollPane();
        bookSynopsisLabel = new javax.swing.JLabel();
        publisherIdSubtitle = new javax.swing.JLabel();
        synopsisSubtitle2 = new javax.swing.JLabel();
        coverImage = new javax.swing.JLabel();
        authorNameComboBox = new javax.swing.JComboBox<>();
        publisherNameComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookSynopsis = new javax.swing.JTextArea();
        customerManagementTab = new javax.swing.JPanel();
        pageTitle2 = new javax.swing.JLabel();
        customerIDSubtitle = new javax.swing.JLabel();
        customerIdLabel = new javax.swing.JTextField();
        customerNameSubtitle = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        customerEmailSubtitle = new javax.swing.JLabel();
        customerEmail = new javax.swing.JTextField();
        customerGenderSubtitle = new javax.swing.JLabel();
        customerGender = new javax.swing.JComboBox<>();
        addCustomer = new javax.swing.JButton();
        updateCustomer = new javax.swing.JButton();
        deleteCustomer = new javax.swing.JButton();
        clearCustomer = new javax.swing.JButton();
        customerInventoryTableScroll = new javax.swing.JScrollPane();
        customerInventoryTable = new javax.swing.JTable();
        customerInventorySubtitle = new javax.swing.JLabel();
        adressSubtitle = new javax.swing.JLabel();
        customerAddress = new javax.swing.JTextField();
        adressSubtitle1 = new javax.swing.JLabel();
        customerPass = new javax.swing.JTextField();
        authorDetailsTab = new javax.swing.JPanel();
        pageTitle3 = new javax.swing.JLabel();
        authorIDSubtitle = new javax.swing.JLabel();
        authorIdLabel = new javax.swing.JTextField();
        authorNameSubtitle = new javax.swing.JLabel();
        authorName = new javax.swing.JTextField();
        authorBirthdaySubtitle = new javax.swing.JLabel();
        addAuthor = new javax.swing.JButton();
        updateAuthor = new javax.swing.JButton();
        deleteAuthor = new javax.swing.JButton();
        clearAuthor = new javax.swing.JButton();
        customerInventoryTableScroll1 = new javax.swing.JScrollPane();
        authorInventoryTable = new javax.swing.JTable();
        customerInventorySubtitle1 = new javax.swing.JLabel();
        authorCountrySubtitle = new javax.swing.JLabel();
        authorCountry = new javax.swing.JTextField();
        authorImageLabel = new javax.swing.JLabel();
        authorImage = new javax.swing.JTextField();
        uploadAuthorImage = new javax.swing.JButton();
        authorBiographyLabel = new javax.swing.JLabel();
        uploadAuthorBiography = new javax.swing.JButton();
        authorBirthday = new com.toedter.calendar.JDateChooser();
        imageofAuthor = new javax.swing.JLabel();
        biographyofAuthor = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        authorBiography = new javax.swing.JTextArea();
        purchaseHistoryTab = new javax.swing.JPanel();
        pageTitle5 = new javax.swing.JLabel();
        customerInventoryTableScroll3 = new javax.swing.JScrollPane();
        purchaseHistoryTable = new javax.swing.JTable();
        searchPurchase = new javax.swing.JTextField();
        searchIcon = new javax.swing.JLabel();
        customerIDSubtitle2 = new javax.swing.JLabel();
        purchaseBillLabel = new javax.swing.JLabel();
        publisherDetailsTab = new javax.swing.JPanel();
        pageTitle4 = new javax.swing.JLabel();
        publisherIDSubtitle = new javax.swing.JLabel();
        publisherId = new javax.swing.JTextField();
        publisherNameSubtitle = new javax.swing.JLabel();
        publisherName = new javax.swing.JTextField();
        emailSubtitle1 = new javax.swing.JLabel();
        publisherAddress = new javax.swing.JTextField();
        addPublisher = new javax.swing.JButton();
        updatePublisher = new javax.swing.JButton();
        deletePublisher = new javax.swing.JButton();
        clearPublisher = new javax.swing.JButton();
        customerInventoryTableScroll2 = new javax.swing.JScrollPane();
        publisherInventoryTable = new javax.swing.JTable();
        publisherInventorySubtitle = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        borderPanel.setBackground(new java.awt.Color(217, 185, 155));

        adminScreen.setForeground(new java.awt.Color(123, 63, 0));
        adminScreen.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N

        bookManagementTab.setBackground(new java.awt.Color(250, 250, 250));

        pageTitle1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 36)); // NOI18N
        pageTitle1.setForeground(new java.awt.Color(123, 63, 0));
        pageTitle1.setText("BOOK MANAGEMENT");

        bookIDSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        bookIDSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        bookIDSubtitle.setText("BOOK ID");

        bookIdLabel.setEditable(false);
        bookIdLabel.setBackground(new java.awt.Color(250, 250, 250));
        bookIdLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        bookIdLabel.setBorder(null);

        titleSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        titleSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        titleSubtitle.setText("BOOK TITLE");

        bookTitleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

        priceSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        priceSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        priceSubtitle.setText("BOOK PRICE");

        deleteBook.setBackground(new java.awt.Color(123, 63, 0));
        deleteBook.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        deleteBook.setForeground(new java.awt.Color(255, 255, 255));
        deleteBook.setText("Delete");
        deleteBook.setBorder(null);
        deleteBook.setBorderPainted(false);
        deleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookActionPerformed(evt);
            }
        });

        clearBook.setBackground(new java.awt.Color(123, 63, 0));
        clearBook.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clearBook.setForeground(new java.awt.Color(255, 255, 255));
        clearBook.setText("Clear");
        clearBook.setBorder(null);
        clearBook.setBorderPainted(false);
        clearBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBookActionPerformed(evt);
            }
        });

        bookInventoryTable.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        bookInventoryTable.setSelectionBackground(new java.awt.Color(217, 185, 155));
        bookInventoryTable.setSelectionForeground(new java.awt.Color(102, 102, 102));
        bookInventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookInventoryTableMouseClicked(evt);
            }
        });
        bookInventoryTableScroll.setViewportView(bookInventoryTable);

        bookInventorySubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 20)); // NOI18N
        bookInventorySubtitle.setForeground(new java.awt.Color(123, 63, 0));
        bookInventorySubtitle.setText("Book Inventory");

        updateBook.setBackground(new java.awt.Color(123, 63, 0));
        updateBook.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        updateBook.setForeground(new java.awt.Color(255, 255, 255));
        updateBook.setText("Update");
        updateBook.setBorder(null);
        updateBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookActionPerformed(evt);
            }
        });

        addBook.setBackground(new java.awt.Color(123, 63, 0));
        addBook.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addBook.setForeground(new java.awt.Color(255, 255, 255));
        addBook.setText("Add");
        addBook.setBorder(null);
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        bookQtyLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        bookQtyLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookQtyLabelActionPerformed(evt);
            }
        });

        bookPriceLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

        authorSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        authorSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        authorSubtitle.setText("AUTHOR NAME");

        bookImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        qtySubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        qtySubtitle.setForeground(new java.awt.Color(123, 63, 0));
        qtySubtitle.setText("BOOK QUANTITY");

        bookImage.setEditable(true);
        bookImage.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

        uploadBookImage.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        uploadBookImage.setText("Upload");
        uploadBookImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBookImageActionPerformed(evt);
            }
        });

        uploadBookSynopsis.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        uploadBookSynopsis.setText("Upload");
        uploadBookSynopsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBookSynopsisActionPerformed(evt);
            }
        });

        bookSynopsisLabel.setBackground(new java.awt.Color(255, 255, 255));
        bookSynopsisLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        bookSynopsisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookSynopsisLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        bookSynopsisScroll.setViewportView(bookSynopsisLabel);

        publisherIdSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        publisherIdSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        publisherIdSubtitle.setText("PUBLISHER NAME");

        synopsisSubtitle2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        synopsisSubtitle2.setForeground(new java.awt.Color(123, 63, 0));
        synopsisSubtitle2.setText("SYNOPSIS");

        coverImage.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        coverImage.setForeground(new java.awt.Color(123, 63, 0));
        coverImage.setText("COVER IMAGE");

        authorNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        publisherNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        bookSynopsis.setColumns(20);
        bookSynopsis.setLineWrap(true);
        bookSynopsis.setRows(5);
        jScrollPane1.setViewportView(bookSynopsis);

        javax.swing.GroupLayout bookManagementTabLayout = new javax.swing.GroupLayout(bookManagementTab);
        bookManagementTab.setLayout(bookManagementTabLayout);
        bookManagementTabLayout.setHorizontalGroup(
            bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookManagementTabLayout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addComponent(pageTitle1)
                .addGap(32, 425, Short.MAX_VALUE))
            .addGroup(bookManagementTabLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addComponent(bookIDSubtitle)
                        .addGap(40, 40, 40))
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addComponent(qtySubtitle)
                        .addGap(29, 29, 29))
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorSubtitle)
                            .addComponent(priceSubtitle))
                        .addGap(31, 31, 31))
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addComponent(publisherIdSubtitle)
                        .addGap(29, 29, 29)))
                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addComponent(bookIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(coverImage, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(synopsisSubtitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookInventoryTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(publisherNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(bookManagementTabLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(bookPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(bookQtyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(authorNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookManagementTabLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bookImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookImage))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uploadBookImage))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookManagementTabLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(updateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookManagementTabLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(deleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(clearBook, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookManagementTabLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(bookSynopsisScroll))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uploadBookSynopsis)
                                .addGap(38, 38, 38))))
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(bookInventorySubtitle)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        bookManagementTabLayout.setVerticalGroup(
            bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookManagementTabLayout.createSequentialGroup()
                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(pageTitle1)
                        .addGap(18, 18, 18)
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coverImage)
                            .addComponent(synopsisSubtitle2))
                        .addGap(18, 18, 18)
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookManagementTabLayout.createSequentialGroup()
                                .addComponent(bookImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bookImage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uploadBookImage)))
                            .addGroup(bookManagementTabLayout.createSequentialGroup()
                                .addComponent(bookSynopsisScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(uploadBookSynopsis, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(46, 46, 46)
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearBook, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bookManagementTabLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookIDSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bookManagementTabLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(authorNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookQtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtySubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bookManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(publisherIdSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(publisherNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookInventorySubtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookInventoryTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        adminScreen.addTab("Book Management", bookManagementTab);

        customerManagementTab.setBackground(new java.awt.Color(250, 250, 250));

        pageTitle2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 36)); // NOI18N
        pageTitle2.setForeground(new java.awt.Color(123, 63, 0));
        pageTitle2.setText("CUSTOMER MANAGEMENT");

        customerIDSubtitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        customerIDSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        customerIDSubtitle.setText("CUSTOMER ID");

        customerIdLabel.setEditable(false);
        customerIdLabel.setBackground(new java.awt.Color(250, 250, 250));
        customerIdLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        customerIdLabel.setBorder(null);

        customerNameSubtitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        customerNameSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        customerNameSubtitle.setText("NAME");

        customerName.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

        customerEmailSubtitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        customerEmailSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        customerEmailSubtitle.setText("EMAIL");

        customerEmail.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

        customerGenderSubtitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        customerGenderSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        customerGenderSubtitle.setText("GENDER");

        customerGender.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        customerGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "Male", "Female" }));
        customerGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerGenderActionPerformed(evt);
            }
        });

        addCustomer.setBackground(new java.awt.Color(123, 63, 0));
        addCustomer.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addCustomer.setForeground(new java.awt.Color(255, 255, 255));
        addCustomer.setText("Add");
        addCustomer.setBorder(null);
        addCustomer.setBorderPainted(false);
        addCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });

        updateCustomer.setBackground(new java.awt.Color(123, 63, 0));
        updateCustomer.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        updateCustomer.setForeground(new java.awt.Color(255, 255, 255));
        updateCustomer.setText("Update");
        updateCustomer.setBorder(null);
        updateCustomer.setBorderPainted(false);
        updateCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerActionPerformed(evt);
            }
        });

        deleteCustomer.setBackground(new java.awt.Color(123, 63, 0));
        deleteCustomer.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        deleteCustomer.setForeground(new java.awt.Color(255, 255, 255));
        deleteCustomer.setText("Delete");
        deleteCustomer.setBorder(null);
        deleteCustomer.setBorderPainted(false);
        deleteCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerActionPerformed(evt);
            }
        });

        clearCustomer.setBackground(new java.awt.Color(123, 63, 0));
        clearCustomer.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clearCustomer.setForeground(new java.awt.Color(255, 255, 255));
        clearCustomer.setText("Clear");
        clearCustomer.setBorder(null);
        clearCustomer.setBorderPainted(false);
        clearCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCustomerActionPerformed(evt);
            }
        });

        customerInventoryTable.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        customerInventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER ID", "NAME", "GENDER", "EMAIL", "ADDRESS"
            }
        ) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false; // Make all cells non-editable
            }
        }
    );
    customerInventoryTable.setSelectionBackground(new java.awt.Color(217, 185, 155));
    customerInventoryTable.setSelectionForeground(new java.awt.Color(102, 102, 102));
    customerInventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            customerInventoryTableMouseClicked(evt);
        }
    });
    customerInventoryTableScroll.setViewportView(customerInventoryTable);

    customerInventorySubtitle.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
    customerInventorySubtitle.setForeground(new java.awt.Color(123, 63, 0));
    customerInventorySubtitle.setText("Customer Inventory");

    adressSubtitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    adressSubtitle.setForeground(new java.awt.Color(123, 63, 0));
    adressSubtitle.setText("ADDRESS");

    customerAddress.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

    adressSubtitle1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    adressSubtitle1.setForeground(new java.awt.Color(123, 63, 0));
    adressSubtitle1.setText("PASSWORD");

    customerPass.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
    customerPass.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            customerPassActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout customerManagementTabLayout = new javax.swing.GroupLayout(customerManagementTab);
    customerManagementTab.setLayout(customerManagementTabLayout);
    customerManagementTabLayout.setHorizontalGroup(
        customerManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(customerManagementTabLayout.createSequentialGroup()
            .addGroup(customerManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(customerManagementTabLayout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addGroup(customerManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(customerIDSubtitle)
                        .addComponent(customerNameSubtitle))
                    .addGap(52, 52, 52)
                    .addGroup(customerManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(customerManagementTabLayout.createSequentialGroup()
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                            .addComponent(customerGenderSubtitle))
                        .addGroup(customerManagementTabLayout.createSequentialGroup()
                            .addComponent(customerIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customerEmailSubtitle)))
                    .addGap(2, 2, 2))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerManagementTabLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(updateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)))
            .addGap(12, 12, 12)
            .addGroup(customerManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(customerGender, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(customerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(customerManagementTabLayout.createSequentialGroup()
                    .addComponent(deleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)
                    .addComponent(clearCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
            .addGroup(customerManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerManagementTabLayout.createSequentialGroup()
                    .addComponent(adressSubtitle)
                    .addGap(15, 15, 15))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerManagementTabLayout.createSequentialGroup()
                    .addComponent(adressSubtitle1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
            .addGroup(customerManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(customerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(customerPass, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(89, Short.MAX_VALUE))
        .addGroup(customerManagementTabLayout.createSequentialGroup()
            .addGap(528, 528, 528)
            .addComponent(customerInventorySubtitle)
            .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(customerManagementTabLayout.createSequentialGroup()
            .addGap(193, 193, 193)
            .addComponent(customerInventoryTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerManagementTabLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageTitle2)
            .addGap(368, 368, 368))
    );

    customerManagementTabLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {customerEmail, customerGender, customerIdLabel, customerName});

    customerManagementTabLayout.setVerticalGroup(
        customerManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(customerManagementTabLayout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addComponent(pageTitle2)
            .addGap(48, 48, 48)
            .addGroup(customerManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(customerIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(customerEmailSubtitle)
                .addComponent(customerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(customerIDSubtitle)
                .addComponent(adressSubtitle)
                .addComponent(customerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(customerManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(customerNameSubtitle)
                .addComponent(customerGenderSubtitle)
                .addComponent(customerGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(adressSubtitle1)
                .addComponent(customerPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(36, 36, 36)
            .addGroup(customerManagementTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(updateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(deleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(clearCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(28, 28, 28)
            .addComponent(customerInventorySubtitle)
            .addGap(18, 18, 18)
            .addComponent(customerInventoryTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(122, Short.MAX_VALUE))
    );

    customerManagementTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {customerEmail, customerGender, customerIdLabel, customerName});

    adminScreen.addTab("Customer Management", customerManagementTab);

    authorDetailsTab.setBackground(new java.awt.Color(250, 250, 250));

    pageTitle3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 36)); // NOI18N
    pageTitle3.setForeground(new java.awt.Color(123, 63, 0));
    pageTitle3.setText("AUTHOR DETAILS");

    authorIDSubtitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    authorIDSubtitle.setForeground(new java.awt.Color(123, 63, 0));
    authorIDSubtitle.setText("AUTHOR ID");

    authorIdLabel.setEditable(false);
    authorIdLabel.setBackground(new java.awt.Color(250, 250, 250));
    authorIdLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
    authorIdLabel.setBorder(null);

    authorNameSubtitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    authorNameSubtitle.setForeground(new java.awt.Color(123, 63, 0));
    authorNameSubtitle.setText("NAME");

    authorName.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

    authorBirthdaySubtitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    authorBirthdaySubtitle.setForeground(new java.awt.Color(123, 63, 0));
    authorBirthdaySubtitle.setText("BIRTHDAY");

    addAuthor.setBackground(new java.awt.Color(123, 63, 0));
    addAuthor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
    addAuthor.setForeground(new java.awt.Color(255, 255, 255));
    addAuthor.setText("Add");
    addAuthor.setBorder(null);
    addAuthor.setBorderPainted(false);
    addAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    addAuthor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addAuthorActionPerformed(evt);
        }
    });

    updateAuthor.setBackground(new java.awt.Color(123, 63, 0));
    updateAuthor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
    updateAuthor.setForeground(new java.awt.Color(255, 255, 255));
    updateAuthor.setText("Update");
    updateAuthor.setBorder(null);
    updateAuthor.setBorderPainted(false);
    updateAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    updateAuthor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            updateAuthorActionPerformed(evt);
        }
    });

    deleteAuthor.setBackground(new java.awt.Color(123, 63, 0));
    deleteAuthor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
    deleteAuthor.setForeground(new java.awt.Color(255, 255, 255));
    deleteAuthor.setText("Delete");
    deleteAuthor.setBorder(null);
    deleteAuthor.setBorderPainted(false);
    deleteAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    deleteAuthor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteAuthorActionPerformed(evt);
        }
    });

    clearAuthor.setBackground(new java.awt.Color(123, 63, 0));
    clearAuthor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
    clearAuthor.setForeground(new java.awt.Color(255, 255, 255));
    clearAuthor.setText("Clear");
    clearAuthor.setBorder(null);
    clearAuthor.setBorderPainted(false);
    clearAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    clearAuthor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            clearAuthorActionPerformed(evt);
        }
    });

    authorInventoryTable.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
    authorInventoryTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "AUTHOR ID", "NAME", "BIRTHDAY", "COUNTRY"
        }
    ) {
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false; // Make all cells non-editable
        }
    }
    );
    authorInventoryTable.setSelectionBackground(new java.awt.Color(217, 185, 155));
    authorInventoryTable.setSelectionForeground(new java.awt.Color(102, 102, 102));
    authorInventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            authorInventoryTableMouseClicked(evt);
        }
    });
    customerInventoryTableScroll1.setViewportView(authorInventoryTable);

    customerInventorySubtitle1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
    customerInventorySubtitle1.setForeground(new java.awt.Color(123, 63, 0));
    customerInventorySubtitle1.setText("Author Inventory");

    authorCountrySubtitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    authorCountrySubtitle.setForeground(new java.awt.Color(123, 63, 0));
    authorCountrySubtitle.setText("COUNTRY");

    authorCountry.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

    authorImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    authorImage.setEditable(true);
    authorImage.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

    uploadAuthorImage.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
    uploadAuthorImage.setText("Upload");
    uploadAuthorImage.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            uploadAuthorImageActionPerformed(evt);
        }
    });

    authorBiographyLabel.setBackground(new java.awt.Color(255, 255, 255));
    authorBiographyLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
    authorBiographyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    authorBiographyLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    uploadAuthorBiography.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
    uploadAuthorBiography.setText("Upload");
    uploadAuthorBiography.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            uploadAuthorBiographyActionPerformed(evt);
        }
    });

    authorBirthday.setDateFormatString("yyyy-MM-dd");

    imageofAuthor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    imageofAuthor.setForeground(new java.awt.Color(123, 63, 0));
    imageofAuthor.setText("IMAGE");

    biographyofAuthor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    biographyofAuthor.setForeground(new java.awt.Color(123, 63, 0));
    biographyofAuthor.setText("BIOGRAPHY");

    authorBiography.setColumns(20);
    authorBiography.setLineWrap(true);
    authorBiography.setRows(5);
    jScrollPane2.setViewportView(authorBiography);

    javax.swing.GroupLayout authorDetailsTabLayout = new javax.swing.GroupLayout(authorDetailsTab);
    authorDetailsTab.setLayout(authorDetailsTabLayout);
    authorDetailsTabLayout.setHorizontalGroup(
        authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(authorDetailsTabLayout.createSequentialGroup()
            .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(authorDetailsTabLayout.createSequentialGroup()
                    .addGap(580, 580, 580)
                    .addComponent(customerInventorySubtitle1))
                .addGroup(authorDetailsTabLayout.createSequentialGroup()
                    .addGap(223, 223, 223)
                    .addComponent(customerInventoryTableScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(authorDetailsTabLayout.createSequentialGroup()
                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(authorDetailsTabLayout.createSequentialGroup()
                            .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(authorDetailsTabLayout.createSequentialGroup()
                                    .addGap(160, 160, 160)
                                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(authorBirthdaySubtitle)
                                        .addComponent(authorCountrySubtitle))
                                    .addGap(18, 18, 18)
                                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(authorCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                        .addComponent(authorBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(authorDetailsTabLayout.createSequentialGroup()
                                    .addGap(88, 88, 88)
                                    .addComponent(addAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(updateAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(deleteAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(clearAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(36, 36, 36)
                            .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(authorImage)
                                .addComponent(authorImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(uploadAuthorImage))
                        .addGroup(authorDetailsTabLayout.createSequentialGroup()
                            .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(authorDetailsTabLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(authorNameSubtitle)
                                    .addGap(40, 40, 40)
                                    .addComponent(authorName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, authorDetailsTabLayout.createSequentialGroup()
                                    .addGap(152, 152, 152)
                                    .addComponent(authorIDSubtitle)
                                    .addGap(18, 18, 18)
                                    .addComponent(authorIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(201, 201, 201)
                            .addComponent(imageofAuthor))
                        .addGroup(authorDetailsTabLayout.createSequentialGroup()
                            .addGap(501, 501, 501)
                            .addComponent(pageTitle3)))
                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(authorDetailsTabLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(authorBiographyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                .addComponent(jScrollPane2))
                            .addGap(12, 12, 12)
                            .addComponent(uploadAuthorBiography))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, authorDetailsTabLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(biographyofAuthor)
                            .addGap(197, 197, 197)))))
            .addContainerGap(9, Short.MAX_VALUE))
    );
    authorDetailsTabLayout.setVerticalGroup(
        authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(authorDetailsTabLayout.createSequentialGroup()
            .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(authorDetailsTabLayout.createSequentialGroup()
                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(authorDetailsTabLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(pageTitle3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(imageofAuthor)
                            .addGap(5, 5, 5))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, authorDetailsTabLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(biographyofAuthor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(authorDetailsTabLayout.createSequentialGroup()
                            .addComponent(authorImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(authorDetailsTabLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(updateAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clearAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, authorDetailsTabLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(authorImage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(uploadAuthorImage)))))
                        .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(uploadAuthorBiography)
                            .addGroup(authorDetailsTabLayout.createSequentialGroup()
                                .addComponent(authorBiographyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(authorDetailsTabLayout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(authorIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(authorIDSubtitle))
                    .addGap(18, 18, 18)
                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(authorName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(authorNameSubtitle))
                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(authorDetailsTabLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(authorBirthdaySubtitle))
                        .addGroup(authorDetailsTabLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(authorBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(31, 31, 31)
                    .addGroup(authorDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(authorCountrySubtitle)
                        .addComponent(authorCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(36, 36, 36)
            .addComponent(customerInventorySubtitle1)
            .addGap(18, 18, 18)
            .addComponent(customerInventoryTableScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 26, Short.MAX_VALUE))
    );

    adminScreen.addTab("Author Details", authorDetailsTab);

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
    searchPurchase.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            searchPurchaseKeyReleased(evt);
        }
    });

    searchIcon.setBackground(new java.awt.Color(255, 255, 255));
    searchIcon.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
    searchIcon.setForeground(new java.awt.Color(123, 63, 0));
    searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Literarium/Images/Search.png"))); // NOI18N

    customerIDSubtitle2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    customerIDSubtitle2.setForeground(new java.awt.Color(123, 63, 0));
    customerIDSubtitle2.setText("PURCHASE ID");

    purchaseBillLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    javax.swing.GroupLayout purchaseHistoryTabLayout = new javax.swing.GroupLayout(purchaseHistoryTab);
    purchaseHistoryTab.setLayout(purchaseHistoryTabLayout);
    purchaseHistoryTabLayout.setHorizontalGroup(
        purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
            .addGap(122, 122, 122)
            .addGroup(purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
                    .addComponent(customerIDSubtitle2)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
                    .addGroup(purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
                            .addComponent(searchPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
                            .addComponent(customerInventoryTableScroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(purchaseBillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(117, Short.MAX_VALUE))))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaseHistoryTabLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageTitle5)
            .addGap(452, 452, 452))
    );
    purchaseHistoryTabLayout.setVerticalGroup(
        purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(purchaseHistoryTabLayout.createSequentialGroup()
            .addGap(49, 49, 49)
            .addComponent(pageTitle5)
            .addGap(37, 37, 37)
            .addComponent(customerIDSubtitle2)
            .addGap(15, 15, 15)
            .addGroup(purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(searchPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(37, 37, 37)
            .addGroup(purchaseHistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(purchaseBillLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customerInventoryTableScroll3, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
            .addContainerGap(185, Short.MAX_VALUE))
    );

    adminScreen.addTab("Purchase History", purchaseHistoryTab);

    publisherDetailsTab.setBackground(new java.awt.Color(250, 250, 250));

    pageTitle4.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 36)); // NOI18N
    pageTitle4.setForeground(new java.awt.Color(123, 63, 0));
    pageTitle4.setText("PUBLISHER DETAILS");

    publisherIDSubtitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    publisherIDSubtitle.setForeground(new java.awt.Color(123, 63, 0));
    publisherIDSubtitle.setText("PUBLISHER ID");

    publisherId.setEditable(false);
    publisherId.setBackground(new java.awt.Color(250, 250, 250));
    publisherId.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
    publisherId.setBorder(null);

    publisherNameSubtitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    publisherNameSubtitle.setForeground(new java.awt.Color(123, 63, 0));
    publisherNameSubtitle.setText("NAME");

    publisherName.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

    emailSubtitle1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    emailSubtitle1.setForeground(new java.awt.Color(123, 63, 0));
    emailSubtitle1.setText("ADDRESS");

    publisherAddress.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

    addPublisher.setBackground(new java.awt.Color(123, 63, 0));
    addPublisher.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
    addPublisher.setForeground(new java.awt.Color(255, 255, 255));
    addPublisher.setText("Add");
    addPublisher.setBorder(null);
    addPublisher.setBorderPainted(false);
    addPublisher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    addPublisher.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addPublisherActionPerformed(evt);
        }
    });

    updatePublisher.setBackground(new java.awt.Color(123, 63, 0));
    updatePublisher.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
    updatePublisher.setForeground(new java.awt.Color(255, 255, 255));
    updatePublisher.setText("Update");
    updatePublisher.setBorder(null);
    updatePublisher.setBorderPainted(false);
    updatePublisher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    updatePublisher.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            updatePublisherActionPerformed(evt);
        }
    });

    deletePublisher.setBackground(new java.awt.Color(123, 63, 0));
    deletePublisher.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
    deletePublisher.setForeground(new java.awt.Color(255, 255, 255));
    deletePublisher.setText("Delete");
    deletePublisher.setBorder(null);
    deletePublisher.setBorderPainted(false);
    deletePublisher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    deletePublisher.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deletePublisherActionPerformed(evt);
        }
    });

    clearPublisher.setBackground(new java.awt.Color(123, 63, 0));
    clearPublisher.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
    clearPublisher.setForeground(new java.awt.Color(255, 255, 255));
    clearPublisher.setText("Clear");
    clearPublisher.setBorder(null);
    clearPublisher.setBorderPainted(false);
    clearPublisher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    clearPublisher.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            clearPublisherActionPerformed(evt);
        }
    });

    publisherInventoryTable.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
    publisherInventoryTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "PUBLISHER ID", "NAME", "ADDRESS"
        }
    ) {
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false; // Make all cells non-editable
        }
    }
    );
    publisherInventoryTable.setSelectionBackground(new java.awt.Color(217, 185, 155));
    publisherInventoryTable.setSelectionForeground(new java.awt.Color(102, 102, 102));
    publisherInventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            publisherInventoryTableMouseClicked(evt);
        }
    });
    customerInventoryTableScroll2.setViewportView(publisherInventoryTable);

    publisherInventorySubtitle.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
    publisherInventorySubtitle.setForeground(new java.awt.Color(123, 63, 0));
    publisherInventorySubtitle.setText("Publisher Inventory");

    javax.swing.GroupLayout publisherDetailsTabLayout = new javax.swing.GroupLayout(publisherDetailsTab);
    publisherDetailsTab.setLayout(publisherDetailsTabLayout);
    publisherDetailsTabLayout.setHorizontalGroup(
        publisherDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(publisherDetailsTabLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(publisherDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(publisherNameSubtitle)
                .addComponent(publisherIDSubtitle))
            .addGap(43, 43, 43)
            .addGroup(publisherDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(publisherId, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(publisherDetailsTabLayout.createSequentialGroup()
                    .addComponent(publisherName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(58, 58, 58)
                    .addComponent(emailSubtitle1)))
            .addGap(80, 80, 80)
            .addComponent(publisherAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(publisherDetailsTabLayout.createSequentialGroup()
            .addGap(491, 491, 491)
            .addComponent(pageTitle4)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(publisherDetailsTabLayout.createSequentialGroup()
            .addGroup(publisherDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(publisherDetailsTabLayout.createSequentialGroup()
                    .addGap(584, 584, 584)
                    .addComponent(publisherInventorySubtitle))
                .addGroup(publisherDetailsTabLayout.createSequentialGroup()
                    .addGap(398, 398, 398)
                    .addComponent(addPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(86, 86, 86)
                    .addComponent(updatePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(97, 97, 97)
                    .addComponent(deletePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(85, 85, 85)
                    .addComponent(clearPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(262, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, publisherDetailsTabLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(customerInventoryTableScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(175, 175, 175))
    );
    publisherDetailsTabLayout.setVerticalGroup(
        publisherDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(publisherDetailsTabLayout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addComponent(pageTitle4)
            .addGap(45, 45, 45)
            .addGroup(publisherDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(publisherId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(emailSubtitle1)
                .addComponent(publisherAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(publisherIDSubtitle))
            .addGap(18, 18, 18)
            .addGroup(publisherDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(publisherName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(publisherNameSubtitle))
            .addGap(37, 37, 37)
            .addGroup(publisherDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(updatePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(deletePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(clearPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(35, 35, 35)
            .addComponent(publisherInventorySubtitle)
            .addGap(18, 18, 18)
            .addComponent(customerInventoryTableScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(115, Short.MAX_VALUE))
    );

    adminScreen.addTab("Publisher Details", publisherDetailsTab);

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
            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout)
            .addContainerGap())
        .addGroup(borderPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(adminScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 1314, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        .addComponent(borderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private PreparedStatement Ps;
    
    public Admin() {
        initComponents();
        Con = databaseConnection.mycon();
        populateTablePublisher();
        populateTableBooks();
        populateTableCust();
        populateTableAuthor();
        populateTablePurchases();
        populateAuthorNameComboBox();
        populatePublisherNameComboBox();
    }
    
    // add book 
    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        // Get selected author name from the combo box
        Object selectedAuthorNameObject = authorNameComboBox.getSelectedItem();
        
        // Get selected publisher name from the combo box
        Object selectedPublisherNameObject = publisherNameComboBox.getSelectedItem();

        // Check if an author is selected
        if (selectedAuthorNameObject == null) {
            JOptionPane.showMessageDialog(this, "Please select an author before adding the book.");
            return;
        }
       
        // Check if a publisher is selected
        if (selectedPublisherNameObject == null) {
            JOptionPane.showMessageDialog(this, "Please select a publisher before adding the book.");
            return;
        }

        // Convert the selected author name to a string
        String selectedAuthorName = selectedAuthorNameObject.toString();
        
        // Convert the selected publisher name to a string
        String selectedPublisherName = selectedPublisherNameObject.toString();
        
        // Find the author ID based on the selected author name
        int selectedAuthorId = findAuthorIdByName(selectedAuthorName);
        
        // Find the publisher ID based on the selected publisher name
        int selectedPublisherId = findPublisherIdByName(selectedPublisherName);

        String bookTitleText = bookTitleLabel.getText();
        String bookPriceText = bookPriceLabel.getText();
        String bookQtyText = bookQtyLabel.getText();
        String bookImageText = bookImage.getText();
        String bookSynopsisText = bookSynopsis.getText();

        // Check if an image is selected
        if (bookImageText == null || bookImageText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please upload an image before adding the book.");
            return;
        }

        // Use PreparedStatement to avoid SQL injection
        String insertBookQuery = "INSERT INTO Book (authorId, title, price, quantity, image, synopsis, publisherId) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement insertBookStatement = databaseConnection.mycon().prepareStatement(insertBookQuery)) {
            // Use the found author ID when inserting the book
            insertBookStatement.setInt(1, selectedAuthorId);
            insertBookStatement.setString(2, bookTitleText);
            insertBookStatement.setString(3, bookPriceText);
            insertBookStatement.setString(4, bookQtyText);
            insertBookStatement.setString(5, bookImageText);
            insertBookStatement.setString(6, bookSynopsisText);
            insertBookStatement.setInt(7, selectedPublisherId);

            int bookRowsAffected = insertBookStatement.executeUpdate();

            // Check if the insert was successful
            if (bookRowsAffected > 0) {
                System.out.println("Book recorded successfully. Rows affected: " + bookRowsAffected);
            } else {
                System.out.println("Failed to record book. No rows affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle potential SQLException
        }

        JOptionPane.showMessageDialog(null, "Book successfully added!");

        // Clear text fields
        bookTitleLabel.setText(null);
        bookPriceLabel.setText(null);
        bookQtyLabel.setText(null);
        bookImage.setText(null);
        bookImageLabel.setIcon(null);
        bookSynopsis.setText(null);
        bookSynopsisLabel.setText(null);
        authorNameComboBox.setSelectedItem(null);
        publisherNameComboBox.setSelectedItem(null);

        // Refresh the table or perform other necessary actions
        refreshTables();
    }//GEN-LAST:event_addBookActionPerformed

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

// Method to find the publisher ID based on the publisher name
private int findPublisherIdByName(String publisherName) {
    int publisherId = -1;  // Default value if publisher ID is not found

    // Query the database to find the publisher ID based on the author name
    String query = "SELECT publisherId FROM Publisher WHERE publisherName = ?";

    try (PreparedStatement preparedStatement = databaseConnection.mycon().prepareStatement(query)) {
        preparedStatement.setString(1, publisherName);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            publisherId = resultSet.getInt("publisherId");
        }

    } catch (SQLException e) {
        e.printStackTrace(); // Handle potential SQLException
    }

    return publisherId;
}

    
    // update book
    private void updateBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookActionPerformed
        // Validate quantity and price inputs
        try {
            float price = Float.parseFloat(bookPriceLabel.getText());
            int qty = Integer.parseInt(bookQtyLabel.getText());

            if (qty <= 0 || price <= 0) {
                JOptionPane.showMessageDialog(null, "Please enter a positive quantity and price.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid quantity and price values.");
            return;
        }

        // Update book details in the database
        String updateBookQuery = "UPDATE Book SET authorId = ?, title = ?, price = ?, quantity = ?, image = ?, synopsis = ?, publisherId = ? WHERE bookId = ?";

        try (PreparedStatement updateBookStatement = databaseConnection.mycon().prepareStatement(updateBookQuery)) {
            Object selectedAuthorNameObject = authorNameComboBox.getSelectedItem();
            Object selectedPublisherNameObject = publisherNameComboBox.getSelectedItem();
            if (selectedAuthorNameObject == null) {
                JOptionPane.showMessageDialog(this, "Please select an author before updating the book.");
                return;
            }
            
            if (selectedPublisherNameObject == null) {
                JOptionPane.showMessageDialog(this, "Please select a publisher before updating the book.");
                return;
            }
            
            String selectedAuthorName = selectedAuthorNameObject.toString();
            String selectedPublisherName = selectedPublisherNameObject.toString();

            // Find the author ID based on the selected author name
            int selectedAuthorId = findAuthorIdByName(selectedAuthorName);
            
            // Find the publisher ID based on the selected publisher name
            int selectedPublisherId = findPublisherIdByName(selectedPublisherName);

            updateBookStatement.setInt(1, selectedAuthorId);
            updateBookStatement.setString(2, bookTitleLabel.getText().trim());
            updateBookStatement.setString(3, bookPriceLabel.getText().trim());
            updateBookStatement.setString(4, bookQtyLabel.getText().trim());
            updateBookStatement.setString(5, bookImage.getText().trim());
            updateBookStatement.setString(6, bookSynopsis.getText().trim());
            updateBookStatement.setInt(7, selectedPublisherId);
            updateBookStatement.setString(8, bookIdLabel.getText().trim());

            int bookRowsAffected = updateBookStatement.executeUpdate();

            // Check if the update was successful
            if (bookRowsAffected > 0) {
                System.out.println("Book updated successfully. Rows affected: " + bookRowsAffected);
            } else {
                System.out.println("Failed to update book. No rows affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle potential SQLException
        }

        // Update the table with the updated value
        refreshTables();

        JOptionPane.showMessageDialog(null, "Book successfully updated!");

        // Clear text fields
        bookIdLabel.setText(null);
        bookTitleLabel.setText(null);
        bookPriceLabel.setText(null);
        bookQtyLabel.setText(null);
        bookImageLabel.setIcon(null);
        bookSynopsisLabel.setText(null);
        bookImage.setText(null);
        bookSynopsis.setText(null);
        authorNameComboBox.setSelectedItem(null);
        publisherNameComboBox.setSelectedItem(null);
    }//GEN-LAST:event_updateBookActionPerformed

    // book inventory table clicked
    private void bookInventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookInventoryTableMouseClicked
        int index = bookInventoryTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) bookInventoryTable.getModel();

        String authorName = model.getValueAt(index, 1).toString();
        String publisherName = model.getValueAt(index, 7).toString();


        authorNameComboBox.setSelectedItem(authorName);
     
        publisherNameComboBox.setSelectedItem(publisherName);

        // Retrieve authorId based on authorName
        String authorId = getAuthorId(authorName);

        String id = model.getValueAt(index, 0).toString();
        bookTitleLabel.setText(model.getValueAt(index, 2).toString());
        bookPriceLabel.setText(model.getValueAt(index, 3).toString());
        bookQtyLabel.setText(model.getValueAt(index, 4).toString());
        bookSynopsis.setText(model.getValueAt(index, 5).toString());
        bookImage.setText(model.getValueAt(index,6).toString());
 
        // Retrieve publisherId based on publisherName
        String publisherId = getPublisherId(publisherName);
        
        String bookImage = "";
        String bookSynopsis = "";

        // Assuming the bookIdLabel is a JTextField
        String bookId = model.getValueAt(index, 0).toString();
        bookIdLabel.setText(bookId);

        try {
            // Establish a connection to the database
            Connection conn = databaseConnection.mycon();

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
       
    }//GEN-LAST:event_bookInventoryTableMouseClicked


// Helper method to get authorId based on authorName
private String getAuthorId(String authorName) {
    String authorId = "";

    try {
        // Establish a connection to the database
        Connection conn = databaseConnection.mycon();

        // Create a statement for executing SQL queries
        Statement stmt = conn.createStatement();

        // Replace "Author" with the actual table name and "authorName" with the actual column name
        final String AUTHOR_ID_QUERY = "SELECT authorId FROM Author WHERE authorName = '" + authorName + "'";
        ResultSet resultSet = stmt.executeQuery(AUTHOR_ID_QUERY);

        if (resultSet.next()) {
            authorId = resultSet.getString("authorId");
        }

        // Close the result set and statement
        resultSet.close();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage());
    }

    return authorId;
}

// Helper method to get publisherId based on publisherName
private String getPublisherId(String publisherName) {
    String publisherId = "";
    
    
    try {
        // Establish a connection to the database
        Connection conn = databaseConnection.mycon();

        // Create a statement for executing SQL queries
        Statement stmt = conn.createStatement();

        // Replace "Publisher" with the actual table name and "publisherName" with the actual column name
        final String PUBLISHER_ID_QUERY = "SELECT publisherId FROM Publisher WHERE publisherName = '" + publisherName + "'";
        ResultSet resultSet = stmt.executeQuery(PUBLISHER_ID_QUERY);

        if (resultSet.next()) {
            publisherId = resultSet.getString("publisherId");
        }

        // Close the result set and statement
        resultSet.close();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage());
    }

    return publisherId;
}

     // clear book
    private void clearBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBookActionPerformed
        bookIdLabel.setText(null);
        bookTitleLabel.setText(null);
        bookPriceLabel.setText(null);
        bookQtyLabel.setText(null);
        bookImageLabel.setIcon(null);
        bookSynopsisLabel.setText(null);
        bookImage.setText(null);
        bookSynopsis.setText(null);
        authorNameComboBox.setSelectedItem(null);
        publisherNameComboBox.setSelectedItem(null);

    }//GEN-LAST:event_clearBookActionPerformed
    
    // delete book
    private void deleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookActionPerformed
        // Get the book ID from the label
        String bookId = bookIdLabel.getText().trim();

        if (bookId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a book to delete.");
            return;
        }

        // Delete book data from the database
        removeBookFromDataBase(bookId);

        DefaultTableModel model = (DefaultTableModel) bookInventoryTable.getModel();

        // If a single row is selected
        if (bookInventoryTable.getSelectedRowCount() == 1) {
            model.removeRow(bookInventoryTable.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Book successfully deleted.");
        } else if (bookInventoryTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No data available in the table.");
        } else {
            JOptionPane.showMessageDialog(null, "Please choose a single row to perform the delete.");
        }

        
        bookIdLabel.setText(null);
        bookTitleLabel.setText(null);
        bookPriceLabel.setText(null);
        bookQtyLabel.setText(null);
        bookImageLabel.setIcon(null);
        bookSynopsisLabel.setText(null);
        bookImage.setText(null);
        bookSynopsis.setText(null);
        authorNameComboBox.setSelectedItem(null);
        publisherNameComboBox.setSelectedItem(null);
    }//GEN-LAST:event_deleteBookActionPerformed

// Update this method to delete a book from the database
private void removeBookFromDataBase(String bookId) {
    try {
        // Use PreparedStatement to avoid SQL injection
        String deleteBookQuery = "DELETE FROM Book WHERE bookId = ?";

        try (PreparedStatement deleteBookStatement = databaseConnection.mycon().prepareStatement(deleteBookQuery)) {
            deleteBookStatement.setString(1, bookId);

            int rowsAffected = deleteBookStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Book deleted successfully. Rows affected: " + rowsAffected);
            } else {
                System.out.println("Failed to delete book. No rows affected.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Handle potential SQLException
    }
}

    // upload book image
    private void uploadBookImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBookImageActionPerformed
        // Retrieve the image name from the JTextField named bookImage
        String imageName = bookImage.getText();

        // Check if the user entered a name
        if (imageName != null && !imageName.isEmpty()) {
            try {
                String destinationPath = "src/Literarium/Images/bookImgs/" + imageName + ".jpg";
                File imageFile = new File(destinationPath);

                // Check if the file exists
                if (!imageFile.exists()) {
                    JOptionPane.showMessageDialog(this, "Image file does not exist: " + destinationPath);
                    return;
                }

                // Load the image using ImageIO
                BufferedImage image = ImageIO.read(imageFile);

                // Check if the image is successfully loaded
                if (image == null) {
                    JOptionPane.showMessageDialog(this, "Error reading the image file: " + destinationPath);
                    return;
                }

                // Display the image in the JTextField named bookImageLabel
                ImageIcon imageIcon = new ImageIcon(image);
                bookImageLabel.setIcon(imageIcon);

                // Perform the upload (no need to copy a file since we're not selecting from a file)
                JOptionPane.showMessageDialog(this, "Image uploaded successfully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in uploading the image.");
                e.printStackTrace(); // Print the stack trace for debugging
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid image name.");
        }
    }//GEN-LAST:event_uploadBookImageActionPerformed

   // upload book synopsis
    private void uploadBookSynopsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBookSynopsisActionPerformed
        // Assuming 'bookSynopsis' is a JTextField
        String synopsisText = bookSynopsis.getText();

        // Check if the user entered a synopsis
        if (synopsisText != null && !synopsisText.isEmpty()) {
            // Display the synopsis in the JLabel named 'bookSynopsisLabel'
            bookSynopsisLabel.setText(synopsisText);

            // Display a message or perform any additional actions if needed
            JOptionPane.showMessageDialog(this, "Synopsis added successfully!");
        } else {
            // Inform the user that they need to enter a synopsis
            JOptionPane.showMessageDialog(this, "Please enter a synopsis before uploading.");
        }
    }//GEN-LAST:event_uploadBookSynopsisActionPerformed

    // add customer
    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed
        // Assuming customerGender is a JComboBox<String>
        Object customerGenderText = customerGender.getSelectedItem();

        String customerNameText = customerName.getText();
        String customerEmailText = customerEmail.getText();
        String customerPassText = customerPass.getText();
        String customerAddressText = customerAddress.getText();

        // Use PreparedStatement to avoid SQL injection
        String insertCustomerQuery = "INSERT INTO Customer (customerName, gender, pass, email, address) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement insertCustomerStatement = databaseConnection.mycon().prepareStatement(insertCustomerQuery)) {
            insertCustomerStatement.setString(1, customerNameText);
            insertCustomerStatement.setString(2, customerGenderText.toString()); // Assuming customerGender is a JComboBox<String>
            insertCustomerStatement.setString(3, customerPassText);
            insertCustomerStatement.setString(4, customerEmailText);
            insertCustomerStatement.setString(5, customerAddressText);

            int customerRowsAffected = insertCustomerStatement.executeUpdate();

            // Check if the insert was successful
            if (customerRowsAffected > 0) {
                System.out.println("Customer recorded successfully. Rows affected: " + customerRowsAffected);
            } else {
                System.out.println("Failed to record customer. No rows affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle potential SQLException
        }

        JOptionPane.showMessageDialog(null, "Data successfully added!");

        // Clear text fields
        customerName.setText(null);
        customerGender.setSelectedIndex(0);  // Assuming the default selection is the first item
        customerPass.setText(null);
        customerEmail.setText(null);
        customerAddress.setText(null);

        // Refresh the table
        refreshTables();
    }//GEN-LAST:event_addCustomerActionPerformed

    // update customer
    private void updateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerActionPerformed
        // Update customer details in the database
        String updateCustomerQuery = "UPDATE Customer SET customerName = ?, gender = ?, pass = ?, email = ?, address = ? WHERE customerId = ?";

        try (PreparedStatement updateCustomerStatement = databaseConnection.mycon().prepareStatement(updateCustomerQuery)) {
            updateCustomerStatement.setString(1, customerName.getText().trim()); 
            updateCustomerStatement.setString(2, (String) customerGender.getSelectedItem());
            updateCustomerStatement.setString(3, customerPass.getText().trim());
            updateCustomerStatement.setString(4, customerEmail.getText().trim());
            updateCustomerStatement.setString(5, customerAddress.getText().trim());
            updateCustomerStatement.setString(6, customerIdLabel.getText().trim());

            int customerRowsAffected = updateCustomerStatement.executeUpdate();

            // Check if the update was successful
            if (customerRowsAffected > 0) {
                System.out.println("Customer updated successfully. Rows affected: " + customerRowsAffected);
            } else {
                System.out.println("Failed to update customer. No rows affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle potential SQLException
        }

        // Update the table with the updated value
        DefaultTableModel model = (DefaultTableModel) customerInventoryTable.getModel();
        int selectedRow = customerInventoryTable.getSelectedRow();

        if (selectedRow >= 0) {
            Object[] updatedRow = {
                customerIdLabel.getText().trim(),
                customerName.getText().trim(),
                customerGender.getSelectedItem(),
                customerPass.getText().trim(),
                customerEmail.getText().trim(),
                customerAddress.getText().trim()
            };

            model.removeRow(selectedRow);  // Remove the old row
            model.insertRow(selectedRow, updatedRow);  // Insert the updated row at the same position

            // Update the table with the updated value
            refreshTables();

            JOptionPane.showMessageDialog(null, "Customer successfully updated!");

            // Clear text fields
            customerName.setText(null);
            customerGender.setSelectedIndex(0);
            customerPass.setText(null);
            customerEmail.setText(null);
            customerAddress.setText(null);
        } else {
            System.out.println("No row selected in the table.");
        }

    }//GEN-LAST:event_updateCustomerActionPerformed

      
     // delete customer
    private void deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerActionPerformed
        // Get the customer ID from the label
        String customerId = customerIdLabel.getText().trim();

        if (customerId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a customer to delete.");
            return;
        }

        // Delete book data from the database
        removeCustomerFromDatabase(customerId);

        DefaultTableModel model = (DefaultTableModel) customerInventoryTable.getModel();

        // If a single row is selected
        if (customerInventoryTable.getSelectedRowCount() == 1) {
            model.removeRow(customerInventoryTable.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Customer successfully deleted.");
        } else if (customerInventoryTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No data available in the table.");
        } else {
            JOptionPane.showMessageDialog(null, "Please choose a single row to perform the delete.");
        }
     
        customerIdLabel.setText(null);
        customerEmail.setText(null);
        customerName.setText(null);
        customerGender.setSelectedItem(null);
        customerAddress.setText(null);
    }//GEN-LAST:event_deleteCustomerActionPerformed
                           
// Update this method to delete a book from the database
private void removeCustomerFromDatabase(String customerId) {
    try {
        // Use PreparedStatement to avoid SQL injection
        String deleteCustomerQuery = "DELETE FROM Customer WHERE customerId = ?";

        try (PreparedStatement deleteCustomerStatement = databaseConnection.mycon().prepareStatement(deleteCustomerQuery)) {
            deleteCustomerStatement.setString(1, customerId);

            int rowsAffected = deleteCustomerStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Customer deleted successfully. Rows affected: " + rowsAffected);
            } else {
                System.out.println("Failed to delete customer. No rows affected.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Handle potential SQLException
    }
}

    // clear customer
    private void clearCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCustomerActionPerformed
        customerIdLabel.setText(null);
        customerName.setText(null);
        customerEmail.setText(null);
        customerGender.setSelectedItem(null);
        customerAddress.setText(null);
        customerPass.setText(null);
    }//GEN-LAST:event_clearCustomerActionPerformed

    // logout
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    // customer inventory table clicked
    private void customerInventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerInventoryTableMouseClicked
        int index = customerInventoryTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) customerInventoryTable.getModel();

        customerIdLabel.setText(model.getValueAt(index, 0).toString());
        customerName.setText(model.getValueAt(index, 1).toString());
        customerGender.setSelectedItem(model.getValueAt(index, 2).toString());
        customerPass.setText(model.getValueAt(index, 3).toString());
        customerEmail.setText(model.getValueAt(index, 4).toString());
        customerAddress.setText(model.getValueAt(index, 5).toString());
    }//GEN-LAST:event_customerInventoryTableMouseClicked

    
     // add author
    private void addAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuthorActionPerformed
        String authorNameText = authorName.getText();
        
        // Get the selected date from JCalendar
        Date selectedDate = authorBirthday.getDate();

        // Format the date as text using SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String authorBirthdayText = dateFormat.format(selectedDate);

        String authorCountryText = authorCountry.getText();
        String authorImageText = authorImage.getText();
        String authorBiographyText = authorBiography.getText();

        // Check if an image is selected
        if (authorImageText == null || authorImageText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please upload an image before adding the author.");
            return;
        }

        // Use PreparedStatement to avoid SQL injection
        String insertAuthorQuery = "INSERT INTO Author (authorName, birthday, image, biography, country) VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement insertAuthorStatement = databaseConnection.mycon().prepareStatement(insertAuthorQuery)) {
            insertAuthorStatement.setString(1, authorNameText);
            insertAuthorStatement.setString(2, authorBirthdayText);
            insertAuthorStatement.setString(3, authorImageText);
            insertAuthorStatement.setString(4, authorBiographyText);
            insertAuthorStatement.setString(5, authorCountryText);

            int authorRowsAffected = insertAuthorStatement.executeUpdate();

            // Check if the insert was successful
            if (authorRowsAffected > 0) {
                System.out.println("Author recorded successfully. Rows affected: " + authorRowsAffected);
            } else {
                System.out.println("Failed to record author. No rows affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle potential SQLException
        }

        JOptionPane.showMessageDialog(null, "Author successfully added!");

        // Clear text fields
        authorIdLabel.setText(null);
        authorName.setText(null);
        authorBirthday.setDate(null);
        authorCountry.setText(null);
        authorImage.setText(null);
        authorImageLabel.setIcon(null);
        authorBiography.setText(null);
        authorBiographyLabel.setText(null);

        // Refresh the table or perform other necessary actions
         refreshTables();
    }//GEN-LAST:event_addAuthorActionPerformed

    // update author
    private void updateAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAuthorActionPerformed
        // Update book details in the database
        String updateAuthorQuery = "UPDATE Author SET authorName = ?, birthday = ?, image = ?, biography = ?, country = ? WHERE authorId = ?";

        // Convert the Date object to a formatted String
        Date selectedDate = authorBirthday.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String authorBirthdayText = dateFormat.format(selectedDate);
            
        try (PreparedStatement updateAuthorStatement = databaseConnection.mycon().prepareStatement(updateAuthorQuery)) {
            updateAuthorStatement.setString(1, authorName.getText().trim());
            updateAuthorStatement.setString(2, authorBirthdayText); 
            updateAuthorStatement.setString(3, authorImage.getText().trim()); 
            updateAuthorStatement.setString(4, authorBiography.getText().trim());
            updateAuthorStatement.setString(5, authorCountry.getText().trim());
            updateAuthorStatement.setString(6, authorIdLabel.getText().trim());

            int authorRowsAffected = updateAuthorStatement.executeUpdate();

            // Check if the update was successful
            if (authorRowsAffected > 0) {
                System.out.println("Author updated successfully. Rows affected: " + authorRowsAffected);
            } else {
                System.out.println("Failed to update author. No rows affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle potential SQLException
        }

        // Update the table with the updated value
        DefaultTableModel model = (DefaultTableModel) authorInventoryTable.getModel();
        model.setValueAt(authorName.getText().trim(), authorInventoryTable.getSelectedRow(), 1);
        model.setValueAt(authorBirthdayText, authorInventoryTable.getSelectedRow(), 2);
        model.setValueAt(authorImage.getText(), authorInventoryTable.getSelectedRow(), 3);
        model.setValueAt(authorBiography.getText().trim(), authorInventoryTable.getSelectedRow(), 4);
        model.setValueAt(authorCountry.getText().trim(), authorInventoryTable.getSelectedRow(), 5);

        // Update the table with the updated value
        refreshTables();

        JOptionPane.showMessageDialog(null, "Author successfully updated!");

        // Clear text fields
        authorIdLabel.setText(null);
        authorName.setText(null);
        authorBirthday.setDate(null);
        authorCountry.setText(null);
        authorImage.setText(null);
        authorImageLabel.setIcon(null);
        authorBiography.setText(null);
        authorBiographyLabel.setText(null);
    }//GEN-LAST:event_updateAuthorActionPerformed

     // delete author
    private void deleteAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAuthorActionPerformed
        // Get the author ID from the label
        String authorId = authorIdLabel.getText().trim();

        if (authorId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select an author to delete.");
            return;
        }

        // Delete author data from the database
        removeAuthorFromDataBase(authorId);

        DefaultTableModel model = (DefaultTableModel) authorInventoryTable.getModel();

        // If a single row is selected
        if (authorInventoryTable.getSelectedRowCount() == 1) {
            model.removeRow(authorInventoryTable.getSelectedRow());
            model.fireTableDataChanged(); // Add this line to refresh the table
            JOptionPane.showMessageDialog(null, "Author, associated books, and ratings deleted successfully!");
        } else if (authorInventoryTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No data available in the table.");
        } else {
            JOptionPane.showMessageDialog(null, "Please choose a single row to perform the delete.");
        }
        
        // Clear text fields
        authorIdLabel.setText(null);
        authorName.setText(null);
        authorBirthday.setDate(null);
        authorCountry.setText(null);
        authorImage.setText(null);
        authorImageLabel.setIcon(null);
        authorBiography.setText(null);
        authorBiographyLabel.setText(null);
       
        refreshTables();
    }//GEN-LAST:event_deleteAuthorActionPerformed
                         
   
private void removeAuthorFromDataBase(String authorIdLabel) {
    try {
        // Use PreparedStatement to avoid SQL injection
        String deleteAuthorQuery = "DELETE FROM Author WHERE authorId = ?";
        String deleteBooksQuery = "DELETE FROM Book WHERE authorId = ?";
        String deleteRatingsQuery = "DELETE FROM Rating WHERE bookId IN (SELECT bookId FROM Book WHERE authorId = ?)";

        try (Connection connection = databaseConnection.mycon();
             PreparedStatement deleteRatingsStatement = connection.prepareStatement(deleteRatingsQuery);
             PreparedStatement deleteBooksStatement = connection.prepareStatement(deleteBooksQuery);
             PreparedStatement deleteAuthorStatement = connection.prepareStatement(deleteAuthorQuery)) {

            // Start a transaction
            connection.setAutoCommit(false);

            // Set the authorId for the deleteRatingsStatement
            deleteRatingsStatement.setString(1, authorIdLabel);

            // Execute the delete for associated ratings
            int rowsAffectedRatings = deleteRatingsStatement.executeUpdate();

            // Set the authorId for the deleteBooksStatement
            deleteBooksStatement.setString(1, authorIdLabel);

            // Execute the delete for associated books only if ratings are deleted successfully
            if (rowsAffectedRatings >= 0) { // Change to >= instead of just >
                int rowsAffectedBooks = deleteBooksStatement.executeUpdate();

                // Set the authorId for the deleteAuthorStatement
                deleteAuthorStatement.setString(1, authorIdLabel);

                // Execute the delete for author only if associated books are deleted successfully
                int rowsAffectedAuthor = deleteAuthorStatement.executeUpdate();

                // Commit the transaction if all deletes are successful
                if (rowsAffectedBooks >= 0 && rowsAffectedAuthor > 0) { // Change to >= instead of just >
                    connection.commit();
                    System.out.println("Author, associated books, and ratings deleted successfully. Rows affected (Author): " + rowsAffectedAuthor + ", Rows affected (Books): " + rowsAffectedBooks + ", Rows affected (Ratings): " + rowsAffectedRatings);
                } else {
                    System.out.println("Failed to delete Author. Rows affected (Author): " + rowsAffectedAuthor + ", Rows affected (Books): " + rowsAffectedBooks + ", Rows affected (Ratings): " + rowsAffectedRatings);
                    // Rollback the transaction if there's an issue deleting the author or books
                    connection.rollback();
                }
            } else {
                System.out.println("Failed to delete associated ratings. Rows affected (Ratings): " + rowsAffectedRatings);
                // Commit the transaction even if there's an issue deleting ratings
                connection.commit();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Handle potential SQLException
    }
}
                               
    // clear author button
    private void clearAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAuthorActionPerformed
        authorIdLabel.setText(null);
        authorName.setText(null);
        authorBirthday.setDate(null);
        authorCountry.setText(null);
        authorImage.setText(null);
        authorImageLabel.setIcon(null);
        authorBiography.setText(null);
        authorBiographyLabel.setText(null);
    }//GEN-LAST:event_clearAuthorActionPerformed

    // upload author image
    private void uploadAuthorImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadAuthorImageActionPerformed
        String imageName = authorImage.getText();

        if (imageName != null && !imageName.isEmpty()) {
            try {
                String destinationPath = "src/Literarium/Images/authorImgs/" + imageName + ".jpg";
                File imageFile = new File(destinationPath);

                if (!imageFile.exists()) {
                    JOptionPane.showMessageDialog(this, "Image file does not exist: " + destinationPath);
                    return;
                }

                BufferedImage image = ImageIO.read(imageFile);

                if (image == null) {
                    JOptionPane.showMessageDialog(this, "Error reading the image file: " + destinationPath);
                    return;
                }

                // Resize the image to fit the label
                ImageIcon scaledIcon = new ImageIcon(image.getScaledInstance(authorImageLabel.getWidth(), authorImageLabel.getHeight(), Image.SCALE_SMOOTH));

                // Display the scaled image in the authorImageLabel
                authorImageLabel.setIcon(scaledIcon);

                JOptionPane.showMessageDialog(this, "Image uploaded successfully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in uploading the image.");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid image name.");
        }
    }//GEN-LAST:event_uploadAuthorImageActionPerformed

   // upload author biography
    private void uploadAuthorBiographyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadAuthorBiographyActionPerformed
        String synopsisText = authorBiography.getText();

        // Check if the user entered a synopsis
        if (synopsisText != null && !synopsisText.isEmpty()) {
            authorBiographyLabel.setText(synopsisText);

            // Display a message or perform any additional actions if needed
            JOptionPane.showMessageDialog(this, "Biography added successfully!");
        } else {
            // Inform the user that they need to enter a synopsis
            JOptionPane.showMessageDialog(this, "Please enter a biography before uploading.");
        }   
    }//GEN-LAST:event_uploadAuthorBiographyActionPerformed

    // author inventory
    private void authorInventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorInventoryTableMouseClicked

        int index = authorInventoryTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) authorInventoryTable.getModel();

        authorIdLabel.setText(model.getValueAt(index, 0).toString());
        authorName.setText(model.getValueAt(index, 1).toString());

        // Get the value from the table at index 3 (assuming it's the date column)
        Object valueAtIndex3 = model.getValueAt(index, 2);

        // Check if the value is not null and is a String
        if (valueAtIndex3 != null && valueAtIndex3 instanceof String) {
            try {
                // Parse the string to a Date object
                Date selectedDate = new SimpleDateFormat("yyyy-MM-dd").parse((String) valueAtIndex3);

                // Set the Date to the existing JDateChooser
                authorBirthday.setDate(selectedDate);
            } catch (ParseException e) {
                e.printStackTrace(); // Handle the parse exception if needed
            }
        } else {
            // Handle the case where the value is not a valid date
        }

        authorImage.setText(model.getValueAt(index, 3).toString());
        authorBiography.setText(model.getValueAt(index, 4).toString());
        authorCountry.setText(model.getValueAt(index, 5).toString());

        String authorImage = "";
        String authorBiography = "";
        
        String authorId = model.getValueAt(index, 0).toString();
        authorIdLabel.setText(authorId);

        try {
            // Establish a connection to the database
            Connection conn = databaseConnection.mycon();

            // Create a statement for executing SQL queries
            Statement stmt = conn.createStatement();

            // Replace "image" and "biography" with the actual column names in your database
            final String IMAGE_QUERY = "SELECT image FROM Author WHERE authorId = '" + authorId + "'";
            ResultSet imageResultSet = stmt.executeQuery(IMAGE_QUERY);

            if (imageResultSet.next()) {
                authorImage = "src/Literarium/Images/authorImgs/" + imageResultSet.getString("image") + ".jpg";
            }

            final String SYNOPSIS_QUERY = "SELECT biography FROM Author WHERE authorId = '" + authorId + "'";
            ResultSet biographyResultSet = stmt.executeQuery(SYNOPSIS_QUERY);

            if (biographyResultSet.next()) {
                authorBiography = biographyResultSet.getString("biography");
            }

            // Close the result sets and statement
            imageResultSet.close();
            biographyResultSet.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage());
        }

        // Ensure that there is a valid image path before attempting to load image
        if (!authorImage.isEmpty()) {
            try {
                ImageIcon icon = new ImageIcon(authorImage);
                Image image = icon.getImage().getScaledInstance(authorImageLabel.getWidth(), authorImageLabel.getHeight(), Image.SCALE_SMOOTH);
                authorImageLabel.setIcon(new ImageIcon(image));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error loading image");
            }
        }

        // Set the font and text style for the book synopsis
        String formattedSynopsis = "<html>" + wrapText(authorBiography, authorBiographyLabel.getWidth(), authorBiographyLabel.getHeight()).replaceAll("\n", "<br>") + "</html>";
        authorBiographyLabel.setText(formattedSynopsis);
        Font labelFont = authorBiographyLabel.getFont();
        authorBiographyLabel.setFont(new Font(labelFont.getName(), Font.PLAIN, 13));
    }//GEN-LAST:event_authorInventoryTableMouseClicked
        
     // add publisher
    private void addPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPublisherActionPerformed
        String publisherNameText = publisherName.getText();
        String publisherAddressText = publisherAddress.getText();
 
        // Use PreparedStatement to avoid SQL injection
        String insertPublisherQuery = "INSERT INTO Publisher (publisherName, address) VALUES (?, ?)";
        
        try (PreparedStatement insertPublisherStatement = databaseConnection.mycon().prepareStatement(insertPublisherQuery)) {
            insertPublisherStatement.setString(1, publisherNameText);
            insertPublisherStatement.setString(2, publisherAddressText); 

            int publisherRowsAffected = insertPublisherStatement.executeUpdate();

            // Check if the insert was successful
            if (publisherRowsAffected > 0) {
                System.out.println("Publisher recorded successfully. Rows affected: " + publisherRowsAffected);
            } else {
                System.out.println("Failed to record customer. No rows affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle potential SQLException
        }

        JOptionPane.showMessageDialog(null, "Data successfully added!");

        // Clear text fields
        publisherId.setText(null);
        publisherName.setText(null);
        publisherAddress.setText(null);

        // Refresh the table
        refreshTables();
    }//GEN-LAST:event_addPublisherActionPerformed

    // update publisher
    private void updatePublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePublisherActionPerformed
        // Update publisher details in the database
        String updatePublisherQuery = "UPDATE Publisher SET publisherName = ?, address = ?,  WHERE publisherId = ?";

        try (PreparedStatement updatePublisherStatement = databaseConnection.mycon().prepareStatement(updatePublisherQuery)) {
            updatePublisherStatement.setString(1, publisherName.getText().trim()); 
            updatePublisherStatement.setString(2, publisherAddress.getText().trim());
            updatePublisherStatement.setString(3, publisherId.getText().trim());
            
            int publisherRowsAffected = updatePublisherStatement.executeUpdate();

            // Check if the update was successful
            if (publisherRowsAffected > 0) {
                System.out.println("Publisher updated successfully. Rows affected: " + publisherRowsAffected);
            } else {
                System.out.println("Failed to update customer. No rows affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle potential SQLException
        }

        // Update the table with the updated value
        DefaultTableModel model = (DefaultTableModel) publisherInventoryTable.getModel();
        int selectedRow = publisherInventoryTable.getSelectedRow();

        if (selectedRow >= 0) {
            Object[] updatedRow = {
                publisherId.getText().trim(),
                publisherName.getText().trim(),
                publisherAddress.getText().trim(),
            };

            model.removeRow(selectedRow);  // Remove the old row
            model.insertRow(selectedRow, updatedRow);  // Insert the updated row at the same position

            // Update the table with the updated value
            refreshTables();

            JOptionPane.showMessageDialog(null, "Customer successfully updated!");

            // Clear text fields
            publisherId.setText(null);
            publisherName.setText(null);
            publisherAddress.setText(null);
        } else {
            System.out.println("No row selected in the table.");
        }
    }//GEN-LAST:event_updatePublisherActionPerformed


     // delete publisher
    private void deletePublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePublisherActionPerformed
        // Get the publisher ID from the label
        String publisherIdString = publisherId.getText().trim();

        if (publisherIdString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a publisher to delete.");
            return;
        }

        // Delete author data from the database
        removePublisherFromDatabase(publisherIdString);

        DefaultTableModel model = (DefaultTableModel) publisherInventoryTable.getModel();

        // If a single row is selected
        if (publisherInventoryTable.getSelectedRowCount() == 1) {
            model.removeRow(publisherInventoryTable.getSelectedRow());
            model.fireTableDataChanged(); // Add this line to refresh the table
            JOptionPane.showMessageDialog(null, "Publisher and associated books deleted successfully!");
        } else if (publisherInventoryTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No data available in the table.");
        } else {
            JOptionPane.showMessageDialog(null, "Please choose a single row to perform the delete.");
        }
        
        // Clear text fields
        publisherId.setText(null);
        publisherName.setText(null);
        publisherAddress.setText(null);
        
        refreshTables();


//        // Get the publisher ID from the label
//        String publisherIdString = publisherId.getText().trim();
//
//        if (publisherIdString.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Please select a publisher to delete.");
//            return;
//        }
//
//        // Delete pubblisher data from the database
//        removePublisherFromDatabase(publisherIdString);
//
//        DefaultTableModel model = (DefaultTableModel) publisherInventoryTable.getModel();
//
//        // If a single row is selected
//        if (publisherInventoryTable.getSelectedRowCount() == 1) {
//            model.removeRow(publisherInventoryTable.getSelectedRow());
//            JOptionPane.showMessageDialog(null, "Publisher successfully deleted.");
//        } else if (publisherInventoryTable.getRowCount() == 0) {
//            JOptionPane.showMessageDialog(null, "No data available in the table.");
//        } else {
//            JOptionPane.showMessageDialog(null, "Please choose a single row to perform the delete.");
//        }
//     
//        publisherId.setText(null);
//        publisherName.setText(null);
//        publisherAddress.setText(null);
//        publisherNumberofTitles.setText(null);
    }//GEN-LAST:event_deletePublisherActionPerformed

//// Update this method to delete a book from the database
//private void removePublisherFromDatabase(String publisherId) {
//    try {
//        // Use PreparedStatement to avoid SQL injection
//        String deletePublisherQuery = "DELETE FROM Publisher WHERE publisherId = ?";
//
//        try (PreparedStatement deletePublisherStatement = databaseConnection.mycon().prepareStatement(deletePublisherQuery)) {
//            deletePublisherStatement.setString(1, publisherId);
//
//            int rowsAffected = deletePublisherStatement.executeUpdate();
//
//            if (rowsAffected > 0) {
//                System.out.println("Publisher deleted successfully. Rows affected: " + rowsAffected);
//            } else {
//                System.out.println("Failed to delete customer. No rows affected.");
//            }
//        }
//    } catch (SQLException e) {
//        e.printStackTrace(); // Handle potential SQLException
//    }
//}
//         
    
   
private void removePublisherFromDatabase(String publisherId) {
    try {
        // Use PreparedStatement to avoid SQL injection
        String deletePublisherQuery = "DELETE FROM Publisher WHERE publisherId = ?";
        String deleteBooksQuery = "DELETE FROM Book WHERE publisherId = ?";
        String deleteRatingsQuery = "DELETE FROM Rating WHERE bookId IN (SELECT bookId FROM Book WHERE publisherId = ?)";

        try (Connection connection = databaseConnection.mycon();
             PreparedStatement deleteRatingsStatement = connection.prepareStatement(deleteRatingsQuery);
             PreparedStatement deleteBooksStatement = connection.prepareStatement(deleteBooksQuery);
             PreparedStatement deletePublisherStatement = connection.prepareStatement(deletePublisherQuery)) {

            // Start a transaction
            connection.setAutoCommit(false);
            
            // Set the authorId for the deleteRatingsStatement
            deleteRatingsStatement.setString(1, publisherId);

            // Execute the delete for associated ratings
            int rowsAffectedRatings = deleteRatingsStatement.executeUpdate();

            // Set the authorId for the deleteBooksStatement
            deleteBooksStatement.setString(1, publisherId);

            // Execute the delete for associated books only if ratings are deleted successfully
            if (rowsAffectedRatings >= 0) { // Change to >= instead of just >
                int rowsAffectedBooks = deleteBooksStatement.executeUpdate();

                // Set the authorId for the deleteAuthorStatement
                deletePublisherStatement.setString(1, publisherId);

                // Execute the delete for author only if associated books are deleted successfully
                int rowAffectedPublisher = deletePublisherStatement.executeUpdate();

                // Commit the transaction if all deletes are successful
                if (rowsAffectedBooks >= 0 && rowAffectedPublisher > 0) { // Change to >= instead of just >
                    connection.commit();
                    System.out.println("Publisher and associated books deleted successfully. Rows affected (Publisher): " + rowAffectedPublisher + ", Rows affected (Books): " + rowsAffectedBooks + ", Rows affected(Ratings): " + rowsAffectedRatings);
                } else {
                    System.out.println("Failed to delete Publisher. Rows affected (Publisher): " + rowAffectedPublisher + ", Rows affected (Books): " + rowsAffectedBooks + ", Rows affected(Ratings): " + rowsAffectedRatings);
                    // Rollback the transaction if there's an issue deleting the author or books
                    connection.rollback();
                }
            } else {
                System.out.println("Failed to delete associated ratings. Rows affected (Ratings): " + rowsAffectedRatings);
                // Commit the transaction even if there's an issue deleting ratings
                connection.commit();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Handle potential SQLException
    }
}

     // clear publisher
    private void clearPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPublisherActionPerformed
        publisherId.setText(null);
        publisherName.setText(null);
        publisherAddress.setText(null);
    }//GEN-LAST:event_clearPublisherActionPerformed

    // publisher inventory clicked
    private void publisherInventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publisherInventoryTableMouseClicked
        int index = publisherInventoryTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) publisherInventoryTable.getModel();

        publisherId.setText(model.getValueAt(index, 0).toString());
        publisherName.setText(model.getValueAt(index, 1).toString());
        publisherAddress.setText(model.getValueAt(index, 2).toString());
    }//GEN-LAST:event_publisherInventoryTableMouseClicked

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

    private void bookQtyLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookQtyLabelActionPerformed

    }//GEN-LAST:event_bookQtyLabelActionPerformed
    
    
    private void customerGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerGenderActionPerformed

    private void customerPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerPassActionPerformed

        // removes book from the database
    private void removeBookFromDatabase(String id) {
        // Replace with your actual database table name
        final String DELETE_QUERY = "DELETE FROM Book WHERE bookId = ?";

        try {
            // Establish a connection to the database
            Connection conn = databaseConnection.mycon();

            // Create a prepared statement for executing SQL queries with parameters
            try (PreparedStatement preparedStatement = conn.prepareStatement(DELETE_QUERY)) {
                preparedStatement.setString(1, id);

                // Execute the DELETE query
                preparedStatement.executeUpdate();
            }

            // Close the connection
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage());
        }
    }

    // creates the table of authors
    public void populateTableAuthor() {

        // SQL query to select all columns from the 'author' table
        final String QUERY = "SELECT * FROM Author";

        try {
            // Establish a connection to the database
            Connection conn = databaseConnection.mycon();

            // Create a statement for executing SQL queries
            Statement stmt = conn.createStatement();

            // Execute the SELECT query
            ResultSet rs = stmt.executeQuery(QUERY);

            // Define column names for the JTable
            String[] columnNames = {"authorId","authorName", "birthday", "image", "biography", "country"};

            // Create a DefaultTableModel with no data
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

            // Iterate through the result set and add data to the table model
            while (rs.next()) {
                String authorId = rs.getString("authorId");
                String authorName = rs.getString("authorName");
                String birthday = rs.getString("birthday");
                String authorImage = rs.getString("image");
                String biography = rs.getString("biography");
                String country = rs.getString("country");

                Object[] data = {authorId, authorName, birthday, authorImage, biography, country};
                tableModel.addRow(data);
            }

            // Set the JTable model with the populated data
            authorInventoryTable.setModel(tableModel);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // creates the table of customers
    public void populateTableCust() {

        // SQL query to select all columns from the 'Customer' table
        final String QUERY = "SELECT * FROM Customer";

        try {
            // Establish a connection to the database
            Connection conn = databaseConnection.mycon();

            // Create a statement for executing SQL queries
            Statement stmt = conn.createStatement();

            // Execute the SELECT query
            ResultSet rs = stmt.executeQuery(QUERY);

            // Define column names for the JTable
            String[] columnNames = {"customerId", "customerName", "gender", "pass", "email", "address"};

            // Create a DefaultTableModel with no data
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

            // Iterate through the result set and add data to the table model
            while (rs.next()) {
                String customerId = rs.getString("customerId");
                String customerName = rs.getString("customerName");
                String gender = rs.getString("gender");

                // Replace the actual password with asterisks
                String pass = "*".repeat(rs.getString("pass").length());

                String email = rs.getString("email");
                String address = rs.getString("address"); 

                Object[] data = {customerId, customerName, gender, pass, email, address};
                tableModel.addRow(data);
            }

            // Set the JTable model with the populated data
            customerInventoryTable.setModel(tableModel);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
// creates the table of books (1st page)
public void populateTableBooks() {
    // SQL query to select all columns from the 'catalogue' table
    final String QUERY = "SELECT Book.bookId, Book.title, Book.price, Book.quantity, Book.synopsis, Book.image, Author.authorId, Author.authorName, Publisher.publisherId, Publisher.publisherName " +
            "FROM Book " +
            "INNER JOIN Author ON Book.authorId = Author.authorId " +
            "INNER JOIN Publisher ON Book.publisherId = Publisher.publisherId";

    try {
        // Establish a connection to the database
        Connection conn = databaseConnection.mycon();

        // Create a statement for executing SQL queries
        Statement stmt = conn.createStatement();

        // Execute the SELECT query
        ResultSet rs = stmt.executeQuery(QUERY);

        // Define column names for the JTable
        String column[] = {"bookId", "authorName", "title", "price", "quantity", "synopsis", "image", "publisherName"};

        // Create a DefaultTableModel with no data
        DefaultTableModel tableModel = new DefaultTableModel(column, 0);

        // Iterate through the result set and add data to the table model
        while (rs.next()) {
            String bookId = rs.getString("bookId");
            String authorName = rs.getString("authorName");
            String title = rs.getString("title");
            double price = Double.parseDouble(rs.getString("price"));
            int quantity = Integer.parseInt(rs.getString("quantity"));
            String synopsis = rs.getString("synopsis");
            String image = rs.getString("image");
            String publisherName = rs.getString("publisherName");

            Object[] data = {bookId, authorName, title, price, quantity, synopsis, image, publisherName};
            tableModel.addRow(data);
        }

        // Set the JTable model with the populated data
        bookInventoryTable.setModel(tableModel);

    } catch (SQLException e) {
        // Handle any SQL exceptions that may occur
        System.out.println("Error: " + e);
    }
}


    
    // Method to populate the JTable with data from a MySQL database
    public void populateTablePublisher() {
        // Make the table header transparent
        publisherInventoryTable.getTableHeader().setOpaque(false);

        // SQL query to select all columns from the 'catalogue' table
        final String QUERY = "SELECT * FROM Publisher";

        try {
            // Establish a connection to the database
            Connection conn = databaseConnection.mycon();

            // Create a statement for executing SQL queries
            Statement stmt = conn.createStatement();

            // Execute the SELECT query
            ResultSet rs = stmt.executeQuery(QUERY);

            // Define column names for the JTable
            String column[] = {"publisherId", "publisherName", "address"};

            // Create a DefaultTableModel with no data
            DefaultTableModel tableModel = new DefaultTableModel(column, 0);

            // Iterate through the result set and add data to the table model
            while (rs.next()) {
                String publisherId = rs.getString("publisherId");
                String publisherName = rs.getString("publisherName");
                String address = rs.getString("address");
                Object[] data = {publisherId, publisherName, address};
                tableModel.addRow(data);
            }

            // Set the JTable model with the populated data
            publisherInventoryTable.setModel(tableModel);

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

    // table of purchases
    public void populateTablePurchases() {
    // Get the customerId from SharedData
    String currentCustomerId = SharedData.getCustomerId();

    final String QUERY3 = "SELECT * FROM Purchase";

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


public void populatePublisherNameComboBox() {
    try {
        // Establish a connection to the database
        Connection conn = databaseConnection.mycon();

        // Create a statement for executing SQL queries
        Statement stmt = conn.createStatement();

        // Execute the SELECT query
        ResultSet rs = stmt.executeQuery("SELECT publisherName FROM Publisher");

        // Clear existing items in the combo box
        publisherNameComboBox.removeAllItems();

        // Add author names to the combo box
        while (rs.next()) {
            String publisherName = rs.getString("publisherName");
            publisherNameComboBox.addItem(publisherName);
        }

        // Close resources
        rs.close();
        stmt.close();
        conn.close();

        // Set the selected item to null
        publisherNameComboBox.setSelectedItem(null);

    } catch (SQLException e) {
        // Handle any SQL exceptions that may occur
        e.printStackTrace();
    }
}
    // refreshes all tables
    private void refreshTables() {
        populateTableAuthor();
        populateTableCust();
        populateTableBooks();
        populateTablePublisher();
        populateAuthorNameComboBox();
        populatePublisherNameComboBox();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAuthor;
    private javax.swing.JButton addBook;
    private javax.swing.JButton addCustomer;
    private javax.swing.JButton addPublisher;
    private javax.swing.JTabbedPane adminScreen;
    private javax.swing.JLabel adressSubtitle;
    private javax.swing.JLabel adressSubtitle1;
    private javax.swing.JTextArea authorBiography;
    private javax.swing.JLabel authorBiographyLabel;
    private com.toedter.calendar.JDateChooser authorBirthday;
    private javax.swing.JLabel authorBirthdaySubtitle;
    private javax.swing.JTextField authorCountry;
    private javax.swing.JLabel authorCountrySubtitle;
    private javax.swing.JPanel authorDetailsTab;
    private javax.swing.JLabel authorIDSubtitle;
    private javax.swing.JTextField authorIdLabel;
    private javax.swing.JTextField authorImage;
    private javax.swing.JLabel authorImageLabel;
    private javax.swing.JTable authorInventoryTable;
    private javax.swing.JTextField authorName;
    private javax.swing.JComboBox<String> authorNameComboBox;
    private javax.swing.JLabel authorNameSubtitle;
    private javax.swing.JLabel authorSubtitle;
    private javax.swing.JLabel biographyofAuthor;
    private javax.swing.JLabel bookIDSubtitle;
    private javax.swing.JTextField bookIdLabel;
    private javax.swing.JTextField bookImage;
    private javax.swing.JLabel bookImageLabel;
    private javax.swing.JLabel bookInventorySubtitle;
    private javax.swing.JTable bookInventoryTable;
    private javax.swing.JScrollPane bookInventoryTableScroll;
    private javax.swing.JPanel bookManagementTab;
    private javax.swing.JTextField bookPriceLabel;
    private javax.swing.JTextField bookQtyLabel;
    private javax.swing.JTextArea bookSynopsis;
    private javax.swing.JLabel bookSynopsisLabel;
    private javax.swing.JScrollPane bookSynopsisScroll;
    private javax.swing.JTextField bookTitleLabel;
    private javax.swing.JPanel borderPanel;
    private javax.swing.JButton clearAuthor;
    private javax.swing.JButton clearBook;
    private javax.swing.JButton clearCustomer;
    private javax.swing.JButton clearPublisher;
    private javax.swing.JLabel coverImage;
    private javax.swing.JTextField customerAddress;
    private javax.swing.JTextField customerEmail;
    private javax.swing.JLabel customerEmailSubtitle;
    private javax.swing.JComboBox<String> customerGender;
    private javax.swing.JLabel customerGenderSubtitle;
    private javax.swing.JLabel customerIDSubtitle;
    private javax.swing.JLabel customerIDSubtitle2;
    private javax.swing.JTextField customerIdLabel;
    private javax.swing.JLabel customerInventorySubtitle;
    private javax.swing.JLabel customerInventorySubtitle1;
    private javax.swing.JTable customerInventoryTable;
    private javax.swing.JScrollPane customerInventoryTableScroll;
    private javax.swing.JScrollPane customerInventoryTableScroll1;
    private javax.swing.JScrollPane customerInventoryTableScroll2;
    private javax.swing.JScrollPane customerInventoryTableScroll3;
    private javax.swing.JPanel customerManagementTab;
    private javax.swing.JTextField customerName;
    private javax.swing.JLabel customerNameSubtitle;
    private javax.swing.JTextField customerPass;
    private javax.swing.JButton deleteAuthor;
    private javax.swing.JButton deleteBook;
    private javax.swing.JButton deleteCustomer;
    private javax.swing.JButton deletePublisher;
    private javax.swing.JLabel emailSubtitle1;
    private javax.swing.JLabel imageofAuthor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logout;
    private javax.swing.JLabel pageTitle1;
    private javax.swing.JLabel pageTitle2;
    private javax.swing.JLabel pageTitle3;
    private javax.swing.JLabel pageTitle4;
    private javax.swing.JLabel pageTitle5;
    private javax.swing.JLabel priceSubtitle;
    private javax.swing.JTextField publisherAddress;
    private javax.swing.JPanel publisherDetailsTab;
    private javax.swing.JLabel publisherIDSubtitle;
    private javax.swing.JTextField publisherId;
    private javax.swing.JLabel publisherIdSubtitle;
    private javax.swing.JLabel publisherInventorySubtitle;
    private javax.swing.JTable publisherInventoryTable;
    private javax.swing.JTextField publisherName;
    private javax.swing.JComboBox<String> publisherNameComboBox;
    private javax.swing.JLabel publisherNameSubtitle;
    private javax.swing.JLabel purchaseBillLabel;
    private javax.swing.JPanel purchaseHistoryTab;
    private javax.swing.JTable purchaseHistoryTable;
    private javax.swing.JLabel qtySubtitle;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JTextField searchPurchase;
    private javax.swing.JLabel synopsisSubtitle2;
    private javax.swing.JLabel titleSubtitle;
    private javax.swing.JButton updateAuthor;
    private javax.swing.JButton updateBook;
    private javax.swing.JButton updateCustomer;
    private javax.swing.JButton updatePublisher;
    private javax.swing.JButton uploadAuthorBiography;
    private javax.swing.JButton uploadAuthorImage;
    private javax.swing.JButton uploadBookImage;
    private javax.swing.JButton uploadBookSynopsis;
    // End of variables declaration//GEN-END:variables
}
