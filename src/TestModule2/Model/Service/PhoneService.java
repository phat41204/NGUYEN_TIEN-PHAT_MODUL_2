package TestModule2.Model.Service;

import TestModule2.Model.Entity.Phone;
import TestModule2.Model.Repository.PhoneRepository;

import java.util.List;

public class PhoneService implements Iphone{
    private PhoneRepository phoneRepo = new PhoneRepository();
    @Override
    public void addnewphone(Phone phone) {
        phoneRepo.addPhone(phone);
        phoneRepo.savetofile();
    }

    @Override
    public void deletephoneById(int id) {
phoneRepo.removePhone(id);
    }

    @Override
    public List<Phone> getAllphones() {
        return phoneRepo.getPhoneList();
    }

    @Override
    public List<Phone> getlphonesByName(String word) {
        return phoneRepo.Search(word);
    }
    public void savephone(Phone phone){
        phoneRepo.savetofile();
    }
}
