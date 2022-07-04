//@author Yağmur Doğan

public class Meal {

    private String meal_type;
    private int price, cid;

    public Meal(String meal_type, int price, int cid){
        this.meal_type = meal_type;
        this.price = price;
        this.cid = cid;

    }
    public String getMeal_type(){
        return meal_type;
    }
    public void setMeal_type(String meal_type){
        this.meal_type = meal_type;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getCid(){
        return cid;
    }
    public void setCid(int cid){
        this.cid = cid;
    }

}
