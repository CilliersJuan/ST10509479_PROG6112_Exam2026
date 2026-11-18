/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10509479prog6112examq2;

/**
 *
 * @author emeris
 */
public class ProductCalculations implements IProductCalculations {
    

    @Override
    public double getVat(double Price) {
            
        double vat = Price * 1;

        return vat + (vat * 0.05);
    }
   
    @Override
    public double getCommission(double Price) {

        double commission = Price * 0.05;

        return commission;
    }

   @Override
    public double getTotal(double Price, double vat, double commission) {

        double totalSaleAmount = Price + vat + commission;

        return totalSaleAmount;
    }

} //END CLASS

    

