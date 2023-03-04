package com.practice.java;

import java.util.ArrayList;
import java.util.List;

public final class Immutable
{
    private final String name;
    private final List<String> list;

    public String getName()
    {
        return name;
    }

    public Immutable(String name, List<String> list)
    {
        this.name = name;

        this.list = new ArrayList<>();
        this.list.addAll(list);
    }

    public List<String> getList()
    {
        List<String> newList = new ArrayList<>();
        newList.addAll(this.list);
        return newList;
    }
}

