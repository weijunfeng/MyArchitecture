package jzhu.com.moduleusers.Repository;

import io.reactivex.Observable;
import jzhu.com.moduleusers.model.UserModel;

import java.util.List;

public interface UsersRepository{

    Observable<List<UserModel>> getUsers();


}
