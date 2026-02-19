package com.example.ex11062;

import java.util.ArrayList;

public class Costume {
    private String _name;
    private  String _Category;
    private int _level;
    private int _img;
    private ArrayList<String> _accessories;


    public Costume(String name, String category, int level, int img, ArrayList<String>accessories)
    {
        _name = name;
        _Category = category;
        _level = level;
        _img = img;
        _accessories = accessories;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_Category() {
        return _Category;
    }

    public void set_Category(String _Category) {
        this._Category = _Category;
    }

    public int get_level() {
        return _level;
    }

    public void set_level(int _level) {
        this._level = _level;
    }

    public int get_img() {
        return _img;
    }

    public void set_img(int _img) {
        this._img = _img;
    }

    public ArrayList<String> get_accessories() {
        return _accessories;
    }

    public void set_accessories(ArrayList<String> _accessories) {this._accessories = _accessories;}
}
