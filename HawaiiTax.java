public class HawaiiTax implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return value * 0.045;
    }
}
