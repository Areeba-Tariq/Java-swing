public class Contacts {

    private String givenname;
    private String surname;
    private String mob;
    private String email;

    public Contacts(String Givenname, String surname, String mob, String email)
    {

        givenname = Givenname;
        this.surname = surname;
        this.mob = mob;
        this.email = email;
    }

    public String getGivenname() {
        return givenname;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
