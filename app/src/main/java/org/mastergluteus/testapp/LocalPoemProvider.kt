package org.mastergluteus.testapp

object LocalPoemProvider: PoemProvider {
    private val poems = listOf(
        "Come d'inverno sulle case, la sborra.",
        "La nebbia e gli irti collie."
    )

    override fun getPoem() = poems.random()
}