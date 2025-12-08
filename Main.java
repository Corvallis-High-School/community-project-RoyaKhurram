class Main {

  public static void main(String[] args) {
    // Construct 2 objects of your class using the constructor with different values
    CommunityProject e1 = new CommunityProject("Charity Run", 15, 6);
    CommunityProject e2 = new CommunityProject("Food Drive", 22, 11);

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