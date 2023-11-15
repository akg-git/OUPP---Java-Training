package gov.in.oupp.training.java.corejava.assignments2;

import gov.in.oupp.training.java.corejava.exceptions.InsufficientFundException;
import gov.in.oupp.training.java.corejava.exceptions.InvalidAmountException;
import gov.in.oupp.training.java.corejava.exceptions.InvalidInputException;
import gov.in.oupp.training.java.corejava.exceptions.NetworkConnectivityException;

public class ChildrenBankTest {
    public static void main(String[] args) {

        try {
            deposits(123456782,"AccountHolder1",40000);
            withdraw(243687831,"AccountHolder2",35000);
            fundTransfer(34458785,"AccountHolder3",234678630, 10000);
        } catch (gov.in.oupp.training.java.corejava.exceptions.NetworkConnectivityException nce) {
            System.err.println("Unable to connect to the children bank server:(");
        } catch (gov.in.oupp.training.java.corejava.exceptions.InvalidInputException iie){
            System.err.println("Invalid Input!! Please enter valid amount.");
        } catch (gov.in.oupp.training.java.corejava.exceptions.InsufficientFundException ife){
            System.err.println("Insufficient Fund!!");
        } catch (Exception e) {
            System.err.println("Main Exception");
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally block");
        }
    }

    private static void deposits(long accountNo, String accountHolder, int amount)
            throws gov.in.oupp.training.java.corejava.exceptions.NetworkConnectivityException, gov.in.oupp.training.java.corejava.exceptions.InvalidInputException, gov.in.oupp.training.java.corejava.exceptions.InsufficientFundException, InvalidAmountException {
        if(amount<500 || amount>10000){
            throw new gov.in.oupp.training.java.corejava.exceptions.InvalidInputException(" Please Deposit atleast 500 rupees.");
        }

        if(amount%100!=0){
            throw new InvalidAmountException(" Please enter amount in Dominations of 100s to deposit.");
        }

    }

    private static void withdraw(long accountNo, String accountHolder, int amount)
            throws gov.in.oupp.training.java.corejava.exceptions.NetworkConnectivityException, gov.in.oupp.training.java.corejava.exceptions.InvalidInputException, InvalidAmountException, InsufficientFundException {

        if(amount<500 || amount>10000){
            throw new gov.in.oupp.training.java.corejava.exceptions.InvalidInputException(" Please Withdraw atleast 500 rupees.");
        }

        if(amount%100!=0){
            throw new InvalidAmountException(" Please enter amount in Dominations of 100s to withdraw.");
        }
    }

    private static void fundTransfer(long accountNo, String accountHolder, long receiverAccountNo, int amount)
            throws NetworkConnectivityException, gov.in.oupp.training.java.corejava.exceptions.InvalidInputException {

        if(amount<500 || amount>10000){
            throw new gov.in.oupp.training.java.corejava.exceptions.InvalidInputException(" Please Withdraw atleast 500 rupees.");
        }

        if(String.valueOf(accountNo).length() <5 || String.valueOf(accountNo).length()>9 || String.valueOf(receiverAccountNo).length() <5 || String.valueOf(receiverAccountNo).length()>9){
            throw new InvalidInputException(" Invalid Account Number.");
        }

    }
}
