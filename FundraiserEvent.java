public class FundraiserEvent extends CommunityProject
{
private double moneyNeeded;
private double amtRaised = 0;
private String eventFor;
public FundraiserEvent()
{
    

}
public FundraiserEvent(String eventName, int day, int month, int year, String time, String location, double moneyNeeded, String eventFor)
{
    super(eventName, day, month, year, time, location);
    this.moneyNeeded=moneyNeeded;
    this.eventFor = eventFor;

}
public String toString()
{
    return  super.toString() + ", " + "Money needed " + moneyNeeded + " Cause for Fundraiser: " + eventFor;
}
public String donate(double amt)
{
    amtRaised += amt;
    moneyNeeded-= amt;
    return "Thanks for the donation we are " + (moneyNeeded-amtRaised) + " away from our goal of " + moneyNeeded;
}
}
