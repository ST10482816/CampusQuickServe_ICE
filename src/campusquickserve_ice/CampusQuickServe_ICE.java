
package campusquickserve_ice;

import javax.swing.JOptionPane;


public class CampusQuickServe_ICE {    
    private static final double VAT = 0.15;
    
    public class Order{
        
        public static double[] calculateOrderPrice(final double VAT, int quantity, double price){
            double subtotal = quantity * price;
            double vatValue = VAT * subtotal;
            double total = vatValue + subtotal;
            return new double[] {subtotal, vatValue, total};
        }
        public static String createInvoice(double total, 
                double vatValue, 
                double subtotal, 
                String customerName, 
                String studentNumber, 
                String itemOrdered, 
                String itemQuantity, 
                String itemPrice){
            
            String headerMsg = "------CAMPUS QUICKSERVE------";
            String footerMsg = "Thank you for your order!";
            String invoiceEnd = "-------------------------------";
            
            String invoiceOutput = 
                    headerMsg + "\n" +
                    "Customer: " + customerName + "\n" +
                    "Student Number: " + studentNumber + "\n\n" +
                    
                    "Item Ordered: " + itemOrdered + "\n" + 
                    "Quantity: " + itemQuantity + "\n" +
                    "Price per Item: R" + itemPrice + "\n\n" + 
                    
                    "Subtotal: R" + subtotal + "\n" + 
                    "VAT (15%): R" + vatValue + "\n" +
                    "Total: R" + total + "\n\n" + 
                    
                    footerMsg + "\n" + 
                    invoiceEnd + "\n";
         
            return invoiceOutput;
        }
    }
    
    public static void main(String[] args) {
        String customerName = JOptionPane.showInputDialog("Enter customer name:");
        String studentNumber = JOptionPane.showInputDialog("Enter student number:");
        String itemOrdered = JOptionPane.showInputDialog("Enter item choice:");
        String itemQuantity = JOptionPane.showInputDialog("Enter quantity:");
        String itemPrice = JOptionPane.showInputDialog("Enter item price in rands:");
        
        int quantity = Integer.parseInt(itemQuantity);
        double price = Double.parseDouble(itemPrice);
        
        
        double[] orderCalcResults = Order.calculateOrderPrice(VAT, quantity, price);
        double subtotal = orderCalcResults[0];
        double vatValue = orderCalcResults[1];
        double total = orderCalcResults[2];
        
        String invoiceOutput = Order.createInvoice(total, vatValue, subtotal, customerName, studentNumber, itemOrdered, itemQuantity, itemPrice);
        JOptionPane.showMessageDialog(null, invoiceOutput);
//        System.out.println(invoiceOutput);
        
    }
    
}