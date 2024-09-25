package com.creativeitinstitute.quizapp

object LocalDataSource {

    val questions = mutableListOf<Quiz>(
        Quiz("What is the capital of BD? ",
            listOf("Noakhali", "Bogra", "Dhaka", "Barishal"),
            2),
        Quiz("What is the Industrial capital of BD? ",
            listOf("Noakhali", "Chittagong", "Dhaka", "Barishal"),
            2),
        Quiz("What is the capital of France?",
            listOf("Paris", "Madrid", "Rome", "Berlin"),
            0),
        Quiz("Which planet is known as the Red Planet?",
            listOf("Earth", "Venus", "Mars", "Jupiter"),
            2),
        Quiz("Who wrote 'Romeo and Juliet'?",
            listOf("William Shakespeare", "Charles Dickens", "Jane Austen", "Mark Twain"),
            0),
        Quiz("What is the largest mammal in the world?",
            listOf("Elephant", "Blue whale", "Giraffe", "Hippo"),
            1),
        Quiz("Which country is known as the Land of the Rising Sun?",
            listOf("China", "Japan", "India", "Korea"),
            1),
        Quiz("What is the tallest mountain in the world?",
            listOf("Mount Kilimanjaro", "Mount Everest", "Mount Fuji", "Mount McKinley"),
            1),
        Quiz("Who painted the Mona Lisa?",
            listOf("Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Michelangelo"),
            0),
        Quiz("What is the chemical symbol for water?",
            listOf("W", "H2O", "CO2", "O2"),
            1),
        Quiz("What is the currency of Japan?",
            listOf("Yuan", "Won", "Yen", "Dollar"),
            2),
        Quiz("Who is the CEO of Tesla Motors?",
            listOf("Elon Musk", "Jeff Bezos", "Bill Gates", "Mark Zuckerberg"),
            0)



    )
}