package TestModule2.Model.Service;

import TestModule2.Model.Entity.Phone;

import java.util.List;

public interface Iphone {
    void addnewphone(Phone phone);
    void deletephoneById(int id);
    List<Phone> getAllphones();
    List<Phone> getlphonesByName(String word);
}
