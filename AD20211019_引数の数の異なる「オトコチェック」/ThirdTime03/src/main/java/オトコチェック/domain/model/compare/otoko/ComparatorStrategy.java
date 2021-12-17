package オトコチェック.domain.model.compare.otoko;

import オトコチェック.domain.model.item.otoko.王子様;
import オトコチェック.domain.model.item.message.回答;

//比較インターフェース
public interface ComparatorStrategy {
    回答 compare(王子様 o1 , 王子様 o2);
}