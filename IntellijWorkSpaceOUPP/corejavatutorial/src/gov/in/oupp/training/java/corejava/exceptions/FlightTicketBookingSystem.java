package gov.in.oupp.training.java.corejava.exceptions;

public class FlightTicketBookingSystem {

    public static void main(String[] args) {
        try {
            bookFlights("samplename","1234567890",4);
        } catch (NetworkConnectivityException nce) {
            System.err.println("Unable to connect to the flight booking server:(");
        } catch (InvalidInputException iie){
            System.err.println("Invalid Input!! Please enter valid no of passengers.");
        } catch (SeatReservationException sre){
            System.err.println("All Seats are full!! Better luck next time.");
        } catch (CreditCardException cce){
            System.err.println("Credit Card is expired!!");
        } catch (Exception e) {
            System.err.println("Main Exception");
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally block");
        }

    }

    // bookFlights: passenger name, credit card number, number of passengers/seats
    private static void bookFlights(String pName, String ccNumber, int passengers)
            throws NetworkConnectivityException, InvalidInputException, SeatReservationException, CreditCardException {

            if(passengers<1){
                throw new InvalidInputException(" Please enter valid no of passengers.");
            }

            if(passengers>10){
                throw new SeatReservationException("Sorry!! We can't book more than 10 passengers at a time.");
            }

            //assume full capacity of flight is 40
            if(passengers == 40){
                throw new SeatReservationException("All Seats are full!! Better luck next time.");
            }

            boolean invalidCreditCard = true;
            if(invalidCreditCard){
                throw new CreditCardException("Please try with valid credit card!!");
            }
        }
}