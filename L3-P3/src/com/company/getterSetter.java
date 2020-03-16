package com.company;

public class getterSetter {
    private int Nb;
    private String Str;

    public void setNumber(int number){
        this.Nb=number;
    }
    public void setString(String str1){
        this.Str=str1;
    }

    public int getNumber(){
        return this.Nb;
    }

    public String getStr(){
        return this.Str;
    }

}
