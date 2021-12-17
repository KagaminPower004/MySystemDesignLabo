package オトコチェック.domain.model.item.otoko;

import オトコチェック.domain.model.item.message.回答;
import オトコチェック.domain.model.item.otoko.composite_parts.身体;
import オトコチェック.domain.model.item.otoko.parts.*;

public class 王子様 {

    private お名前 myお名前;
    private 身体 my身体;

    public 王子様(String お名前, int 身長, int 体重, int 年齢){
        this.myお名前 = new お名前(お名前);
        this.my身体 = new 身体(身長,体重,年齢);
    }

    public Boolean is非該当(){
        if(myお名前.is非該当()){ return true; }
        if(my身体.is非該当()){ return true; }
        else{ return false; }
    }

    public 回答 非該当箇所(){
        String my非該当箇所 = "";

        if(myお名前.is非該当()){
            my非該当箇所 = myお名前.getClass().getSimpleName() + ":" + myお名前.value() ;
        }

        if(my身体.is非該当()){
            my非該当箇所 = my身体.getClass().getSimpleName() + ":" + my身体.非該当箇所() ;
        }

        if( my非該当箇所.isEmpty() ){ my非該当箇所 = "誤った設定は1つもございません。"; }

        return new 回答( my非該当箇所 );
    }

    public String お名前(){
        return myお名前.value();
    }

    public Integer 身長(){
        return my身体.身長();
    }

    public Integer 体重(){
        return my身体.体重();
    }

    public Integer 年齢(){
        return my身体.年齢();
    }
}