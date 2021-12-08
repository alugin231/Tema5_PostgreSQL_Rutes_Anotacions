import classes.Punt
import classes.Ruta
import org.hibernate.cfg.Configuration
import java.util.logging.Level
import java.util.logging.LogManager

fun main(args: Array<String>) {
    //evitar errors
    LogManager.getLogManager().getLogger("").setLevel(Level.SEVERE)
    val sessio = Configuration().configure().buildSessionFactory().openSession()

    //val ruta = sessio.load("classes.Ruta", ) as Ruta
    val q = sessio.createQuery ("from Ruta")

    val llistaRutes = q.list()
    val itRutes = llistaRutes.iterator()

    while (itRutes.hasNext()){
        val ruta = itRutes.next() as Ruta
        println(ruta.nomR + " - " + ruta.punts.size + " punts")
/*
        val llistaPunts = ruta.punts.toList()
        val itPunts = llistaPunts.iterator()

        while (itPunts.hasNext()){
            val punt = itPunts.next() as Punt
            println("" + punt.nomP)
        }

 */

    }



    sessio.close()
}