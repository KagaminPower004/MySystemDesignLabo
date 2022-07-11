package domain.model;

import domain.support.primitive_data_types.*;

public class CeckBehavior {

    public static void main(String[] args){

        new CeckBehavior().test();

    }

    private StringRecord hoge;
    public void test(){
        //フィールドをいじってみる
        this.hoge = new StringRecord("ヴァルヴァルヴァル!!!");
        System.out.println(hoge.toString().startsWith("ヴァ"));
        System.out.println(hoge.Val().startsWith("ヴァ"));
        System.out.println(hoge.Val().length());
        System.out.println(hoge.Val());

        //ろーかるにすてみる♪
        IntRecord intHoge = new IntRecord(123);
        System.out.println(intHoge);
        System.out.println( intHoge.Val() );
        System.out.println( intHoge.Val() + new IntRecord(456).Val() );
        System.out.println( new IntRecord(123 + 456).Val() );

        IntRecord intHogeHoge = new IntRecord(456);
        System.out.println(intHoge.Val() + intHogeHoge.Val());

    }
}
