package August.ex_0108;

public class RealTimeInheritance {
    public static void main(String[] args) {
        BaseClass t1= new TestCase1();  //  Dynamic Dispatch //Runtime
    //    t1.setBrowser("opera",true);
        t1.opernBrowser();
        t1.clsoeBrowser();
    }


}

        class TestCase1 extends BaseClass{
        //TestCase is a type of BaseClass --->   Single Inheritance
            TestCase1(){
                super();  //DC of Parent
                this.setBrowser("edge",true);
            }


            @Override
            public void setBrowser(String browser, boolean isAuth){
                super.setBrowser(browser, isAuth);
            }
        }
    class BaseClass{
            BaseClass(){
            System.out.println("DC - BaseClass");

            }
             BaseClass(String b){

            System.out.println("CC - BaseClass");
        }


        private String browser;

        public String getBrowser() {
            return browser;
        }

        public void setBrowser(String browser, boolean isAuth) {
            if(isAuth){
                this.browser =browser;
            }else {
                System.out.println("not allowed");
            }

              }

              void opernBrowser(){
                System.out.println("Chrome Browser");
              }

              void openBrowser(String browserName){
                System.out.println("Open Browser ->" + browserName);
              }

              void clsoeBrowser(){
                    System.out.println("Close Browser");
              }
    }