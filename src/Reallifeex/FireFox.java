package Reallifeex;

public class FireFox extends Baseclass {

    @Override
    String openBrowser() {
        System.out.println("Open the chrome. . .              //This is code realted to chrome only\n");
        return "";
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing the chrome.. . .        //This is code realted to chrome only\n");
        //This is code realted to chrome only
        return "";

    }

    @Override
    void takeScreenshot() {
        System.out.println("take ss firefox");
    }
}