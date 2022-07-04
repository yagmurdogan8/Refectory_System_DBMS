//@author Yağmur Doğan

public class Employee {

    private int Eid;
    private String Ename, Eaddress, Egender, Sdate;
    private int cid;

    public Employee(int Eid, String Ename, String Eaddress, String Egender, String Sdate, int cid) {
        this.Eid = Eid;
        this.Ename = Ename;
        this.Eaddress = Eaddress;
        this.Egender = Egender;
        this.Sdate = Sdate;
        this.cid = cid;
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int Eid) {
        this.Eid = Eid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String Ename) {
        this.Ename = Ename;
    }

    public String getEaddress() {
        return Eaddress;
    }

    public void setEaddress(String Eaddress) {
        this.Eaddress = Eaddress;
    }

    public String getEgender() {
        return Egender;
    }

    public void setEgender(String Egender) {
        this.Egender = Egender;
    }

    public String getSdate() {
        return Sdate;
    }

    public void setSdate(String Sdate) {
        this.Sdate = Sdate;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }


}
