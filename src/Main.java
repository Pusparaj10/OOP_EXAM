import Model.TShirt;
import Model.Order;
public class Main {
    public static void main(String[] args) {

        TShirt tshirt1 = new TShirt("Gorkhali Batman", 572, 1235, "Karuna", "Graphic text: You either die a hero or live long enough to see yourself be a villain", new String[]{"XL", "Medium", "Large"});

        tshirt1.describeTShirt();


        Order order1 = new Order("Gopal Sharma", "0486756465", new String[]{"572", "681"}, new double[]{1235, 1780});

        order1.printBill();


    }
}
