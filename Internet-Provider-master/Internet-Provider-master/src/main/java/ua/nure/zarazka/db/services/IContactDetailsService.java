package ua.nure.zarazka.db.services;

import ua.nure.zarazka.db.entity.ContactDetails;

import java.util.List;

//creator Sukhostavsky Pavel Yurievich
public interface IContactDetailsService {

    List<ContactDetails> findAll();

    ContactDetails find(long id);

    void save(ContactDetails account);

    void update(ContactDetails account);

    void remove(int id);
}
