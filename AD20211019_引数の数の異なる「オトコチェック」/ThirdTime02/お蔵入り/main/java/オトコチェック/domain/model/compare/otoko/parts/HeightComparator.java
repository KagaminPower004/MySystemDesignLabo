package オトコチェック.domain.model.compare.otoko.parts;

import オトコチェック.domain.model.compare.otoko.ComparatorStrategy;
import オトコチェック.domain.model.item.otoko.parts.お名前;
import オトコチェック.domain.model.item.otoko.王子様;

//身長比較クラス
public class HeightComparator implements ComparatorStrategy {
    public String compare(王子様 o1, 王子様 o2) {
        //背が高い人が好き♪
        if (o1.身長() > o2.身長()) { return o1.お名前(); }
        if (o1.身長() < o2.身長()) { return o2.お名前(); }
        else { return "両方とも"; }
    }
}