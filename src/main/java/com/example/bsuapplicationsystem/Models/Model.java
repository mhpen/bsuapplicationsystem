package com.example.bsuapplicationsystem.Models;

import com.example.bsuapplicationsystem.Views.ViewsFactory;

public class Model {
    private static Model model;
    private final ViewsFactory viewsFactory;

    private Model(){
        this.viewsFactory = new ViewsFactory();
    }
    public static synchronized Model getInstance(){
        if( model == null){
            model = new Model();
        }
        return model;
    }
    public ViewsFactory getViewsFactory(){
        return viewsFactory;
    }
}
