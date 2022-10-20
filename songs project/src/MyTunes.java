
import java.util.ArrayList;

public class MyTunes {
    public static void main(String[] argv) {
        Musician miles = new TrumpetPlayer( "Miles Davis", "USA", "jazz", "1950s", "brass" );
        Musician curtis = new Vocalist( "Curtis Mayfield", "USA", "soul", "1970s", "Muddy Waters" );
        Musician gary = new Guitarist( "Gary Clark Jr", "USA", "blues", "2010s", 6 );


        ArrayList<Songs> library = new ArrayList<Songs>();   // Create our library

// 		Add some songs!  Add 4-5 to keep it simple.
//    			But… see anything that upsets your OO sensibilities?

         Songs s= new Songs( "People Get Ready", curtis, "Relaxing",
                "https://www.youtube.com/watch?v=VOXmaSCt4ZE" );
        Songs ty = new Songs( "Next Saturday", miles, "Relaxing",
                "https://www.youtube.com/watch?v=VOXmaWRGWG" );
        Songs Db = new Songs( "When I Am Away", gary, "Relaxing",
                "https://www.youtube.com/watch?v=XDA65efWEt" );
        Songs Ww = new Songs( "Party Next Door", gary, "Turn Up",
                "https://www.youtube.com/watch?v=WES3hyskk" );
        Songs Ql = new Songs( "Get Lit", curtis, "Turn up",
                "https://www.youtube.com/watch?v=TUA76drt" );


        library.add( s );
        library.add( ty );
        library.add( Db );
        library.add( Ww );
        library.add( Ql );


        for (int counter = 0; counter < library.size(); counter++) {
            System.out.println( library.get( counter ) );

        }

    }
}