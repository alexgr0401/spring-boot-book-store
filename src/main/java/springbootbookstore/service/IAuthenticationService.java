package springbootbookstore.service;

import springbootbookstore.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
