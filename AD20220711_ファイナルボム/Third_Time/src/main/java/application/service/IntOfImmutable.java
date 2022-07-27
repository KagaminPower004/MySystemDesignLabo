package application.service;

record IntOfImmutable(int Int) implements Interface_IntOfImmutable
    { public int value(){ return this.Int; } }
