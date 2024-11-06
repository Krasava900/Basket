public class Basket {
    private  static String items = "";

    public static void main(String[] args) {
        ada("1 кг картошки", 500);
        ada("Апельсиновый сок", 200);
        ada("2 кг говядина", 1500);
        ada("Малосаленные огурцы", 400);
        ada("Майонез", 100);
        print("Содержание корзины: ");
        clear();
        print("Содержание корзины: ");

    }

    public static void ada(String name, int price) {
        if(items.isEmpty()) {
            items += name + " - " + price;
        }
        else {
            items += "\n" + name + " - " + price;
        }
    }


    public static void clear() {
        items = "";
    }
    public static void print(String title) {
        System.out.println(title);
        if(items.isEmpty()){
            System.out.println("Корзина пустая");
        }
        else {
            System.out.println(items);
        }
    }





}
