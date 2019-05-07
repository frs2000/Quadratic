package entities;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String valueA;
    private String valueB;
    private String valueC;
    private String valueD;
    private String valueError;
    private String valueX1;
    private String valueX2;

    public Request() {
    }

    public Request(String valueA, String valueB, String valueC, String valueD, String valueError, String valueX1, String valueX2) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.valueC = valueC;
        this.valueD = valueD;
        this.valueError = valueError;
        this.valueX1 = valueX1;
        this.valueX2 = valueX2;
    }

    public String getVakueA(){
        return valueA;
    }
}
