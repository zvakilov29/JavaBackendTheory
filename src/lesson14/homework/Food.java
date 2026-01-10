package lesson14.homework;

import java.time.LocalDate;

public class Food extends Product{
    private LocalDate expirationDate;


    public Food(String name, double price, LocalDate expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate(){
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate){
        this.expirationDate = expirationDate;
    }
}
