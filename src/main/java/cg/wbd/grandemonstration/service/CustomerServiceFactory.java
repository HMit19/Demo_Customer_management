package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.service.impl.SimpleCustomerServiceImpl;

public class CustomerServiceFactory {
    // Singleton pattern dùng để đảm bảo chỉ có một đối tượng duy nhất được tạo ra từ một lớp.
    private static ICustomerService singleton;

    public static synchronized ICustomerService getInstance() {
        // synchronized: đảm bảo chỉ có một luồng được truy cập vào phương thức getInstance() tại một thời điểm.
        if (singleton == null) {
            singleton = new SimpleCustomerServiceImpl(); // có nghĩa là chỉ có một đối tượng SimpleCustomerServiceImpl được tạo ra.
        }
        return singleton;
    }
}
