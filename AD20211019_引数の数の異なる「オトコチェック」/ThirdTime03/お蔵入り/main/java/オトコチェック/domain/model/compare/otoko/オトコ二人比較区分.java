package オトコチェック.domain.model.compare.otoko;

import オトコチェック.domain.model.compare.otoko.parts.HeightComparator;
import オトコチェック.domain.model.compare.otoko.parts.WeightComparator;
import オトコチェック.domain.model.item.otoko.王子様;

public enum オトコ二人比較区分 {
     身長( new HeightComparator())
    ,体重( new WeightComparator())
    ,年齢( null);

     private ComparatorStrategy myComparatorStrategy;

     private オトコ二人比較区分(ComparatorStrategy myComparatorStrategy){
         this.myComparatorStrategy = myComparatorStrategy;
     }

     public String compare( 王子様 o1, 王子様 o2 ){
         return myComparatorStrategy.compare(o1, o2 );
     }
}