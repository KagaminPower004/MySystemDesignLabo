package domain.support.type;

public record StringOfImmutable(String String)
    { public String value(){ return this.String; } }
