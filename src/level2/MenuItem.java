package level2;

public class MenuItem {
    private String name;
    private int price;
    private String info;

    void setName (String name){
        this.name = name;
    }
    void setPrice (int price) {
        this.price = price;
    }
    void setInfo (String info) {
        this.info = info;
    }
    void setMenu (String name, int price, String info){
        this.name = name;
        this.price = price;
        this.info = info;
    }

    String getName() {return name;}
    int getPrice() {return price;}
    String getInfo() {return info;}
}
