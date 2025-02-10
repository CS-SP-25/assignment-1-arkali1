public class NoTax implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return 0.0;
    }
}
//compute sales tax which is 0.0 for this class.