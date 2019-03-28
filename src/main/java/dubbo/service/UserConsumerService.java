package dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class UserConsumerService {


    public String localVar = "11";

    @Reference(version = "1.0.0")
    IUserService iUserService;

    public void test(){
        String result = iUserService.test("1");
        System.out.println(result);
    }
}
