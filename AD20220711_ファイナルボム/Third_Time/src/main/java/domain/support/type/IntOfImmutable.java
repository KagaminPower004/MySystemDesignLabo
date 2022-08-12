package domain.support.type;

public record IntOfImmutable(int Int)
    {
        public int value(){ return this.Int; }

        public Integer toInteger(){ return this.Int; }

    }
