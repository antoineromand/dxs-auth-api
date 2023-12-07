package com.forum.auth.domain.ports;

import com.forum.auth.domain.user.UserCredentialsEntity;
import com.forum.auth.domain.valuesobject.Email;

public interface IUserRepository {
    UserCredentialsEntity save(UserCredentialsEntity user);
    UserCredentialsEntity findByEmail(Email email);

}
