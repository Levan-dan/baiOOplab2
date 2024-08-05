package smartphone;

public class Main {
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        Iphone iphone = new Iphone();

        System.out.println(nokia.downloadApp());
        System.out.println(iphone.downloadApp());
    }

}
