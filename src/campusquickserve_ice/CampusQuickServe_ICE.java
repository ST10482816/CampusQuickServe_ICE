
package campusquickserve_ice;

import javax.swing.JOptionPane;


public class CampusQuickServe_ICE {    
    private static final double VAT = 0.15;
    
    public static void main(String[] args) {
        String customerName = JOptionPane.showInputDialog("Enter customer name:");
        String studentNumber = JOptionPane.showInputDialog("Enter student number:");
        String itemOrdered = JOptionPane.showInputDialog("Enter item choice:");
        String itemQuantity = JOptionPane.showInputDialog("Enter quantity:");
        String itemPrice = JOptionPane.showInputDialog("Enter item price in rands:");
        
        double subtotal = Integer.parseInt(itemQuantity) * Integer.parseInt(itemPrice);
        double vatValue = VAT * subtotal;
        double total = vatValue + subtotal;
        
        
        
        String headerMsg = "------CAMPUS QUICKSERVE------";
        String footerMsg = "Thank you for your order!";
        String invoiceEnd = "-------------------------------";
        String lineBreak = "\n";
        
        
        System.out.println(headerMsg);
        System.out.println("Customer: " + customerName);
        System.out.println("Student Number: " + studentNumber);
        System.out.println(lineBreak);
        
        System.out.println("Item Ordered: " + itemOrdered);
        System.out.println("Quantity: " + itemQuantity);
        System.out.println("Price per Item: R" + itemPrice);
        
        System.out.println("Subtotal: R" + subtotal);
        System.out.println("VAT (15%): R" + vatValue);
        System.out.println("Total: R" + total);
        System.out.println(lineBreak);
        
        System.out.println(footerMsg);
        System.out.println(invoiceEnd);
        
    }
    
}
