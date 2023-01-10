import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Order {
    public int id;
    public Date date;
    public int timeTaken;
    public User user;
    public Restaurant restaurant;
    public double amount;
    public Rider rider;
    public String paymentMethod;
    public String paymentStatus;
}
