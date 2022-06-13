public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String binStr1 = "00000010";
        String binStr2 = "00000101";
        System.out.println(bins.sum(binStr1, binStr2));
        System.out.println(bins.mult(binStr1, binStr2));
    }
}
