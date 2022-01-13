package com.company.dao;

import java.util.List;

public interface IDao <T>{
    public T guardar(T t) throws Exception;
    public List<T> listarTodo() throws Exception;
}
