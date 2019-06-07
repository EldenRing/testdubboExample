package mytest.testapp.serviceImpl;


import com.biz.service.HkService;
import org.apache.dubbo.config.annotation.Service;


/**
 * @Author: Chen Wei
 * @Date: Created in 20:19 2019/4/17
 */
@Service(version = "1.0",dynamic=true)
public class HkServiceImpl implements HkService {
    @Override
    public String sayHello() {
        return "1111";
    }
}
