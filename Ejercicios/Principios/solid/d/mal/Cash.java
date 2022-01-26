package solid.d.mal;

class Cash {

   public void pay(Product product, PaymentType paymentType) {

        MySqlDatabaseBad persistence = new MySqlDatabaseBad();
        persistence.save(product, paymentType);

   }

}
