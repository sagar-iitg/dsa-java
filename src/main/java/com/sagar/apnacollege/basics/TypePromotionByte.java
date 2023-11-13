package basics;

class TypePromotionByte {

    public static void main(String[] args) {

        byte b = 5;
        byte c = (byte) (b * 2);
        System.out.println(c);

    }
}