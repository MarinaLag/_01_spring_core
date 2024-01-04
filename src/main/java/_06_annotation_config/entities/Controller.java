package _06_annotation_config.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    private Service service;

    @Autowired
    public void setService(Service service) {
        this.service = service;
    }
    @Override
    public String toString() {
        return "Controller object.Service: " + service;
    }
}
