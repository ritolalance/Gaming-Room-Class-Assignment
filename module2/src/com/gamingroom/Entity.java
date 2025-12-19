/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.gamingroom;

/**
 *
 * @author snipwilder
 */
public class Entity {
    private long id;
    private String name;

    private Entity()
    {

    }

    public Entity(long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "Entity [id = " + id + ", name = " + name + "]";
    }

}
