package application.service;

import domain.model.CheckBehavior;
import domain.support.type.Interface_IntOfImmutable;

public class Check_IntegrationBehavior {
    public static void main(String[] args) {
        //アプリケーション層のプリミティブなだけのレコードクラスを、
        // インターフェース経由でドメインに渡す！！！
        Interface_IntOfImmutable hoge01
                = new application.service.IntOfImmutable(321);

        new CheckBehavior().test02( hoge01 ) ;
    }
}
