
public class ExceptionMain {
    ExceptionMain(String msg) {
        msg = "this is bound to execute";
        System.out.println(msg);
    }

    public static void main(String[] args) throws Exception {

        
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("i will get printed");
        }

    }
}