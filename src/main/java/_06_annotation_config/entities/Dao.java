package _06_annotation_config.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao {
    private ConnectionManager connectionManager;

    @Autowired
    public void setConnectionManager(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @Override
    public String toString() {
        return "Dao object.Connection manager: " + connectionManager;
    }
}
