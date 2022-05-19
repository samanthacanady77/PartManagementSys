package model;

public class Outsourced extends Part {
    //field declaration
    private String companyName;

    public Outsourced(int id, String name, double price, int stock, int min, int max) {
        super(id, name, price, stock, min, max);
    }

    //setter
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    //getter
    public String getCompanyName(){
        return companyName;
    }
}
