package domain.model;

import domain.support.type.Interface_IntOfImmutable;
import domain.support.type.IntOfImmutable;
import domain.support.type.StringOfImmutable;

public class CheckBehavior {

    public static void main(String[] args){

        new CheckBehavior().test();

    }

    private StringOfImmutable hogeMessage;
    protected void test(){
        //フィールドをいじってみる
        this.hogeMessage = new StringOfImmutable("ヴァルヴァルヴァル!!!");
        System.out.println( hogeMessage.toString().startsWith("ヴァ") );
        System.out.println( hogeMessage.value().startsWith("ヴァ") );
        System.out.println( hogeMessage.value().length() );
        System.out.println( hogeMessage.value() );

        //ろーかるにすてみる♪
        IntOfImmutable hogeAmount = new IntOfImmutable(123);
        System.out.println( hogeAmount );
        System.out.println( hogeAmount.value() );
        System.out.println( hogeAmount.value() + new IntOfImmutable(456).value() );
        System.out.println( new IntOfImmutable(123 + 456).value() );

        IntOfImmutable hogeHogeAmount = new IntOfImmutable(456);
        System.out.println( hogeAmount.value() + hogeHogeAmount.value() );

        //ろーかるめそっどをじっけんしてみぅ♪
        System.out.println( this.hoge( new StringOfImmutable("aaa") ) );

        //intをIntegerに変換するぉ♪
        System.out.println("[999]と[777]をぢか打ちで比較するぉ♪");
        System.out.println( new IntOfImmutable( 999 ).toInteger().compareTo(777) );

        System.out.println("[777]と[999]をぢか打ちで比較するぉ♪");
        System.out.println( new IntOfImmutable( 777 ).toInteger().compareTo(999) );
    }

    public void test02(Interface_IntOfImmutable Param01 ){
        System.out.println( "引数の値は..." );

        System.out.println( Param01.value() );

        System.out.println( "続いて上記に123を足す" );

        System.out.println
            (
                    new IntOfImmutable( Param01.value() ).value()
                    +
                    123
            );
    }

    private String hoge( StringOfImmutable aaa ){
        return aaa.String();
    }
}
