// @author Yağmur Doğan

public class Client {

    private int client_id;
    private String client_name;
    private String client_address;
    private String client_gender;
    private String client_fac;
    private String client_type;
    private String Edate;
    private int pid;
    private int rid;
    private int cid;

    public Client(int client_id, String client_name, String client_address, String client_gender, String client_fac, String client_type, String Edate, int pid, int rid, int cid) {
        this.client_id = client_id;
        this.client_name = client_name;
        this.client_address = client_address;
        this.client_gender = client_gender;
        this.client_fac = client_fac;
        this.client_type = client_type;
        this.Edate = Edate;
        this.pid = pid;
        this.rid = rid;
        this.cid = cid;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_address() {
        return client_address;
    }

    public void setClient_address(String client_address) {
        this.client_address = client_address;
    }

    public String getClient_gender() {
        return client_gender;
    }

    public void setClient_gender(String client_gender) {
        this.client_gender = client_gender;
    }

    public String getClient_fac() {
        return client_fac;
    }

    public void setClient_fac(String client_fac) {
        this.client_fac = client_fac;
    }

    public String getClient_type() {
        return client_type;
    }

    public void setClient_type(String client_type) {
        this.client_type = client_type;
    }

    public String getEdate() {
        return Edate;
    }

    public void setEdate(String Edate) {
        this.Edate = Edate;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }


}
