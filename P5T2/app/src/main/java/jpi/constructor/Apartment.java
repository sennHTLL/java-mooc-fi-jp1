package jpi.constructor;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getRooms() { return this.rooms; }
    public int getSquares() { return this.squares; }
    public int getPricePerSquare() { return this.pricePerSquare; }
    public int getTotalPrice() { return this.squares * this.pricePerSquare; }

    public boolean largerThan(Apartment compared) {
        boolean isIt = (this.squares > compared.squares) ? true : false;
        return isIt;
    }

    public int priceDifference(Apartment compared) {
        int difference = (this.getTotalPrice() > compared.getTotalPrice()) 
                       ? this.getTotalPrice() - compared.getTotalPrice() 
                       : compared.getTotalPrice() - this.getTotalPrice();
        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        boolean isIt = (this.getTotalPrice() > compared.getTotalPrice()) ? true : false;
        return isIt;
    }
}
