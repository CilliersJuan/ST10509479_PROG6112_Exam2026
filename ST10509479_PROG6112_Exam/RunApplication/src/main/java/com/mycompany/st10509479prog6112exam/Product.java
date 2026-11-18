/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10509479prog6112exam;

/**
 *
 * @author emeris
 */
public class Product implements IProducts{
     // Calculate the total sales
    @Override
    public int GetTotalProductsSold(int[][] product) {

        int total = 0;

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                total += product[i][j];
            }
        }

        return total;
    }

    // Calculate the average product sold
    @Override
    public double GetAverageProductSold(int[][] product) {

        int total = GetTotalProductsSold(product);
        int count = 0;

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                count++;
            }
        }

        return (double) total / count;
    }

    // Find the most popular product
    @Override
    public String GetMostPopularProduct(String[] sales, int[] product) {

        int highestSold = product[0];
        String topProduct = sales[0];

        for (int i = 0; i < product.length; i++) {

            if (product[i] > highestSold) {

                highestSold = product[i];
                topProduct = sales[i];

            }
        }

        return topProduct;
    }

}
