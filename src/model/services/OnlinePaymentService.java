package model.services;

public interface OnlinePaymentService {

    //Essa Interface só possui métodos

    double paymentFee(double amount);
    double interest(double amount, int months);

}
