public class Contact {
    private String fname;
    private String lname;
    private String mblNo;
    private String email;

    public Contact(String fname, String lname, String mblNo, String email) {
        this.fname = fname;
        this.lname = lname;
        this.mblNo = mblNo;
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getMblNo() {
        return mblNo;
    }

    public String getEmail() {
        return email;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setMblNo(String mblNo) {
        this.mblNo = mblNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
