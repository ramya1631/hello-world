import service.HelloWorldService;

public class Main {
    public static void main(String[] args) {
        HelloWorldService hs = new HelloWorldService();
        System.out.printf(hs.returnMessage());
    }
}