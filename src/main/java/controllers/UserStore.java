package controllers;

import com.scalekit.internal.http.IdTokenClaims;

import java.util.HashMap;
import java.util.Map;

class UserStore {
    private final Map<String, IdTokenClaims> users = new HashMap<>();

    public synchronized void addUser(String uid, IdTokenClaims user) {
        users.put(uid, user);
    }

    public synchronized IdTokenClaims getUser(String uid) {
        return users.get(uid);
    }
}

