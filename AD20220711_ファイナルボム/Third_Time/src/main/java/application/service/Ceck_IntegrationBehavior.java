package application.service;

import application.support.primitive_data_types.IntOfImmutable;

public class Ceck_IntegrationBehavior {
    public static void main(String[] args) {
        //アプリケーション層のプリミティブなだけのレコードクラスを、
        // インターフェース経由でドメインに渡す！！！
        Interface_IntOfImmutable hoge = new IntOfImmutable(321);
        new domain.model.CeckBehavior().test02( hoge ) ;
    }
}
