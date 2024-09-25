package com.creativeitinstitute.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.creativeitinstitute.quizapp.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {

    private val viewModel : PlayViewModel by viewModels()

    lateinit var binding: ActivityPlayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        val quiz = LocalDataSource.questions[0]

//        binding.questionTV.text = quiz.question
//        binding.option1.text = currentQuestion.options[0]
//        binding.option2.text = currentQuestion.options[1]
//        binding.option3.text = currentQuestion.options[2]
//        binding.option4.text = currentQuestion.options[3]


        showCurrentQuestion()



        binding.nextBtn.setOnClickListener {
            val selectedIndex = binding.quizRadioGroup
                .indexOfChild(
                    findViewById(
                        binding.quizRadioGroup.checkedRadioButtonId
                    ))

            if (selectedIndex != -1){
                viewModel.checkAnswer(selectedIndex)
                setNextQuestion()
            }else{
                Toast.makeText(this,"Please Select any Option",Toast.LENGTH_LONG).show()
            }


//            val resultIntent = Intent(this@PlayActivity, ResultActivity::class.java)
//            startActivity(resultIntent)
// rotate configaration change
        }

    }

    private fun showCurrentQuestion(){
        val currentQuestion = viewModel.getCurrentQuestion()

        binding.questionTV.text = currentQuestion.question

        binding.option1.text = currentQuestion.options[0]
        binding.option2.text = currentQuestion.options[1]
        binding.option3.text = currentQuestion.options[2]
        binding.option4.text = currentQuestion.options[3]
        binding.quizRadioGroup.clearCheck()

    }

    private fun setNextQuestion() {
        val nextQuestion = viewModel.getNextQuestion()

        if (nextQuestion != null){
            showCurrentQuestion()
        }else{
            val resultIntent = Intent(this@PlayActivity, ResultActivity::class.java)
            resultIntent.putExtra("score", viewModel.getScore())
            startActivity(resultIntent)
        }

    }
}