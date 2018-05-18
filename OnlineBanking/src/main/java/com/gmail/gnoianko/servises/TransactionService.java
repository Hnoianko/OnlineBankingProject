package com.gmail.gnoianko.servises;

import com.gmail.gnoianko.models.PrimaryAccount;
import com.gmail.gnoianko.models.PrimaryTransaction;
import com.gmail.gnoianko.models.SavingsAccount;
import com.gmail.gnoianko.models.SavingsTransaction;

import java.util.List;

public interface TransactionService {

    List<PrimaryTransaction> findPrimaryTransactionList(String username);

    List<SavingsTransaction> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);

    void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);

    void betweenAccountsTransfer(String transferFrom, String transferTo, String amount,
                                 PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;
}
