package オトコチェック.domain.model.compare.otoko.parts;

import オトコチェック.domain.model.compare.otoko.ComparatorStrategy;
import オトコチェック.domain.model.item.otoko.王子様;

//体重比較クラス
public class WeightComparator implements ComparatorStrategy {
    public String compare(王子様 o1 , 王子様 o2){
        //痩せてる人が好き♪
        if (o1.体重() > o2.体重()) { return o2.お名前(); }
        if (o1.体重() < o2.体重()) { return o1.お名前(); }
        else { return "両方とも"; }
    }
}