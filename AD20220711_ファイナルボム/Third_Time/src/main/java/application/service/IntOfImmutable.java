package application.service;

import domain.support.type.Interface_IntOfImmutable;

record IntOfImmutable(int Int) implements Interface_IntOfImmutable
    { public int value(){ return this.Int; } }
