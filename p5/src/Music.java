public class Music extends ServiceCommunicator {
// public class
    private String iTunes;

    //Constructor for Music class
    public Music(String iTunes) {
        this.iTunes = iTunes;
    }

    public static void main(String[] args) {
        //Test 1    - call methods individually
        Music ms = new Music("ABC");
        ms.setURL("https://itunes.apple.com/search?term=" + ms.iTunes + "&limit=1");
        ms.connect();
        String mystring = ms.get();
        System.out.println(mystring);
    }
}

