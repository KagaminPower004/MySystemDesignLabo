package オトコチェック.domain.model.compare.otoko.parts;

import オトコチェック.domain.model.item.message.回答;
import オトコチェック.domain.model.item.otoko.王子様;
import オトコチェック.domain.model.compare.otoko.ThreeComparatorStrategy;

public class HeightThreeComparator implements ThreeComparatorStrategy {
    public 回答 threeCompare(王子様 o1, 王子様 o2, 王子様 o3) {
        //背が高い人が好き♪
        return new 回答(
                        compareRecursion(compareRecursion(o1, o2), o3)
                        .お名前()
                        );
    }

    private 王子様 compareRecursion(王子様 o1, 王子様 o2) {
        //背が高い人が好き♪
        if (o1.身長() > o2.身長()) { return o1; }
        if (o1.身長() < o2.身長()) { return o2; }
        else {
            String name = o1.お名前() + "♪" + o2.お名前();
            int height = o1.身長();
            int weight = o2.体重();
            int age = o2.年齢();
            return new 王子様(name, height, weight, age);
        }
    }
}