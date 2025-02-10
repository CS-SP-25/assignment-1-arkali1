import java.text.NumberFormat;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        //checks if correct number of arguments are present
        if (args.length != 2){
            System.out.println("Usage: java SalesTaxCalculator <State> <SaleAmount>");
            return;
        }
        String stateName = args[0]; //state name
        double saleAmount;
        //parse the sale amount and handling incorrect inputs
        try {
            saleAmount = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid sale amount. Please provide a numeric value.");
            return;
        }

        State state;
        //determine the state and create appropriate State Object

        switch (stateName){
            case "Indiana":
                state = new Indiana();
                break;
            case "Alaska":
                state = new Alaska();
                break;
            case "Hawaii":
                state = new Hawaii();
                break;
            default:
                System.out.println("Error: Invalid state. Please enter 'Indiana', 'Alaska', or 'Hawaii'.");
                return;
        }
//display the calculated sales tax
        state.showTax(saleAmount);


      
    }
}
