package August.ex_0108.AccessModifier.police;

public class Cop {
    public int gun;
        public String idCard;


        public Cop(int gun){
            this.gun =gun;
            }

          protected void canIShoot(){
            System.out.println("Yes, You can");
            }


}
