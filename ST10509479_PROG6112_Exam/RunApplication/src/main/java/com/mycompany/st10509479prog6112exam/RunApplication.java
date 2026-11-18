/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10509479prog6112exam;

/**
 *
 * @author emeris
 */
public class RunApplication {

    public static void main(String[] args) {
         String[] products = {"Cozy Nights Monarch", "\nRestonic Barbados", "\nSealy Phuket"};
         String[] months = {"\tMonth 1", "\tMonth 2", "\tMonth 3"};

        //Product sales for each month
        int[][] product = {
            {63, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

         //Store the total sales for each product
        int[] totalSold = new int[products.length];

        //Create productSales object
        Product sales = new Product();

        //Display the report heading
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("**************************************");

        //Display the month headings
        System.out.printf("%-18s", "");

        for (int i = 0; i < months.length; i++) {

            System.out.printf("%-10s", months[i]);

        }

        System.out.println();

        //Display product sales
        for (int i = 0; i < product.length; i++) {

            System.out.printf("%-18s", products[i]);

            for (int j = 0; j < product[i].length; j++) {

                System.out.printf("%-10d", product[i][j]);

            }

        }

        System.out.println("**************************************");

        //Display total sales
        for (int i = 0; i < products.length; i++) {

            System.out.println("Total Product Sales "
                    + product);

        }

        //Find the most popular product
        String topProduct = sales.GetMostPopularProduct(products, totalSold);

        System.out.println();
        System.out.println("Most Popular Product: " + topProduct);

    } //END MAIN

} //END CLASS
