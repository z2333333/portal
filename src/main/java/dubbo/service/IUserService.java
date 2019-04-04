package dubbo.service;

import com.zx.portal.common.ServerResponse;
import com.zx.portal.dao.model.User;

public interface IUserService {

    String test(String a);

    ServerResponse<User> login(String username, String password);
}
