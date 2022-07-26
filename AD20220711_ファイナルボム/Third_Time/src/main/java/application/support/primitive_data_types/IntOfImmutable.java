package application.support.primitive_data_types;

import application.service.Interface_IntOfImmutable;

public record IntOfImmutable(int Int) implements Interface_IntOfImmutable
    { public int value(){ return this.Int; } }
