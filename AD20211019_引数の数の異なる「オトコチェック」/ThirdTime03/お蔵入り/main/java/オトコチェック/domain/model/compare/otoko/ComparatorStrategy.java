package オトコチェック.domain.model.compare.otoko;

import オトコチェック.domain.model.item.otoko.王子様;

//比較インターフェース
public interface ComparatorStrategy {
    String compare(王子様 o1 , 王子様 o2);
}