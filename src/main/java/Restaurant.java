import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Restaurant {
    public int id;
    public String name;
    public double rating;
    public String address;
    public String[] cuisinesOffered;
}
