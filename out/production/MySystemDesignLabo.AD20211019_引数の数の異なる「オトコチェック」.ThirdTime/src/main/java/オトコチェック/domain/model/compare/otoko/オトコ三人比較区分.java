package オトコチェック.domain.model.compare.otoko;

import オトコチェック.domain.model.compare.otoko.parts.HeightThreeComparator;
import オトコチェック.domain.model.item.message.回答;
import オトコチェック.domain.model.item.otoko.王子様;

public enum オトコ三人比較区分 {
     身長( new HeightThreeComparator());

     private ThreeComparatorStrategy myThreeComparatorStrategy;

     オトコ三人比較区分(ThreeComparatorStrategy myThreeComparatorStrategy){
         this.myThreeComparatorStrategy = myThreeComparatorStrategy;
     }

     public 回答 threeCompare( 王子様 o1, 王子様 o2, 王子様 o3 ){
         return myThreeComparatorStrategy.threeCompare( o1, o2, o3 );
     }
}