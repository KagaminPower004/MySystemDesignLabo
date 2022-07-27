package application.service;

public class Ceck_IntegrationBehavior {
    public static void main(String[] args) {
        //アプリケーション層のプリミティブなだけのレコードクラスを、
        // インターフェース経由でドメインに渡す！！！
        Interface_IntOfImmutable hoge01 = new IntOfImmutable(321);
        new domain.model.CeckBehavior().test02( hoge01 ) ;
    }
}
