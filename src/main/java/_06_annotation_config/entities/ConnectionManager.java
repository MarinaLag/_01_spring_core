package _06_annotation_config.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
public class ConnectionManager {

    @Override
    public String toString() {
        return "Connection manager object";
    }
}
