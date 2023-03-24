package com.walletone.demo;
import java.util.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public interface WalletService {

    WalletDto createWallet(WalletDto walletDto);

    WalletDto getWalletByID(Integer id) throws WalletException ;

    WalletDto updateWallet(WalletDto walletDto) throws WalletException;

    WalletDto deleteWalletById(Integer id) throws WalletException;

    Double addFunds(Integer id, Double amount) throws WalletException;

    Double withdrawFunds(Integer id, Double amount) throws WalletException;

    String tranfersFunds(Integer fromId, Integer toId, Double amount) throws WalletException;

    public Collection<WalletDto> getAllWallets();

}
//public interface WalletService {
//
//    WalletDto registerWallet(WalletDto wallet) throws WalletException  ;
//
//
//    WalletDto getWalletById(Integer walletId) throws WalletException;
//
//    WalletDto updateWallet(WalletDto wallet)throws WalletException;
//    WalletDto deleteWalletById(Integer walletId)throws WalletException;
//
//
//    Double addFundsToWalletById(Integer walletId,Double amount)throws WalletException;
//    Double withdrawFundsFromWalletById(Integer walletById,Double amount) throws WalletException;
//    Boolean fundTransfer(Integer fromWalletId,Integer toWalletId,Double amount)throws WalletException;
//
//    List<WalletDto> getAllWallets();
//}