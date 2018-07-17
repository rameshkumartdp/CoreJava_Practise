package basic;

public class Builder {
    public static void main(String[] args) {
        Cake cake = new Cake.Builder()
                            .sugar(1)
                            .cheese(2)
                            .cherry(1)
                            .build();
        System.out.println(cake.getCheese()+" "+cake.getCherry()+" "+cake.getSugar());
    }
}

class Cake {
    private int sugar;
    private int cherry;
    private int cheese;

    static class Builder {
        private int sugar;
        private int cherry;
        private int cheese;

        public Builder sugar(int sugar) {
            this.sugar = sugar;
            return this;
        }
        public Builder cherry(int cherry) {
            this.cherry = cherry;
            return this;
        }
        public Builder cheese(int cheese) {
            this.cheese = cheese;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }

    public Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.cherry = builder.cherry;
        this.cheese = builder.cheese;
    }

    public int getSugar() {
        return sugar;
    }

    public int getCherry() {
        return cherry;
    }

    public int getCheese() {
        return cheese;
    }
}
