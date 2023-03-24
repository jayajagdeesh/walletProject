package com.walletone.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletJpaRepository extends JpaRepository<WalletDto,Integer> {



}
//
//public interface WalletJpaRepository {
//
//}
