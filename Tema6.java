package Homeworks;

public class Tema6 {
    static void CalculatePrice(double baseprice, double VAT) {
        System.out.println(baseprice + VAT/100*baseprice);
    }

    public static void main(String[] args){
        CalculatePrice(20,19);
    }

}
