package khai.amo.catalog.w3

import com.sun.prism.impl.Disposer
import khai.general.League

import khai.general.TypeSports
import khai.w1.*

class SportFactory(){
    companion object {
        fun create(league: League): Sport? = when(league){
            League.Series_A,League.Bundesliga, League.La_Liga,League.Eredivisie, League.Liga_1, League.Premier_League -> club3
            League.KHL, League.NHL-> club5
            League.NBA-> club4

            else -> null
        }

    }
}

