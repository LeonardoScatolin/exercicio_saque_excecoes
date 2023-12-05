package model.exceptions;

public class WithdrawErrorException extends Exception {

    public WithdrawErrorException(String msg) {
        super("Withdraw error: " + msg);
    }

}
