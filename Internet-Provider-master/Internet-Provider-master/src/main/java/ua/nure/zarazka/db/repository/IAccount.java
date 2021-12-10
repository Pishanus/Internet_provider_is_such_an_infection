package ua.nure.zarazka.db.repository;

import ua.nure.zarazka.db.entity.Account;

//creator Sukhostavsky Pavel Yurievich
public interface IAccount extends IEntity<Account> {
    long newNumberContract();
}
