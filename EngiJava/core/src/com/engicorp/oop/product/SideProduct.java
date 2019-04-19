package com.engicorp.oop.product;

import java.util.*;

public abstract class SideProduct extends Product{
    protected Vector<FarmProduct> ingredients;
    public SideProduct(int _price, String _name){
        super(_price, _name);
        ingredients = new Vector<FarmProduct>();
    }
    /*public void showIngredients(){
        cout << "Ingredients :" << endl;
        for(FarmProduct fp : ingredients)
        {
            cout << "  " << fp.getName() << endl;
        }
    }*/
    public void setIngredients(Vector<FarmProduct> FP)
    {
        ingredients = FP;
    }
    public void addIngredients(FarmProduct FP)
    {
        //ingredients.push_back(FP);
    }
    public Vector<FarmProduct> getIngredients(){
        return ingredients;
    }

    public boolean canMake(Vector<Product> bahan){
        Vector<Integer> terpakai;
        boolean sukses = true;
        for(FarmProduct fp : ingredients)
        {
            boolean ketemu = false;
            for(int i = 0; i < bahan.size() && !ketemu; i++)
            {
                /*if(fp == bahan[i]){
                    auto iterTerpakai = find(terpakai.begin(), terpakai.end(), i);
                    if(iterTerpakai == terpakai.end())
                    {
                        terpakai.push_back(i);
                        ketemu = true;
                    }
                }
                */
            }
            if(!ketemu)
            {
                sukses = false;
            }
        }
        return sukses;
    }
}