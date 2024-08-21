package August.wrapperclass1708;

public enum COLOR {
    RED("#ff0000 "),
    GREEN("f0f0ff"),
    BLUE("#f0df0f");


    private String hexvalue;

    COLOR(String hexvalue) {
        this.hexvalue = hexvalue;
    }

    public String getValue() {
        return hexvalue;
    }
}