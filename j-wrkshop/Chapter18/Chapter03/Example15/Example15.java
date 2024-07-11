interface Computer15 {
    public String getDeviceType();

    public String getSpeed();  
}

class Tablet15 implements Computer15 {
    public String getDeviceType() {
        return "it is a tablet";
    }

    public String getSpeed() {
        return "1GHz";
    }
}

class Example15 {
    public static void main(String[] args) {
        Tablet15 myTab = new Tablet15();
        System.out.println( myTab.getDeviceType() );
        System.out.println( myTab.getSpeed() );
    }
}
