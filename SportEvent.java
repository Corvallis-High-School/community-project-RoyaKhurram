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
    public String getSport()
    {
        return sport;
    }
    public String getTeamA()
    {
        return teamA;
    }
    public String getTeamB()
    {
        return teamB;
    }
    public int getMaxTickets()
    {
        return maxTickets;

    }
    public void setSport(String sport)
    {
        this.sport = sport;
    }
    public void setTeamA(String teamA)
    {
        this.teamA=teamA;
    }
    public void setTeamB(String teamB)
    {
        this.teamB = teamB;
    }
    public void setMaxTickets(int maxTickets)
    {
        this.maxTickets = maxTickets;

    }
    public void setScore(int score)
    {
        this.score= score;
    }
    public String toString()
    {
        return super.toString() + " game of: " + sport + ", " + teamA + " against " + teamB + " Current score of "  + teamA + " is: " + score;

    }
    public void changeScore(int change)
    {
        score += change;
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
    
    