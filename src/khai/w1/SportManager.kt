package khai.amo.catalog.w2

import khai.amo.catalog.*

import khai.amo.catalog.w3.*
import khai.w1.ADDREMOVE
import khai.w1.ListADDREMOVE

import khai.w1.Sport


object SportManager : ADDREMOVE, ImpoExporter{
    override var filename: String = "data.tsv"
    private val sports: MutableList<Sport> = mutableListOf()


    private val controller : ADDREMOVE = ListADDREMOVE(sports)

    override fun add(sport: Sport): Boolean  = controller.add(sport)
    override fun remove(sport: Sport): Boolean = controller.remove(sport)
    override fun contains(sport: Sport): Boolean = controller.contains(sport)
    override fun getAll(): Collection<Sport> = controller.getAll()

    //work #3
    private val impoExporter : ImpoExporter = ListImpoExporter(filename, sports)
    override fun write(): Boolean = impoExporter.write()
    override fun load(): Boolean = impoExporter.load()

    fun clear(): Boolean{
        sports.clear()
        return sports.isEmpty()
    }
}