package com.example.singleresp;

public class UserPersistenceService {
    private Store store = new Store();
    void  saveUser(User user) {
        store.store(user);
    }
}
