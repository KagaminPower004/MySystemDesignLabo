package domain.model;

import domain.support.primitive_data_types.*;

public class CeckBehavior {

    public static void main(String[] args){

        new CeckBehavior().test();

    }

    private StringOfImmutable hogeMessage;
    public void test(){
        //フィールドをいじってみる
        this.hogeMessage = new StringOfImmutable("ヴァルヴァルヴァル!!!");
        System.out.println( hogeMessage.toString().startsWith("ヴァ") );
        System.out.println( hogeMessage.Value().startsWith("ヴァ") );
        System.out.println( hogeMessage.Value().length() );
        System.out.println( hogeMessage.Value() );

        //ろーかるにすてみる♪
        IntOfImmutable hogeAmount = new IntOfImmutable(123);
        System.out.println( hogeAmount );
        System.out.println( hogeAmount.Value() );
        System.out.println( hogeAmount.Value() + new IntOfImmutable(456).Value() );
        System.out.println( new IntOfImmutable(123 + 456).Value() );

        IntOfImmutable hogeHogeAmount = new IntOfImmutable(456);
        System.out.println( hogeAmount.Value() + hogeHogeAmount.Value() );

        //ろーかるめそっどをじっけんしてみぅ♪
        System.out.println( this.hoge( new StringOfImmutable("aaa") ) );
    }

    private String hoge( StringOfImmutable aaa ){
        return aaa.Value();
    }
}
