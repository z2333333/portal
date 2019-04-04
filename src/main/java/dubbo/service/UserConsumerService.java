package dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zx.portal.common.ServerResponse;
import com.zx.portal.dao.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserConsumerService {


    public String localVar = "11";

//    @Reference(version = "1.0.0")
    @Reference
    IUserService iUserService;

    public ServerResponse<User> login(String username, String password) {
        return iUserService.login(username,password);
    }

    public void test(){
        String result = iUserService.test("1");
        System.out.println(result);
    }
}
