package ua.nure.zarazka.db.repository;

import ua.nure.zarazka.db.entity.Tariff;
import ua.nure.zarazka.db.entity.User;

import java.util.List;

//creator Sukhostavsky Pavel Yurievich
public interface IUser extends IEntity<User> {

    User getByLogin(String login);

    List<Tariff> getTariffs(User user);

    void addLinksUsersHasTariffs(User user, String[] tariffsId);

    void deleteLinksUsersHasTariffs(User user);
}
