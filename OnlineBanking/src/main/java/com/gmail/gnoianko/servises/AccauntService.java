package com.gmail.gnoianko.servises;

import com.gmail.gnoianko.models.PrimaryAccount;
import com.gmail.gnoianko.models.SavingsAccount;

public interface AccauntService {

    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
}
