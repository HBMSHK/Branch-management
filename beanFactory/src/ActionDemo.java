import com.beanFactory.service.CustomerService;
import com.beanFactory.service.impl.CustomerServicelmpl;

public class ActionDemo {
    public static void main(String[] args) {
        CustomerService customerService=new CustomerServicelmpl();
        customerService.save();
    }
}
