package ua.nure.zarazka.db.services;

import ua.nure.zarazka.db.entity.PackageServices;

import java.util.List;

//creator Sukhostavsky Pavel Yurievich
public interface IPackageService {

    List<PackageServices> findAll();

    PackageServices find(long id);

    void save(PackageServices service);

    void update(PackageServices service);

    void remove(long id);
}
