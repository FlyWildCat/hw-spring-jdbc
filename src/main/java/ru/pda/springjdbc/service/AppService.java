package ru.pda.springjdbc.service;

import org.springframework.stereotype.Service;
import ru.pda.springjdbc.repository.AppRepository;

import java.util.List;

@Service
public class AppService {
    AppRepository repository;

    public AppService(AppRepository repository) {
        this.repository = repository;
    }

    public List<String> getProductName(String customerName) {
        return repository.getProductName(customerName);
    }
}
