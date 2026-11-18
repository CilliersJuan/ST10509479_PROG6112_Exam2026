/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.st10509479prog6112exam;

/**
 *
 * @author emeris
 */
public interface IProducts {
    
    int GetTotalProductsSold(int[][] product);
    double GetAverageProductSold(int[][] product);
    String GetMostPopularProduct(String[] sales, int[] product);
         
}
