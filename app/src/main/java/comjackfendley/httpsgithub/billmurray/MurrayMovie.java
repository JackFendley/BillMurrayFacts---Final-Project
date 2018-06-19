package comjackfendley.httpsgithub.billmurray;

/**
 * Created by j.fendley on 6/1/2018.
 */

public class MurrayMovie {

    private String name;
    private String description;
    private int imageResourceId;


    public static final MurrayMovie[] movies = {
            new MurrayMovie("Ghostbusters", "After the members of a team of scientists (Harold Ramis, Dan Aykroyd, Bill Murray) lose their cushy positions at a university in New York City, they decide to become \"ghostbusters\" to wage a high-tech battle with the supernatural for money. They stumble upon a gateway to another dimension, a doorway that will release evil upon the city. The Ghostbusters must now save New York from complete destruction.", R.drawable.ghostbusters2),
            new MurrayMovie("Groundhog Day", "A cynical TV weatherman (Bill Murray) finds himself reliving the same day over and over again when he goes on location to the small town of Punxsutawney to film a report about their annual Groundhog Day. His predicament drives him to distraction, until he sees a way of turning the situation to his advantage.", R.drawable.groundhogday2),
            new MurrayMovie("Life Aquatic with Steve Zissou", "Renowned oceanographer Steve Zissou (Bill Murray) has sworn vengeance upon the rare shark that devoured a member of his crew. In addition to his regular team, he is joined on his boat by Ned (Owen Wilson), a man who believes Zissou to be his father, and Jane (Cate Blanchett), a journalist pregnant by a married man. They travel the sea, all too often running into pirates and, perhaps more traumatically, various figures from Zissou's past, including his estranged wife, Eleanor (Anjelica Huston).", R.drawable.lifeaquatic2),
            new MurrayMovie("Tootsie", "New York actor Michael Dorsey (Dustin Hoffman) is a talented perfectionist who is so hard on himself and others that his agent (Sydney Pollack) can no longer find work for him. After a soap opera audition goes poorly, Michael reinvents himself as actress Dorothy Michaels and wins the part. What was supposed to be a short-lived role turns into a long-term contract, but when Michael falls for his castmate Julie (Jessica Lange), complications develop that could wreck everything.", R.drawable.tootsie),
            new MurrayMovie("Kingpin", "Roy Munson (Woody Harrelson) is a young bowler with a promising career ahead of him until a disreputable colleague, Ernie McCracken (Bill Murray), tricks him into participating in a con game that ends with Roy's bowling hand crippled for life. Years later, Roy ekes out a hardscrabble existence until he discovers Amish bowling phenom Ishmael (Randy Quaid). With the help of a gangser's girlfriend (Vanessa Angel), he plots to take Ishmael to the top of the bowling world.", R.drawable.kingpin),
            new MurrayMovie("What About Bob", "Before going on vacation, self-involved psychiatrist Dr. Leo Marvin (Richard Dreyfuss) has the misfortune of taking on a new patient: Bob Wiley (Bill Murray). An exemplar of neediness and a compendium of phobias, Bob follows Marvin to his family's country house. Dr. Marvin tries to get him to leave; the trouble is, everyone love Bob. As his oblivious patient makes himself at home, Dr. Marvin loses his professional composure and, before long, may be ready for the loony bin himself.", R.drawable.whataboutbob),
            new MurrayMovie("Scrooged", "In this modern take on Charles Dickens' \"A Christmas Carol,\" Frank Cross (Bill Murray) is a wildly successful television executive whose cold ambition and curmudgeonly nature has driven away the love of his life, Claire Phillips (Karen Allen). But after firing a staff member, Eliot Loudermilk (Bobcat Goldthwait), on Christmas Eve, Frank is visited by a series of ghosts who give him a chance to re-evaluate his actions and right the wrongs of his past.", R.drawable.scrooged),
            new MurrayMovie("Lost in Translation", "A lonely, aging movie star named Bob Harris (Bill Murray) and a conflicted newlywed, Charlotte (Scarlett Johansson), meet in Tokyo. Bob is there to film a Japanese whiskey commercial; Charlotte is accompanying her celebrity-photographer husband. Strangers in a foreign land, the two find escape, distraction and understanding amidst the bright Tokyo lights after a chance meeting in the quiet lull of the hotel bar. They form a bond that is as unlikely as it is heartfelt and meaningful.", R.drawable.lostintranslation),
            new MurrayMovie("Caddyshack", "Danny Noonan (Michael O'Keefe), a teen down on his luck, works as a caddy at the snob-infested Bushwood Country Club to raise money for his college education. In an attempt to gain votes for a college scholarship reserved for caddies, Noonan volunteers to caddy for a prominent and influential club member (Ted Knight). Meanwhile, Danny struggles to prepare for the high pressure Caddy Day golf tournament while absorbing New Age advice from wealthy golf guru Ty Webb (Chevy Chase).", R.drawable.caddyshack),
            new MurrayMovie("Stripes", "Hard-luck cabbie John Winger (Bill Murray) -- directionless after being fired from his job and dumped by his girlfriend -- enlists in the U.S. Army with his close pal, Russell Ziskey (Harold Ramis). After his barely satisfactory performance in basic training, the irreverent Winger emerges as the figurehead for a ragtag band of Army misfits. However, his hijinks threaten to cause an international scandal when he inadvertently commandeers a military assault vehicle behind enemy lines.", R.drawable.stripes),

    };

    /**
     * MurrayMovie is the constructor for objects of type movie that stores
     * a name, a description, and an image resource ID for each movie
     * @param movieName is the name of the movie
     * @param movieDescription is the description of the movie
     * @param movieImageResourceId is the image resource ID of the movie
     * @return an object of class movie
     */
    public MurrayMovie( String movieName, String movieDescription, int movieImageResourceId)
    {
        name = movieName;
        description = movieDescription;
        imageResourceId = movieImageResourceId;
    }

    /**
     * getName returns the name of the movie
     * @param "" There are no parameters
     * @return a String representing the name of the movie
     */
    public String getName()
    {
        return name;
    }

    /**
     * getDescription returns the description of the drink
     *
     * @param "" There are no parameters
     * @return a String representing the description of the drink
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * getImageResourceId returns the image resource id of the drink
     *
     * @param "" There are no parameters
     * @return a int representing the image resource id of the drink
     */
    public int getImageResourceId()
    {
        return imageResourceId;
    }

    /**
     * toString returns a string representation of the data held inside the drink class
     *
     * @param "" There are no parameters
     * @return a string representing the data within each drink
     */
    public String toString()
    {
        return this.name;
    }

}
