package ua.nure.zarazka.db.repository;

import ua.nure.zarazka.db.entity.Tariff;

import java.util.List;

//creator Sukhostavsky Pavel Yurievich
public interface ITariff extends IEntity<Tariff> {

    List<Tariff> getAllByServiceId(long id);

    Tariff getByName(String name);
}
