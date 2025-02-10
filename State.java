public abstract class State {
    protected String name;
    protected SalesTaxBehavior taxBehavior;

    public String getName() {
        return name;
    }
//get name of state
    public void setName(String name) {
        this.name = name;
    }
//set name of set
    public void setTaxBehavior(SalesTaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;

    }
//set the sales tax behavior for the state
//Display of sales tax for a given sale.
    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.println(String.format("The sales tax on $%.2f in %s is $%.2f.", value, name, tax));
    }
}
