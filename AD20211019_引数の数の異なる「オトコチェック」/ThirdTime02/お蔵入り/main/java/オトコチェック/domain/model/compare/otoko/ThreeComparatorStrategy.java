package オトコチェック.domain.model.compare.otoko;

import オトコチェック.domain.model.item.otoko.王子様;

public interface ThreeComparatorStrategy {
    String threeCompare(王子様 o1 , 王子様 o2 , 王子様 o3);
}