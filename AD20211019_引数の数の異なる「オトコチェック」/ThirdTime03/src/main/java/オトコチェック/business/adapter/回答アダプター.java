package オトコチェック.business.adapter;

import オトコチェック.domain.model.item.message.回答;

public class 回答アダプター {

        private final 回答 my回答;

        public 回答アダプター(String 回答){
            my回答 = new 回答(回答);
        }

        public final String アダプタ回答(){ return this.my回答.回答() ;}
}
