package ru.kirshov.data.models

data class CardModel(
    val prepaid:Boolean,
    val cardScheme: CardScheme,
    val bankScheme: BankScheme,
    val numberScheme: NumberScheme,
    val type: CardType,
    val brand: String
)
