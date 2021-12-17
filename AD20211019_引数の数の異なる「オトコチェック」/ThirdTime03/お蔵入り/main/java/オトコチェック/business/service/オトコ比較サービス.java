package オトコチェック.business.service;

import オトコチェック.business.Adapter.オトコ比較区分アダプター;
import オトコチェック.domain.model.compare.otoko.オトコ二人比較区分;
import オトコチェック.domain.model.compare.otoko.オトコ三人比較区分;
import オトコチェック.domain.model.item.otoko.王子様;

//比較サービス
public class オトコ比較サービス {

    private オトコ比較区分アダプター myオトコ比較区分アダプター;

    public オトコ比較サービス(int 人数, String 比較内容 ){
        try{
            if(人数 == 2){
                this.myオトコ比較区分アダプター = new オトコ比較区分アダプター( オトコ二人比較区分.valueOf(比較内容));
            }
            if(人数 == 3){
                this.myオトコ比較区分アダプター = new オトコ比較区分アダプター( オトコ三人比較区分.valueOf(比較内容));
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("そのオトコ比較は対応できません");
        }
    }

    public final String 二人比較(王子様 o1, 王子様 o2){
        return myオトコ比較区分アダプター.二人比較(o1, o2);
    }
    public final String 三人比較(王子様 o1, 王子様 o2, 王子様 o3){
        return myオトコ比較区分アダプター.三人比較(o1,o2,o3);
    }
}