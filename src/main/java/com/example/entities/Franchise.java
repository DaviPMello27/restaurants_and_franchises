package com.example.entities;

import com.example.restaurants.R;

public class Franchise {
    public String name;
    public String description;
    public int image;
    public Restaurant[] restaurants;

    public Franchise(String name, String description, int image, Restaurant[] restaurants){
        this.name = name;
        this.description = description;
        this.image = image;
        this.restaurants = restaurants;
    }

    static public Franchise[] sampleFranchises = {
            new Franchise(
                    "McDonaldo",
                    "Vendemos apenas sanduíches de microondas.",
                    R.drawable.mcdonaldo,
                    new Restaurant[]{
                            new Restaurant(
                                    "McDonaldo Super, temos dois microondas!",
                                    "Rua Jonas Bróders, 152",
                                    "Itajaé",
                                    null
                            ),
                            new Restaurant(
                                    "McDonaldo Jr: Um restaurante para crianças, por crianças.",
                                    "",
                                    "",
                                    null
                            ),
                            new Restaurant(
                                    "McDonaldo Super, temos dois microondas!",
                                    "",
                                    "",
                                    null
                            ),
                    }
            ),
            new Franchise(
                    "Burger Prince",
                    "Temos sanduíches de microondas um pouco melhores que os do McDonaldo.",
                    R.drawable.burger_prince,
                    new Restaurant[]{}
            ),
            new Franchise(
                    "Superway",
                    "Pra que comer sanduíche de microondas quando você pode fazer o próprio sanduíche de 30 metros?",
                    R.drawable.superway,
                    new Restaurant[]{}
            ),
            new Franchise(
                    "Dominós",
                    "Aqui as suas calorias vão ser tão baixas quanto a minha habilidade de jogar dominó.",
                    R.drawable.dominos,
                    new Restaurant[]{}
            ),
    };
}
