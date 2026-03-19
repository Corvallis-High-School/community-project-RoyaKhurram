public class CommunityProject {
    // 1. write 3 instance variables for class: private type variableName;
    private String eventName;
    private int day;
    private int month;
    private int year;
    private String time;
    private String location;
    public CommunityProject()
    {
        
    }


    // 2. Add a constructor with 3 parameters to set all of the instance variables to the given parameters.
    public CommunityProject(String eventName, int day, int month, int year, String time, String location)
    {
        this.eventName = eventName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.time= time;
        this.location= location;
    }

    // 3. Write a print() method that uses System.out.println to print out all the instance variables.
    public void print()
    {
        System.out.println(eventName + ": " + day + "/" + month + "/" + year + "," + time + "," + location);
    }

    // 4. Create accessor (get) methods for each of the instance variables.
    public String getEventName()
    {
        return eventName;
    }
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public String getTime()
    {
        return time;
    }
    public String getLocation()
    {
        return location;
    }

    // 5. Create mutator (set) methods for each of the instance variables.
    public void setEventName(String eventName)
    {
        this.eventName = eventName;
    }
    public void setDay(int day)
    {
        this.day = day;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }

    // 6. Create a toString() method that returns all the information in the instance variables.
    public String toString()
    {
        return eventName + " : " + day  + "/" + month + "/" + year + ", " + time + ", " + location;
    }
    

    // 7. Write an additional method for your class that takes a parameter. For example, there could be a print method with arguments that indicate how you want to print out the information, e.g. print(format) could print the data according to an argument that is "plain" or "table" where the data is printed in a table drawn with dashes (-) and lines (|).
    public void infoFormat(String format)
    {
        String info;
        if (format == "One Line" || format == "one line")
        {
            info = eventName + " is scheduled for " + day + "/" + month + ".";
            System.out.println(info);
        }
        else if (format == "Detailed" || format == "detailed")
        {
            info = "Event Name: " + eventName + "\nDay: " + day + "\nMonth: " + month;
            System.out.println(info);
        }
        
    }
}
    