package com.creativeitinstitute.quizapp

data class Quiz(val question:String,
                 val options: List<String>,
                 val correctAnswerIndex : Int
)