//@author Yağmur Doğan

public class Reservation {

    private String Rdate, res_meth;
    private int rid;
    private String meal_type;

    public Reservation (String Rdate, String res_meth, int rid, String meal_type){
        this.Rdate = Rdate;
        this.res_meth = res_meth;
        this.rid = rid;
        this.meal_type = meal_type;
    }

    public String getRdate(){
        return Rdate;
    }
    public void setRdate(String Rdate){
        this.Rdate = Rdate;
    }
    public String getRes_meth(){
        return res_meth;
    }
    public void setRes_meth(String res_meth){
        this.res_meth = res_meth;
    }
    public int getRid(){
        return rid;
    }
    public void setRid(int rid){
        this.rid = rid;
    }
    public String getMeal_type(){
        return meal_type;
    }
    public void setMeal_type(String meal_type){
        this.meal_type = meal_type;
    }
}
