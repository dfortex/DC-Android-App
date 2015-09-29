package com.example.denny.dcapp;

/**
 * Created by Denny on 9/25/2015.
 */
public class Hero
{
    int _power;
    int _cost;
    int _vp;
    String _name;
    String _set;
    String _ability;

    public Hero()
    {}

    public Hero(String name, String set, String ability, int power, int cost, int vp)
    {
        this._name = name;
        this._set = set;
        this._ability = ability;
        this._power = power;
        this._cost = cost;
        this._vp = vp;
    }
    public int getPower()
    {
        return this._power;
    }
    public void setPower(int power)
    {
        this._power = power;
    }
    public int getCost()
    {
        return this._cost;
    }
    public void setCost(int cost)
    {
        this._cost = cost;
    }
    public int getVp()
    {
        return this._vp;
    }
    public void setVp(int vp)
    {
        this._vp = vp;
    }
    public String getName()
    {
        return this._name;
    }
    public void setName(String name)
    {
        this._name = name;
    }
    public String getSet()
    {
        return this._set;
    }
    public void setSet(String set)
    {
        this._set = set;
    }
    public String getAbility()
    {
        return this._ability;
    }
    public void setAbility(String ability)
    {
        this._ability = ability;
    }
}
