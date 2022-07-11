package domain.model;

import domain.support.primitive_data_types.*;

public class CeckBehavior {

    public static void main(String[] args){

        new CeckBehavior().test();

    }

    private StringRecord hogeMessage;
    public void test(){
        //フィールドをいじってみる
        this.hogeMessage = new StringRecord("ヴァルヴァルヴァル!!!");
        System.out.println(hogeMessage.toString().startsWith("ヴァ"));
        System.out.println(hogeMessage.Val().startsWith("ヴァ"));
        System.out.println(hogeMessage.Val().length());
        System.out.println(hogeMessage.Val());

        //ろーかるにすてみる♪
        IntRecord hogeAmount = new IntRecord(123);
        System.out.println(hogeAmount);
        System.out.println( hogeAmount.Val() );
        System.out.println( hogeAmount.Val() + new IntRecord(456).Val() );
        System.out.println( new IntRecord(123 + 456).Val() );

        IntRecord hogeHogeAmount = new IntRecord(456);
        System.out.println(hogeAmount.Val() + hogeHogeAmount.Val());

    }
}
