import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class Main {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("phim1", "the loai", "dao dien", 120, 10);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("phim2", "the loai", "dao dien", 130, 20);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("phim3", "the loai", "dao dien", 110, 40);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("phim4", "the loai", "dao dien", 150, 30);

        Cart cart = new Cart();

        cart.add_DVD(dvd1);
        cart.add_DVD(dvd2);
        cart.print();
        cart.calculate_total_cost();

        cart.remove_DVD(dvd2);
        cart.add_DVD(dvd3);
        cart.add_DVD(dvd4);
        cart.remove_DVD(dvd2);
        cart.print();
        cart.calculate_total_cost();
    }
}