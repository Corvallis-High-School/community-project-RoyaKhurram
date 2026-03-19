class Main {

  public static void main(String[] args) {
    // Construct 2 objects of your class using the constructor with different values
    CommunityProject e1 = new FundraiserEvent("Charity Run", 15, 6, 2026, "3:00 pm", "Avery Park", 9000.0, " raise awareness for cancer ");
    CommunityProject e2 = new SportEvent("Home Game", 22, 11, 2026, "12:00 pm", "Corvallis High School", "Basektball", "Spartians", "Raiders", 20);


    // call all of the objects methods to test them
    e1.print();
    e2.print();
    System.out.println(e1.getEventName());
    System.out.println(e2.getDay());
    e1.setMonth(7);
    System.out.println(e1.toString());
    e2.infoFormat("Detailed");
    

  }
}