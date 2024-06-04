public class Calculator2 {
    public double tax = 0.05;
    public double tip = 0.15;
    public double originalPrice = 0;
    
    public void findTotal() {
        // Calcule o valor total, incluindo imposto e gorjeta
        double total = originalPrice * (1 + tax + tip);
        
        // Print o total
        System.out.println("Valor total incluindo imposto e gorjeta: " + total);
    }

    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
        calculator.originalPrice = 50; // Atribuir algum valor ao preço original
        calculator.findTotal();
    }
}