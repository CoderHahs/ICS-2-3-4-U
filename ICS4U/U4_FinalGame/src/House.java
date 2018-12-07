
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saksham
 */
public class House {

    private double price;
    private double priceFactor;
    private Color colour;
    private int coordinate;
    private boolean sold;

    public House(int coordinate, int price, double priceFactor, Color colour, boolean sold) {
        this.coordinate = coordinate;
        this.price = price;
        this.priceFactor = priceFactor;
        this.colour = colour;
        this.sold = sold;
    }

    public String toString() {
        return "";
    }

    public double getPrice() {
        return this.price;
    }

    public double getPriceFactor() {
        return this.priceFactor;
    }

    public Color getColor() {
        return this.colour;
    }

    public int getCoordinates() {
        return this.coordinate;
    }

    public boolean getSold() {
        return sold;
    }
    
    public void setPriceFactor (double priceFactor) {
        this.priceFactor = priceFactor;
    }
    
    public void setPrice (double price) {
        this.price = price;
    }
    
    public void setColor (Color c) {
        this.colour = c;
    }

    public void setSold(boolean flag) {
        this.sold = flag;
    }

    public House() {
    }
}
