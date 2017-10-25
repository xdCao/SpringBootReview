package chapter11;

import org.springframework.stereotype.Service;

/**
 * created by xdCao on 2017/10/25
 */
@Service
public class StatusService {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
