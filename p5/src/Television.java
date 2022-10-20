public class Television extends ServiceCommunicator {

    private String search;

    //Constructor for Television class:
    public Television(String search) {
        this.search = search;
    }

    public static void main(String[] args) {
        // Test 1     - call methods individually
        Television tv = new Television("Dexter");
        tv.setURL("http://api.tvmaze.com/singlesearch/shows?q=" + tv.search);
        tv.connect();
        String mystring = tv.get();
        System.out.println(mystring);

    }
}



