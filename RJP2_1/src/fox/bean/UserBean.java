package fox.bean;

public class UserBean {
    private String name;
    private String pass;

    public String getName(){
        return name;
    }
    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    public void setName(String name){
        this.name = name;
    }
}