package com.company;
public class Encapsulation {
    private String id,password;
    public String getId()//accessor method
    {
        return id;
    }
    public String getPassword()//accessor method
    {
        return password;
    }
    public void setDetails(String id,String password)//mutator method
    {
        this.id=id;
        this.password=password;
    }
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        e.setDetails("ismailshaikh0876262@gmail.com","IsmailShaikh@8424985679");
        System.out.println(e.getId()+"\n"+e.getPassword());
    }
}
