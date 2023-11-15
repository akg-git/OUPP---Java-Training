package gov.in.oupp.training.java.corejava.exceptions;

public class ChildrenBankTest {
    public static void main(String[] args) {

        try {
            deposits(123456782,"AccountHolder1",40000);
            withdraw(243687831,"AccountHolder2",35000);
            fundTransfer(34458785,"AccountHolder3",234678630, 10000);
        } catch (NetworkConnectivityException nce) {
            System.err.println("Unable to connect to the children bank server:(");
        } catch (InvalidInputException iie){
            System.err.println("Invalid Input!! Please enter valid amount.");
        } catch (InsufficientFundException ife){
            System.err.println("Insufficient Fund!!");
        } catch (Exception e) {
            System.err.println("Main Exception");
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally block");
        }
    }

    private static void deposits(long accountNo, String accountHolder, int amount)
            throws NetworkConnectivityException, InvalidInputException, InsufficientFundException, InvalidAmountException {
        if(amount<500 || amount>10000){
            throw new InvalidInputException(" Please Deposit atleast 500 rupees.");
        }

        if(amount%100!=0){
            throw new InvalidAmountException(" Please enter amount in Dominations of 100s to deposit.");
        }

    }

    private static void withdraw(long accountNo, String accountHolder, int amount)
            throws NetworkConnectivityException, InvalidInputException, InvalidAmountException, InsufficientFundException {

        if(amount<500 || amount>10000){
            throw new InvalidInputException(" Please Withdraw atleast 500 rupees.");
        }

        if(amount%100!=0){
            throw new InvalidAmountException(" Please enter amount in Dominations of 100s to withdraw.");
        }
    }

    private static void fundTransfer(long accountNo, String accountHolder, long receiverAccountNo, int amount)
            throws NetworkConnectivityException, InvalidInputException {

        if(amount<500 || amount>10000){
            throw new InvalidInputException(" Please Withdraw atleast 500 rupees.");
        }

        if(String.valueOf(accountNo).length() <5 || String.valueOf(accountNo).length()>9 || String.valueOf(receiverAccountNo).length() <5 || String.valueOf(receiverAccountNo).length()>9){
            throw new InvalidInputException(" Invalid Account Number.");
        }

    }
}
