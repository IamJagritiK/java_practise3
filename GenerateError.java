public class GenerateError {
    public static void main(String[] args) {
        try {
            throw new NegativeArraySizeException();
        } catch (NegativeArraySizeException e1) {
            System.out.println(e1.toString());
        }

        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e2) {
            System.out.println(e2.toString());
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException e3) {
            System.out.println(e3.toString());
        }
    }
}