package solid.d.bien;

class Cash {

    Persistence persistence;

    public Cash(Persistence persistence) {
        this.persistence = persistence;
    }

    public void pay(Product product, PaymentType paymentType) {

        persistence.save(product, paymentType);

    }

}

