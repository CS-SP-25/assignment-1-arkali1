public class SevenPercent implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return value * 0.07;
    }
}
//compute sales tax with 7% based on Indiana tax laws