package Reallifeeg;

public class Lab189 {
    public static void main(String[] args) {

        CHOMRE c = new CHOMRE();
        String s= c.openBrowser();
        System.out.println(s);
        c.closeBrowser();

        FireFox f =new FireFox();
        f.openBrowser();
        f.closeBrowser();
        f.takeScreenshot();
    }
}
