package PhoneStore;
import java.util.*;

public class Main {

public static void main(String[] args) {
    List<Phone> phones = new ArrayList<>();
    phones.add(new Phone("Samsung s22", 3000));
    phones.add(new Phone("Xiaomi mi 10", 2800));
    phones.add(new Phone("Nokia g21", 690));

    phones.stream().sorted(new PhoneComparator()).forEach(p->
            System.out.printf("Full price: %s - %dBLR\n", p.getName(), p.getPrice()));
    System.out.println();

    System.out.println("Enter season:");
    String nameSeason =new Scanner(System.in).nextLine();

    phones.stream().sorted(new PhoneComparator()).forEach(p->
            System.out.printf(nameSeason + "price: %s - %.2fBLR\n", p.getName(), p.getSeasonDiscount(nameSeason)));

}
static class PhoneComparator implements Comparator<Phone>{
    @Override
    public int compare(Phone a, Phone b) {
        if (a.getPrice() > b.getPrice()){
            return 1;
        } else if (a.getPrice() ==b.getPrice()) {
            return 0;
        }else {
            return -1;
        }

    }
}
}
