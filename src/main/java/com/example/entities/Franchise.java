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
                                    R.drawable.mcdonaldo_restaurant_1
                            ),
                            new Restaurant(
                                    "McDonaldo Jr: Um restaurante para crianças, por crianças.",
                                    "Rua do Sanduíche, 529",
                                    "Navegandos",
                                    R.drawable.mcdonaldo_restaurant_2
                            ),
                            new Restaurant(
                                    "McDonaldo ao contrário: Aqui você faz e a gente come!",
                                    "Rua do Contra, 0Ɛ8",
                                    "ɘbɒbiƆ",
                                    R.drawable.mcdonaldo_restaurant_3
                            ),
                    }
            ),
            new Franchise(
                    "Burger Prince",
                    "Temos sanduíches de microondas um pouco melhores que os do McDonaldo.",
                    R.drawable.burger_prince,
                    new Restaurant[]{
                            new Restaurant(
                                    "Super Burger Prince: Melhor que o McDonaldo!",
                                    "Rua da Inveja, 822",
                                    "Cidade de Marrocos",
                                    R.drawable.burger_prince_restaurant_1
                            ),
                            new Restaurant(
                                    "Burger Pleb: Só temos pão e água!",
                                    "Rua Marco Guerreiro, 238",
                                    "Barra Nova",
                                    R.drawable.burger_prince_restaurant_2
                            ),
                            new Restaurant(
                                    "Burger Prince 2: Dobro de burger, dobro de prince!",
                                    "Avenida Avenida Dupla Dupla",
                                    "Cicidadadede",
                                    R.drawable.burger_prince_restaurant_3
                            ),
                    }
            ),
            new Franchise(
                    "Superway",
                    "Pra que comer sanduíche de microondas quando você pode fazer o próprio sanduíche de 30 metros?",
                    R.drawable.superway,
                    new Restaurant[]{
                            new Restaurant(
                                    "Superway Autoritário: Nós escolhemos o seu sanduíche!",
                                    "Avenida da Autoridade, 1288",
                                    "Rei Jonas II",
                                    R.drawable.superway_restaurant_1
                            ),
                            new Restaurant(
                                    "Superway Chinatown: 好雞!",
                                    "好鄰居街我需要更多文本, 533",
                                    "城市",
                                    R.drawable.superway_restaurant_2
                            ),
                            new Restaurant(
                                    "Superway Quilométrico: Sim, quilométrico.",
                                    "Avenida Nunca Acaba, 17462835",
                                    "Campo Largo",
                                    R.drawable.superway_restaurant_3
                            ),
                    }
            ),
            new Franchise(
                    "Dominós",
                    "Aqui as suas calorias vão ser tão baixas quanto a minha habilidade de jogar dominó.",
                    R.drawable.dominos,
                    new Restaurant[]{
                            new Restaurant(
                                    "Efeito Dominó: Sua pizza vai cair no chão!",
                                    "Rua Ser Cílio Cercílio, 229",
                                    "Cercílio Jr.",
                                    R.drawable.dominos_restaurant_1
                            ),
                            new Restaurant(
                                    "Desafio Dominó: Vença uma partida de dominó e ganhe uma pizza grátis!",
                                    "Rua Coronel General Sargento, 164",
                                    "Cabo Soldado",
                                    R.drawable.dominos_restaurant_2
                            ),
                            new Restaurant(
                                    "Sede Dominó: Prometemos não botar peças de dominó na sua pizza!",
                                    "Rua Domingo, 31",
                                    "Rio de Fevereiro",
                                    R.drawable.dominos_restaurant_3
                            ),
                    }
            ),
    };
}
