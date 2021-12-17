package オトコチェック.domain.model.compare.otoko;

import オトコチェック.domain.model.compare.otoko.parts.HeightThreeComparator;
import オトコチェック.domain.model.item.otoko.王子様;

public enum オトコ三人比較区分 {
     身長( new HeightThreeComparator())
    ,体重( null)
    ,年齢( null);

     private ThreeComparatorStrategy myThreeComparatorStrategy;

     private オトコ三人比較区分(ThreeComparatorStrategy myThreeComparatorStrategy){
         this.myThreeComparatorStrategy = myThreeComparatorStrategy;
     }

     public String threeCompare( 王子様 o1, 王子様 o2, 王子様 o3 ){
         return myThreeComparatorStrategy.threeCompare( o1, o2, o3 );
     }
}