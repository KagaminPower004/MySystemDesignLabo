package オトコチェック.business.Adapter;

import オトコチェック.domain.model.compare.otoko.オトコ二人比較区分;
import オトコチェック.domain.model.compare.otoko.オトコ三人比較区分;
import オトコチェック.domain.model.item.otoko.王子様;

public class オトコ比較区分アダプター {
    private オトコ二人比較区分 myオトコ二人比較;
    private オトコ三人比較区分 myオトコ三人比較;

    public オトコ比較区分アダプター(オトコ二人比較区分 myオトコ二人比較){
        this.myオトコ二人比較 = myオトコ二人比較;
    }

    public オトコ比較区分アダプター(オトコ三人比較区分 myオトコ三人比較){
        this.myオトコ三人比較 = myオトコ三人比較;
    }

    public final String 二人比較(王子様 o1, 王子様 o2){
        if(myオトコ二人比較.name() == オトコ二人比較区分.身長.name()) { return myオトコ二人比較.身長.compare(o1, o2); }
        if(myオトコ二人比較.name() == オトコ二人比較区分.体重.name()) { return myオトコ二人比較.体重.compare(o1, o2); }
        else{ return "該当する二人を比較するメソッドがございません"; }
    }

    public final String 三人比較(王子様 o1, 王子様 o2, 王子様 o3){
        if(myオトコ三人比較.name() == オトコ二人比較区分.身長.name()) { return myオトコ三人比較.身長.threeCompare(o1, o2, o3); }
        else{ return "該当する三人を比較するメソッドがございません"; }
    }
}