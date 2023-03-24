package com.walletone.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Entity
public class WalletDto {
    public WalletDto(Integer id, String name, Double balance, LocalDate dateofCreation) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        DateofCreation = dateofCreation;
    }


    @NotNull(message = "Id cant be null")
    @Id
    private Integer id;

    @NotBlank(message = "Name cant be blank")
    @Pattern(regexp = "[a-zA-Z]{3,20}", message = "Name should contain 3 - 20 character and no special characters allowed")
    private String name;
    private Double balance;
    private LocalDate DateofCreation;

    public LocalDate getDateofCreation() {
        return DateofCreation;
    }

    public void setDateofCreation(LocalDate dateofCreation) {
        DateofCreation = dateofCreation;
    }

    public WalletDto(Integer id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    public WalletDto() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "WalletDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", DateofCreation=" + DateofCreation +
                '}';
    }
}
//import javax.validation.constraints.*;
//import java.time.LocalDate;
//
//
//public class WalletDto { // POJO
//    @NotNull(message = "Id can not be empty")
//
//    private Integer id;
//    @NotBlank(message = "Name cant be null, it should contain some letters")
//    @Pattern(regexp = "[a-zA-Z]{5,10}", message = "Name should contain minimum 5 to 16 chars , numbers and special chars are not allowed.")
//    private String name;
//    private Double balance;
//    @Email(message = "e.g name@ford.com")
//    @Pattern(regexp = "[@.]{2}",message = "Password should contain 6 digits with any of the symbols")
//    private String email;
//    @Pattern(regexp = "[@#$%]{2}",message = "Password should contain 6 digits with any of the symbols")
//    @Pattern(regexp = "[0-9]{2}",message = "should consists of 3 digit number")
//    private String password;
//    @FutureOrPresent(message = "Join data cant be in pas")
//    //private LocalDate date;
//    public WalletDto() {
//
//    }
//
//    public WalletDto(String email) {
//        this.email = email;
//    }
//
//    public WalletDto(Integer id, String name, Double balance,String email,String password) {
//        this.id = id;
//        this.name = name;
//        this.balance = balance;
//        this.email = email;
//        this.password=password;
//       // this.date=date;
//    }
//
////    public WalletDto getId() {
////        return id;
////    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(Double balance) {
//        this.balance = balance;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
////    public LocalDate getDate() {
////        return date;
////    }
////
////    public void setDate(LocalDate date) {
////        this.date = date;
////    }
//
//    public Integer getId() {
//        return id;
//    }
//    // email, pWD, date of wallet creation
//
//}