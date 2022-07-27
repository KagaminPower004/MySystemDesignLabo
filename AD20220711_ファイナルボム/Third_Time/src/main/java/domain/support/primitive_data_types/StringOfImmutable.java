package domain.support.primitive_data_types;

public record StringOfImmutable(String String)
    { public String value(){ return this.String; } }
