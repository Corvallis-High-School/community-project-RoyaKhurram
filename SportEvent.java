public class SportEvent extends CommunityProject
{
    private String sport;
    private String teamA;
    private String teamB;
    private int maxTickets;
    private int score;
    public SportEvent(String eventName, int day, int month, int year, String time, String location, String sport, String teamA, String teamB, int score)
    {
        super(eventName, day, month, year, time, location);
        this.sport = sport;
        this.teamA = teamA;
        this.teamB = teamB;
        this.score = score;
    
    }
    public SportEvent()
    {}
    public String toString()
    {
        return super.toString() + " game of: " + sport + ", " + teamA + " against " + teamB + " Current score of "  + teamA + " is: " + score;

    }
    public void addPoint()
    {
        score++;
    }
    public void removePoint()
    {
        score--;
    }
    public int getScore()
    {
        return score;
    }
    public void print()
    {
        super.print();
        System.out.println(sport + " game." + " Team A is " + teamA + " and team B is " + teamB + " the current score is " + score);
    }
    }
    