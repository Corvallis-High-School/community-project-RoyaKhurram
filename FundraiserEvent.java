public class FundraiserEvent extends CommunityProject
{
private double moneyNeeded;
private String eventFor;
private double amtRaised =0;
public FundraiserEvent()
{
    super();
    moneyNeeded = 0.0;
    eventFor = "";
    amtRaised = 0.0;
}
public FundraiserEvent(String eventName, int day, int month, int year, String time, String location, double moneyNeeded, String eventFor, double amtRaised)
{
    super(eventName, day, month, year, time, location);
    this.moneyNeeded=moneyNeeded;
    this.eventFor = eventFor;
    this.amtRaised = amtRaised;

}
public double getAmtRaised()
{
    return amtRaised;
}
public double getMoneyNeeded()
{
    return moneyNeeded;
}
public String getEventFor()
{
    return eventFor;

}
public void setMoneyNeeded(double moneyNeeded)
{
    this.moneyNeeded=moneyNeeded;
}
public void setEventFor(String eventFor)
{
    this.eventFor= eventFor;
}
public void setAmtRaised(double amtRaised)
{
    this.amtRaised = amtRaised;
}
public String toString()
{
    return  super.toString() + ", " + "Money needed " + moneyNeeded + " Cause for Fundraiser: " + eventFor;
}
public String donate(double amt)
{
    amtRaised += amt;
    setMoneyNeeded((moneyNeeded-amt));
    return "Thanks for the donation we are " + (moneyNeeded-amtRaised) + " away from our goal of " + moneyNeeded;
}
public void print()
{
    super.print();
    System.out.println(" Money needed to raise: " + moneyNeeded + " this event is for " + eventFor);
}
}
