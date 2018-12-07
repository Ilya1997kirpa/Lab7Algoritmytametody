package khai.w1

import khai.general.Country
import khai.general.League
import khai.general.TypeSports


    val club3 = Football_club(

            country = Country.Germany,
            stadium = "Альянц Арена",
            city = "Мюнхен",
            league = League.Bundesliga,
            captain = "Мануэль Нойер",
            price = 0.786,
            yearofFoundation = "1900",
            coach = "Нико Ковач",
            holder = "Ули Хёнесс",
            typeSports = TypeSports.football,
            rating = 8
    )
            .setBasicInformation("Бавария", typeSport = TypeSports.football, yearofFoundation = "1900")

    val club4 = ConcertRecord(
            Football_club(
                    "",
                    "Буэнос-Айрес",
                    country = Country.Argentina,
                    league = League.Super_League,
                    price = 0.72,
                    yearofFoundation = "1905",
                    coach = "Гильермо Баррос Скелотто",
                    holder = "",
                    typeSports = TypeSports.football,
                    rating = 12
            )

                    .setBasicInformation("Бока Хуниорс", typeSport = TypeSports.football,
                            yearofFoundation = "1905") as Football_club
    )
    val club5: Sport = Basketball_club("Чикаго Буллз",
            TypeSports.basketball,
            city = "Чикаго",
            country = Country.USA,
            coach = "Фред Хойберг",
            league = League.NBA,
            price = 1.5,
            yearofFoundation = "1966",
            rating = 3)
