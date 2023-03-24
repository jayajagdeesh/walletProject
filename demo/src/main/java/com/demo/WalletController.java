package com.walletone.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/v1/wallet/")
public class WalletController {

    @Autowired
    WalletService walletService;

    @PostMapping("/")
    @ResponseStatus(value = HttpStatus.CREATED)
    WalletDto addWallet(@Valid @RequestBody WalletDto walletDto) {

        return walletService.createWallet(walletDto);
    }

    @DeleteMapping("/{id}")
    WalletDto deleteWallet(@PathVariable Integer id) throws WalletException{

        return walletService.deleteWalletById(id);

    }
    @PutMapping("/")
    WalletDto updateWallet(@RequestBody WalletDto walletDto) throws WalletException {

        return walletService.updateWallet(walletDto);
    }

    @GetMapping("/{id}")
    WalletDto getWalletById(@PathVariable Integer id) throws WalletException{
        return walletService.getWalletByID(id);
    }





    @PatchMapping("/addFund/{id}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    Double addFunds( @PathVariable Integer id, @RequestParam Double balance) throws WalletException{

        return walletService.addFunds(id,balance);
    }
    @PatchMapping ("/withdrawFund/{id}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    Double withdrawFunds(@PathVariable Integer id, @RequestParam Double balance ) throws WalletException{

        return walletService.withdrawFunds(id,balance);
    }


    @PatchMapping("/tranferFunds/{fromId}/{toId}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    String fundTranfer(Integer fromId, Integer toId, Double amount) throws WalletException{

        return walletService.tranfersFunds(fromId,toId,amount);
    }

    @GetMapping("wallets")
    public Collection<WalletDto> getAllWallets(){
        return this.walletService.getAllWallets();
    }


}

//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
////import org.springframework.web.bind.annotation.PathVariable;
////import org.springframework.web.bind.annotation.RequestMapping;
//
////import org.springframework.web.bind.annotation.*;
//
//@RestController
//
////@RequestMapping(value = "/v1") //
//public class WalletController {
//
//    @Autowired
//    private WalletService WalletService;
//     @GetMapping("/")
//    public String greet(){
//        return "Welcome to wallet application !";
//    }
//    @PostMapping("/wallet") // bind incoming JSON data and parameter
////    @ResponseStatus(value = HttpStatus.CREATED)
// //@GetMapping("/jaya")
//    public WalletDto addWallet(@RequestBody WalletDto wallet) throws WalletException{
//
//        return WalletService.registerWallet(wallet);
//    }
//
//
////    @PostMapping("/walletfund") // bind incoming JSON data and parameter
//////    @ResponseStatus(value = HttpStatus.CREATED)
////    //@GetMapping("/jaya")
////    public Double addFund(@RequestBody Integer walletId, Double amount) throws WalletException{
////
////        return WalletService.addFundsToWalletById(walletId,9000.0);
////    }
//
//    @GetMapping("/wallet/{id}")
//    public WalletDto getWallet(@PathVariable Integer id) throws WalletException{
//
//        //return "get employee by id"+id;
//        return WalletService.getWalletById(id);
//
//    }
////
////    public WalletDto withdrawFund(@PathVariable walletId, Double amount) throws WalletException{
////
////        return WalletService.withdrawFundsFromWalletById(walletId,9000.0);
////    }
//
//
//    @DeleteMapping("/wallet/{walletId}")// URl template
//    public WalletDto deleteWallet(@PathVariable("walletId") Integer WalletId ) throws WalletException {
//        //return "Delete !"+employeeId;
//        return WalletService.deleteWalletById(WalletId);
//    }
//    @PutMapping("/wallet") // update employee
//    public WalletDto replaceResource(@RequestBody WalletDto wallet) throws WalletException {
//        //  return "Put request !"+employee;
//        return WalletService.updateWallet(wallet);
//    }
//    @PostMapping("/addFund/{id}")
//    @ResponseStatus(value = HttpStatus.ACCEPTED)
//    Double addFunds( @PathVariable Integer id, @RequestParam Double balance) throws WalletException{
//
//        return WalletService.addFundsToWalletById(id,balance);
//    }
//    @PostMapping("/withdrawFund/{id}")
//    @ResponseStatus(value = HttpStatus.ACCEPTED)
//    Double withdrawFunds(@PathVariable Integer id, @RequestParam Double balance ) throws WalletException{
//
//        return WalletService.withdrawFundsFromWalletById(id,balance);
//     }
//
//}
