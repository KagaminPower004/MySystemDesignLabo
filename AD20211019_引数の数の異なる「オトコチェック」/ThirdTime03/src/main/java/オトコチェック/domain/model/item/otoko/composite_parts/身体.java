package オトコチェック.domain.model.item.otoko.composite_parts;

import オトコチェック.domain.model.item.message.回答;
import オトコチェック.domain.model.item.otoko.parts.体重;
import オトコチェック.domain.model.item.otoko.parts.年齢;
import オトコチェック.domain.model.item.otoko.parts.身長;

public class 身体 {
    private 身長 my身長;
    private 体重 my体重;
    private 年齢 my年齢;

    public 身体(int 身長, int 体重, int 年齢){
        this.my身長 = new 身長(身長);
        this.my体重 = new 体重(体重);
        this.my年齢 = new 年齢(年齢);
    }

    public Boolean is非該当(){
        if(my身長.is非該当()){ return true; }
        if(my体重.is非該当()){ return true; }
        if(my年齢.is非該当()){ return true; }
        else{ return false; }
    }

    public 回答 非該当箇所(){
        String my非該当箇所 = "";

        if(my身長.is非該当()){
            my非該当箇所 = my身長.getClass().getSimpleName() + ":" + my身長.value() ;
        }

        if(my体重.is非該当()){
            my非該当箇所 = my体重.getClass().getSimpleName() + ":" + my体重.value() ;
        }

        if(my年齢.is非該当()){
            my非該当箇所 = my年齢.getClass().getSimpleName() + ":" + my年齢.value() ;
        }

        if( my非該当箇所.isEmpty() ){ my非該当箇所 = "誤った設定は1つもございません。"; }

        return new 回答( my非該当箇所 );
    }

    public Integer 身長(){
        return my身長.value();
    }

    public Integer 体重(){
        return my体重.value();
    }

    public Integer 年齢(){
        return my年齢.value();
    }
}