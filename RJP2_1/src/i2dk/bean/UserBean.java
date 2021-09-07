package i2dk.bean;

public class UserBean {
    private String name;
    private String pass;
    private String item;

    public String getName(){
        return name;
    }
    public String getPass(){
        return pass;
    }
    public String getItem(){
        return item;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setItem(String item){
        this.item = item;
    }
}
