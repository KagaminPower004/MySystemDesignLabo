package オトコチェック.domain.model.compare.otoko;

import オトコチェック.domain.model.item.otoko.王子様;
import オトコチェック.domain.model.item.message.回答;

//三人比較インターフェース
public interface ThreeComparatorStrategy {
    回答 threeCompare(王子様 o1 , 王子様 o2 , 王子様 o3);
}