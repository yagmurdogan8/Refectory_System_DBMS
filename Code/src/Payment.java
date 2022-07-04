//@author Yağmur Doğan

public class Payment {

    private String Pdate, pay_meth;
    private int pid;
    private String meal_type;

    public Payment(String Pdate, String pay_meth, int pid, String meal_type){
        this.Pdate = Pdate;
        this.pay_meth = pay_meth;
        this.pid = pid;
        this.meal_type = meal_type;
    }
    public String getPdate(){
        return Pdate;
    }
    public void setPdate(String Pdate){
        this.Pdate = Pdate;
    }
    public String getPay_meth(){
        return pay_meth;
    }
    public void setPay_meth(String pay_meth){
        this.pay_meth = pay_meth;
    }
    public int getPid(){
        return pid;
    }
    public void setPid(int pid){
        this.pid = pid;
    }
    public String getMeal_type(){
        return meal_type;
    }
    public void setMeal_type(String meal_type){
        this.meal_type = meal_type;
    }

}
