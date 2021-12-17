package オトコチェック.domain.model.item.otoko;

import オトコチェック.domain.model.item.otoko.parts.*;

public class 王子様 {

    private お名前 myお名前;
    private 身長 my身長;
    private 体重 my体重;
    private 年齢 my年齢;

    public 王子様(String お名前, int 身長, int 体重, int 年齢){
        this.myお名前 = new お名前(お名前);
        this.my身長 = new 身長(身長);
        this.my体重 = new 体重(体重);
        this.my年齢 = new 年齢(年齢);
    }

    public Boolean is非該当(){
        if(myお名前.is非該当()){ return true; }
        if(my身長.is非該当()){ return true; }
        if(my体重.is非該当()){ return true; }
        if(my年齢.is非該当()){ return true; }
        else{ return false; }
    }

    public String 非該当箇所(){
        String my非該当箇所 = "";

        if(myお名前.is非該当()){
            my非該当箇所 = myお名前.getClass().getSimpleName() + ":" + myお名前.value() ;
        }

        if(my身長.is非該当()){
            my非該当箇所 = my身長.getClass().getSimpleName() + ":" + my身長.value() ;
        }

        if(my体重.is非該当()){
            my非該当箇所 = my体重.getClass().getSimpleName() + ":" + my体重.value() ;
        }

        if(my年齢.is非該当()){
            my非該当箇所 = my年齢.getClass().getSimpleName() + ":" + my年齢.value() ;
        }

        else{ my非該当箇所 = "誤った設定は1つもございません。"; }

        return my非該当箇所;
    }

    public String お名前(){
        return myお名前.value();
    }

    public int 身長(){
        return my身長.value();
    }

    public int 体重(){
        return my体重.value();
    }

    public int 年齢(){
        return my年齢.value();
    }
}