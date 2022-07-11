package domain.model;

import domain.support.primitive_data_types.*;

public class TestBehavior {

    public static void main(String[] args){

        new TestBehavior().test();

    }

    private StringRecord hoge;
    public void test(){
        //フィールドをいじってみる
        this.hoge = new StringRecord("ヴァルヴァルヴァル!!!");
        System.out.println(hoge.toString().startsWith("ヴァ"));
        System.out.println(hoge.StringRecord().startsWith("ヴァ"));
        System.out.println(hoge.StringRecord().length());
        System.out.println(hoge.StringRecord());

        //ろーかるにすてみる♪
        IntRecord intHoge = new IntRecord(123);
        System.out.println(intHoge);
        System.out.println( intHoge.IntRecord() );
        System.out.println( intHoge.IntRecord() + new IntRecord(456).IntRecord() );
        System.out.println( new IntRecord(123 + 456).IntRecord() );

    }
}
