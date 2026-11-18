/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10509479prog6112examq2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

/**
 *
 * @author emeris
 */
public class ST10509479RunApplicationQ2 {

    //===============================================
    //INSTANCE VARIABLES
    //===============================================

    //Combo Box
    JComboBox<String> productComboBox;

    //Text Fields
    JTextField nameField;
    JTextField priceField;

    //Buttons
    JButton processButton;
    
    //Text Area
    JTextArea outputTextArea;

    //Menu Items
    JMenuItem exit;
    JMenuItem process;
    JMenuItem clear;

    //MovieTickets object
    ProductCalculations productObj = new ProductCalculations();

    public static void main(String[] args) {

        //===============================================
        //1. Create and configure the window
        //===============================================

        JFrame frame = new JFrame();

        frame.setTitle("Product App");
        frame.setSize(460, 430);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 12));

        //===============================================
        //2. Create the menu
        //===============================================

        //Step 1: Create menu bar
        JMenuBar menuBar = new JMenuBar();

        //Step 2: Create menu headings
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        //Step 3: Create dropdown items
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem process = new JMenuItem("Process");
        JMenuItem clear = new JMenuItem("Clear");

        //Step 4: Add items to menu headings
        file.add(exit);

        edit.add(process);
        edit.add(clear);

        //Step 5: Add headings to menu bar
        menuBar.add(file);
        menuBar.add(edit);

        //Step 6: Add menu bar to frame
        frame.setJMenuBar(menuBar);

        //===============================================
        //3. Create components to add to window
        //===============================================

         //----------------Customer Name----------------

        JLabel nameLabel = new JLabel("Customer Name:");
        nameLabel.setPreferredSize(new Dimension(145, 25));

        JTextField nameField = new JTextField(20);
        nameField.setPreferredSize(new Dimension(230, 30));

        
        
        //----------------Product Combo Box----------------

        JLabel productLabel = new JLabel("Select Product:");
        productLabel.setPreferredSize(new Dimension(145, 25));

        JComboBox<String> productComboBox = new JComboBox<>();

        productComboBox.addItem("Cozy Nights Monarch");
        productComboBox.addItem("Restonic Barbados");
        productComboBox.addItem("Sealy Phuket");

        productComboBox.setSelectedIndex(0);
        productComboBox.setPreferredSize(new Dimension(230, 30));

       
        //----------------Price----------------

        JLabel priceLabel = new JLabel("Enter Price:");
        priceLabel.setPreferredSize(new Dimension(145, 25));

        JTextField priceField = new JTextField(20);
        priceField.setPreferredSize(new Dimension(230, 30));

        //----------------Buttons----------------

        JButton processButton = new JButton("Process");
        processButton.setPreferredSize(new Dimension(250, 30));
 /*   
        //===============================================
        //Create Listener and connect components
        //===============================================

        //Create listener object
        ST10509479RunApplicationQ2 Listener = new ST10509479RunApplicationQ2();

        //Give listener access to components
        Listener.productComboBox = productComboBox;

        Listener.nameField = nameField;
        Listener.priceField = priceField;

        //Give listener access to buttons
        Listener.processButton = processButton;
        
        //Give listener access to menu items
        Listener.exit = exit;
        Listener.process = process;
        Listener.clear = clear;

        //Register menu items with listener
        exit.addActionListener(Listener);
        process.addActionListener(Listener);
        clear.addActionListener(Listener);
*/
        //===============================================
        // Add components to frame
        //===============================================


        frame.add(nameLabel);
        frame.add(nameField);
        
        frame.add(productLabel);
        frame.add(productComboBox);

        frame.add(priceLabel);
        frame.add(priceField);
        frame.add(processButton);
        //===============================================
        // Display the window
        //===============================================

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

    } //END MAIN
 
    //===============================================
    // Respond to menu clicks
    //===============================================
/*
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (source == process) {

            processData();

        } else if (source == clear) {

            clearData();

        } else if (source == exit) {

            System.exit(0);
        }
    }

    //===============================================
    // Process information
    //===============================================

   public void processData() {

        //Get selected movie
        String customerName = (String) productComboBox.getSelectedItem();

        try {

            //Get input values from text fields
            int numberOfTickets =
                    Integer.parseInt(nameField.getText().trim());

            double Price =
                    Double.parseDouble(priceField.getText().trim());

            //Create MovieTicketData object
            ProductCalculations productData = new ProductCalculations(
                    Price);

            //Validate the entered data
            if (!productObj.ValidateData(productData)) {

                JOptionPane.showMessageDialog(null,
                        "Enter a movie name, a ticket number above 0, and a price above 0.");

                return;
            }

            //Calculate total ticket price including VAT
            double totalTicketPrice =
                    productObj.CalculateTotalTicketPrice(
                            numberOfTickets, Price);    

            //Display the ticket report
            String report = "CUSTOMER NAME: " + customerName + "\n"
                    + "PRICE: R " + Price + "\n"
                    + "NUMBER OF TICKETS: " + numberOfTickets + "\n"
                    + "TOTAL TICKET PRICE: R "
                    + (Math.round(totalTicketPrice * 100.0) / 100.0);

            outputTextArea.setText(report);

            //Save report to file
            writeData();

        } catch (NumberFormatException E) {

            JOptionPane.showMessageDialog(null,
                    "Number of tickets must be a whole number, and ticket price must be a number.");
        }
    }
*/
    //===============================================
    //Save product report to data.txt
    //===============================================

    public void writeData() {

        //Step 1: Create a path for the file
        Path pathLocation = Paths.get("data.txt");

        try {

            //Step 2: Create and open file for writing
            BufferedWriter writerObj = Files.newBufferedWriter(
                    pathLocation,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );

            //Step 3: Write data to the file
            writerObj.write("DATA LOG");
            writerObj.newLine();

            writerObj.write("***********************************");
            writerObj.newLine();

            writerObj.write(outputTextArea.getText());
            writerObj.newLine();

            writerObj.write("***********************************");
            writerObj.newLine();

            //Step 4: Force contents out of buffer
            writerObj.flush();

            //Step 5: Close the writer
            writerObj.close();

        } catch (IOException E) {

            System.out.println("Error writing to file: "
                    + E.getMessage());

            JOptionPane.showMessageDialog(null,
                    "Error saving data.txt");
        }
    }

    //===============================================
    //10. Clear the input fields and report
    //===============================================

    public void clearData() {

        

        //Clear text fields
        nameField.setText("");
        
        //Reset combo box to first movie
        productComboBox.setSelectedIndex(0);
        
        //Clear text fields
        priceField.setText("");

    }

} //END CLASS

