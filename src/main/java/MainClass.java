import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        User u1 = new User(01,"meg","m","meg123","123456",new Date(1993,10,9),"HMS Hisar");

        Restaurant r1 = new Restaurant(1,"Mustard",4.3,"Industrial Area Hisar",new String[]{"Indian","Continental","Chinese"});
        Restaurant r2 = new Restaurant(2,"Tamas",3.8,"Industrial Area Hisar",new String[]{"Indian","Continental","Chinese","Lebanese"});

        Rider rd1 = new Rider(01,"Rajesh","014561111",4.4);
        Order o1 = new Order(01,new Date(),42,u1,r1,1220,rd1,"Online","Paid");

        System.out.println("Order details : "+o1.user.firstName+ " "+o1.user.lastName);
        System.out.println("Order Amount : "+o1.amount);
        System.out.println("Order restaurant : "+o1.restaurant.name);
        System.out.println("Rider Details : "+o1.rider.name + " Contact : "+o1.rider.contactDetails);
        System.out.println("Time Taken in minutes to prepare : "+o1.timeTaken);

    }
}
