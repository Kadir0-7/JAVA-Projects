public class Zipcode extends ServiceCommunicator {

    private String zipcode;

    //Constructor for Zipcode class:
    public Zipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public static void main(String[] args) {
        // Test 1     - call methods individually
        Zipcode zp = new Zipcode("11220");
        zp.setURL("http://api.zippopotam.us/us/" + zp.zipcode);
        zp.connect();
        String mystring = zp.get();
        System.out.println(mystring);

    }
}




