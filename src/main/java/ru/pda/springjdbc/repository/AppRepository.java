package ru.pda.springjdbc.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Repository
public class AppRepository {
    private final NamedParameterJdbcTemplate namedTemplate;

    public AppRepository(NamedParameterJdbcTemplate namedTemplate) {
        this.namedTemplate = namedTemplate;
    }

    public static String read(String queryFileName){
        try(InputStream input = new ClassPathResource(queryFileName).getInputStream();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(input))) {
            return buffer.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getProductName(String customerName){
        var namedParam = new HashMap<String, String>();
        namedParam.put("name", customerName);
        List<String> productNames = namedTemplate.queryForList(read("select product_name.sql"),namedParam, String.class);
        System.out.println(productNames);
        return productNames;
    }
}
