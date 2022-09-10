package domain.model;

public class AdapterJava {
    private final Object Hoge;

    public AdapterJava(Object Hoge) {
        if(Hoge instanceof InterfaceJava){ this.Hoge = Hoge; }
        else                             {  throw new RuntimeException("つこうとるラベルちゃうやん"); }
    }

    public Object me(){ return this.Hoge ; }
}
