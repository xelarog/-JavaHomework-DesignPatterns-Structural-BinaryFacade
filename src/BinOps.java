public class BinOps {
    public String sum(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int sum = aInt + bInt;
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public String mult(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int mult = aInt * bInt;
        String result = Integer.toBinaryString(mult);
        return result;
    }
}