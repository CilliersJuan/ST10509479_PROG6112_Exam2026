/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.st10509479prog6112examq2;

/**
 *
 * @author emeris
 */
public interface IProductCalculations {
    
    double getVat(double Price);
    double getCommission(double Price);
    double getTotal(double Price, double vat, double commission);
    
}
